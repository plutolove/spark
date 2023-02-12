package org.apache.spark.sql.execution.datasources;
public  class FileDeletionRaceFileSystem extends org.apache.hadoop.fs.RawLocalFileSystem {
  // not preceding
  public   FileDeletionRaceFileSystem ()  { throw new RuntimeException(); }
  public  org.apache.hadoop.fs.BlockLocation[] getFileBlockLocations (org.apache.hadoop.fs.FileStatus file, long start, long len)  { throw new RuntimeException(); }
  // not preceding
  public  java.lang.String getScheme ()  { throw new RuntimeException(); }
  public  org.apache.hadoop.fs.FileStatus[] listStatus (org.apache.hadoop.fs.Path path)  { throw new RuntimeException(); }
}
