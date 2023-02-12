package org.apache.spark.sql.execution.streaming;
/**
 * CheckpointFileManagerSuiteFileSystem to test fallback of the CheckpointFileManager
 * from FileContext to FileSystem API.
 */
public  class CheckpointFileManagerSuiteFileSystem extends org.apache.hadoop.fs.RawLocalFileSystem {
  // not preceding
  static public  java.lang.String scheme ()  { throw new RuntimeException(); }
  // not preceding
  public   CheckpointFileManagerSuiteFileSystem ()  { throw new RuntimeException(); }
  // not preceding
  public  java.net.URI getUri ()  { throw new RuntimeException(); }
}
