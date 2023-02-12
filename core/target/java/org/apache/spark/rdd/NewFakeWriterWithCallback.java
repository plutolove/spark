package org.apache.spark.rdd;
public  class NewFakeWriterWithCallback extends org.apache.spark.rdd.NewFakeWriter {
  // not preceding
  public   NewFakeWriterWithCallback ()  { throw new RuntimeException(); }
  // not preceding
  public  void close (org.apache.hadoop.mapreduce.TaskAttemptContext p1)  { throw new RuntimeException(); }
  public  void write (java.lang.Integer p1, java.lang.Integer p2)  { throw new RuntimeException(); }
}
