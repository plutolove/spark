package org.apache.spark.sql.catalyst.expressions;
/**
 * An expression that generates bad code (variable name "some_variable" is not unique across
 * instances of the expression.
 */
public  class BadCodegenExpression extends org.apache.spark.sql.catalyst.expressions.LeafExpression implements scala.Product, scala.Serializable {
  static public abstract  R apply ()  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  // not preceding
  public   BadCodegenExpression ()  { throw new RuntimeException(); }
  // not preceding
  public  boolean nullable ()  { throw new RuntimeException(); }
  public  Object eval (org.apache.spark.sql.catalyst.InternalRow input)  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.expressions.codegen.ExprCode doGenCode (org.apache.spark.sql.catalyst.expressions.codegen.CodegenContext ctx, org.apache.spark.sql.catalyst.expressions.codegen.ExprCode ev)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.DataType dataType ()  { throw new RuntimeException(); }
}
