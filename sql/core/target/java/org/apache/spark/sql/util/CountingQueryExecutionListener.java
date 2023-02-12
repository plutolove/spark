package org.apache.spark.sql.util;
public  class CountingQueryExecutionListener implements org.apache.spark.sql.util.QueryExecutionListener {
  // not preceding
  static public  java.util.concurrent.atomic.AtomicInteger CALLBACK_COUNT ()  { throw new RuntimeException(); }
  static public  java.util.concurrent.atomic.AtomicInteger INSTANCE_COUNT ()  { throw new RuntimeException(); }
  // not preceding
  public   CountingQueryExecutionListener ()  { throw new RuntimeException(); }
  public  void onSuccess (java.lang.String funcName, org.apache.spark.sql.execution.QueryExecution qe, long durationNs)  { throw new RuntimeException(); }
  public  void onFailure (java.lang.String funcName, org.apache.spark.sql.execution.QueryExecution qe, java.lang.Exception exception)  { throw new RuntimeException(); }
}
