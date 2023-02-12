package org.apache.spark.sql.execution.datasources;
/**
 * @return the leaf files for the specified path from this cache, or None if not cached.
 */
public abstract class FileStatusCache {
  /**
   * @return a new FileStatusCache based on session configuration. Cache memory quota is
   *         shared across all clients.
   * @param session (undocumented)
   */
  static public  org.apache.spark.sql.execution.datasources.FileStatusCache getOrCreate (org.apache.spark.sql.SparkSession session)  { throw new RuntimeException(); }
  static public  void resetForTesting ()  { throw new RuntimeException(); }
  // not preceding
  public   FileStatusCache ()  { throw new RuntimeException(); }
  // not preceding
  public  scala.Option<org.apache.hadoop.fs.FileStatus[]> getLeafFiles (org.apache.hadoop.fs.Path path)  { throw new RuntimeException(); }
  /**
   * Saves the given set of leaf files for a path in this cache.
   * @param path (undocumented)
   * @param leafFiles (undocumented)
   */
  public abstract  void putLeafFiles (org.apache.hadoop.fs.Path path, org.apache.hadoop.fs.FileStatus[] leafFiles)  ;
  /**
   * Invalidates all data held by this cache.
   */
  public abstract  void invalidateAll ()  ;
}
