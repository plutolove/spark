package org.apache.spark.input;
/**
 * Allow minPartitions set by end-user in order to keep compatibility with old Hadoop API,
 * which is set through setMaxSplitSize
 */
  class WholeTextFileInputFormat extends org.apache.hadoop.mapreduce.lib.input.CombineFileInputFormat<org.apache.hadoop.io.Text, org.apache.hadoop.io.Text> implements org.apache.spark.input.Configurable {
  // not preceding
  public   WholeTextFileInputFormat ()  { throw new RuntimeException(); }
  public  org.apache.hadoop.mapreduce.RecordReader<org.apache.hadoop.io.Text, org.apache.hadoop.io.Text> createRecordReader (org.apache.hadoop.mapreduce.InputSplit split, org.apache.hadoop.mapreduce.TaskAttemptContext context)  { throw new RuntimeException(); }
  // not preceding
  protected  boolean isSplitable (org.apache.hadoop.mapreduce.JobContext context, org.apache.hadoop.fs.Path file)  { throw new RuntimeException(); }
  /**
   * Allow minPartitions set by end-user in order to keep compatibility with old Hadoop API,
   * which is set through setMaxSplitSize
   * @param context (undocumented)
   * @param minPartitions (undocumented)
   */
  public  void setMinPartitions (org.apache.hadoop.mapreduce.JobContext context, int minPartitions)  { throw new RuntimeException(); }
}
