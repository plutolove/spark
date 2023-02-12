package org.apache.spark.sql.execution.datasources.parquet;
/**
 * Provide a builder for constructing a parquet writer - after PARQUET-248 directly
 * constructing the writer is deprecated and should be done through a builder. The default
 * builders include Avro - but for raw Parquet writing we must create our own builder.
 */
public  class JobCommitFailureParquetOutputCommitter extends org.apache.parquet.hadoop.ParquetOutputCommitter {
  // not preceding
  public   JobCommitFailureParquetOutputCommitter (org.apache.hadoop.fs.Path outputPath, org.apache.hadoop.mapreduce.TaskAttemptContext context)  { throw new RuntimeException(); }
  // not preceding
  public  void commitJob (org.apache.hadoop.mapreduce.JobContext jobContext)  { throw new RuntimeException(); }
}
