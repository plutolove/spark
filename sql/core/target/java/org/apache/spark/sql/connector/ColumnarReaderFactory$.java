package org.apache.spark.sql.connector;
// not preceding
public  class ColumnarReaderFactory$ implements org.apache.spark.sql.connector.read.PartitionReaderFactory {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final ColumnarReaderFactory$ MODULE$ = null;
  public   ColumnarReaderFactory$ ()  { throw new RuntimeException(); }
  public  boolean supportColumnarReads (org.apache.spark.sql.connector.read.InputPartition partition)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.read.PartitionReader<org.apache.spark.sql.catalyst.InternalRow> createReader (org.apache.spark.sql.connector.read.InputPartition partition)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.read.PartitionReader<org.apache.spark.sql.vectorized.ColumnarBatch> createColumnarReader (org.apache.spark.sql.connector.read.InputPartition partition)  { throw new RuntimeException(); }
}
