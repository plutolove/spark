package org.apache.spark.sql.hive.execution;
/**
 * Inserts all the rows in the table into Hive.  Row objects are properly serialized with the
 * <code>org.apache.hadoop.hive.serde2.SerDe</code> and the
 * <code>org.apache.hadoop.mapred.OutputFormat</code> provided by the table definition.
 */
public  class InsertIntoHiveTable extends org.apache.spark.sql.catalyst.plans.logical.LogicalPlan implements org.apache.spark.sql.hive.execution.SaveAsHiveFile, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3, T4 v4, T5 v5, T6 v6)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  // not preceding
  public  scala.Option<org.apache.hadoop.fs.Path> createdTempDir ()  { throw new RuntimeException(); }
  // not preceding
  public  scala.collection.immutable.Map<java.lang.String, org.apache.spark.sql.execution.metric.SQLMetric> metrics ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.catalog.CatalogTable table ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, scala.Option<java.lang.String>> partition ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan query ()  { throw new RuntimeException(); }
  public  boolean overwrite ()  { throw new RuntimeException(); }
  public  boolean ifPartitionNotExists ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.String> outputColumnNames ()  { throw new RuntimeException(); }
  // not preceding
  public   InsertIntoHiveTable (org.apache.spark.sql.catalyst.catalog.CatalogTable table, scala.collection.immutable.Map<java.lang.String, scala.Option<java.lang.String>> partition, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan query, boolean overwrite, boolean ifPartitionNotExists, scala.collection.Seq<java.lang.String> outputColumnNames)  { throw new RuntimeException(); }
  // not preceding
  public  scala.collection.Seq<org.apache.spark.sql.Row> run (org.apache.spark.sql.SparkSession sparkSession, org.apache.spark.sql.execution.SparkPlan child)  { throw new RuntimeException(); }
}
