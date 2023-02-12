package org.apache.spark.sql.streaming.sources;
public  class FakeScanBuilder implements org.apache.spark.sql.connector.read.ScanBuilder, org.apache.spark.sql.connector.read.Scan {
  // not preceding
  public   FakeScanBuilder ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.connector.read.Scan build ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType readSchema ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.read.streaming.ContinuousStream toContinuousStream (java.lang.String checkpointLocation)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.read.streaming.MicroBatchStream toMicroBatchStream (java.lang.String checkpointLocation)  { throw new RuntimeException(); }
}
