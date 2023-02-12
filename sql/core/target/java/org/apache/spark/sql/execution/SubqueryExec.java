package org.apache.spark.sql.execution;
/**
 * Physical plan for a subquery.
 */
public  class SubqueryExec extends org.apache.spark.sql.execution.BaseSubqueryExec implements org.apache.spark.sql.execution.UnaryExecNode, scala.Product, scala.Serializable {
  // not preceding
  static   scala.concurrent.ExecutionContextExecutorService executionContext ()  { throw new RuntimeException(); }
  // not preceding
  public  java.lang.String name ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.SparkPlan child ()  { throw new RuntimeException(); }
  // not preceding
  public   SubqueryExec (java.lang.String name, org.apache.spark.sql.execution.SparkPlan child)  { throw new RuntimeException(); }
  // not preceding
  public  scala.collection.immutable.Map<java.lang.String, org.apache.spark.sql.execution.metric.SQLMetric> metrics ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.execution.SparkPlan doCanonicalize ()  { throw new RuntimeException(); }
  protected  void doPrepare ()  { throw new RuntimeException(); }
  protected  org.apache.spark.rdd.RDD<org.apache.spark.sql.catalyst.InternalRow> doExecute ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.InternalRow[] executeCollect ()  { throw new RuntimeException(); }
  public  scala.collection.Iterator<java.lang.Object> stringArgs ()  { throw new RuntimeException(); }
}
