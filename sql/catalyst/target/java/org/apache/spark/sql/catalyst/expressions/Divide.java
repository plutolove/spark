package org.apache.spark.sql.catalyst.expressions;
/**
 * Special case handling due to division/remainder by 0 =&gt; null.
 */
public  class Divide extends org.apache.spark.sql.catalyst.expressions.BinaryArithmetic implements org.apache.spark.sql.catalyst.expressions.DivModLike, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.catalyst.expressions.Expression left ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression right ()  { throw new RuntimeException(); }
  // not preceding
  public   Divide (org.apache.spark.sql.catalyst.expressions.Expression left, org.apache.spark.sql.catalyst.expressions.Expression right)  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.types.AbstractDataType inputType ()  { throw new RuntimeException(); }
  public  java.lang.String symbol ()  { throw new RuntimeException(); }
  public  java.lang.String decimalMethod ()  { throw new RuntimeException(); }
  public  Object evalOperation (Object left, Object right)  { throw new RuntimeException(); }
}
