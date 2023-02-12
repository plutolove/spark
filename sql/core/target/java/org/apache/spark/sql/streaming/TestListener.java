package org.apache.spark.sql.streaming;
public  class TestListener extends org.apache.spark.sql.streaming.StreamingQueryListener {
  // not preceding
  static public  org.apache.spark.sql.streaming.StreamingQueryListener.QueryStartedEvent queryStartedEvent ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.streaming.StreamingQueryListener.QueryTerminatedEvent queryTerminatedEvent ()  { throw new RuntimeException(); }
  // not preceding
  public   TestListener (org.apache.spark.SparkConf sparkConf)  { throw new RuntimeException(); }
  // not preceding
  public  void onQueryStarted (org.apache.spark.sql.streaming.StreamingQueryListener.QueryStartedEvent event)  { throw new RuntimeException(); }
  public  void onQueryProgress (org.apache.spark.sql.streaming.StreamingQueryListener.QueryProgressEvent event)  { throw new RuntimeException(); }
  public  void onQueryTerminated (org.apache.spark.sql.streaming.StreamingQueryListener.QueryTerminatedEvent event)  { throw new RuntimeException(); }
}
