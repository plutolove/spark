package org.apache.spark.status;
/**
 * Create an in-memory store for a live application.
 */
// not preceding
public  class AppStatusStore$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final AppStatusStore$ MODULE$ = null;
  public   AppStatusStore$ ()  { throw new RuntimeException(); }
  /**
   * Calls a closure that may throw a NoSuchElementException and returns <code>None</code> when the exception
   * is thrown.
   * @return (undocumented)
   */
  public  long CURRENT_VERSION ()  { throw new RuntimeException(); }
  /**
   * Create an in-memory store for a live application.
   * @param conf (undocumented)
   * @param appStatusSource (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.status.AppStatusStore createLiveStore (org.apache.spark.SparkConf conf, scala.Option<org.apache.spark.status.AppStatusSource> appStatusSource)  { throw new RuntimeException(); }
}
