package org.apache.spark.status;
/** Use this to annotate constructor params to be used as KVStore indices. */
// not preceding
public  class KVUtils$ implements org.apache.spark.internal.Logging {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final KVUtils$ MODULE$ = null;
  public   KVUtils$ ()  { throw new RuntimeException(); }
  // not preceding
  // Select(Select(This(TypeName("KVStoreScalaSerializer")), TermName("mapper")), TermName("registerModule"))
  // Select(This(TypeName("KVStoreScalaSerializer")), TermName("mapper"))
  // This(TypeName("KVStoreScalaSerializer"))
  // Select(Select(Select(Select(Select(Ident(com), com.fasterxml), com.fasterxml.jackson), com.fasterxml.jackson.module), com.fasterxml.jackson.module.scala), com.fasterxml.jackson.module.scala.DefaultScalaModule)
  // Select(Select(Select(Select(Ident(com), com.fasterxml), com.fasterxml.jackson), com.fasterxml.jackson.module), com.fasterxml.jackson.module.scala)
  // Select(Select(Select(Ident(com), com.fasterxml), com.fasterxml.jackson), com.fasterxml.jackson.module)
  // Select(Select(Ident(com), com.fasterxml), com.fasterxml.jackson)
  // Select(Ident(com), com.fasterxml)
  // Ident(com)
  // Select(Select(This(TypeName("KVStoreScalaSerializer")), TermName("mapper")), TermName("setSerializationInclusion"))
  // Select(This(TypeName("KVStoreScalaSerializer")), TermName("mapper"))
  // This(TypeName("KVStoreScalaSerializer"))
  // Literal(Constant(Java enum NON_ABSENT))
  public <M extends java.lang.Object> org.apache.spark.util.kvstore.LevelDB open (java.io.File path, M metadata, scala.reflect.ClassTag<M> evidence$1)  { throw new RuntimeException(); }
  /** Turns a KVStoreView into a Scala sequence, applying a filter. */
  public <T extends java.lang.Object> scala.collection.Seq<T> viewToSeq (org.apache.spark.util.kvstore.KVStoreView<T> view, int max, scala.Function1<T, java.lang.Object> filter)  { throw new RuntimeException(); }
}
