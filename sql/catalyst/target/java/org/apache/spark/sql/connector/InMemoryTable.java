package org.apache.spark.sql.connector;
/**
 * A simple in-memory table. Rows are stored as a buffered group produced by each output task.
 */
public  class InMemoryTable implements org.apache.spark.sql.connector.catalog.Table, org.apache.spark.sql.connector.catalog.SupportsRead, org.apache.spark.sql.connector.catalog.SupportsWrite, org.apache.spark.sql.connector.catalog.SupportsDelete {
  public  class InMemoryBatchScan implements org.apache.spark.sql.connector.read.Scan, org.apache.spark.sql.connector.read.Batch {
    // not preceding
    public   InMemoryBatchScan (org.apache.spark.sql.connector.read.InputPartition[] data)  { throw new RuntimeException(); }
    public  org.apache.spark.sql.connector.read.PartitionReaderFactory createReaderFactory ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.connector.read.InputPartition[] planInputPartitions ()  { throw new RuntimeException(); }
    // not preceding
    public  org.apache.spark.sql.types.StructType readSchema ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.connector.read.Batch toBatch ()  { throw new RuntimeException(); }
  }
  // not preceding
  static public  java.lang.String SIMULATE_FAILED_WRITE_OPTION ()  { throw new RuntimeException(); }
  static public  scala.collection.Iterable<scala.collection.Seq<java.lang.Object>> filtersToKeys (scala.collection.Iterable<scala.collection.Seq<java.lang.Object>> keys, scala.collection.Seq<java.lang.String> partitionNames, org.apache.spark.sql.sources.Filter[] filters)  { throw new RuntimeException(); }
  static public  void maybeSimulateFailedTableWrite (org.apache.spark.sql.util.CaseInsensitiveStringMap tableOptions)  { throw new RuntimeException(); }
  // not preceding
  public  java.lang.String name ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType schema ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.expressions.Transform[] partitioning ()  { throw new RuntimeException(); }
  public  java.util.Map<java.lang.String, java.lang.String> properties ()  { throw new RuntimeException(); }
  // not preceding
  public   InMemoryTable (java.lang.String name, org.apache.spark.sql.types.StructType schema, org.apache.spark.sql.connector.expressions.Transform[] partitioning, java.util.Map<java.lang.String, java.lang.String> properties)  { throw new RuntimeException(); }
  public  scala.collection.mutable.Map<scala.collection.Seq<java.lang.Object>, org.apache.spark.sql.connector.BufferedRows> dataMap ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.BufferedRows[] data ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.InternalRow> rows ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.InMemoryTable withData (org.apache.spark.sql.connector.BufferedRows[] data)  { throw new RuntimeException(); }
  public  java.util.Set<org.apache.spark.sql.connector.catalog.TableCapability> capabilities ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.read.ScanBuilder newScanBuilder (org.apache.spark.sql.util.CaseInsensitiveStringMap options)  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.connector.write.WriteBuilder newWriteBuilder (org.apache.spark.sql.connector.write.LogicalWriteInfo info)  { throw new RuntimeException(); }
  // not preceding
  public  void deleteWhere (org.apache.spark.sql.sources.Filter[] filters)  { throw new RuntimeException(); }
}
