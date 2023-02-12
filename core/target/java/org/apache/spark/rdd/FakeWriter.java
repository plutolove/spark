package org.apache.spark.rdd;
public  class FakeWriter implements org.apache.hadoop.mapred.RecordWriter<java.lang.Integer, java.lang.Integer> {
  // not preceding
  public   FakeWriter ()  { throw new RuntimeException(); }
  public  void close (org.apache.hadoop.mapred.Reporter reporter)  { throw new RuntimeException(); }
  // not preceding
  public  void write (java.lang.Integer key, java.lang.Integer value)  { throw new RuntimeException(); }
}
