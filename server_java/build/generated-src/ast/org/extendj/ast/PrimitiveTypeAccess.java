/* This file was generated with JastAdd2 (http://jastadd.org) version 2.3.2 */
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
 * @ast node
 * @declaredat /Users/Jonte/Documents/Appar/2021-compiler-lsp/server_java/extendj/java4/grammar/Java.ast:99
 * @astdecl PrimitiveTypeAccess : TypeAccess ::= <Package:String> <ID:String>;
 * @production PrimitiveTypeAccess : {@link TypeAccess} ::= <span class="component">&lt;Package:String&gt;</span> <span class="component">&lt;ID:String&gt;</span>;

 */
public class PrimitiveTypeAccess extends TypeAccess implements Cloneable {
  /**
   * @aspect NodeConstructors
   * @declaredat /Users/Jonte/Documents/Appar/2021-compiler-lsp/server_java/extendj/java4/frontend/NodeConstructors.jrag:92
   */
  public PrimitiveTypeAccess(String name) {
    this(PRIMITIVE_PACKAGE_NAME, name);
  }
  /**
   * @aspect PrettyPrintUtil
   * @declaredat /Users/Jonte/Documents/Appar/2021-compiler-lsp/server_java/extendj/java4/frontend/PrettyPrintUtil.jrag:79
   */
  @Override public String toString() {
    return getID();
  }
  /**
   * @declaredat ASTNode:1
   */
  public PrimitiveTypeAccess() {
    super();
  }
  /**
   * Initializes the child array to the correct size.
   * Initializes List and Opt nta children.
   * @apilevel internal
   * @ast method
   * @declaredat ASTNode:10
   */
  public void init$Children() {
  }
  /**
   * @declaredat ASTNode:12
   */
  @ASTNodeAnnotation.Constructor(
    name = {"Package", "ID"},
    type = {"String", "String"},
    kind = {"Token", "Token"}
  )
  public PrimitiveTypeAccess(String p0, String p1) {
    setPackage(p0);
    setID(p1);
  }
  /**
   * @declaredat ASTNode:21
   */
  public PrimitiveTypeAccess(beaver.Symbol p0, beaver.Symbol p1) {
    setPackage(p0);
    setID(p1);
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:26
   */
  protected int numChildren() {
    return 0;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:32
   */
  public boolean mayHaveRewrite() {
    return false;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:36
   */
  public void flushAttrCache() {
    super.flushAttrCache();
    decls_reset();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:41
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:45
   */
  public PrimitiveTypeAccess clone() throws CloneNotSupportedException {
    PrimitiveTypeAccess node = (PrimitiveTypeAccess) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:50
   */
  public PrimitiveTypeAccess copy() {
    try {
      PrimitiveTypeAccess node = (PrimitiveTypeAccess) clone();
      node.parent = null;
      if (children != null) {
        node.children = (ASTNode[]) children.clone();
      }
      return node;
    } catch (CloneNotSupportedException e) {
      throw new Error("Error: clone not supported for " + getClass().getName());
    }
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @deprecated Please use treeCopy or treeCopyNoTransform instead
   * @declaredat ASTNode:69
   */
  @Deprecated
  public PrimitiveTypeAccess fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:79
   */
  public PrimitiveTypeAccess treeCopyNoTransform() {
    PrimitiveTypeAccess tree = (PrimitiveTypeAccess) copy();
    if (children != null) {
      for (int i = 0; i < children.length; ++i) {
        ASTNode child = (ASTNode) children[i];
        if (child != null) {
          child = child.treeCopyNoTransform();
          tree.setChild(child, i);
        }
      }
    }
    return tree;
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The subtree of this node is traversed to trigger rewrites before copy.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:99
   */
  public PrimitiveTypeAccess treeCopy() {
    PrimitiveTypeAccess tree = (PrimitiveTypeAccess) copy();
    if (children != null) {
      for (int i = 0; i < children.length; ++i) {
        ASTNode child = (ASTNode) getChild(i);
        if (child != null) {
          child = child.treeCopy();
          tree.setChild(child, i);
        }
      }
    }
    return tree;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:113
   */
  protected boolean is$Equal(ASTNode node) {
    return super.is$Equal(node) && (tokenString_Package == ((PrimitiveTypeAccess) node).tokenString_Package) && (tokenString_ID == ((PrimitiveTypeAccess) node).tokenString_ID);    
  }
  /**
   * Replaces the lexeme Package.
   * @param value The new value for the lexeme Package.
   * @apilevel high-level
   */
  public void setPackage(String value) {
    tokenString_Package = value;
  }
  /**
   * JastAdd-internal setter for lexeme Package using the Beaver parser.
   * @param symbol Symbol containing the new value for the lexeme Package
   * @apilevel internal
   */
  public void setPackage(beaver.Symbol symbol) {
    if (symbol.value != null && !(symbol.value instanceof String))
    throw new UnsupportedOperationException("setPackage is only valid for String lexemes");
    tokenString_Package = (String)symbol.value;
    Packagestart = symbol.getStart();
    Packageend = symbol.getEnd();
  }
  /**
   * Retrieves the value for the lexeme Package.
   * @return The value for the lexeme Package.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="Package")
  public String getPackage() {
    return tokenString_Package != null ? tokenString_Package : "";
  }
  /**
   * Replaces the lexeme ID.
   * @param value The new value for the lexeme ID.
   * @apilevel high-level
   */
  public void setID(String value) {
    tokenString_ID = value;
  }
  /**
   * JastAdd-internal setter for lexeme ID using the Beaver parser.
   * @param symbol Symbol containing the new value for the lexeme ID
   * @apilevel internal
   */
  public void setID(beaver.Symbol symbol) {
    if (symbol.value != null && !(symbol.value instanceof String))
    throw new UnsupportedOperationException("setID is only valid for String lexemes");
    tokenString_ID = (String)symbol.value;
    IDstart = symbol.getStart();
    IDend = symbol.getEnd();
  }
  /**
   * Retrieves the value for the lexeme ID.
   * @return The value for the lexeme ID.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="ID")
  public String getID() {
    return tokenString_ID != null ? tokenString_ID : "";
  }
  /** @apilevel internal */
  private void decls_reset() {
    decls_computed = null;
    decls_value = null;
  }
  /** @apilevel internal */
  protected ASTState.Cycle decls_computed = null;

  /** @apilevel internal */
  protected SimpleSet<TypeDecl> decls_value;

  /**
   * @attribute syn
   * @aspect TypeScopePropagation
   * @declaredat /Users/Jonte/Documents/Appar/2021-compiler-lsp/server_java/extendj/java4/frontend/LookupType.jrag:357
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="TypeScopePropagation", declaredAt="/Users/Jonte/Documents/Appar/2021-compiler-lsp/server_java/extendj/java4/frontend/LookupType.jrag:357")
  public SimpleSet<TypeDecl> decls() {
    ASTState state = state();
    if (decls_computed == ASTState.NON_CYCLE || decls_computed == state().cycle()) {
      return decls_value;
    }
    decls_value = lookupType(PRIMITIVE_PACKAGE_NAME, name());
    if (state().inCircle()) {
      decls_computed = state().cycle();
    
    } else {
      decls_computed = ASTState.NON_CYCLE;
    
    }
    return decls_value;
  }
  /** @apilevel internal */
  public ASTNode rewriteTo() {
    return super.rewriteTo();
  }
  /** @apilevel internal */
  public boolean canRewrite() {
    return false;
  }
}
