package org.apache.spark.sql.execution.exchange;
/**
 * For registering callbacks on <code>relationFuture</code>.
 * Note that calling this field will not start the execution of broadcast job.
 */
public  class BroadcastExchangeExec extends org.apache.spark.sql.execution.exchange.Exchange implements org.apache.spark.sql.execution.exchange.BroadcastExchangeLike, scala.Product, scala.Serializable {
  // not preceding
  static public  long MAX_BROADCAST_TABLE_ROWS ()  { throw new RuntimeException(); }
  static public  long MAX_BROADCAST_TABLE_BYTES ()  { throw new RuntimeException(); }
  static   scala.concurrent.ExecutionContextExecutorService executionContext ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.catalyst.plans.physical.BroadcastMode mode ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.SparkPlan child ()  { throw new RuntimeException(); }
  // not preceding
  public   BroadcastExchangeExec (org.apache.spark.sql.catalyst.plans.physical.BroadcastMode mode, org.apache.spark.sql.execution.SparkPlan child)  { throw new RuntimeException(); }
  // not preceding
  public  java.util.UUID runId ()  { throw new RuntimeException(); }
  // not preceding
  public  scala.collection.immutable.Map<java.lang.String, org.apache.spark.sql.execution.metric.SQLMetric> metrics ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.physical.Partitioning outputPartitioning ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.SparkPlan doCanonicalize ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.Statistics runtimeStatistics ()  { throw new RuntimeException(); }
  // not preceding
  public  scala.concurrent.Future<org.apache.spark.broadcast.Broadcast<java.lang.Object>> completionFuture ()  { throw new RuntimeException(); }
  // not preceding
  public  java.util.concurrent.Future<org.apache.spark.broadcast.Broadcast<java.lang.Object>> relationFuture ()  { throw new RuntimeException(); }
  protected  void doPrepare ()  { throw new RuntimeException(); }
  protected  org.apache.spark.rdd.RDD<org.apache.spark.sql.catalyst.InternalRow> doExecute ()  { throw new RuntimeException(); }
  protected <T extends java.lang.Object> org.apache.spark.broadcast.Broadcast<T> doExecuteBroadcast ()  { throw new RuntimeException(); }
}
