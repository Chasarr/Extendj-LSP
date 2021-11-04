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
 * Interface for numeric literals.
 * 
 * <p>This is used to add helper attributes to numeric literals
 * (IntegerLiteral and LongLiteral) without duplicating the attribute code.
 * @ast interface
 * @aspect Java7Literals
 * @declaredat /Users/Jonte/Documents/Appar/2021-compiler-lsp/server_java/extendj/java7/frontend/Literals.jrag:311
 */
 interface NumericLiteral {

     
    String getLITERAL();
  /**
   * @attribute syn
   * @aspect Java7Literals
   * @declaredat /Users/Jonte/Documents/Appar/2021-compiler-lsp/server_java/extendj/java7/frontend/Literals.jrag:317
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="Java7Literals", declaredAt="/Users/Jonte/Documents/Appar/2021-compiler-lsp/server_java/extendj/java7/frontend/Literals.jrag:317")
  public boolean isHex();
  /**
   * @attribute syn
   * @aspect Java7Literals
   * @declaredat /Users/Jonte/Documents/Appar/2021-compiler-lsp/server_java/extendj/java7/frontend/Literals.jrag:319
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="Java7Literals", declaredAt="/Users/Jonte/Documents/Appar/2021-compiler-lsp/server_java/extendj/java7/frontend/Literals.jrag:319")
  public boolean isOctal();
  /**
   * @attribute syn
   * @aspect Java7Literals
   * @declaredat /Users/Jonte/Documents/Appar/2021-compiler-lsp/server_java/extendj/java7/frontend/Literals.jrag:321
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="Java7Literals", declaredAt="/Users/Jonte/Documents/Appar/2021-compiler-lsp/server_java/extendj/java7/frontend/Literals.jrag:321")
  public boolean isDecimal();
}
