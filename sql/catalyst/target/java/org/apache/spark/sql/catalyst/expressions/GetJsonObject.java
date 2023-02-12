package org.apache.spark.sql.catalyst.expressions;
/**
 * Evaluate a list of JsonPath instructions, returning a bool that indicates if any leaf nodes
 * have been written to the generator
 */
public  class GetJsonObject extends org.apache.spark.sql.catalyst.expressions.BinaryExpression implements org.apache.spark.sql.catalyst.expressions.ExpectsInputTypes, org.apache.spark.sql.catalyst.expressions.codegen.CodegenFallback, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.catalyst.expressions.Expression json ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression path ()  { throw new RuntimeException(); }
  // not preceding
  public   GetJsonObject (org.apache.spark.sql.catalyst.expressions.Expression json, org.apache.spark.sql.catalyst.expressions.Expression path)  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.catalyst.expressions.Expression left ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression right ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.types.DataType> inputTypes ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.DataType dataType ()  { throw new RuntimeException(); }
  public  boolean nullable ()  { throw new RuntimeException(); }
  public  java.lang.String prettyName ()  { throw new RuntimeException(); }
  public  Object eval (org.apache.spark.sql.catalyst.InternalRow input)  { throw new RuntimeException(); }
}
