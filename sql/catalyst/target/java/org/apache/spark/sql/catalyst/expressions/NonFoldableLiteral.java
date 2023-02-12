package org.apache.spark.sql.catalyst.expressions;
/**
 * A literal value that is not foldable. Used in expression codegen testing to test code path
 * that behave differently based on foldable values.
 */
public  class NonFoldableLiteral extends org.apache.spark.sql.catalyst.expressions.LeafExpression implements scala.Product, scala.Serializable {
  // not preceding
  static public  org.apache.spark.sql.catalyst.expressions.NonFoldableLiteral apply (Object value)  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.catalyst.expressions.NonFoldableLiteral create (Object value, org.apache.spark.sql.types.DataType dataType)  { throw new RuntimeException(); }
  // not preceding
  public  Object value ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.DataType dataType ()  { throw new RuntimeException(); }
  // not preceding
  public   NonFoldableLiteral (Object value, org.apache.spark.sql.types.DataType dataType)  { throw new RuntimeException(); }
  // not preceding
  public  boolean foldable ()  { throw new RuntimeException(); }
  public  boolean nullable ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  Object eval (org.apache.spark.sql.catalyst.InternalRow input)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.codegen.ExprCode doGenCode (org.apache.spark.sql.catalyst.expressions.codegen.CodegenContext ctx, org.apache.spark.sql.catalyst.expressions.codegen.ExprCode ev)  { throw new RuntimeException(); }
}
