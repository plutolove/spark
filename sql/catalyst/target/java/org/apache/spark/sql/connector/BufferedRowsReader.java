package org.apache.spark.sql.connector;
public  class BufferedRowsReader implements org.apache.spark.sql.connector.read.PartitionReader<org.apache.spark.sql.catalyst.InternalRow> {
  // not preceding
  public   BufferedRowsReader (org.apache.spark.sql.connector.BufferedRows partition)  { throw new RuntimeException(); }
  public  void close ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.InternalRow get ()  { throw new RuntimeException(); }
  public  boolean next ()  { throw new RuntimeException(); }
}
