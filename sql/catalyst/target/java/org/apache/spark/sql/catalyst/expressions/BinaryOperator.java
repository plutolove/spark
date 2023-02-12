package org.apache.spark.sql.catalyst.expressions;
/**
 * Expected input type from both left/right child expressions, similar to the
 * {@link ImplicitCastInputTypes} trait.
 */
public abstract class BinaryOperator extends org.apache.spark.sql.catalyst.expressions.BinaryExpression implements org.apache.spark.sql.catalyst.expressions.ExpectsInputTypes {
  // not preceding
  static public  scala.Option<scala.Tuple2<org.apache.spark.sql.catalyst.expressions.Expression, org.apache.spark.sql.catalyst.expressions.Expression>> unapply (org.apache.spark.sql.catalyst.expressions.BinaryOperator e)  { throw new RuntimeException(); }
  // not preceding
  public   BinaryOperator ()  { throw new RuntimeException(); }
  // not preceding
  public abstract  org.apache.spark.sql.types.AbstractDataType inputType ()  ;
  public abstract  java.lang.String symbol ()  ;
  public  java.lang.String sqlOperator ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.types.AbstractDataType> inputTypes ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.analysis.TypeCheckResult checkInputDataTypes ()  { throw new RuntimeException(); }
  public  java.lang.String sql ()  { throw new RuntimeException(); }
}
