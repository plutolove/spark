package org.apache.spark.sql.catalyst.plans.logical;
/**
 * A SHOW TABLE EXTENDED statement, as parsed from SQL.
 */
public  class ShowTableStatement extends org.apache.spark.sql.catalyst.plans.logical.ParsedStatement implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  // not preceding
  public  scala.Option<scala.collection.Seq<java.lang.String>> namespace ()  { throw new RuntimeException(); }
  public  java.lang.String pattern ()  { throw new RuntimeException(); }
  public  scala.Option<scala.collection.immutable.Map<java.lang.String, java.lang.String>> partitionSpec ()  { throw new RuntimeException(); }
  // not preceding
  public   ShowTableStatement (scala.Option<scala.collection.Seq<java.lang.String>> namespace, java.lang.String pattern, scala.Option<scala.collection.immutable.Map<java.lang.String, java.lang.String>> partitionSpec)  { throw new RuntimeException(); }
}
