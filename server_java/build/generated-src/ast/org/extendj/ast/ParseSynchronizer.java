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
 * This is a helper class used to ensure that only one thread
 * parses a single demand loaded compilation unit.
 * 
 * <p>A thread calls the first() method to check if it should parse the
 * compilation unit. If first() returns {@code true} then the thread proceeds
 * to parse the compilation unit and stores the result by calling set(). If
 * first() instead returns {@code false} the thread will call get() which
 * waits until the result is available.
 * @ast class
 * @aspect ClassPath
 * @declaredat /Users/Jonte/Documents/Appar/2021-compiler-lsp/server_java/extendj/java4/frontend/ClassPath.jrag:447
 */
 class ParseSynchronizer extends java.lang.Object {
  
    private AtomicBoolean first = new AtomicBoolean(true);

  
    private CompilationUnit result = null;

  

    /**
     * @return {@code true} in only one thread calling this method.
     * Returns {@code false} in all other threads.
     */
    public boolean first() {
      return first.getAndSet(false);
    }

  

    /**
     * Share a parsed compilation unit with other threads.
     * The compilation unit must not be null!
     */
    public synchronized void set(CompilationUnit result) {
      this.result = result;
      notifyAll();
    }

  

    /**
     * Read the stored compilation unit. This blocks until the result has been
     * stored by another thread.
     */
    public synchronized CompilationUnit get() {
      try {
        while (result == null) {
          wait();
        }
      } catch (InterruptedException e) {
      }
      return result;
    }


}
