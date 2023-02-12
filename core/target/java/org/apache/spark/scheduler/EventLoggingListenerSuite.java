package org.apache.spark.scheduler;
/**
 * Test basic event logging functionality.
 * <p>
 * This creates two simple events, posts them to the EventLoggingListener, and verifies that
 * exactly these two events are logged in the expected file.
 */
public  class EventLoggingListenerSuite extends org.apache.spark.SparkFunSuite implements org.apache.spark.LocalSparkContext, org.scalatest.BeforeAndAfter, org.apache.spark.internal.Logging {
  // not preceding
  public   EventLoggingListenerSuite ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.SparkContext sc ()  { throw new RuntimeException(); }
}
