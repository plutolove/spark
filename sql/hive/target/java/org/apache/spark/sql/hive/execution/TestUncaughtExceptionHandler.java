package org.apache.spark.sql.hive.execution;
public  class TestUncaughtExceptionHandler implements java.lang.Thread.UncaughtExceptionHandler {
  // not preceding
  public   TestUncaughtExceptionHandler ()  { throw new RuntimeException(); }
  public  void cleanStatus ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Throwable> exception ()  { throw new RuntimeException(); }
  public  void uncaughtException (java.lang.Thread t, java.lang.Throwable e)  { throw new RuntimeException(); }
}
