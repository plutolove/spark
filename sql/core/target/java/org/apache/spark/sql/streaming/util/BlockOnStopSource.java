package org.apache.spark.sql.streaming.util;
/** A V1 Streaming Source which blocks on stop(). It does not produce any data. */
public  class BlockOnStopSource implements org.apache.spark.sql.execution.streaming.Source {
  // not preceding
  public   BlockOnStopSource (org.apache.spark.sql.SparkSession spark, java.util.concurrent.CountDownLatch latch)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> getBatch (scala.Option<org.apache.spark.sql.execution.streaming.Offset> start, org.apache.spark.sql.execution.streaming.Offset end)  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.sql.execution.streaming.Offset> getOffset ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType schema ()  { throw new RuntimeException(); }
  // not preceding
  public  void stop ()  { throw new RuntimeException(); }
}
