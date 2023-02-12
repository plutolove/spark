package org.apache.spark.sql.catalyst.expressions;
/**
 * Initializes internal states given the current partition index.
 * This is used by nondeterministic expressions to set initial states.
 * The default implementation does nothing.
 */
public  class InterpretedPredicate extends org.apache.spark.sql.catalyst.expressions.BasePredicate implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.catalyst.expressions.Expression expression ()  { throw new RuntimeException(); }
  // not preceding
  public   InterpretedPredicate (org.apache.spark.sql.catalyst.expressions.Expression expression)  { throw new RuntimeException(); }
  // not preceding
  public  boolean eval (org.apache.spark.sql.catalyst.InternalRow r)  { throw new RuntimeException(); }
  public  void initialize (int partitionIndex)  { throw new RuntimeException(); }
}
