package org.apache.spark.sql.connector;
public  class BufferedRows implements org.apache.spark.sql.connector.write.WriterCommitMessage, org.apache.spark.sql.connector.read.InputPartition, scala.Serializable {
  // not preceding
  public   BufferedRows ()  { throw new RuntimeException(); }
  // not preceding
  public  scala.collection.mutable.ArrayBuffer<org.apache.spark.sql.catalyst.InternalRow> rows ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.BufferedRows withRow (org.apache.spark.sql.catalyst.InternalRow row)  { throw new RuntimeException(); }
}
