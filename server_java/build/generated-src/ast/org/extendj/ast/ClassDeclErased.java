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
 * An erased class declaration. All parameterized type accesses are erased.
 * @ast node
 * @declaredat /Users/Jonte/Documents/Appar/2021-compiler-lsp/server_java/extendj/java5/grammar/Generics.ast:97
 * @astdecl ClassDeclErased : ClassDeclSubstituted ::= Modifiers <ID:String> [SuperClass:Access] Implements:Access* <Original:TypeDecl> [ImplicitConstructor:ConstructorDecl] BodyDecl*;
 * @production ClassDeclErased : {@link ClassDeclSubstituted};

 */
public class ClassDeclErased extends ClassDeclSubstituted implements Cloneable {
  /**
   * @declaredat ASTNode:1
   */
  public ClassDeclErased() {
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
    children = new ASTNode[5];
    setChild(new Opt(), 1);
    setChild(new List(), 2);
    setChild(new Opt(), 3);
    setChild(new List(), 4);
  }
  /**
   * @declaredat ASTNode:17
   */
  @ASTNodeAnnotation.Constructor(
    name = {"Modifiers", "ID", "SuperClass", "Implements", "Original"},
    type = {"Modifiers", "String", "Opt<Access>", "List<Access>", "TypeDecl"},
    kind = {"Child", "Token", "Opt", "List", "Token"}
  )
  public ClassDeclErased(Modifiers p0, String p1, Opt<Access> p2, List<Access> p3, TypeDecl p4) {
    setChild(p0, 0);
    setID(p1);
    setChild(p2, 1);
    setChild(p3, 2);
    setOriginal(p4);
  }
  /**
   * @declaredat ASTNode:29
   */
  public ClassDeclErased(Modifiers p0, beaver.Symbol p1, Opt<Access> p2, List<Access> p3, TypeDecl p4) {
    setChild(p0, 0);
    setID(p1);
    setChild(p2, 1);
    setChild(p3, 2);
    setOriginal(p4);
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:37
   */
  protected int numChildren() {
    return 3;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:43
   */
  public boolean mayHaveRewrite() {
    return false;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:47
   */
  public void flushAttrCache() {
    super.flushAttrCache();
    getBodyDeclList_reset();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:52
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:56
   */
  public ClassDeclErased clone() throws CloneNotSupportedException {
    ClassDeclErased node = (ClassDeclErased) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:61
   */
  public ClassDeclErased copy() {
    try {
      ClassDeclErased node = (ClassDeclErased) clone();
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
   * @declaredat ASTNode:80
   */
  @Deprecated
  public ClassDeclErased fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:90
   */
  public ClassDeclErased treeCopyNoTransform() {
    ClassDeclErased tree = (ClassDeclErased) copy();
    if (children != null) {
      for (int i = 0; i < children.length; ++i) {
        switch (i) {
        case 3:
          tree.children[i] = new Opt();
          continue;
        case 4:
          tree.children[i] = new List();
          continue;
        }
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
   * @declaredat ASTNode:118
   */
  public ClassDeclErased treeCopy() {
    ClassDeclErased tree = (ClassDeclErased) copy();
    if (children != null) {
      for (int i = 0; i < children.length; ++i) {
        switch (i) {
        case 3:
          tree.children[i] = new Opt();
          continue;
        case 4:
          tree.children[i] = new List();
          continue;
        }
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
   * @declaredat ASTNode:140
   */
  protected boolean is$Equal(ASTNode node) {
    return super.is$Equal(node) && (tokenString_ID == ((ClassDeclErased) node).tokenString_ID) && (tokenTypeDecl_Original == ((ClassDeclErased) node).tokenTypeDecl_Original);    
  }
  /**
   * Replaces the Modifiers child.
   * @param node The new node to replace the Modifiers child.
   * @apilevel high-level
   */
  public void setModifiers(Modifiers node) {
    setChild(node, 0);
  }
  /**
   * Retrieves the Modifiers child.
   * @return The current node used as the Modifiers child.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Child(name="Modifiers")
  public Modifiers getModifiers() {
    return (Modifiers) getChild(0);
  }
  /**
   * Retrieves the Modifiers child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the Modifiers child.
   * @apilevel low-level
   */
  public Modifiers getModifiersNoTransform() {
    return (Modifiers) getChildNoTransform(0);
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
   * Replaces the optional node for the SuperClass child. This is the <code>Opt</code>
   * node containing the child SuperClass, not the actual child!
   * @param opt The new node to be used as the optional node for the SuperClass child.
   * @apilevel low-level
   */
  public void setSuperClassOpt(Opt<Access> opt) {
    setChild(opt, 1);
  }
  /**
   * Replaces the (optional) SuperClass child.
   * @param node The new node to be used as the SuperClass child.
   * @apilevel high-level
   */
  public void setSuperClass(Access node) {
    getSuperClassOpt().setChild(node, 0);
  }
  /**
   * Check whether the optional SuperClass child exists.
   * @return {@code true} if the optional SuperClass child exists, {@code false} if it does not.
   * @apilevel high-level
   */
  public boolean hasSuperClass() {
    return getSuperClassOpt().getNumChild() != 0;
  }
  /**
   * Retrieves the (optional) SuperClass child.
   * @return The SuperClass child, if it exists. Returns {@code null} otherwise.
   * @apilevel low-level
   */
  public Access getSuperClass() {
    return (Access) getSuperClassOpt().getChild(0);
  }
  /**
   * Retrieves the optional node for the SuperClass child. This is the <code>Opt</code> node containing the child SuperClass, not the actual child!
   * @return The optional node for child the SuperClass child.
   * @apilevel low-level
   */
  @ASTNodeAnnotation.OptChild(name="SuperClass")
  public Opt<Access> getSuperClassOpt() {
    return (Opt<Access>) getChild(1);
  }
  /**
   * Retrieves the optional node for child SuperClass. This is the <code>Opt</code> node containing the child SuperClass, not the actual child!
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The optional node for child SuperClass.
   * @apilevel low-level
   */
  public Opt<Access> getSuperClassOptNoTransform() {
    return (Opt<Access>) getChildNoTransform(1);
  }
  /**
   * Replaces the Implements list.
   * @param list The new list node to be used as the Implements list.
   * @apilevel high-level
   */
  public void setImplementsList(List<Access> list) {
    setChild(list, 2);
  }
  /**
   * Retrieves the number of children in the Implements list.
   * @return Number of children in the Implements list.
   * @apilevel high-level
   */
  public int getNumImplements() {
    return getImplementsList().getNumChild();
  }
  /**
   * Retrieves the number of children in the Implements list.
   * Calling this method will not trigger rewrites.
   * @return Number of children in the Implements list.
   * @apilevel low-level
   */
  public int getNumImplementsNoTransform() {
    return getImplementsListNoTransform().getNumChildNoTransform();
  }
  /**
   * Retrieves the element at index {@code i} in the Implements list.
   * @param i Index of the element to return.
   * @return The element at position {@code i} in the Implements list.
   * @apilevel high-level
   */
  public Access getImplements(int i) {
    return (Access) getImplementsList().getChild(i);
  }
  /**
   * Check whether the Implements list has any children.
   * @return {@code true} if it has at least one child, {@code false} otherwise.
   * @apilevel high-level
   */
  public boolean hasImplements() {
    return getImplementsList().getNumChild() != 0;
  }
  /**
   * Append an element to the Implements list.
   * @param node The element to append to the Implements list.
   * @apilevel high-level
   */
  public void addImplements(Access node) {
    List<Access> list = (parent == null) ? getImplementsListNoTransform() : getImplementsList();
    list.addChild(node);
  }
  /** @apilevel low-level 
   */
  public void addImplementsNoTransform(Access node) {
    List<Access> list = getImplementsListNoTransform();
    list.addChild(node);
  }
  /**
   * Replaces the Implements list element at index {@code i} with the new node {@code node}.
   * @param node The new node to replace the old list element.
   * @param i The list index of the node to be replaced.
   * @apilevel high-level
   */
  public void setImplements(Access node, int i) {
    List<Access> list = getImplementsList();
    list.setChild(node, i);
  }
  /**
   * Retrieves the Implements list.
   * @return The node representing the Implements list.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.ListChild(name="Implements")
  public List<Access> getImplementsList() {
    List<Access> list = (List<Access>) getChild(2);
    return list;
  }
  /**
   * Retrieves the Implements list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the Implements list.
   * @apilevel low-level
   */
  public List<Access> getImplementsListNoTransform() {
    return (List<Access>) getChildNoTransform(2);
  }
  /**
   * @return the element at index {@code i} in the Implements list without
   * triggering rewrites.
   */
  public Access getImplementsNoTransform(int i) {
    return (Access) getImplementsListNoTransform().getChildNoTransform(i);
  }
  /**
   * Retrieves the Implements list.
   * @return The node representing the Implements list.
   * @apilevel high-level
   */
  public List<Access> getImplementss() {
    return getImplementsList();
  }
  /**
   * Retrieves the Implements list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the Implements list.
   * @apilevel low-level
   */
  public List<Access> getImplementssNoTransform() {
    return getImplementsListNoTransform();
  }
  /**
   * Replaces the lexeme Original.
   * @param value The new value for the lexeme Original.
   * @apilevel high-level
   */
  public void setOriginal(TypeDecl value) {
    tokenTypeDecl_Original = value;
  }
  /**
   * Retrieves the value for the lexeme Original.
   * @return The value for the lexeme Original.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="Original")
  public TypeDecl getOriginal() {
    return tokenTypeDecl_Original;
  }
  /**
   * Replaces the (optional) ImplicitConstructor child.
   * @param node The new node to be used as the ImplicitConstructor child.
   * @apilevel high-level
   */
  public void setImplicitConstructor(ConstructorDecl node) {
    getImplicitConstructorOpt().setChild(node, 0);
  }
  /**
   * Check whether the optional ImplicitConstructor child exists.
   * @return {@code true} if the optional ImplicitConstructor child exists, {@code false} if it does not.
   * @apilevel high-level
   */
  public boolean hasImplicitConstructor() {
    return getImplicitConstructorOpt().getNumChild() != 0;
  }
  /**
   * Retrieves the (optional) ImplicitConstructor child.
   * @return The ImplicitConstructor child, if it exists. Returns {@code null} otherwise.
   * @apilevel low-level
   */
  public ConstructorDecl getImplicitConstructor() {
    return (ConstructorDecl) getImplicitConstructorOpt().getChild(0);
  }
  /**
   * Retrieves the optional node for child ImplicitConstructor. This is the <code>Opt</code> node containing the child ImplicitConstructor, not the actual child!
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The optional node for child ImplicitConstructor.
   * @apilevel low-level
   */
  public Opt<ConstructorDecl> getImplicitConstructorOptNoTransform() {
    return (Opt<ConstructorDecl>) getChildNoTransform(3);
  }
  /**
   * Retrieves the child position of the optional child ImplicitConstructor.
   * @return The the child position of the optional child ImplicitConstructor.
   * @apilevel low-level
   */
  protected int getImplicitConstructorOptChildPosition() {
    return 3;
  }
  /**
   * This method should not be called. This method throws an exception due to
   * the corresponding child being an NTA shadowing a non-NTA child.
   * @param node
   * @apilevel internal
   */
  public void setBodyDeclList(List<BodyDecl> node) {
    throw new Error("Can not replace NTA child BodyDeclList in ClassDeclErased!");
  }
  /**
   * Retrieves the number of children in the BodyDecl list.
   * @return Number of children in the BodyDecl list.
   * @apilevel high-level
   */
  public int getNumBodyDecl() {
    return getBodyDeclList().getNumChild();
  }
  /**
   * Retrieves the number of children in the BodyDecl list.
   * Calling this method will not trigger rewrites.
   * @return Number of children in the BodyDecl list.
   * @apilevel low-level
   */
  public int getNumBodyDeclNoTransform() {
    return getBodyDeclListNoTransform().getNumChildNoTransform();
  }
  /**
   * Retrieves the element at index {@code i} in the BodyDecl list.
   * @param i Index of the element to return.
   * @return The element at position {@code i} in the BodyDecl list.
   * @apilevel high-level
   */
  public BodyDecl getBodyDecl(int i) {
    return (BodyDecl) getBodyDeclList().getChild(i);
  }
  /**
   * Check whether the BodyDecl list has any children.
   * @return {@code true} if it has at least one child, {@code false} otherwise.
   * @apilevel high-level
   */
  public boolean hasBodyDecl() {
    return getBodyDeclList().getNumChild() != 0;
  }
  /**
   * Append an element to the BodyDecl list.
   * @param node The element to append to the BodyDecl list.
   * @apilevel high-level
   */
  public void addBodyDecl(BodyDecl node) {
    List<BodyDecl> list = (parent == null) ? getBodyDeclListNoTransform() : getBodyDeclList();
    list.addChild(node);
  }
  /** @apilevel low-level 
   */
  public void addBodyDeclNoTransform(BodyDecl node) {
    List<BodyDecl> list = getBodyDeclListNoTransform();
    list.addChild(node);
  }
  /**
   * Replaces the BodyDecl list element at index {@code i} with the new node {@code node}.
   * @param node The new node to replace the old list element.
   * @param i The list index of the node to be replaced.
   * @apilevel high-level
   */
  public void setBodyDecl(BodyDecl node, int i) {
    List<BodyDecl> list = getBodyDeclList();
    list.setChild(node, i);
  }
  /**
   * Retrieves the child position of the BodyDecl list.
   * @return The the child position of the BodyDecl list.
   * @apilevel low-level
   */
  protected int getBodyDeclListChildPosition() {
    return 4;
  }
  /**
   * Retrieves the BodyDecl list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the BodyDecl list.
   * @apilevel low-level
   */
  public List<BodyDecl> getBodyDeclListNoTransform() {
    return (List<BodyDecl>) getChildNoTransform(4);
  }
  /**
   * @return the element at index {@code i} in the BodyDecl list without
   * triggering rewrites.
   */
  public BodyDecl getBodyDeclNoTransform(int i) {
    return (BodyDecl) getBodyDeclListNoTransform().getChildNoTransform(i);
  }
  /**
   * Retrieves the BodyDecl list.
   * @return The node representing the BodyDecl list.
   * @apilevel high-level
   */
  public List<BodyDecl> getBodyDecls() {
    return getBodyDeclList();
  }
  /**
   * Retrieves the BodyDecl list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the BodyDecl list.
   * @apilevel low-level
   */
  public List<BodyDecl> getBodyDeclsNoTransform() {
    return getBodyDeclListNoTransform();
  }
  /** @apilevel internal */
  private void getBodyDeclList_reset() {
    getBodyDeclList_computed = false;
    
    getBodyDeclList_value = null;
  }
  /** @apilevel internal */
  protected boolean getBodyDeclList_computed = false;

  /** @apilevel internal */
  protected List<BodyDecl> getBodyDeclList_value;

  /**
   * @attribute syn nta
   * @aspect LookupParTypeDecl
   * @declaredat /Users/Jonte/Documents/Appar/2021-compiler-lsp/server_java/extendj/java5/frontend/Generics.jrag:1692
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN, isNTA=true)
  @ASTNodeAnnotation.Source(aspect="LookupParTypeDecl", declaredAt="/Users/Jonte/Documents/Appar/2021-compiler-lsp/server_java/extendj/java5/frontend/Generics.jrag:1692")
  public List<BodyDecl> getBodyDeclList() {
    ASTState state = state();
    if (getBodyDeclList_computed) {
      return (List<BodyDecl>) getChild(getBodyDeclListChildPosition());
    }
    state().enterLazyAttribute();
    getBodyDeclList_value = getOriginal().erasedBodyDecls();
    setChild(getBodyDeclList_value, getBodyDeclListChildPosition());
    getBodyDeclList_computed = true;
    state().leaveLazyAttribute();
    List<BodyDecl> node = (List<BodyDecl>) this.getChild(getBodyDeclListChildPosition());
    return node;
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
