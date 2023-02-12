package org.apache.spark.sql.execution.datasources;
/**
 * @return a FileStatusCache that does not share any entries with any other client, but does
 *         share memory resources for the purpose of cache eviction.
 */
public  class SharedInMemoryCache implements org.apache.spark.internal.Logging {
  // not preceding
  public   SharedInMemoryCache (long maxSizeInBytes)  { throw new RuntimeException(); }
  /**
   * @return a FileStatusCache that does not share any entries with any other client, but does
   *         share memory resources for the purpose of cache eviction.
   */
  public  org.apache.spark.sql.execution.datasources.FileStatusCache createForNewClient ()  { throw new RuntimeException(); }
}
