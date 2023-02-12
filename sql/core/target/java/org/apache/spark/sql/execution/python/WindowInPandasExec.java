package org.apache.spark.sql.execution.python;
/**
 * Helper functions and data structures for window bounds
 * <p>
 * It contains:
 * (1) Total number of window bound indices in the python input row
 * (2) Function from frame index to its lower bound column index in the python input row
 * (3) Function from frame index to its upper bound column index in the python input row
 * (4) Seq from frame index to its window bound type
 */
public  class WindowInPandasExec extends org.apache.spark.sql.execution.window.WindowExecBase implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3, T4 v4)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  // not preceding
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> windowExpression ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> partitionSpec ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.SortOrder> orderSpec ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.SparkPlan child ()  { throw new RuntimeException(); }
  // not preceding
  public   WindowInPandasExec (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> windowExpression, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> partitionSpec, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.SortOrder> orderSpec, org.apache.spark.sql.execution.SparkPlan child)  { throw new RuntimeException(); }
  // not preceding
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.plans.physical.Distribution> requiredChildDistribution ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.SortOrder>> requiredChildOrdering ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.SortOrder> outputOrdering ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.physical.Partitioning outputPartitioning ()  { throw new RuntimeException(); }
  protected  org.apache.spark.rdd.RDD<org.apache.spark.sql.catalyst.InternalRow> doExecute ()  { throw new RuntimeException(); }
}
