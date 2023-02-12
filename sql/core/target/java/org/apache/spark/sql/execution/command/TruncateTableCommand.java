package org.apache.spark.sql.execution.command;
/**
 * A command to truncate table.
 * <p>
 * The syntax of this command is:
 * <pre><code>
 *   TRUNCATE TABLE tablename [PARTITION (partcol1=val1, partcol2=val2 ...)]
 * </code></pre>
 */
public  class TruncateTableCommand extends org.apache.spark.sql.catalyst.plans.logical.LogicalPlan implements org.apache.spark.sql.execution.command.RunnableCommand, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  // not preceding
  public  scala.collection.immutable.Map<java.lang.String, org.apache.spark.sql.execution.metric.SQLMetric> metrics ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.TableIdentifier tableName ()  { throw new RuntimeException(); }
  public  scala.Option<scala.collection.immutable.Map<java.lang.String, java.lang.String>> partitionSpec ()  { throw new RuntimeException(); }
  // not preceding
  public   TruncateTableCommand (org.apache.spark.sql.catalyst.TableIdentifier tableName, scala.Option<scala.collection.immutable.Map<java.lang.String, java.lang.String>> partitionSpec)  { throw new RuntimeException(); }
  // not preceding
  public  scala.collection.Seq<org.apache.spark.sql.Row> run (org.apache.spark.sql.SparkSession spark)  { throw new RuntimeException(); }
}