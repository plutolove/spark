package org.apache.spark.sql.connector;
public  class SimpleSinglePartitionSource implements org.apache.spark.sql.connector.TestingV2Source {
  // not preceding
  public  class MyScanBuilder extends org.apache.spark.sql.connector.SimpleScanBuilder {
    // not preceding
    public   MyScanBuilder ()  { throw new RuntimeException(); }
    // not preceding
    public  org.apache.spark.sql.connector.read.InputPartition[] planInputPartitions ()  { throw new RuntimeException(); }
  }
  // not preceding
  public   SimpleSinglePartitionSource ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.connector.catalog.Table getTable (org.apache.spark.sql.util.CaseInsensitiveStringMap options)  { throw new RuntimeException(); }
}
