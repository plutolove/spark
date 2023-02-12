package org.apache.spark.sql.execution.datasources;
/**
 * Prepares a write job and returns an {@link OutputWriterFactory}.  Client side job preparation can
 * be put here.  For example, user defined output committer can be configured here
 * by setting the output committer class in the conf of spark.sql.sources.outputCommitterClass.
 */
public  class LocalityTestFileSystem extends org.apache.hadoop.fs.RawLocalFileSystem {
  // not preceding
  public   LocalityTestFileSystem ()  { throw new RuntimeException(); }
  public  org.apache.hadoop.fs.BlockLocation[] getFileBlockLocations (org.apache.hadoop.fs.FileStatus file, long start, long len)  { throw new RuntimeException(); }
}
