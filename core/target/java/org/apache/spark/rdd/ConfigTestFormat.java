package org.apache.spark.rdd;
public  class ConfigTestFormat extends org.apache.spark.rdd.NewFakeFormat implements org.apache.hadoop.conf.Configurable {
  // not preceding
  public   ConfigTestFormat ()  { throw new RuntimeException(); }
  public  org.apache.hadoop.conf.Configuration getConf ()  { throw new RuntimeException(); }
  public  org.apache.hadoop.mapreduce.RecordWriter<java.lang.Integer, java.lang.Integer> getRecordWriter (org.apache.hadoop.mapreduce.TaskAttemptContext p1)  { throw new RuntimeException(); }
  public  void setConf (org.apache.hadoop.conf.Configuration p1)  { throw new RuntimeException(); }
  // not preceding
  public  boolean setConfCalled ()  { throw new RuntimeException(); }
}
