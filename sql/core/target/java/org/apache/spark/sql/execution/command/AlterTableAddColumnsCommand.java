package org.apache.spark.sql.execution.command;
/**
 * ALTER TABLE ADD COLUMNS command does not support temporary view/table,
 * view, or datasource table with text, orc formats or external provider.
 * For datasource table, it currently only supports parquet, json, csv, orc.
 */
public  class AlterTableAddColumnsCommand extends org.apache.spark.sql.catalyst.plans.logical.LogicalPlan implements org.apache.spark.sql.execution.command.RunnableCommand, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  // not preceding
  public  scala.collection.immutable.Map<java.lang.String, org.apache.spark.sql.execution.metric.SQLMetric> metrics ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.TableIdentifier table ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.types.StructField> colsToAdd ()  { throw new RuntimeException(); }
  // not preceding
  public   AlterTableAddColumnsCommand (org.apache.spark.sql.catalyst.TableIdentifier table, scala.collection.Seq<org.apache.spark.sql.types.StructField> colsToAdd)  { throw new RuntimeException(); }
  // not preceding
  public  scala.collection.Seq<org.apache.spark.sql.Row> run (org.apache.spark.sql.SparkSession sparkSession)  { throw new RuntimeException(); }
}
