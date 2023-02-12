package org.apache.spark.deploy.history;
/** the cache key doesn't match a cached entry, or the entry is out-of-date, so load it. */
  class ApplicationCache implements org.apache.spark.internal.Logging {
  // not preceding
  public   ApplicationCache (org.apache.spark.deploy.history.ApplicationCacheOperations operations, int retainedApplications, org.apache.spark.util.Clock clock)  { throw new RuntimeException(); }
  public  org.apache.spark.util.Clock clock ()  { throw new RuntimeException(); }
  public  org.apache.spark.deploy.history.CacheEntry get (java.lang.String appId, scala.Option<java.lang.String> attemptId)  { throw new RuntimeException(); }
  public  void invalidate (org.apache.spark.deploy.history.CacheKey key)  { throw new RuntimeException(); }
  /**
   * The metrics which are updated as the cache is used.
   * @return (undocumented)
   */
  public  org.apache.spark.deploy.history.CacheMetrics metrics ()  { throw new RuntimeException(); }
  public  org.apache.spark.deploy.history.ApplicationCacheOperations operations ()  { throw new RuntimeException(); }
  public  int retainedApplications ()  { throw new RuntimeException(); }
  /** @return Number of cached UIs. */
  public  long size ()  { throw new RuntimeException(); }
  /**
   * String operator dumps the cache entries and metrics.
   * @return a string value, primarily for testing and diagnostics
   */
  public  java.lang.String toString ()  { throw new RuntimeException(); }
  /**
   * Run a closure while holding an application's UI read lock. This prevents the history server
   * from closing the UI data store while it's being used.
   * @param appId (undocumented)
   * @param attemptId (undocumented)
   * @param fn (undocumented)
   * @return (undocumented)
   */
  public <T extends java.lang.Object> T withSparkUI (java.lang.String appId, scala.Option<java.lang.String> attemptId, scala.Function1<org.apache.spark.ui.SparkUI, T> fn)  { throw new RuntimeException(); }
}
