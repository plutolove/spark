package org.apache.spark.sql.catalyst.plans.logical;
/**
 * ALTER TABLE ... SERDEPROPERTIES command, as parsed from SQL
 */
public  class AlterTableSerDePropertiesStatement extends org.apache.spark.sql.catalyst.plans.logical.ParsedStatement implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3, T4 v4)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  // not preceding
  public  scala.collection.Seq<java.lang.String> tableName ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> serdeClassName ()  { throw new RuntimeException(); }
  public  scala.Option<scala.collection.immutable.Map<java.lang.String, java.lang.String>> serdeProperties ()  { throw new RuntimeException(); }
  public  scala.Option<scala.collection.immutable.Map<java.lang.String, java.lang.String>> partitionSpec ()  { throw new RuntimeException(); }
  // not preceding
  public   AlterTableSerDePropertiesStatement (scala.collection.Seq<java.lang.String> tableName, scala.Option<java.lang.String> serdeClassName, scala.Option<scala.collection.immutable.Map<java.lang.String, java.lang.String>> serdeProperties, scala.Option<scala.collection.immutable.Map<java.lang.String, java.lang.String>> partitionSpec)  { throw new RuntimeException(); }
}
