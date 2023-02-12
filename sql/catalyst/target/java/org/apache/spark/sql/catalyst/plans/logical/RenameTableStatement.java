package org.apache.spark.sql.catalyst.plans.logical;
/**
 * ALTER TABLE ... RENAME TO command, as parsed from SQL.
 */
public  class RenameTableStatement extends org.apache.spark.sql.catalyst.plans.logical.ParsedStatement implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  // not preceding
  public  scala.collection.Seq<java.lang.String> oldName ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.String> newName ()  { throw new RuntimeException(); }
  public  boolean isView ()  { throw new RuntimeException(); }
  // not preceding
  public   RenameTableStatement (scala.collection.Seq<java.lang.String> oldName, scala.collection.Seq<java.lang.String> newName, boolean isView)  { throw new RuntimeException(); }
}
