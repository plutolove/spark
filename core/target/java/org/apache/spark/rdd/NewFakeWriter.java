package org.apache.spark.rdd;
public  class NewFakeWriter extends org.apache.hadoop.mapreduce.RecordWriter<java.lang.Integer, java.lang.Integer> {
  // not preceding
  public   NewFakeWriter ()  { throw new RuntimeException(); }
  // not preceding
  public  void close (org.apache.hadoop.mapreduce.TaskAttemptContext p1)  { throw new RuntimeException(); }
  public  void write (java.lang.Integer p1, java.lang.Integer p2)  { throw new RuntimeException(); }
}
