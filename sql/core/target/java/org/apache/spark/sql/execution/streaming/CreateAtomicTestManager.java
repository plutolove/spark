package org.apache.spark.sql.execution.streaming;
/** A fake implementation to test different characteristics of CheckpointFileManager interface */
public  class CreateAtomicTestManager extends org.apache.spark.sql.execution.streaming.FileSystemBasedCheckpointFileManager {
  // not preceding
  static public  boolean shouldFailInCreateAtomic ()  { throw new RuntimeException(); }
  static public  boolean cancelCalledInCreateAtomic ()  { throw new RuntimeException(); }
  // not preceding
  public   CreateAtomicTestManager (org.apache.hadoop.fs.Path path, org.apache.hadoop.conf.Configuration hadoopConf)  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.execution.streaming.CheckpointFileManager.CancellableFSDataOutputStream createAtomic (org.apache.hadoop.fs.Path path, boolean overwrite)  { throw new RuntimeException(); }
}
