package org.apache.spark.sql.streaming;
/** Simply return an empty file for now. */
public  class ExistsThrowsExceptionFileSystem extends org.apache.hadoop.fs.RawLocalFileSystem {
  // not preceding
  static public  java.lang.String scheme ()  { throw new RuntimeException(); }
  // not preceding
  public   ExistsThrowsExceptionFileSystem ()  { throw new RuntimeException(); }
  // not preceding
  public  java.net.URI getUri ()  { throw new RuntimeException(); }
  public  boolean exists (org.apache.hadoop.fs.Path f)  { throw new RuntimeException(); }
  /** Simply return an empty file for now. */
  public  org.apache.hadoop.fs.FileStatus[] listStatus (org.apache.hadoop.fs.Path file)  { throw new RuntimeException(); }
}
