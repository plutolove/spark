package org.apache.spark.sql.streaming.ui;
/** Holds the most recent query progress updates. */
  class StreamingQueryUIData {
  // not preceding
  public   StreamingQueryUIData (java.lang.String name, java.util.UUID id, java.util.UUID runId, long startTimestamp)  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> exception ()  { throw new RuntimeException(); }
  public  java.util.UUID id ()  { throw new RuntimeException(); }
  public  boolean isActive ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.streaming.StreamingQueryProgress lastProgress ()  { throw new RuntimeException(); }
  // not preceding
  public  java.lang.String name ()  { throw new RuntimeException(); }
  public  void queryTerminated (org.apache.spark.sql.streaming.StreamingQueryListener.QueryTerminatedEvent event)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.streaming.StreamingQueryProgress[] recentProgress ()  { throw new RuntimeException(); }
  public  java.util.UUID runId ()  { throw new RuntimeException(); }
  public  long startTimestamp ()  { throw new RuntimeException(); }
  public  void updateProcess (org.apache.spark.sql.streaming.StreamingQueryProgress newProgress, int retentionNum)  { throw new RuntimeException(); }
}
