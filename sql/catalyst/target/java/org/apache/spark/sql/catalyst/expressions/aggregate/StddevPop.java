package org.apache.spark.sql.catalyst.expressions.aggregate;
/**
 * The central moment order to be computed.
 */
public  class StddevPop extends org.apache.spark.sql.catalyst.expressions.aggregate.CentralMomentAgg implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.catalyst.expressions.Expression child ()  { throw new RuntimeException(); }
  // not preceding
  public   StddevPop (org.apache.spark.sql.catalyst.expressions.Expression child)  { throw new RuntimeException(); }
  // not preceding
  protected  int momentOrder ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression evaluateExpression ()  { throw new RuntimeException(); }
  public  java.lang.String prettyName ()  { throw new RuntimeException(); }
}
