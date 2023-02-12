package org.apache.spark;
// not preceding
// TypeApply(Select(Apply(Select(Apply(Select(Apply(Select(This(TypeName("ShuffleDependency")), TermName("_rdd")), List()), TermName("sparkContext")), List()), TermName("cleaner")), List()), TermName("foreach")), List(TypeTree()))
// Select(Apply(Select(Apply(Select(Apply(Select(This(TypeName("ShuffleDependency")), TermName("_rdd")), List()), TermName("sparkContext")), List()), TermName("cleaner")), List()), TermName("foreach"))
// Apply(Select(Apply(Select(Apply(Select(This(TypeName("ShuffleDependency")), TermName("_rdd")), List()), TermName("sparkContext")), List()), TermName("cleaner")), List())
// Select(Apply(Select(Apply(Select(This(TypeName("ShuffleDependency")), TermName("_rdd")), List()), TermName("sparkContext")), List()), TermName("cleaner"))
// Apply(Select(Apply(Select(This(TypeName("ShuffleDependency")), TermName("_rdd")), List()), TermName("sparkContext")), List())
// Select(Apply(Select(This(TypeName("ShuffleDependency")), TermName("_rdd")), List()), TermName("sparkContext"))
// Apply(Select(This(TypeName("ShuffleDependency")), TermName("_rdd")), List())
// Select(This(TypeName("ShuffleDependency")), TermName("_rdd"))
// This(TypeName("ShuffleDependency"))
// TypeTree()
// Block(List(DefDef(Modifiers(FINAL | METHOD | ARTIFACT), TermName("$anonfun$new"), List(), List(List(ValDef(Modifiers(PARAM | SYNTHETIC), TermName("x$2"), TypeTree(), EmptyTree))), TypeTree(), Apply(Select(Ident(TermName("x$2")), TermName("registerShuffleForCleanup")), List(This(TypeName("ShuffleDependency")))))), Function(List(ValDef(Modifiers(PARAM | SYNTHETIC), TermName("x$2"), TypeTree(), EmptyTree)), Apply(Ident(TermName("$anonfun$new")), List(Ident(TermName("x$2"))))))
// DefDef(Modifiers(FINAL | METHOD | ARTIFACT), TermName("$anonfun$new"), List(), List(List(ValDef(Modifiers(PARAM | SYNTHETIC), TermName("x$2"), TypeTree(), EmptyTree))), TypeTree(), Apply(Select(Ident(TermName("x$2")), TermName("registerShuffleForCleanup")), List(This(TypeName("ShuffleDependency")))))
// ValDef(Modifiers(PARAM | SYNTHETIC), TermName("x$2"), TypeTree(), EmptyTree)
// TypeTree()
// Apply(Select(Ident(TermName("x$2")), TermName("registerShuffleForCleanup")), List(This(TypeName("ShuffleDependency"))))
// Select(Ident(TermName("x$2")), TermName("registerShuffleForCleanup"))
// Ident(TermName("x$2"))
// This(TypeName("ShuffleDependency"))
// Function(List(ValDef(Modifiers(PARAM | SYNTHETIC), TermName("x$2"), TypeTree(), EmptyTree)), Apply(Ident(TermName("$anonfun$new")), List(Ident(TermName("x$2")))))
// ValDef(Modifiers(PARAM | SYNTHETIC), TermName("x$2"), TypeTree(), EmptyTree)
// Apply(Ident(TermName("$anonfun$new")), List(Ident(TermName("x$2"))))
// Ident(TermName("$anonfun$new"))
// Ident(TermName("x$2"))
// Select(Apply(Select(Apply(Select(Apply(Select(This(TypeName("ShuffleDependency")), TermName("_rdd")), List()), TermName("sparkContext")), List()), TermName("shuffleDriverComponents")), List()), TermName("registerShuffle"))
// Apply(Select(Apply(Select(Apply(Select(This(TypeName("ShuffleDependency")), TermName("_rdd")), List()), TermName("sparkContext")), List()), TermName("shuffleDriverComponents")), List())
// Select(Apply(Select(Apply(Select(This(TypeName("ShuffleDependency")), TermName("_rdd")), List()), TermName("sparkContext")), List()), TermName("shuffleDriverComponents"))
// Apply(Select(Apply(Select(This(TypeName("ShuffleDependency")), TermName("_rdd")), List()), TermName("sparkContext")), List())
// Select(Apply(Select(This(TypeName("ShuffleDependency")), TermName("_rdd")), List()), TermName("sparkContext"))
// Apply(Select(This(TypeName("ShuffleDependency")), TermName("_rdd")), List())
// Select(This(TypeName("ShuffleDependency")), TermName("_rdd"))
// This(TypeName("ShuffleDependency"))
// Apply(Select(This(TypeName("ShuffleDependency")), TermName("shuffleId")), List())
// Select(This(TypeName("ShuffleDependency")), TermName("shuffleId"))
// This(TypeName("ShuffleDependency"))
public  class ShuffleDependency$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final ShuffleDependency$ MODULE$ = null;
  public   ShuffleDependency$ ()  { throw new RuntimeException(); }
}
