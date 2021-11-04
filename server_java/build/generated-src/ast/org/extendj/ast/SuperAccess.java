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
 * Represent explicit superclass references ({@code super}).
 * @ast node
 * @declaredat /Users/Jonte/Documents/Appar/2021-compiler-lsp/server_java/extendj/java4/grammar/Java.ast:111
 * @astdecl SuperAccess : Access;
 * @production SuperAccess : {@link Access};

 */
public class SuperAccess extends Access implements Cloneable {
  /**
   * @aspect Java4PrettyPrint
   * @declaredat /Users/Jonte/Documents/Appar/2021-compiler-lsp/server_java/extendj/java4/frontend/PrettyPrint.jadd:567
   */
  public void prettyPrint(PrettyPrinter out) {
    out.print("super");
  }
  /**
   * @aspect VariableScope
   * @declaredat /Users/Jonte/Documents/Appar/2021-compiler-lsp/server_java/extendj/java4/frontend/LookupVariable.jrag:294
   */
  public SimpleSet<Variable> keepAccessibleFields(SimpleSet<Variable> fields) {
    return hostType().keepAccessibleFields(hostType(), fields);
  }
  /**
   * @aspect PrettyPrintUtil
   * @declaredat /Users/Jonte/Documents/Appar/2021-compiler-lsp/server_java/extendj/java4/frontend/PrettyPrintUtil.jrag:167
   */
  @Override public String toString() {
    return "super";
  }
  /**
   * @declaredat ASTNode:1
   */
  public SuperAccess() {
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
  /** @apilevel low-level 
   * @declaredat ASTNode:13
   */
  protected int numChildren() {
    return 0;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:19
   */
  public boolean mayHaveRewrite() {
    return false;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:23
   */
  public void flushAttrCache() {
    super.flushAttrCache();
    decl_reset();
    type_reset();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:29
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:33
   */
  public SuperAccess clone() throws CloneNotSupportedException {
    SuperAccess node = (SuperAccess) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:38
   */
  public SuperAccess copy() {
    try {
      SuperAccess node = (SuperAccess) clone();
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
   * @declaredat ASTNode:57
   */
  @Deprecated
  public SuperAccess fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:67
   */
  public SuperAccess treeCopyNoTransform() {
    SuperAccess tree = (SuperAccess) copy();
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
   * @declaredat ASTNode:87
   */
  public SuperAccess treeCopy() {
    SuperAccess tree = (SuperAccess) copy();
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
   * @declaredat ASTNode:101
   */
  protected boolean is$Equal(ASTNode node) {
    return super.is$Equal(node);    
  }
  /**
   * @aspect TypeScopePropagation
   * @declaredat /Users/Jonte/Documents/Appar/2021-compiler-lsp/server_java/extendj/java4/frontend/LookupType.jrag:383
   */
  private TypeDecl refined_TypeScopePropagation_SuperAccess_decl()
{ return isQualified() ? qualifier().type() : hostType(); }
  /**
   * @attribute syn
   * @aspect AccessTypes
   * @declaredat /Users/Jonte/Documents/Appar/2021-compiler-lsp/server_java/extendj/java4/frontend/ResolveAmbiguousNames.jrag:58
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="AccessTypes", declaredAt="/Users/Jonte/Documents/Appar/2021-compiler-lsp/server_java/extendj/java4/frontend/ResolveAmbiguousNames.jrag:56")
  public boolean isSuperAccess() {
    boolean isSuperAccess_value = true;
    return isSuperAccess_value;
  }
  /**
   * @attribute syn
   * @aspect TypeHierarchyCheck
   * @declaredat /Users/Jonte/Documents/Appar/2021-compiler-lsp/server_java/extendj/java4/frontend/TypeHierarchyCheck.jrag:151
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="TypeHierarchyCheck", declaredAt="/Users/Jonte/Documents/Appar/2021-compiler-lsp/server_java/extendj/java4/frontend/TypeHierarchyCheck.jrag:151")
  public Collection<Problem> typeHierarchyProblems() {
    {
        Collection<Problem> problems = new LinkedList<Problem>();
        if (isQualified()) {
          if (decl().isInterfaceDecl()) {
            InterfaceDecl decl = (InterfaceDecl) decl();
            if (hostType().isClassDecl()) {
              ClassDecl hostDecl = (ClassDecl) hostType();
              InterfaceDecl found = null;
              for (int i = 0; i < hostDecl.getNumImplements(); i++) {
                if (hostDecl.getImplements(i).type() == decl) {
                  found = (InterfaceDecl) hostDecl.getImplements(i).type();
                  break;
                }
              }
              if (found == null) {
                // 15.12.1 - fourth bullet
                problems.add(errorf("Type %s is not a direct superinterface of %s",
                    decl().typeName(), hostType().typeName()));
                return problems;
              }
              InterfaceDecl foundRedundant = null;
              for (int i = 0; i < hostDecl.getNumImplements(); i++) {
                if (hostDecl.getImplements(i).type() != found && hostDecl.getImplements(i).type().strictSubtype(found)) {
                  foundRedundant = (InterfaceDecl) hostDecl.getImplements(i).type();
                  break;
                }
              }
              if (foundRedundant != null) {
                // 15.12.1 - fourth bullet
                problems.add(errorf("Type %s cannot be used as qualifier, it is extended by implemented interface %s and is redundant",
                    decl().typeName(), foundRedundant.typeName()));
                return problems;
              }
              if (hasNextAccess() && nextAccess() instanceof MethodAccess) {
                MethodAccess methodAccess = (MethodAccess) nextAccess();
                if (hostDecl.hasOverridingMethodInSuper(methodAccess.decl())) {
                  problems.add(errorf("Cannot make a super reference to method %s,"
                      + " there is a more specific override",
                      methodAccess.decl().fullSignature()));
                }
              }
            } else if (hostType().isInterfaceDecl()) {
              InterfaceDecl hostDecl = (InterfaceDecl) hostType();
              InterfaceDecl found = null;
              for (int i = 0; i < hostDecl.getNumSuperInterface(); i++) {
                if (hostDecl.getSuperInterface(i).type() == decl) {
                  found = (InterfaceDecl) hostDecl.getSuperInterface(i).type();
                  break;
                }
              }
              if (found == null) {
                // 15.12.1 - fourth bullet
                problems.add(errorf("Type %s is not a direct superinterface of %s",
                    decl().typeName(), hostType().typeName()));
                return problems;
              }
              InterfaceDecl foundRedundant = null;
              for (int i = 0; i < hostDecl.getNumSuperInterface(); i++) {
                if (hostDecl.getSuperInterface(i).type() != found && hostDecl.getSuperInterface(i).type().strictSubtype(found)) {
                  foundRedundant = (InterfaceDecl) hostDecl.getSuperInterface(i).type();
                  break;
                }
              }
              if (foundRedundant != null) {
                // 15.12.1 - fourth bullet
                problems.add(errorf("Type %s cannot be used as qualifier, it is extended by"
                    + " implemented interface %s and is redundant",
                    decl().typeName(), foundRedundant.typeName()));
                return problems;
              }
              if (hasNextAccess() && nextAccess() instanceof MethodAccess) {
                MethodAccess methodAccess = (MethodAccess) nextAccess();
                if (hostDecl.hasOverridingMethodInSuper(methodAccess.decl())) {
                  problems.add(errorf("Cannot make a super reference to method %s,"
                      + " there is a more specific override",
                      methodAccess.decl().fullSignature()));
                }
              }
            } else {
              problems.add(error("Illegal context for super access"));
            }
    
            if (hasNextAccess() && nextAccess() instanceof MethodAccess) {
              if (((MethodAccess) nextAccess()).decl().isStatic()) {
                problems.add(error("Cannot reference static interface methods with super"));
              }
            }
    
            if (!hostType().strictSubtype(decl())) {
              problems.add(errorf("Type %s is not a superinterface for %s",
                  decl().typeName(), hostType().typeName()));
            }
          } else if (!hostType().isInnerTypeOf(decl()) && hostType() != decl()) {
            problems.add(error("qualified super must name an enclosing type"));
          }
          if (inStaticContext()) {
            problems.add(error("*** Qualified super may not occur in static context"));
          }
        }
        // 8.8.5.1
        // JLSv7 8.8.7.1
        TypeDecl constructorHostType = enclosingExplicitConstructorHostType();
        if (constructorHostType != null && (constructorHostType == decl())) {
          problems.add(error("super may not be accessed in an explicit constructor invocation"));
        }
        // 8.4.3.2
        if (inStaticContext()) {
          problems.add(error("super may not be accessed in a static context"));
        }
        return problems;
      }
  }
  /**
   * @attribute syn
   * @aspect TypeScopePropagation
   * @declaredat /Users/Jonte/Documents/Appar/2021-compiler-lsp/server_java/extendj/java4/frontend/LookupType.jrag:373
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="TypeScopePropagation", declaredAt="/Users/Jonte/Documents/Appar/2021-compiler-lsp/server_java/extendj/java4/frontend/LookupType.jrag:373")
  public SimpleSet<TypeDecl> decls() {
    SimpleSet<TypeDecl> decls_value = emptySet();
    return decls_value;
  }
  /** @apilevel internal */
  private void decl_reset() {
    decl_computed = null;
    decl_value = null;
  }
  /** @apilevel internal */
  protected ASTState.Cycle decl_computed = null;

  /** @apilevel internal */
  protected TypeDecl decl_value;

  /**
   * @return the type whose supertype this super access references.
   * @attribute syn
   * @aspect LookupType
   * @declaredat /Users/Jonte/Documents/Appar/2021-compiler-lsp/server_java/extendj/java8/frontend/LookupType.jrag:57
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="TypeScopePropagation", declaredAt="/Users/Jonte/Documents/Appar/2021-compiler-lsp/server_java/extendj/java4/frontend/LookupType.jrag:383")
  public TypeDecl decl() {
    ASTState state = state();
    if (decl_computed == ASTState.NON_CYCLE || decl_computed == state().cycle()) {
      return decl_value;
    }
    decl_value = decl_compute();
    if (state().inCircle()) {
      decl_computed = state().cycle();
    
    } else {
      decl_computed = ASTState.NON_CYCLE;
    
    }
    return decl_value;
  }
  /** @apilevel internal */
  private TypeDecl decl_compute() {
      TypeDecl typeDecl;
      if (isQualified()) {
        typeDecl = qualifier().type();
      } else {
        typeDecl = hostType();
        while (typeDecl instanceof LambdaAnonymousDecl) {
          typeDecl = typeDecl.enclosingType();
        }
      }
  
      if (typeDecl instanceof ParTypeDecl) {
        typeDecl = ((ParTypeDecl) typeDecl).genericDecl();
      }
      return typeDecl;
    }
  /**
   * @attribute syn
   * @aspect VariableScope
   * @declaredat /Users/Jonte/Documents/Appar/2021-compiler-lsp/server_java/extendj/java4/frontend/LookupVariable.jrag:335
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="VariableScope", declaredAt="/Users/Jonte/Documents/Appar/2021-compiler-lsp/server_java/extendj/java4/frontend/LookupVariable.jrag:333")
  public boolean mayAccess(Variable f) {
    boolean mayAccess_Variable_value = hostType().mayAccess(hostType(), f);
    return mayAccess_Variable_value;
  }
  /**
   * @attribute syn
   * @aspect SyntacticClassification
   * @declaredat /Users/Jonte/Documents/Appar/2021-compiler-lsp/server_java/extendj/java4/frontend/SyntacticClassification.jrag:116
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="SyntacticClassification", declaredAt="/Users/Jonte/Documents/Appar/2021-compiler-lsp/server_java/extendj/java4/frontend/SyntacticClassification.jrag:60")
  public NameType predNameType() {
    NameType predNameType_value = NameType.TYPE_NAME;
    return predNameType_value;
  }
  /** @apilevel internal */
  private void type_reset() {
    type_computed = null;
    type_value = null;
  }
  /** @apilevel internal */
  protected ASTState.Cycle type_computed = null;

  /** @apilevel internal */
  protected TypeDecl type_value;

  /**
   * @attribute syn
   * @aspect LookupType
   * @declaredat /Users/Jonte/Documents/Appar/2021-compiler-lsp/server_java/extendj/java8/frontend/LookupType.jrag:75
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="TypeAnalysis", declaredAt="/Users/Jonte/Documents/Appar/2021-compiler-lsp/server_java/extendj/java4/frontend/TypeAnalysis.jrag:295")
  public TypeDecl type() {
    ASTState state = state();
    if (type_computed == ASTState.NON_CYCLE || type_computed == state().cycle()) {
      return type_value;
    }
    type_value = type_compute();
    if (state().inCircle()) {
      type_computed = state().cycle();
    
    } else {
      type_computed = ASTState.NON_CYCLE;
    
    }
    return type_value;
  }
  /** @apilevel internal */
  private TypeDecl type_compute() {
      TypeDecl typeDecl = decl();
      if (typeDecl.isInterfaceDecl()) {
        if (isQualified() && qualifier().type() == typeDecl) {
          return typeDecl;
        }
      }
      if (!typeDecl.isClassDecl()) {
        return unknownType();
      }
      ClassDecl classDecl = (ClassDecl) typeDecl;
      if (!classDecl.hasSuperclass()) {
        return unknownType();
      }
      return classDecl.superclass();
    }
  /**
   * @attribute inh
   * @aspect TypeHierarchyCheck
   * @declaredat /Users/Jonte/Documents/Appar/2021-compiler-lsp/server_java/extendj/java4/frontend/TypeHierarchyCheck.jrag:201
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.INH)
  @ASTNodeAnnotation.Source(aspect="TypeHierarchyCheck", declaredAt="/Users/Jonte/Documents/Appar/2021-compiler-lsp/server_java/extendj/java4/frontend/TypeHierarchyCheck.jrag:201")
  public boolean inExplicitConstructorInvocation() {
    boolean inExplicitConstructorInvocation_value = getParent().Define_inExplicitConstructorInvocation(this, null);
    return inExplicitConstructorInvocation_value;
  }
  /**
   * @attribute inh
   * @aspect TypeHierarchyCheck
   * @declaredat /Users/Jonte/Documents/Appar/2021-compiler-lsp/server_java/extendj/java4/frontend/TypeHierarchyCheck.jrag:212
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.INH)
  @ASTNodeAnnotation.Source(aspect="TypeHierarchyCheck", declaredAt="/Users/Jonte/Documents/Appar/2021-compiler-lsp/server_java/extendj/java4/frontend/TypeHierarchyCheck.jrag:212")
  public TypeDecl enclosingExplicitConstructorHostType() {
    TypeDecl enclosingExplicitConstructorHostType_value = getParent().Define_enclosingExplicitConstructorHostType(this, null);
    return enclosingExplicitConstructorHostType_value;
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
    // @declaredat /Users/Jonte/Documents/Appar/2021-compiler-lsp/server_java/extendj/java4/frontend/TypeHierarchyCheck.jrag:149
    {
      java.util.Set<ASTNode> contributors = _map.get(_root);
      if (contributors == null) {
        contributors = new java.util.LinkedHashSet<ASTNode>();
        _map.put((ASTNode) _root, contributors);
      }
      contributors.add(this);
    }
    super.collect_contributors_CompilationUnit_problems(_root, _map);
  }
  /** @apilevel internal */
  protected void contributeTo_CompilationUnit_problems(LinkedList<Problem> collection) {
    super.contributeTo_CompilationUnit_problems(collection);
    for (Problem value : typeHierarchyProblems()) {
      collection.add(value);
    }
  }
}
