package org.apache.spark.sql.catalyst.plans.logical;
/**
 * A LOAD DATA INTO TABLE statement, as parsed from SQL
 */
public  class LoadDataStatement extends org.apache.spark.sql.catalyst.plans.logical.ParsedStatement implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3, T4 v4, T5 v5)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  // not preceding
  public  scala.collection.Seq<java.lang.String> tableName ()  { throw new RuntimeException(); }
  public  java.lang.String path ()  { throw new RuntimeException(); }
  public  boolean isLocal ()  { throw new RuntimeException(); }
  public  boolean isOverwrite ()  { throw new RuntimeException(); }
  public  scala.Option<scala.collection.immutable.Map<java.lang.String, java.lang.String>> partition ()  { throw new RuntimeException(); }
  // not preceding
  public   LoadDataStatement (scala.collection.Seq<java.lang.String> tableName, java.lang.String path, boolean isLocal, boolean isOverwrite, scala.Option<scala.collection.immutable.Map<java.lang.String, java.lang.String>> partition)  { throw new RuntimeException(); }
}
