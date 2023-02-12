package org.apache.spark.sql.connector;
public abstract class SimpleScanBuilder implements org.apache.spark.sql.connector.read.ScanBuilder, org.apache.spark.sql.connector.read.Batch, org.apache.spark.sql.connector.read.Scan {
  // not preceding
  public   SimpleScanBuilder ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.connector.read.Scan build ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.read.PartitionReaderFactory createReaderFactory ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType readSchema ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.read.Batch toBatch ()  { throw new RuntimeException(); }
}
