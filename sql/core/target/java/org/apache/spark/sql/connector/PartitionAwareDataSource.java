package org.apache.spark.sql.connector;
public  class PartitionAwareDataSource implements org.apache.spark.sql.connector.TestingV2Source {
  // not preceding
  public  class MyScanBuilder extends org.apache.spark.sql.connector.SimpleScanBuilder implements org.apache.spark.sql.connector.read.SupportsReportPartitioning {
    // not preceding
    public   MyScanBuilder ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.connector.read.PartitionReaderFactory createReaderFactory ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.connector.read.partitioning.Partitioning outputPartitioning ()  { throw new RuntimeException(); }
    // not preceding
    public  org.apache.spark.sql.connector.read.InputPartition[] planInputPartitions ()  { throw new RuntimeException(); }
  }
  public  class MyPartitioning implements org.apache.spark.sql.connector.read.partitioning.Partitioning {
    // not preceding
    public   MyPartitioning ()  { throw new RuntimeException(); }
    // not preceding
    public  int numPartitions ()  { throw new RuntimeException(); }
    public  boolean satisfy (org.apache.spark.sql.connector.read.partitioning.Distribution distribution)  { throw new RuntimeException(); }
  }
  // not preceding
  public   PartitionAwareDataSource ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.connector.catalog.Table getTable (org.apache.spark.sql.util.CaseInsensitiveStringMap options)  { throw new RuntimeException(); }
}
