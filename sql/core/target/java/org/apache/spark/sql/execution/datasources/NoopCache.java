package org.apache.spark.sql.execution.datasources;
/**
 * A non-caching implementation used when partition file status caching is disabled.
 */
// not preceding
public  class NoopCache {
  // not preceding
  static public  scala.Option<org.apache.hadoop.fs.FileStatus[]> getLeafFiles (org.apache.hadoop.fs.Path path)  { throw new RuntimeException(); }
  static public  void putLeafFiles (org.apache.hadoop.fs.Path path, org.apache.hadoop.fs.FileStatus[] leafFiles)  { throw new RuntimeException(); }
  static public  void invalidateAll ()  { throw new RuntimeException(); }
}
