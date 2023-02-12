package org.apache.spark.sql.execution.datasources.parquet;
/**
 * A file output committer which explicitly touches a file "marker"; this
 * is how tests can verify that this committer was used.
 * param:  outputPath output path
 * param:  context task context
 */
public  class MarkingFileOutputCommitter extends org.apache.hadoop.mapreduce.lib.output.FileOutputCommitter {
  // not preceding
  public   MarkingFileOutputCommitter (org.apache.hadoop.fs.Path outputPath, org.apache.hadoop.mapreduce.TaskAttemptContext context)  { throw new RuntimeException(); }
  // not preceding
  public  void commitJob (org.apache.hadoop.mapreduce.JobContext context)  { throw new RuntimeException(); }
}
