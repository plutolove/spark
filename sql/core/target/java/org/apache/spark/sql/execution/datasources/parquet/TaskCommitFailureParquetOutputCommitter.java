package org.apache.spark.sql.execution.datasources.parquet;
public  class TaskCommitFailureParquetOutputCommitter extends org.apache.parquet.hadoop.ParquetOutputCommitter {
  // not preceding
  public   TaskCommitFailureParquetOutputCommitter (org.apache.hadoop.fs.Path outputPath, org.apache.hadoop.mapreduce.TaskAttemptContext context)  { throw new RuntimeException(); }
  // not preceding
  public  void commitTask (org.apache.hadoop.mapreduce.TaskAttemptContext context)  { throw new RuntimeException(); }
}
