package org.apache.spark.streaming.scheduler;
/**
 * An initialization method called both from the constructor and Serialization code.
 */
 abstract class RateController implements org.apache.spark.streaming.scheduler.StreamingListener, scala.Serializable {
  // not preceding
  static public  boolean isBackPressureEnabled (org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  // not preceding
  public  int streamUID ()  { throw new RuntimeException(); }
  // not preceding
  public   RateController (int streamUID, org.apache.spark.streaming.scheduler.rate.RateEstimator rateEstimator)  { throw new RuntimeException(); }
  protected abstract  void publish (long rate)  ;
  public  long getLatestRate ()  { throw new RuntimeException(); }
  public  void onBatchCompleted (org.apache.spark.streaming.scheduler.StreamingListenerBatchCompleted batchCompleted)  { throw new RuntimeException(); }
}
