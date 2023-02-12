package org.apache.spark.scheduler.dynalloc;
/**
 * Mock the listener bus *only* for the functionality needed by the shuffle tracking code.
 * Any other event sent through the mock bus will fail.
 */
public  class ExecutorMonitorSuite extends org.apache.spark.SparkFunSuite {
  // not preceding
  public   ExecutorMonitorSuite ()  { throw new RuntimeException(); }
  public  void beforeEach ()  { throw new RuntimeException(); }
}
