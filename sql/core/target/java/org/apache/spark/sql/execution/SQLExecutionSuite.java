package org.apache.spark.sql.execution;
/**
 * Trigger SPARK-10548 by mocking a parent and its child thread executing queries concurrently.
 */
public  class SQLExecutionSuite extends org.apache.spark.SparkFunSuite {
  // not preceding
  static public  boolean canProgress ()  { throw new RuntimeException(); }
  // not preceding
  public   SQLExecutionSuite ()  { throw new RuntimeException(); }
}
