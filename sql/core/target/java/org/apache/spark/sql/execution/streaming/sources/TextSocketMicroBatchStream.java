package org.apache.spark.sql.execution.streaming.sources;
/**
 * All batches from <code>lastCommittedOffset + 1</code> to <code>currentOffset</code>, inclusive.
 * Stored in a ListBuffer to facilitate removing committed batches.
 */
public  class TextSocketMicroBatchStream implements org.apache.spark.sql.connector.read.streaming.MicroBatchStream, org.apache.spark.internal.Logging {
  // not preceding
  public   TextSocketMicroBatchStream (java.lang.String host, int port, int numPartitions)  { throw new RuntimeException(); }
  public  void commit (org.apache.spark.sql.connector.read.streaming.Offset end)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.read.PartitionReaderFactory createReaderFactory ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.read.streaming.Offset deserializeOffset (java.lang.String json)  { throw new RuntimeException(); }
  /** This method is only used for unit test */
    org.apache.spark.sql.execution.streaming.LongOffset getCurrentOffset ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.read.streaming.Offset initialOffset ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.read.streaming.Offset latestOffset ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.read.InputPartition[] planInputPartitions (org.apache.spark.sql.connector.read.streaming.Offset start, org.apache.spark.sql.connector.read.streaming.Offset end)  { throw new RuntimeException(); }
  /** Stop this source. */
  public  void stop ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
