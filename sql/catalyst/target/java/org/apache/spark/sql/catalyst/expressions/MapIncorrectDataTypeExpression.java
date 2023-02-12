package org.apache.spark.sql.catalyst.expressions;
/**
 * An expression that returns a MapData with incorrect DataType whose valueContainsNull is false
 * while its value includes null
 */
public  class MapIncorrectDataTypeExpression extends org.apache.spark.sql.catalyst.expressions.LeafExpression implements org.apache.spark.sql.catalyst.expressions.codegen.CodegenFallback, scala.Product, scala.Serializable {
  static public abstract  R apply ()  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  // not preceding
  public   MapIncorrectDataTypeExpression ()  { throw new RuntimeException(); }
  // not preceding
  public  boolean nullable ()  { throw new RuntimeException(); }
  public  Object eval (org.apache.spark.sql.catalyst.InternalRow input)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.DataType dataType ()  { throw new RuntimeException(); }
}
