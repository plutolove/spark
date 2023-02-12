package org.apache.spark.sql.catalyst.plans.logical;
/**
 * A DESCRIBE FUNCTION statement, as parsed from SQL
 */
public  class DescribeFunctionStatement extends org.apache.spark.sql.catalyst.plans.logical.ParsedStatement implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  // not preceding
  public  scala.collection.Seq<java.lang.String> functionName ()  { throw new RuntimeException(); }
  public  boolean isExtended ()  { throw new RuntimeException(); }
  // not preceding
  public   DescribeFunctionStatement (scala.collection.Seq<java.lang.String> functionName, boolean isExtended)  { throw new RuntimeException(); }
}
