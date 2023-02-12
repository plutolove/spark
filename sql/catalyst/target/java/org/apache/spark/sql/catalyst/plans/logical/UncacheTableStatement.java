package org.apache.spark.sql.catalyst.plans.logical;
/**
 * An UNCACHE TABLE statement, as parsed from SQL
 */
public  class UncacheTableStatement extends org.apache.spark.sql.catalyst.plans.logical.ParsedStatement implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  // not preceding
  public  scala.collection.Seq<java.lang.String> tableName ()  { throw new RuntimeException(); }
  public  boolean ifExists ()  { throw new RuntimeException(); }
  // not preceding
  public   UncacheTableStatement (scala.collection.Seq<java.lang.String> tableName, boolean ifExists)  { throw new RuntimeException(); }
}
