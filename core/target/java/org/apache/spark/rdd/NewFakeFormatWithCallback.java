package org.apache.spark.rdd;
public  class NewFakeFormatWithCallback extends org.apache.spark.rdd.NewFakeFormat {
  // not preceding
  public   NewFakeFormatWithCallback ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.hadoop.mapreduce.RecordWriter<java.lang.Integer, java.lang.Integer> getRecordWriter (org.apache.hadoop.mapreduce.TaskAttemptContext p1)  { throw new RuntimeException(); }
}
