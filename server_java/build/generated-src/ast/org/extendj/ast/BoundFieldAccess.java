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
 * @declaredat /Users/Jonte/Documents/Appar/2021-compiler-lsp/server_java/extendj/java4/grammar/BoundNames.ast:6
 * @astdecl BoundFieldAccess : VarAccess ::= <ID:String> <FieldDeclarator:FieldDeclarator>;
 * @production BoundFieldAccess : {@link VarAccess} ::= <span class="component">&lt;FieldDeclarator:FieldDeclarator&gt;</span>;

 */
public class BoundFieldAccess extends VarAccess implements Cloneable {
  /**
   * @aspect BoundNames
   * @declaredat /Users/Jonte/Documents/Appar/2021-compiler-lsp/server_java/extendj/java4/frontend/BoundNames.jrag:85
   */
  public BoundFieldAccess(FieldDeclarator f) {
    this(f.name(), f);
  }
  /**
   * @aspect BoundNames
   * @declaredat /Users/Jonte/Documents/Appar/2021-compiler-lsp/server_java/extendj/java4/frontend/BoundNames.jrag:91
   */
  public boolean isExactVarAccess() {
    return false;
  }
  /**
   * @declaredat ASTNode:1
   */
  public BoundFieldAccess() {
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
    name = {"ID", "FieldDeclarator"},
    type = {"String", "FieldDeclarator"},
    kind = {"Token", "Token"}
  )
  public BoundFieldAccess(String p0, FieldDeclarator p1) {
    setID(p0);
    setFieldDeclarator(p1);
  }
  /**
   * @declaredat ASTNode:21
   */
  public BoundFieldAccess(beaver.Symbol p0, FieldDeclarator p1) {
    setID(p0);
    setFieldDeclarator(p1);
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
    decl_reset();
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
  public BoundFieldAccess clone() throws CloneNotSupportedException {
    BoundFieldAccess node = (BoundFieldAccess) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:50
   */
  public BoundFieldAccess copy() {
    try {
      BoundFieldAccess node = (BoundFieldAccess) clone();
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
  public BoundFieldAccess fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:79
   */
  public BoundFieldAccess treeCopyNoTransform() {
    BoundFieldAccess tree = (BoundFieldAccess) copy();
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
  public BoundFieldAccess treeCopy() {
    BoundFieldAccess tree = (BoundFieldAccess) copy();
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
    return super.is$Equal(node) && (tokenString_ID == ((BoundFieldAccess) node).tokenString_ID) && (tokenFieldDeclarator_FieldDeclarator == ((BoundFieldAccess) node).tokenFieldDeclarator_FieldDeclarator);    
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
  /**
   * Replaces the lexeme FieldDeclarator.
   * @param value The new value for the lexeme FieldDeclarator.
   * @apilevel high-level
   */
  public void setFieldDeclarator(FieldDeclarator value) {
    tokenFieldDeclarator_FieldDeclarator = value;
  }
  /** @apilevel internal 
   */
  protected FieldDeclarator tokenFieldDeclarator_FieldDeclarator;
  /**
   * Retrieves the value for the lexeme FieldDeclarator.
   * @return The value for the lexeme FieldDeclarator.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="FieldDeclarator")
  public FieldDeclarator getFieldDeclarator() {
    return tokenFieldDeclarator_FieldDeclarator;
  }
  /** @apilevel internal */
  private void decl_reset() {
    decl_computed = null;
    decl_value = null;
  }
  /** @apilevel internal */
  protected ASTState.Cycle decl_computed = null;

  /** @apilevel internal */
  protected Variable decl_value;

  /**
   * @attribute syn
   * @aspect BoundNames
   * @declaredat /Users/Jonte/Documents/Appar/2021-compiler-lsp/server_java/extendj/java4/frontend/BoundNames.jrag:89
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="VariableScopePropagation", declaredAt="/Users/Jonte/Documents/Appar/2021-compiler-lsp/server_java/extendj/java4/frontend/LookupVariable.jrag:405")
  public Variable decl() {
    ASTState state = state();
    if (decl_computed == ASTState.NON_CYCLE || decl_computed == state().cycle()) {
      return decl_value;
    }
    decl_value = getFieldDeclarator();
    if (state().inCircle()) {
      decl_computed = state().cycle();
    
    } else {
      decl_computed = ASTState.NON_CYCLE;
    
    }
    return decl_value;
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
