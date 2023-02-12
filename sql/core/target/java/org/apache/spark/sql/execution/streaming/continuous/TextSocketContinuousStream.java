package org.apache.spark.sql.execution.streaming.continuous;
/** Stop this source. */
public  class TextSocketContinuousStream implements org.apache.spark.sql.connector.read.streaming.ContinuousStream, org.apache.spark.internal.Logging {
  // not preceding
  public   TextSocketContinuousStream (java.lang.String host, int port, int numPartitions, org.apache.spark.sql.util.CaseInsensitiveStringMap options)  { throw new RuntimeException(); }
  public  void commit (org.apache.spark.sql.connector.read.streaming.Offset end)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.read.streaming.ContinuousPartitionReaderFactory createContinuousReaderFactory ()  { throw new RuntimeException(); }
  // not preceding
  public  org.json4s.DefaultFormats defaultFormats ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.read.streaming.Offset deserializeOffset (java.lang.String json)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.read.streaming.Offset initialOffset ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.read.streaming.Offset mergeOffsets (org.apache.spark.sql.connector.read.streaming.PartitionOffset[] offsets)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.read.InputPartition[] planInputPartitions (org.apache.spark.sql.connector.read.streaming.Offset start)  { throw new RuntimeException(); }
    org.apache.spark.sql.execution.streaming.continuous.TextSocketOffset startOffset ()  { throw new RuntimeException(); }
  /** Stop this source. */
  public  void stop ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
