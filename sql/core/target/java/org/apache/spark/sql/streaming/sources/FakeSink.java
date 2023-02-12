package org.apache.spark.sql.streaming.sources;
public  class FakeSink implements org.apache.spark.sql.execution.streaming.Sink {
  // not preceding
  public   FakeSink ()  { throw new RuntimeException(); }
  // not preceding
  public  void addBatch (long batchId, org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> data)  { throw new RuntimeException(); }
}
