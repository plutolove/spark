package org.apache.spark.sql.streaming.ui;
/**
 * We use runId as the key here instead of id in active query status map,
 * because the runId is unique for every started query, even it its a restart.
 */
  class StreamingQueryStatusListener extends org.apache.spark.sql.streaming.StreamingQueryListener {
  // not preceding
  public   StreamingQueryStatusListener (org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  // not preceding
    java.util.concurrent.ConcurrentHashMap<java.util.UUID, org.apache.spark.sql.streaming.ui.StreamingQueryUIData> activeQueryStatus ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.streaming.ui.StreamingQueryUIData> allQueryStatus ()  { throw new RuntimeException(); }
    scala.collection.mutable.Queue<org.apache.spark.sql.streaming.ui.StreamingQueryUIData> inactiveQueryStatus ()  { throw new RuntimeException(); }
  public  void onQueryProgress (org.apache.spark.sql.streaming.StreamingQueryListener.QueryProgressEvent event)  { throw new RuntimeException(); }
  public  void onQueryStarted (org.apache.spark.sql.streaming.StreamingQueryListener.QueryStartedEvent event)  { throw new RuntimeException(); }
  public  void onQueryTerminated (org.apache.spark.sql.streaming.StreamingQueryListener.QueryTerminatedEvent event)  { throw new RuntimeException(); }
}
