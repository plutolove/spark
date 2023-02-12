package org.apache.spark.sql.connector;
public  class AdvancedBatch implements org.apache.spark.sql.connector.read.Batch {
  // not preceding
  public   AdvancedBatch (org.apache.spark.sql.sources.Filter[] filters, org.apache.spark.sql.types.StructType requiredSchema)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.read.PartitionReaderFactory createReaderFactory ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.sources.Filter[] filters ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.connector.read.InputPartition[] planInputPartitions ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType requiredSchema ()  { throw new RuntimeException(); }
}
