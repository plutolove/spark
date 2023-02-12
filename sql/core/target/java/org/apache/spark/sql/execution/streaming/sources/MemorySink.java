package org.apache.spark.sql.execution.streaming.sources;
/** An order list of batches that have been written to this {@link Sink}. */
public  class MemorySink implements org.apache.spark.sql.connector.catalog.Table, org.apache.spark.sql.connector.catalog.SupportsWrite, org.apache.spark.internal.Logging {
  // not preceding
  public   MemorySink ()  { throw new RuntimeException(); }
  /** Returns all rows that are stored in this {@link Sink}. */
  public  scala.collection.Seq<org.apache.spark.sql.Row> allData ()  { throw new RuntimeException(); }
  public  java.util.Set<org.apache.spark.sql.connector.catalog.TableCapability> capabilities ()  { throw new RuntimeException(); }
  public  void clear ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.Row> dataSinceBatch (long sinceBatchId)  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.Row> latestBatchData ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Object> latestBatchId ()  { throw new RuntimeException(); }
  // not preceding
  public  java.lang.String name ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.write.WriteBuilder newWriteBuilder (org.apache.spark.sql.connector.write.LogicalWriteInfo info)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType schema ()  { throw new RuntimeException(); }
  public  java.lang.String toDebugString ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  void write (long batchId, boolean needTruncate, org.apache.spark.sql.Row[] newRows)  { throw new RuntimeException(); }
}
