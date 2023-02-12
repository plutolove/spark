package org.apache.spark.sql.catalyst.expressions.codegen;
/**
 * An expression that's non-deterministic and doesn't support codegen.
 */
public  class NondeterministicExpression extends org.apache.spark.sql.catalyst.expressions.LeafExpression implements org.apache.spark.sql.catalyst.expressions.Nondeterministic, org.apache.spark.sql.catalyst.expressions.codegen.CodegenFallback, scala.Product, scala.Serializable {
  static public abstract  R apply ()  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  // not preceding
  public final  boolean deterministic ()  { throw new RuntimeException(); }
  // not preceding
  public   NondeterministicExpression ()  { throw new RuntimeException(); }
  // not preceding
  protected  void initializeInternal (int partitionIndex)  { throw new RuntimeException(); }
  protected  Object evalInternal (org.apache.spark.sql.catalyst.InternalRow input)  { throw new RuntimeException(); }
  public  boolean nullable ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.DataType dataType ()  { throw new RuntimeException(); }
}
