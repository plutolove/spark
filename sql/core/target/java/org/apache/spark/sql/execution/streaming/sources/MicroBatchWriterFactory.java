package org.apache.spark.sql.execution.streaming.sources;
public  class MicroBatchWriterFactory implements org.apache.spark.sql.connector.write.DataWriterFactory {
  // not preceding
  public   MicroBatchWriterFactory (long epochId, org.apache.spark.sql.connector.write.streaming.StreamingDataWriterFactory streamingWriterFactory)  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.connector.write.DataWriter<org.apache.spark.sql.catalyst.InternalRow> createWriter (int partitionId, long taskId)  { throw new RuntimeException(); }
}
