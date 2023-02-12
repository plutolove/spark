package org.apache.spark.sql.execution.streaming.sources;
/** A {@link ForeachWriter} that writes collected events to ForeachSinkSuite */
public  class TestForeachWriter extends org.apache.spark.sql.ForeachWriter<java.lang.Object> {
  // not preceding
  public   TestForeachWriter ()  { throw new RuntimeException(); }
  public  void close (java.lang.Throwable errorOrNull)  { throw new RuntimeException(); }
  public  boolean open (long partitionId, long version)  { throw new RuntimeException(); }
  public  void process (int value)  { throw new RuntimeException(); }
}
