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
 * @declaredat /Users/Jonte/Documents/Appar/2021-compiler-lsp/server_java/extendj/java4/grammar/Java.ast:219
 * @astdecl MemberInterfaceDecl : MemberTypeDecl ::= InterfaceDecl;
 * @production MemberInterfaceDecl : {@link MemberTypeDecl} ::= <span class="component">{@link InterfaceDecl}</span>;

 */
public class MemberInterfaceDecl extends MemberTypeDecl implements Cloneable {
  /**
   * @aspect Java4PrettyPrint
   * @declaredat /Users/Jonte/Documents/Appar/2021-compiler-lsp/server_java/extendj/java4/frontend/PrettyPrint.jadd:454
   */
  public void prettyPrint(PrettyPrinter out) {
    out.print(getInterfaceDecl());
  }
  /**
   * @declaredat ASTNode:1
   */
  public MemberInterfaceDecl() {
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
    children = new ASTNode[1];
  }
  /**
   * @declaredat ASTNode:13
   */
  @ASTNodeAnnotation.Constructor(
    name = {"InterfaceDecl"},
    type = {"InterfaceDecl"},
    kind = {"Child"}
  )
  public MemberInterfaceDecl(InterfaceDecl p0) {
    setChild(p0, 0);
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:22
   */
  protected int numChildren() {
    return 1;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:28
   */
  public boolean mayHaveRewrite() {
    return false;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:32
   */
  public void flushAttrCache() {
    super.flushAttrCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:36
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:40
   */
  public MemberInterfaceDecl clone() throws CloneNotSupportedException {
    MemberInterfaceDecl node = (MemberInterfaceDecl) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:45
   */
  public MemberInterfaceDecl copy() {
    try {
      MemberInterfaceDecl node = (MemberInterfaceDecl) clone();
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
   * @declaredat ASTNode:64
   */
  @Deprecated
  public MemberInterfaceDecl fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:74
   */
  public MemberInterfaceDecl treeCopyNoTransform() {
    MemberInterfaceDecl tree = (MemberInterfaceDecl) copy();
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
   * @declaredat ASTNode:94
   */
  public MemberInterfaceDecl treeCopy() {
    MemberInterfaceDecl tree = (MemberInterfaceDecl) copy();
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
   * @declaredat ASTNode:108
   */
  protected boolean is$Equal(ASTNode node) {
    return super.is$Equal(node);    
  }
  /**
   * Replaces the InterfaceDecl child.
   * @param node The new node to replace the InterfaceDecl child.
   * @apilevel high-level
   */
  public void setInterfaceDecl(InterfaceDecl node) {
    setChild(node, 0);
  }
  /**
   * Retrieves the InterfaceDecl child.
   * @return The current node used as the InterfaceDecl child.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Child(name="InterfaceDecl")
  public InterfaceDecl getInterfaceDecl() {
    return (InterfaceDecl) getChild(0);
  }
  /**
   * Retrieves the InterfaceDecl child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the InterfaceDecl child.
   * @apilevel low-level
   */
  public InterfaceDecl getInterfaceDeclNoTransform() {
    return (InterfaceDecl) getChildNoTransform(0);
  }
  /**
   * @attribute syn
   * @aspect TypeScopePropagation
   * @declaredat /Users/Jonte/Documents/Appar/2021-compiler-lsp/server_java/extendj/java4/frontend/LookupType.jrag:664
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="TypeScopePropagation", declaredAt="/Users/Jonte/Documents/Appar/2021-compiler-lsp/server_java/extendj/java4/frontend/LookupType.jrag:662")
  public TypeDecl typeDecl() {
    TypeDecl typeDecl_value = getInterfaceDecl();
    return typeDecl_value;
  }
  /**
   * @attribute syn
   * @aspect PreciseRethrow
   * @declaredat /Users/Jonte/Documents/Appar/2021-compiler-lsp/server_java/extendj/java8/frontend/EffectivelyFinal.jrag:71
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="PreciseRethrow", declaredAt="/Users/Jonte/Documents/Appar/2021-compiler-lsp/server_java/extendj/java8/frontend/EffectivelyFinal.jrag:40")
  public boolean modifiedInScope(Variable var) {
    boolean modifiedInScope_Variable_value = getInterfaceDecl().modifiedInScope(var);
    return modifiedInScope_Variable_value;
  }
  /**
   * @declaredat /Users/Jonte/Documents/Appar/2021-compiler-lsp/server_java/extendj/java4/frontend/TypeAnalysis.jrag:627
   * @apilevel internal
   */
  public boolean Define_isMemberType(ASTNode _callerNode, ASTNode _childNode) {
    if (getInterfaceDeclNoTransform() != null && _callerNode == getInterfaceDecl()) {
      // @declaredat /Users/Jonte/Documents/Appar/2021-compiler-lsp/server_java/extendj/java4/frontend/TypeAnalysis.jrag:629
      return true;
    }
    else {
      return getParent().Define_isMemberType(this, _callerNode);
    }
  }
  /**
   * @declaredat /Users/Jonte/Documents/Appar/2021-compiler-lsp/server_java/extendj/java4/frontend/TypeAnalysis.jrag:627
   * @apilevel internal
   * @return {@code true} if this node has an equation for the inherited attribute isMemberType
   */
  protected boolean canDefine_isMemberType(ASTNode _callerNode, ASTNode _childNode) {
    return true;
  }
  /** @apilevel internal */
  public ASTNode rewriteTo() {
    return super.rewriteTo();
  }
  /** @apilevel internal */
  public boolean canRewrite() {
    return false;
  }
  /** @apilevel internal */
  protected void collect_contributors_CompilationUnit_problems(CompilationUnit _root, java.util.Map<ASTNode, java.util.Set<ASTNode>> _map) {
    // @declaredat /Users/Jonte/Documents/Appar/2021-compiler-lsp/server_java/extendj/java4/frontend/Modifiers.jrag:220
    if (hostType().isInnerClass()) {
      {
        java.util.Set<ASTNode> contributors = _map.get(_root);
        if (contributors == null) {
          contributors = new java.util.LinkedHashSet<ASTNode>();
          _map.put((ASTNode) _root, contributors);
        }
        contributors.add(this);
      }
    }
    super.collect_contributors_CompilationUnit_problems(_root, _map);
  }
  /** @apilevel internal */
  protected void contributeTo_CompilationUnit_problems(LinkedList<Problem> collection) {
    super.contributeTo_CompilationUnit_problems(collection);
    if (hostType().isInnerClass()) {
      collection.add(error("*** Inner classes may not declare member interfaces"));
    }
  }
}
