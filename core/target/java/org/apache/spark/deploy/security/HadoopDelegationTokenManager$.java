package org.apache.spark.deploy.security;
/**
 * Obtain new delegation tokens from the available providers. Schedules a new task to fetch
 * new tokens before the new set expires.
 * <p>
 * @return Credentials containing the new tokens.
 */
// not preceding
public  class HadoopDelegationTokenManager$ implements org.apache.spark.internal.Logging {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final HadoopDelegationTokenManager$ MODULE$ = null;
  public   HadoopDelegationTokenManager$ ()  { throw new RuntimeException(); }
  public  boolean isServiceEnabled (org.apache.spark.SparkConf sparkConf, java.lang.String serviceName)  { throw new RuntimeException(); }
}
