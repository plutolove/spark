package org.apache.spark.internal.io;
/** OutputCommitter from Hadoop is not serializable so marking it transient. */
public  class HadoopMapReduceCommitProtocol extends org.apache.spark.internal.io.FileCommitProtocol implements scala.Serializable, org.apache.spark.internal.Logging {
  // not preceding
  public   HadoopMapReduceCommitProtocol (java.lang.String jobId, java.lang.String path, boolean dynamicPartitionOverwrite)  { throw new RuntimeException(); }
  protected  org.apache.hadoop.mapreduce.OutputCommitter setupCommitter (org.apache.hadoop.mapreduce.TaskAttemptContext context)  { throw new RuntimeException(); }
  public  java.lang.String newTaskTempFile (org.apache.hadoop.mapreduce.TaskAttemptContext taskContext, scala.Option<java.lang.String> dir, java.lang.String ext)  { throw new RuntimeException(); }
  public  java.lang.String newTaskTempFileAbsPath (org.apache.hadoop.mapreduce.TaskAttemptContext taskContext, java.lang.String absoluteDir, java.lang.String ext)  { throw new RuntimeException(); }
  protected  java.lang.String getFilename (org.apache.hadoop.mapreduce.TaskAttemptContext taskContext, java.lang.String ext)  { throw new RuntimeException(); }
  public  void setupJob (org.apache.hadoop.mapreduce.JobContext jobContext)  { throw new RuntimeException(); }
  public  void commitJob (org.apache.hadoop.mapreduce.JobContext jobContext, scala.collection.Seq<org.apache.spark.internal.io.FileCommitProtocol.TaskCommitMessage> taskCommits)  { throw new RuntimeException(); }
  /**
   * Abort the job; log and ignore any IO exception thrown.
   * This is invariably invoked in an exception handler; raising
   * an exception here will lose the root cause of the failure.
   * <p>
   * @param jobContext job context
   */
  public  void abortJob (org.apache.hadoop.mapreduce.JobContext jobContext)  { throw new RuntimeException(); }
  public  void setupTask (org.apache.hadoop.mapreduce.TaskAttemptContext taskContext)  { throw new RuntimeException(); }
  public  org.apache.spark.internal.io.FileCommitProtocol.TaskCommitMessage commitTask (org.apache.hadoop.mapreduce.TaskAttemptContext taskContext)  { throw new RuntimeException(); }
  /**
   * Abort the task; log and ignore any failure thrown.
   * This is invariably invoked in an exception handler; raising
   * an exception here will lose the root cause of the failure.
   * <p>
   * @param taskContext context
   */
  public  void abortTask (org.apache.hadoop.mapreduce.TaskAttemptContext taskContext)  { throw new RuntimeException(); }
}
