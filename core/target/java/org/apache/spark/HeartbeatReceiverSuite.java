package org.apache.spark;
/**
 * Before each test, set up the SparkContext and a custom {@link HeartbeatReceiver}
 * that uses a manual clock.
 */
public  class HeartbeatReceiverSuite extends org.apache.spark.SparkFunSuite implements org.scalatest.BeforeAndAfterEach, org.scalatest.PrivateMethodTester, org.apache.spark.LocalSparkContext {
  // not preceding
  public   HeartbeatReceiverSuite ()  { throw new RuntimeException(); }
  public  org.scalatest.PrivateMethodTester.PrivateMethod$ PrivateMethod ()  { throw new RuntimeException(); }
  /**
   * After each test, clean up all state and stop the {@link SparkContext}.
   */
  public  void afterEach ()  { throw new RuntimeException(); }
  /**
   * Before each test, set up the SparkContext and a custom {@link HeartbeatReceiver}
   * that uses a manual clock.
   */
  public  void beforeEach ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.SparkContext sc ()  { throw new RuntimeException(); }
}
