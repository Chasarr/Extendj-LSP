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
 * Describes a function type.
 * 
 * <p>Function types are defined by functional interfaces, but
 * the function type is not always the identical to a single
 * abstract method in the interface.
 * @ast class
 * @aspect FunctionDescriptor
 * @declaredat /Users/Jonte/Documents/Appar/2021-compiler-lsp/server_java/extendj/java8/frontend/FunctionDescriptor.jrag:37
 */
 class FunctionDescriptor extends java.lang.Object {
  
    public final java.util.List<TypeDecl> throwsList;

  
    public final Option<? extends MethodDecl> method;

  
    public final InterfaceDecl fromInterface;

  

    public FunctionDescriptor(InterfaceDecl fromInterface, MethodDecl method,
        java.util.List<TypeDecl> throwsList) {
      this.fromInterface = fromInterface;
      this.method = method.nonWildcardParameterization();
      this.throwsList = throwsList;
    }

  

    public boolean isGeneric() {
      if (method.hasValue()) {
        return method.get().isGeneric();
      } else {
        return false;
      }
    }

  

    public InterfaceDecl fromInterface() {
      return this.fromInterface;
    }

  

    public String toString() {
      if (method.hasValue()) {
        MethodDecl targetMethod = method.get();
        StringBuilder str = new StringBuilder();
        str.append(targetMethod.toString());
        str.append(" throws ");
        if (throwsList.size() > 0) {
          str.append(throwsList.get(0).typeName());
          for (int i = 1; i < throwsList.size(); i++) {
            str.append(", " + throwsList.get(i).toString());
          }
        }
        return str.toString();
      } else {
        return "<unknown>";
      }
    }


}
