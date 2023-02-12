package org.apache.spark.scheduler;
public  class ThrowExceptionOnFirstAttemptOutputCommitter extends org.apache.hadoop.mapred.FileOutputCommitter {
  // not preceding
  public   ThrowExceptionOnFirstAttemptOutputCommitter ()  { throw new RuntimeException(); }
  // not preceding
  public  void commitTask (org.apache.hadoop.mapred.TaskAttemptContext context)  { throw new RuntimeException(); }
}
