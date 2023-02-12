package org.apache.spark.sql.execution.datasources.noop;
// not preceding
public  class NoopWriter {
  // not preceding
  static public  void write (org.apache.spark.sql.catalyst.InternalRow record)  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.connector.write.WriterCommitMessage commit ()  { throw new RuntimeException(); }
  static public  void abort ()  { throw new RuntimeException(); }
  static public  void close ()  { throw new RuntimeException(); }
}
