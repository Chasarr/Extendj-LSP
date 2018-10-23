package org.extendj;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import beaver.Parser;
import org.apache.commons.io.IOUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.fail;
import static com.google.common.truth.Truth.assertThat;

import org.extendj.JavaCompiler;

@RunWith(Parameterized.class)
public class RuntimeTest {
  private final File file;
  private final String filename;

  public RuntimeTest(File file, String filename) {
    this.file = file;
    this.filename = filename;
  }

  /** Build the list of test parameters (test input files). */
  @Parameterized.Parameters(name="{1}")
  public static Iterable<Object[]> getTests() {
    Collection<Object[]> tests = new LinkedList<>();
    addTests(tests, "testfiles");
    return tests;
  }

  private static void addTests(Collection<Object[]> tests, String dirPath) {
    File testDir = new File(dirPath);
    if (!testDir.isDirectory()) {
      throw new Error("Could not find the test directory '" + testDir + "'");
    }
    File[] files = testDir.listFiles();
    if (files != null) {
      for (File file : files) {
        if (file.getName().endsWith(".java")) {
          tests.add(new Object[] {file, file.getName()});
        }
      }
    }
  }

  @Test
  public void runTest() throws IOException, Parser.Exception, InterruptedException {
    File directory = file.getParentFile();
    String classname = file.getName();
    classname = classname.substring(0, classname.length() - 5);

    try (FileReader reader = new FileReader(file)) {
      String[] args = {
        "-d", directory.getPath(),
        file.getPath(),
      };
      boolean result = JavaCompiler.compile(new String[] { file.getPath() });
      if (!result) {
        fail("Testcase compilation failed.");
      } else {
        assertThat(runGetOutput("java", "-classpath", directory.getPath(), classname))
            .containsExactlyElementsIn(getExpectedLines())
            .inOrder();
      }
    }
  }

  private static void run(String... command) throws IOException, InterruptedException {
    Process process = new ProcessBuilder(command).start();
    process.getOutputStream().close();
    String errors = IOUtils.toString(process.getErrorStream());
    int exitCode = process.waitFor();
    assertThat(errors).isEmpty();
    assertThat(exitCode).isEqualTo(0);
  }

  private static List<?> runGetOutput(String... command) throws IOException, InterruptedException {
    System.err.println(java.util.Arrays.toString(command));
    Process process = new ProcessBuilder(command).start();
    process.getOutputStream().close();
    process.getErrorStream().close();
    List<?> output = IOUtils.readLines(process.getInputStream());
    int exitCode = process.waitFor();
    assertThat(exitCode).isEqualTo(0);
    return output;
  }

  public List<String> getExpectedLines() throws IOException {
    List<String> expected = new LinkedList<>();
    try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
      boolean addLines = false;
      while (true) {
        String line = reader.readLine();
        if (line == null) {
          break;
        } else if (addLines) {
          if (line.startsWith("*/")) {
            break;
          }
          expected.add(line);
        } else if (line.startsWith("/*EXPECT")) {
          addLines = true;
        }
      }
    }
    return expected;
  }
}
