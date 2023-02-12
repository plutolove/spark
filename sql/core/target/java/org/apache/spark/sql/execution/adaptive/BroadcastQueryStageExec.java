package org.apache.spark.sql.execution.adaptive;
/**
 * A broadcast query stage whose child is a {@link BroadcastExchangeLike} or {@link ReusedExchangeExec}.
 */
public  class BroadcastQueryStageExec extends org.apache.spark.sql.execution.adaptive.QueryStageExec implements scala.Product, scala.Serializable {
  // not preceding
  public  int id ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.SparkPlan plan ()  { throw new RuntimeException(); }
  // not preceding
  public   BroadcastQueryStageExec (int id, org.apache.spark.sql.execution.SparkPlan plan)  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.execution.exchange.BroadcastExchangeLike broadcast ()  { throw new RuntimeException(); }
  public  scala.concurrent.Future<java.lang.Object> doMaterialize ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.adaptive.QueryStageExec newReuseInstance (int newStageId, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> newOutput)  { throw new RuntimeException(); }
  public  void cancel ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.Statistics getRuntimeStatistics ()  { throw new RuntimeException(); }
}
