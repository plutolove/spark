package org.apache.spark.sql.catalyst.expressions;
/**
 * Natural log, i.e. using e as the base.
 */
public  class Logarithm extends org.apache.spark.sql.catalyst.expressions.BinaryMathExpression implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.catalyst.expressions.Expression left ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression right ()  { throw new RuntimeException(); }
  // not preceding
  public   Logarithm (org.apache.spark.sql.catalyst.expressions.Expression left, org.apache.spark.sql.catalyst.expressions.Expression right)  { throw new RuntimeException(); }
  // not preceding
  public   Logarithm (org.apache.spark.sql.catalyst.expressions.Expression child)  { throw new RuntimeException(); }
  public  boolean nullable ()  { throw new RuntimeException(); }
  protected  Object nullSafeEval (Object input1, Object input2)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.codegen.ExprCode doGenCode (org.apache.spark.sql.catalyst.expressions.codegen.CodegenContext ctx, org.apache.spark.sql.catalyst.expressions.codegen.ExprCode ev)  { throw new RuntimeException(); }
}
