package org.extendj.ast;

import java.util.ArrayList;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.net.URL;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.IOException;
import java.util.Set;
import beaver.Symbol;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.zip.*;
import java.io.*;
import org.jastadd.util.*;
import java.util.LinkedHashSet;
import org.jastadd.util.PrettyPrintable;
import org.jastadd.util.PrettyPrinter;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
/**
 * Abstract representation of a collection of class sources.
 * @ast class
 * @aspect PathPart
 * @declaredat /Users/Jonte/Documents/Appar/2021-compiler-lsp/server_java/extendj/java4/frontend/PathPart.jadd:329
 */
public abstract class PathPart extends java.lang.Object {
  
    /**
     * This is {@code true} if this path part represents a source path, {@code
     * true} if this path part represents a bytecode class path.
     */
    protected final boolean isSource;

  

    /**
     * The file suffix of source files in this path part.
     */
    protected final String fileSuffix;

  

    protected PathPart(boolean isSource) {
      this.isSource = isSource;
      this.fileSuffix = isSource ? ".java" : ".class";
    }

  

    /**
     * @return the path which this path part represents
     */
    abstract public String getPath();

  

    /**
     * Test if a package is available in this path part.
     *
     * <p>The implementations of this method may use caching to improve the
     * efficiency of subsequent calls to the method.
     *
     * @return {@code true} if the given package name exists in this path part
     */
    abstract public boolean hasPackage(String name);

  

    public static PathPart createSourcePath(String fileName) {
      return createPathPart(fileName, true);
    }

  

    public static PathPart createClassPath(String fileName) {
      return createPathPart(fileName, false);
    }

  

    private static PathPart createPathPart(String path, boolean fromSource) {
      try {
        File file = new File(path);
        if (file.isDirectory()) {
          if (fromSource) {
            return new SourceFolderPath(path);
          } else {
            return new ClassFolderPath(path);
          }
        } else if (file.isFile()) {
          return new JarFilePath(path);
        }
      } catch (IOException e) {
        System.err.println("Warning: can not open class path " + path);
      }
      return null;
    }

  

    /**
     * Retrieves a compilation unit based on the canonical name.
     * @param name the canonical name of the class to lookup
     * @return {@code null} if a compilation unit with the given name is not
     * available in this PathPart.
     */
    public ClassSource findSource(String name) {
      return ClassSource.NONE;
    }

  

    /**
     * Load the compilation unit of a class.
     * @param program
     * @param name The canonical name of the class.
     */
    public CompilationUnit getCompilationUnit(Program program, String name) throws IOException {
      ClassSource source = findSource(name);
      if (source == ClassSource.NONE) {
        throw new IOException(String.format("%s file not found: %s",
              isSource ? "Source" : "Class", name));
      }
      return source.parseCompilationUnit(program);
    }


}
