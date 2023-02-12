package org.apache.spark.streaming;
/**
 * Verify that the expected exception is thrown.
 * <p>
 * We use return statements as an indication that a closure is actually being cleaned.
 * We expect closure cleaner to find the return statements in the user provided closures.
 */
public  class DStreamClosureSuite extends org.apache.spark.SparkFunSuite implements org.apache.spark.streaming.LocalStreamingContext, org.scalatest.BeforeAndAfterAll {
  // not preceding
  public   DStreamClosureSuite ()  { throw new RuntimeException(); }
  // not preceding
  protected  void beforeEach ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.streaming.StreamingContext ssc ()  { throw new RuntimeException(); }
  // not preceding
  public  boolean stopSparkContext ()  { throw new RuntimeException(); }
}
