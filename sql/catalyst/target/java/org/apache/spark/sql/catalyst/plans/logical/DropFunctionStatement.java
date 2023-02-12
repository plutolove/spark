package org.apache.spark.sql.catalyst.plans.logical;
/**
 *  DROP FUNCTION statement, as parsed from SQL
 */
public  class DropFunctionStatement extends org.apache.spark.sql.catalyst.plans.logical.ParsedStatement implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  // not preceding
  public  scala.collection.Seq<java.lang.String> functionName ()  { throw new RuntimeException(); }
  public  boolean ifExists ()  { throw new RuntimeException(); }
  public  boolean isTemp ()  { throw new RuntimeException(); }
  // not preceding
  public   DropFunctionStatement (scala.collection.Seq<java.lang.String> functionName, boolean ifExists, boolean isTemp)  { throw new RuntimeException(); }
}
