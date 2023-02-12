package org.apache.spark.sql.execution.datasources;
/** Flag saying whether or not the data to be written out is partitioned. */
public  class DynamicPartitionDataWriter extends org.apache.spark.sql.execution.datasources.FileFormatDataWriter {
  // not preceding
  public   DynamicPartitionDataWriter (org.apache.spark.sql.execution.datasources.WriteJobDescription description, org.apache.hadoop.mapreduce.TaskAttemptContext taskAttemptContext, org.apache.spark.internal.io.FileCommitProtocol committer)  { throw new RuntimeException(); }
  public  void write (org.apache.spark.sql.catalyst.InternalRow record)  { throw new RuntimeException(); }
}
