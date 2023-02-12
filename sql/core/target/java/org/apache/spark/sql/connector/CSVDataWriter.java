package org.apache.spark.sql.connector;
public  class CSVDataWriter implements org.apache.spark.sql.connector.write.DataWriter<org.apache.spark.sql.catalyst.InternalRow> {
  // not preceding
  public   CSVDataWriter (org.apache.hadoop.fs.FileSystem fs, org.apache.hadoop.fs.Path file)  { throw new RuntimeException(); }
  public  void abort ()  { throw new RuntimeException(); }
  public  void close ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.write.WriterCommitMessage commit ()  { throw new RuntimeException(); }
  public  void write (org.apache.spark.sql.catalyst.InternalRow record)  { throw new RuntimeException(); }
}
