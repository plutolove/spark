package org.apache.spark.rdd;
public  class YetAnotherFakeCommitter extends org.apache.hadoop.mapreduce.OutputCommitter implements org.scalatest.Assertions {
  // not preceding
  public   YetAnotherFakeCommitter ()  { throw new RuntimeException(); }
  public  void abortTask (org.apache.hadoop.mapreduce.TaskAttemptContext t)  { throw new RuntimeException(); }
  // not preceding
  public  org.scalatest.Assertions.AssertionsHelper assertionsHelper ()  { throw new RuntimeException(); }
  public  void commitTask (org.apache.hadoop.mapreduce.TaskAttemptContext t)  { throw new RuntimeException(); }
  public  boolean needsTaskCommit (org.apache.hadoop.mapreduce.TaskAttemptContext t)  { throw new RuntimeException(); }
  // not preceding
  public  void setupJob (org.apache.hadoop.mapreduce.JobContext j)  { throw new RuntimeException(); }
  public  void setupTask (org.apache.hadoop.mapreduce.TaskAttemptContext t)  { throw new RuntimeException(); }
  // not preceding
  public final  org.scalatest.compatible.Assertion succeed ()  { throw new RuntimeException(); }
}
