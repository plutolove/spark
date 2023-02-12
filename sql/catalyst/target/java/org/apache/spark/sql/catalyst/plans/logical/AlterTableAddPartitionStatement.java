package org.apache.spark.sql.catalyst.plans.logical;
/**
 * ALTER TABLE ... ADD PARTITION command, as parsed from SQL
 */
public  class AlterTableAddPartitionStatement extends org.apache.spark.sql.catalyst.plans.logical.ParsedStatement implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  // not preceding
  public  scala.collection.Seq<java.lang.String> tableName ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<scala.Tuple2<scala.collection.immutable.Map<java.lang.String, java.lang.String>, scala.Option<java.lang.String>>> partitionSpecsAndLocs ()  { throw new RuntimeException(); }
  public  boolean ifNotExists ()  { throw new RuntimeException(); }
  // not preceding
  public   AlterTableAddPartitionStatement (scala.collection.Seq<java.lang.String> tableName, scala.collection.Seq<scala.Tuple2<scala.collection.immutable.Map<java.lang.String, java.lang.String>, scala.Option<java.lang.String>>> partitionSpecsAndLocs, boolean ifNotExists)  { throw new RuntimeException(); }
}
