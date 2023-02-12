package org.apache.spark.sql.streaming.util;
/**
 * A V2 Streaming Source which blocks on stop(). It does not produce any data. We use this for
 * testing stopping in ContinuousExecution.
 */
public  class BlockOnStopContinuousStream implements org.apache.spark.sql.connector.read.streaming.ContinuousStream {
  // not preceding
  public   BlockOnStopContinuousStream (java.util.concurrent.CountDownLatch latch)  { throw new RuntimeException(); }
  public  void commit (org.apache.spark.sql.connector.read.streaming.Offset end)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.read.streaming.ContinuousPartitionReaderFactory createContinuousReaderFactory ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.read.streaming.Offset deserializeOffset (java.lang.String json)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.streaming.Offset initialOffset ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.read.streaming.Offset mergeOffsets (org.apache.spark.sql.connector.read.streaming.PartitionOffset[] offsets)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.read.InputPartition[] planInputPartitions (org.apache.spark.sql.connector.read.streaming.Offset start)  { throw new RuntimeException(); }
  // not preceding
  public  void stop ()  { throw new RuntimeException(); }
}
