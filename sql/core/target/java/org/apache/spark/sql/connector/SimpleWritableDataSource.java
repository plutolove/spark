package org.apache.spark.sql.connector;
/**
 * A HDFS based transactional writable data source.
 * Each task writes data to <code>target/_temporary/uniqueId/$jobId-$partitionId-$attemptNumber</code>.
 * Each job moves files from <code>target/_temporary/uniqueId/</code> to <code>target</code>.
 */
public  class SimpleWritableDataSource implements org.apache.spark.sql.internal.connector.SimpleTableProvider, org.apache.spark.sql.connector.catalog.SessionConfigSupport {
  public  class MyScanBuilder extends org.apache.spark.sql.connector.SimpleScanBuilder {
    // not preceding
    public   MyScanBuilder (java.lang.String path, org.apache.hadoop.conf.Configuration conf)  { throw new RuntimeException(); }
    public  org.apache.spark.sql.connector.read.PartitionReaderFactory createReaderFactory ()  { throw new RuntimeException(); }
    // not preceding
    public  org.apache.spark.sql.connector.read.InputPartition[] planInputPartitions ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.types.StructType readSchema ()  { throw new RuntimeException(); }
  }
  // not preceding
  public  class MyWriteBuilder implements org.apache.spark.sql.connector.write.WriteBuilder, org.apache.spark.sql.connector.write.SupportsTruncate {
    // not preceding
    public   MyWriteBuilder (java.lang.String path, org.apache.spark.sql.connector.write.LogicalWriteInfo info)  { throw new RuntimeException(); }
    public  org.apache.spark.sql.connector.write.BatchWrite buildForBatch ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.connector.write.WriteBuilder truncate ()  { throw new RuntimeException(); }
  }
  // not preceding
  public  class MyBatchWrite implements org.apache.spark.sql.connector.write.BatchWrite {
    // not preceding
    public   MyBatchWrite (java.lang.String queryId, java.lang.String path, org.apache.hadoop.conf.Configuration conf)  { throw new RuntimeException(); }
    public  void abort (org.apache.spark.sql.connector.write.WriterCommitMessage[] messages)  { throw new RuntimeException(); }
    public  void commit (org.apache.spark.sql.connector.write.WriterCommitMessage[] messages)  { throw new RuntimeException(); }
    // not preceding
    public  org.apache.spark.sql.connector.write.DataWriterFactory createBatchWriterFactory (org.apache.spark.sql.connector.write.PhysicalWriteInfo info)  { throw new RuntimeException(); }
    public  void onDataWriterCommit (org.apache.spark.sql.connector.write.WriterCommitMessage message)  { throw new RuntimeException(); }
  }
  // not preceding
  public  class MyTable extends org.apache.spark.sql.connector.SimpleBatchTable implements org.apache.spark.sql.connector.catalog.SupportsWrite {
    // not preceding
    public   MyTable (org.apache.spark.sql.util.CaseInsensitiveStringMap options)  { throw new RuntimeException(); }
    public  java.util.Set<org.apache.spark.sql.connector.catalog.TableCapability> capabilities ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.connector.read.ScanBuilder newScanBuilder (org.apache.spark.sql.util.CaseInsensitiveStringMap options)  { throw new RuntimeException(); }
    public  org.apache.spark.sql.connector.write.WriteBuilder newWriteBuilder (org.apache.spark.sql.connector.write.LogicalWriteInfo info)  { throw new RuntimeException(); }
    public  org.apache.spark.sql.types.StructType schema ()  { throw new RuntimeException(); }
  }
  // not preceding
  public   SimpleWritableDataSource ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.connector.catalog.Table getTable (org.apache.spark.sql.util.CaseInsensitiveStringMap options)  { throw new RuntimeException(); }
  public  java.lang.String keyPrefix ()  { throw new RuntimeException(); }
}
