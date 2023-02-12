package org.apache.spark.streaming.scheduler;
/** Report the input information with batch time to the tracker */
  class InputInfoTracker implements org.apache.spark.internal.Logging {
  // not preceding
  public   InputInfoTracker (org.apache.spark.streaming.StreamingContext ssc)  { throw new RuntimeException(); }
  /** Cleanup the tracked input information older than threshold batch time */
  public  void cleanup (org.apache.spark.streaming.Time batchThreshTime)  { throw new RuntimeException(); }
  /** Get the all the input stream's information of specified batch time */
  public  scala.collection.immutable.Map<java.lang.Object, org.apache.spark.streaming.scheduler.StreamInputInfo> getInfo (org.apache.spark.streaming.Time batchTime)  { throw new RuntimeException(); }
  /** Report the input information with batch time to the tracker */
  public  void reportInfo (org.apache.spark.streaming.Time batchTime, org.apache.spark.streaming.scheduler.StreamInputInfo inputInfo)  { throw new RuntimeException(); }
}
