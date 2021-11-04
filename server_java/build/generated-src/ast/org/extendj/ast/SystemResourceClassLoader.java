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
 * A class loader that uses default system resources.
 * This class loader will be used on Java 9 and later platforms.
 * @ast class
 * @aspect PathPart
 * @declaredat /Users/Jonte/Documents/Appar/2021-compiler-lsp/server_java/extendj/java4/frontend/PathPart.jadd:657
 */
public class SystemResourceClassLoader extends PathPart {
  

    public SystemResourceClassLoader() {
      super(false);
    }

  

    @Override
    public String getPath() {
      // TODO(joqvist): rename?
      return "<system>";
    }

  

    @Override
    public boolean hasPackage(String name) {
      // TODO(joqvist): will this always work?
      return Package.getPackage(name) != null;
    }

  

    @Override
    public ClassSource findSource(String name) {
      String filePath = name.replace('.', File.separatorChar) + ".class";
      URL url = ClassLoader.getSystemResource(filePath);
      if (url != null) {
        return new URLBytecodeClassSource(this, url);
      }
      return ClassSource.NONE;
    }

  

    @Override
    public String toString() {
      // TODO(joqvist): rename?
      return "<system>";
    }


}
