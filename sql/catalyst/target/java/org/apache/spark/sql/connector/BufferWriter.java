package org.apache.spark.sql.connector;
public  class BufferWriter implements org.apache.spark.sql.connector.write.DataWriter<org.apache.spark.sql.catalyst.InternalRow> {
  // not preceding
  public   BufferWriter ()  { throw new RuntimeException(); }
  public  void abort ()  { throw new RuntimeException(); }
  public  void close ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.write.WriterCommitMessage commit ()  { throw new RuntimeException(); }
  public  void write (org.apache.spark.sql.catalyst.InternalRow row)  { throw new RuntimeException(); }
}
