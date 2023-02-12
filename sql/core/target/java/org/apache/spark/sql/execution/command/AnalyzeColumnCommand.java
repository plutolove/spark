package org.apache.spark.sql.execution.command;
/** Returns true iff the we support gathering column statistics on column of the given type. */
public  class AnalyzeColumnCommand extends org.apache.spark.sql.catalyst.plans.logical.LogicalPlan implements org.apache.spark.sql.execution.command.RunnableCommand, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  // not preceding
  public  scala.collection.immutable.Map<java.lang.String, org.apache.spark.sql.execution.metric.SQLMetric> metrics ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.TableIdentifier tableIdent ()  { throw new RuntimeException(); }
  public  scala.Option<scala.collection.Seq<java.lang.String>> columnNames ()  { throw new RuntimeException(); }
  public  boolean allColumns ()  { throw new RuntimeException(); }
  // not preceding
  public   AnalyzeColumnCommand (org.apache.spark.sql.catalyst.TableIdentifier tableIdent, scala.Option<scala.collection.Seq<java.lang.String>> columnNames, boolean allColumns)  { throw new RuntimeException(); }
  // not preceding
  public  scala.collection.Seq<org.apache.spark.sql.Row> run (org.apache.spark.sql.SparkSession sparkSession)  { throw new RuntimeException(); }
}
