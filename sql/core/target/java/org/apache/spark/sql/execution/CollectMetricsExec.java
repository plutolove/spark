package org.apache.spark.sql.execution;
/**
 * Collect arbitrary (named) metrics from a {@link SparkPlan}.
 */
public  class CollectMetricsExec extends org.apache.spark.sql.execution.SparkPlan implements org.apache.spark.sql.execution.UnaryExecNode, scala.Product, scala.Serializable {
  // not preceding
  static public  scala.collection.immutable.Map<java.lang.String, org.apache.spark.sql.Row> collect (org.apache.spark.sql.execution.SparkPlan plan)  { throw new RuntimeException(); }
  // not preceding
  public  java.lang.String name ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> metricExpressions ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.SparkPlan child ()  { throw new RuntimeException(); }
  // not preceding
  public   CollectMetricsExec (java.lang.String name, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> metricExpressions, org.apache.spark.sql.execution.SparkPlan child)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType metricsSchema ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Row collectedMetrics ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.physical.Partitioning outputPartitioning ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.SortOrder> outputOrdering ()  { throw new RuntimeException(); }
  protected  org.apache.spark.rdd.RDD<org.apache.spark.sql.catalyst.InternalRow> doExecute ()  { throw new RuntimeException(); }
}
