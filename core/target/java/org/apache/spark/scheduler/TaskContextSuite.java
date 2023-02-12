package org.apache.spark.scheduler;
public  class TaskContextSuite extends org.apache.spark.SparkFunSuite implements org.scalatest.BeforeAndAfter, org.apache.spark.LocalSparkContext {
  // not preceding
  static public  boolean completed ()  { throw new RuntimeException(); }
  static public  java.lang.Throwable lastError ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.SparkContext sc ()  { throw new RuntimeException(); }
  // not preceding
  public   TaskContextSuite ()  { throw new RuntimeException(); }
}
