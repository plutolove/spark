package org.apache.spark.deploy.history;
/**
 * Create a security manager.
 * This turns off security in the SecurityManager, so that the History Server can start
 * in a Spark cluster where security is enabled.
 * param:  config configuration for the SecurityManager constructor
 * @return the security manager for use in constructing the History Server.
 */
// not preceding
public  class HistoryServer$ implements org.apache.spark.internal.Logging {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final HistoryServer$ MODULE$ = null;
  public   HistoryServer$ ()  { throw new RuntimeException(); }
  public  java.lang.String UI_PATH_PREFIX ()  { throw new RuntimeException(); }
  public  void main (java.lang.String[] argStrings)  { throw new RuntimeException(); }
  /**
   * Create a security manager.
   * This turns off security in the SecurityManager, so that the History Server can start
   * in a Spark cluster where security is enabled.
   * @param config configuration for the SecurityManager constructor
   * @return the security manager for use in constructing the History Server.
   */
    org.apache.spark.SecurityManager createSecurityManager (org.apache.spark.SparkConf config)  { throw new RuntimeException(); }
  public  void initSecurity ()  { throw new RuntimeException(); }
    java.lang.String getAttemptURI (java.lang.String appId, scala.Option<java.lang.String> attemptId)  { throw new RuntimeException(); }
}
