package org.apache.spark.sql.execution.datasources;
public  class SpecialBlockLocationFileSystem extends org.apache.hadoop.fs.RawLocalFileSystem {
  // not preceding
  public  class SpecialBlockLocation extends org.apache.hadoop.fs.BlockLocation {
    // not preceding
    public   SpecialBlockLocation (java.lang.String[] names, java.lang.String[] hosts, long offset, long length)  { throw new RuntimeException(); }
  }
  // not preceding
  public   SpecialBlockLocationFileSystem ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.hadoop.fs.BlockLocation[] getFileBlockLocations (org.apache.hadoop.fs.FileStatus file, long start, long len)  { throw new RuntimeException(); }
}
