package org.apache.spark.deploy.security;
/**
 * Token<AuthenticationTokenIdentifier> obtainToken(Configuration conf) is a deprecated
 * method and in Hbase 2.0.0 the method is already removed.
 * The HBase client API used in below method is introduced from HBase 0.98.9 version,
 * to invoke this api first connection object has to be retrieved from ConnectionFactory and the
 * same connection can be passed to
 * Token<AuthenticationTokenIdentifier> obtainToken(Connection conn) API
 * <p>
 * param:  hadoopConf Configuration of current Hadoop Compatible system.
 * param:  creds Credentials to add tokens and security keys to.
 */
  class HBaseDelegationTokenProvider implements org.apache.spark.security.HadoopDelegationTokenProvider, org.apache.spark.internal.Logging {
  // not preceding
  public   HBaseDelegationTokenProvider ()  { throw new RuntimeException(); }
  public  boolean delegationTokensRequired (org.apache.spark.SparkConf sparkConf, org.apache.hadoop.conf.Configuration hadoopConf)  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Object> obtainDelegationTokens (org.apache.hadoop.conf.Configuration hadoopConf, org.apache.spark.SparkConf sparkConf, org.apache.hadoop.security.Credentials creds)  { throw new RuntimeException(); }
  // not preceding
  public  java.lang.String serviceName ()  { throw new RuntimeException(); }
}
