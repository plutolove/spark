package org.apache.spark.sql.streaming.sources;
public  class FakeWriteBuilder implements org.apache.spark.sql.connector.write.WriteBuilder, org.apache.spark.sql.connector.write.streaming.StreamingWrite {
  // not preceding
  public   FakeWriteBuilder ()  { throw new RuntimeException(); }
  public  void abort (long epochId, org.apache.spark.sql.connector.write.WriterCommitMessage[] messages)  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.connector.write.streaming.StreamingWrite buildForStreaming ()  { throw new RuntimeException(); }
  public  void commit (long epochId, org.apache.spark.sql.connector.write.WriterCommitMessage[] messages)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.write.streaming.StreamingDataWriterFactory createStreamingWriterFactory (org.apache.spark.sql.connector.write.PhysicalWriteInfo info)  { throw new RuntimeException(); }
}
