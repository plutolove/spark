package org.apache.spark.sql.catalyst.expressions;
public  class Extract extends org.apache.spark.sql.catalyst.expressions.UnaryExpression implements org.apache.spark.sql.catalyst.expressions.RuntimeReplaceable, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.catalyst.expressions.Expression canonicalized ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression field ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression source ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression child ()  { throw new RuntimeException(); }
  // not preceding
  public   Extract (org.apache.spark.sql.catalyst.expressions.Expression field, org.apache.spark.sql.catalyst.expressions.Expression source, org.apache.spark.sql.catalyst.expressions.Expression child)  { throw new RuntimeException(); }
  // not preceding
  public   Extract (org.apache.spark.sql.catalyst.expressions.Expression field, org.apache.spark.sql.catalyst.expressions.Expression source)  { throw new RuntimeException(); }
  public  scala.collection.Iterator<java.lang.Object> flatArguments ()  { throw new RuntimeException(); }
  public  java.lang.String sql ()  { throw new RuntimeException(); }
  public  java.lang.String prettyName ()  { throw new RuntimeException(); }
}