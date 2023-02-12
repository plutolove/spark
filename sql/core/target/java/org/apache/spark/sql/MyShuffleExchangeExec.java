package org.apache.spark.sql;
/**
 * Custom Exchange used in tests to demonstrate that shuffles can be replaced regardless of
 * whether AQE is enabled.
 */
public  class MyShuffleExchangeExec extends org.apache.spark.sql.execution.exchange.Exchange implements org.apache.spark.sql.execution.exchange.ShuffleExchangeLike, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.execution.exchange.ShuffleExchangeExec delegate ()  { throw new RuntimeException(); }
  // not preceding
  public   MyShuffleExchangeExec (org.apache.spark.sql.execution.exchange.ShuffleExchangeExec delegate)  { throw new RuntimeException(); }
  // not preceding
  public  int numMappers ()  { throw new RuntimeException(); }
  public  int numPartitions ()  { throw new RuntimeException(); }
  public  boolean canChangeNumPartitions ()  { throw new RuntimeException(); }
  public  scala.concurrent.Future<org.apache.spark.MapOutputStatistics> mapOutputStatisticsFuture ()  { throw new RuntimeException(); }
  public  org.apache.spark.rdd.RDD<?> getShuffleRDD (org.apache.spark.sql.execution.ShufflePartitionSpec[] partitionSpecs)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.Statistics runtimeStatistics ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.SparkPlan child ()  { throw new RuntimeException(); }
  protected  org.apache.spark.rdd.RDD<org.apache.spark.sql.catalyst.InternalRow> doExecute ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.physical.Partitioning outputPartitioning ()  { throw new RuntimeException(); }
}
