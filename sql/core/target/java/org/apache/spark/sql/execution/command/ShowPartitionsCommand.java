package org.apache.spark.sql.execution.command;
/**
 * Validate and throws an {@link AnalysisException} exception under the following conditions:
 * 1. If the table is not partitioned.
 * 2. If it is a datasource table.
 * 3. If it is a view.
 */
public  class ShowPartitionsCommand extends org.apache.spark.sql.catalyst.plans.logical.LogicalPlan implements org.apache.spark.sql.execution.command.RunnableCommand, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  // not preceding
  public  scala.collection.immutable.Map<java.lang.String, org.apache.spark.sql.execution.metric.SQLMetric> metrics ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.TableIdentifier tableName ()  { throw new RuntimeException(); }
  public  scala.Option<scala.collection.immutable.Map<java.lang.String, java.lang.String>> spec ()  { throw new RuntimeException(); }
  // not preceding
  public   ShowPartitionsCommand (org.apache.spark.sql.catalyst.TableIdentifier tableName, scala.Option<scala.collection.immutable.Map<java.lang.String, java.lang.String>> spec)  { throw new RuntimeException(); }
  // not preceding
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output ()  { throw new RuntimeException(); }
  /**
   * Validate and throws an {@link AnalysisException} exception under the following conditions:
   * 1. If the table is not partitioned.
   * 2. If it is a datasource table.
   * 3. If it is a view.
   * @param sparkSession (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.Seq<org.apache.spark.sql.Row> run (org.apache.spark.sql.SparkSession sparkSession)  { throw new RuntimeException(); }
}
