package org.apache.spark.streaming;
/** Assert that the RDD operation scope properties are not set in our SparkContext. */
public  class DStreamScopeSuite extends org.apache.spark.SparkFunSuite implements org.apache.spark.streaming.LocalStreamingContext {
  // not preceding
  public   DStreamScopeSuite ()  { throw new RuntimeException(); }
  public  void afterEach ()  { throw new RuntimeException(); }
  // not preceding
  public  void beforeEach ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.streaming.StreamingContext ssc ()  { throw new RuntimeException(); }
  // not preceding
  public  boolean stopSparkContext ()  { throw new RuntimeException(); }
}
