package org.apache.spark.scheduler;
public  class ListenerThatAcceptsSparkConf extends org.apache.spark.scheduler.SparkListener {
  // not preceding
  public   ListenerThatAcceptsSparkConf (org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  // not preceding
  public  int count ()  { throw new RuntimeException(); }
  public  void onJobEnd (org.apache.spark.scheduler.SparkListenerJobEnd job)  { throw new RuntimeException(); }
}
