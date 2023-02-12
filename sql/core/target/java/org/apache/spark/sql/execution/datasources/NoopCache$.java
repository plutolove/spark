package org.apache.spark.sql.execution.datasources;
/**
 * A non-caching implementation used when partition file status caching is disabled.
 */
// not preceding
public  class NoopCache$ extends org.apache.spark.sql.execution.datasources.FileStatusCache {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final NoopCache$ MODULE$ = null;
  public   NoopCache$ ()  { throw new RuntimeException(); }
  // not preceding
  public  scala.Option<org.apache.hadoop.fs.FileStatus[]> getLeafFiles (org.apache.hadoop.fs.Path path)  { throw new RuntimeException(); }
  public  void putLeafFiles (org.apache.hadoop.fs.Path path, org.apache.hadoop.fs.FileStatus[] leafFiles)  { throw new RuntimeException(); }
  public  void invalidateAll ()  { throw new RuntimeException(); }
}
