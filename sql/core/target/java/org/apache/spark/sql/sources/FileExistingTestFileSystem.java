package org.apache.spark.sql.sources;
public  class FileExistingTestFileSystem extends org.apache.hadoop.fs.RawLocalFileSystem {
  // not preceding
  public   FileExistingTestFileSystem ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.hadoop.fs.FSDataOutputStream create (org.apache.hadoop.fs.Path f, boolean overwrite, int bufferSize, short replication, long blockSize)  { throw new RuntimeException(); }
}
