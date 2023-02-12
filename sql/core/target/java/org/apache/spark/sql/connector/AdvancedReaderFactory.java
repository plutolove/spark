package org.apache.spark.sql.connector;
public  class AdvancedReaderFactory implements org.apache.spark.sql.connector.read.PartitionReaderFactory {
  // not preceding
  public   AdvancedReaderFactory (org.apache.spark.sql.types.StructType requiredSchema)  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.connector.read.PartitionReader<org.apache.spark.sql.catalyst.InternalRow> createReader (org.apache.spark.sql.connector.read.InputPartition partition)  { throw new RuntimeException(); }
}
