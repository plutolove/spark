package org.apache.spark.sql.hive.security;
/**
 * Run some code as the real logged in user (which may differ from the current user, for
 * example, when using proxying).
 */
  class HiveDelegationTokenProvider implements org.apache.spark.security.HadoopDelegationTokenProvider, org.apache.spark.internal.Logging {
  // not preceding
  public   HiveDelegationTokenProvider ()  { throw new RuntimeException(); }
  public  boolean delegationTokensRequired (org.apache.spark.SparkConf sparkConf, org.apache.hadoop.conf.Configuration hadoopConf)  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Object> obtainDelegationTokens (org.apache.hadoop.conf.Configuration hadoopConf, org.apache.spark.SparkConf sparkConf, org.apache.hadoop.security.Credentials creds)  { throw new RuntimeException(); }
  // not preceding
  public  java.lang.String serviceName ()  { throw new RuntimeException(); }
}
