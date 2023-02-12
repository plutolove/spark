package org.apache.spark.sql.streaming.sources;
public  class FakeDataStream implements org.apache.spark.sql.connector.read.streaming.MicroBatchStream, org.apache.spark.sql.connector.read.streaming.ContinuousStream {
  // not preceding
  public   FakeDataStream ()  { throw new RuntimeException(); }
  public  void commit (org.apache.spark.sql.connector.read.streaming.Offset end)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.read.streaming.ContinuousPartitionReaderFactory createContinuousReaderFactory ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.read.PartitionReaderFactory createReaderFactory ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.connector.read.streaming.Offset deserializeOffset (java.lang.String json)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.read.streaming.Offset initialOffset ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.read.streaming.Offset latestOffset ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.read.streaming.Offset mergeOffsets (org.apache.spark.sql.connector.read.streaming.PartitionOffset[] offsets)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.read.InputPartition[] planInputPartitions (org.apache.spark.sql.connector.read.streaming.Offset start, org.apache.spark.sql.connector.read.streaming.Offset end)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.read.InputPartition[] planInputPartitions (org.apache.spark.sql.connector.read.streaming.Offset start)  { throw new RuntimeException(); }
  public  void stop ()  { throw new RuntimeException(); }
}
