package org.apache.spark.scheduler;
public  class FirehoseListenerThatAcceptsSparkConf extends org.apache.spark.SparkFirehoseListener {
  // not preceding
  public   FirehoseListenerThatAcceptsSparkConf (org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  // not preceding
  public  int count ()  { throw new RuntimeException(); }
  public  void onEvent (org.apache.spark.scheduler.SparkListenerEvent event)  { throw new RuntimeException(); }
}
