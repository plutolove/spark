package org.apache.spark.sql;
/**
 * Custom Exchange used in tests to demonstrate that broadcasts can be replaced regardless of
 * whether AQE is enabled.
 */
public  class MyBroadcastExchangeExec extends org.apache.spark.sql.execution.exchange.Exchange implements org.apache.spark.sql.execution.exchange.BroadcastExchangeLike, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.execution.exchange.BroadcastExchangeExec delegate ()  { throw new RuntimeException(); }
  // not preceding
  public   MyBroadcastExchangeExec (org.apache.spark.sql.execution.exchange.BroadcastExchangeExec delegate)  { throw new RuntimeException(); }
  // not preceding
  public  java.util.UUID runId ()  { throw new RuntimeException(); }
  public  java.util.concurrent.Future<org.apache.spark.broadcast.Broadcast<java.lang.Object>> relationFuture ()  { throw new RuntimeException(); }
  public  scala.concurrent.Future<org.apache.spark.broadcast.Broadcast<java.lang.Object>> completionFuture ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.Statistics runtimeStatistics ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.SparkPlan child ()  { throw new RuntimeException(); }
  protected  void doPrepare ()  { throw new RuntimeException(); }
  protected  org.apache.spark.rdd.RDD<org.apache.spark.sql.catalyst.InternalRow> doExecute ()  { throw new RuntimeException(); }
  public <T extends java.lang.Object> org.apache.spark.broadcast.Broadcast<T> doExecuteBroadcast ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.physical.Partitioning outputPartitioning ()  { throw new RuntimeException(); }
}
