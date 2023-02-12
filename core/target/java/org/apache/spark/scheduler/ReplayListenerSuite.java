package org.apache.spark.scheduler;
/**
 * Test replaying compressed spark history file that internally throws an EOFException.  To
 * avoid sensitivity to the compression specifics the test forces an EOFException to occur
 * while reading bytes from the underlying stream (such as observed in actual history files
 * in some cases) and forces specific failure handling.  This validates correctness in both
 * cases when maybeTruncated is true or false.
 */
public  class ReplayListenerSuite extends org.apache.spark.SparkFunSuite implements org.scalatest.BeforeAndAfter, org.apache.spark.LocalSparkContext {
  // not preceding
  public   ReplayListenerSuite ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.SparkContext sc ()  { throw new RuntimeException(); }
}
