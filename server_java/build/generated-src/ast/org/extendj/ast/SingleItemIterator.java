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
 * An iterator that iterates over one single item.
 * 
 * <p>This is used to iterate singleton sets.
 * @ast class
 * @aspect DataStructures
 * @declaredat /Users/Jonte/Documents/Appar/2021-compiler-lsp/server_java/extendj/java4/frontend/DataStructures.jrag:253
 */
public class SingleItemIterator<T> extends java.lang.Object implements Iterator<T> {
  
    private boolean done = false;

  
    private final T item;

  

    public SingleItemIterator(T item) {
      this.item = item;
    }

  

    @Override
    public boolean hasNext() {
      return !done;
    }

  

    @Override
    public T next() {
      done = true;
      return item;
    }

  

    @Override
    public void remove() {
      throw new UnsupportedOperationException();
    }


}
