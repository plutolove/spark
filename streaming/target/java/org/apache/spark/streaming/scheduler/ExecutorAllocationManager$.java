package org.apache.spark.streaming.scheduler;
/** Kill an executor that is not running any receiver, if possible */
// not preceding
public  class ExecutorAllocationManager$ implements org.apache.spark.internal.Logging {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final ExecutorAllocationManager$ MODULE$ = null;
  public   ExecutorAllocationManager$ ()  { throw new RuntimeException(); }
  // not preceding
  public  boolean isDynamicAllocationEnabled (org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.streaming.scheduler.ExecutorAllocationManager> createIfEnabled (org.apache.spark.ExecutorAllocationClient client, org.apache.spark.streaming.scheduler.ReceiverTracker receiverTracker, org.apache.spark.SparkConf conf, long batchDurationMs, org.apache.spark.util.Clock clock)  { throw new RuntimeException(); }
}
