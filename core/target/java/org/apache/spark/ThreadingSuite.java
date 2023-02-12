package org.apache.spark;
/**
 * Improve the stack trace of an error thrown from within a thread.
 * Otherwise it's difficult to tell which line in the test the error came from.
 */
public  class ThreadingSuite extends org.apache.spark.SparkFunSuite implements org.apache.spark.LocalSparkContext, org.apache.spark.internal.Logging {
  // not preceding
  public   ThreadingSuite ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.SparkContext sc ()  { throw new RuntimeException(); }
}
