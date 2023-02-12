package org.apache.spark.sql.execution.streaming.state;
/**
 * Fake FileSystem that simulates HDFS rename semantic, i.e. renaming a file atop an existing
 * one should return false.
 * See hadoop.apache.org/docs/stable/hadoop-project-dist/hadoop-common/filesystem/filesystem.html
 */
public  class RenameLikeHDFSFileSystem extends org.apache.hadoop.fs.RawLocalFileSystem {
  // not preceding
  public   RenameLikeHDFSFileSystem ()  { throw new RuntimeException(); }
  // not preceding
  public  boolean rename (org.apache.hadoop.fs.Path src, org.apache.hadoop.fs.Path dst)  { throw new RuntimeException(); }
}
