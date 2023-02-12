package org.apache.spark.sql;
public  class TestQueryExecutionListener implements org.apache.spark.sql.util.QueryExecutionListener {
  // not preceding
  public   TestQueryExecutionListener ()  { throw new RuntimeException(); }
  public  void onFailure (java.lang.String funcName, org.apache.spark.sql.execution.QueryExecution qe, java.lang.Exception exception)  { throw new RuntimeException(); }
  // not preceding
  public  void onSuccess (java.lang.String funcName, org.apache.spark.sql.execution.QueryExecution qe, long durationNs)  { throw new RuntimeException(); }
}
