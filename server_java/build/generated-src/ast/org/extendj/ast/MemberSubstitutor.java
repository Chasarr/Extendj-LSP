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
 * @ast interface
 * @aspect LookupParTypeDecl
 * @declaredat /Users/Jonte/Documents/Appar/2021-compiler-lsp/server_java/extendj/java5/frontend/Generics.jrag:1246
 */
 interface MemberSubstitutor {

     
    TypeDecl original();
  /**
   * Substituted local methods.
   * 
   * <p>Includes all non-substitutable original methods plus all substituted methods.
   * @attribute syn
   * @aspect LookupParTypeDecl
   * @declaredat /Users/Jonte/Documents/Appar/2021-compiler-lsp/server_java/extendj/java5/frontend/Generics.jrag:1366
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="LookupParTypeDecl", declaredAt="/Users/Jonte/Documents/Appar/2021-compiler-lsp/server_java/extendj/java5/frontend/Generics.jrag:1366")
  public java.util.List<MethodDecl> localMethods();
  /**
   * @attribute syn
   * @aspect LookupParTypeDecl
   * @declaredat /Users/Jonte/Documents/Appar/2021-compiler-lsp/server_java/extendj/java5/frontend/Generics.jrag:1381
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="LookupParTypeDecl", declaredAt="/Users/Jonte/Documents/Appar/2021-compiler-lsp/server_java/extendj/java5/frontend/Generics.jrag:1381")
  public SimpleSet<Variable> localFields(String name);
  /**
   * @attribute syn
   * @aspect LookupParTypeDecl
   * @declaredat /Users/Jonte/Documents/Appar/2021-compiler-lsp/server_java/extendj/java5/frontend/Generics.jrag:1412
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN, isCircular=true)
  @ASTNodeAnnotation.Source(aspect="LookupParTypeDecl", declaredAt="/Users/Jonte/Documents/Appar/2021-compiler-lsp/server_java/extendj/java5/frontend/Generics.jrag:1412")
  public SimpleSet<TypeDecl> localTypeDecls(String name);
}
