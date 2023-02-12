package org.apache.spark.deploy.security;
public  class ExceptionThrowingDelegationTokenProvider implements org.apache.spark.security.HadoopDelegationTokenProvider {
  // not preceding
  static public  boolean constructed ()  { throw new RuntimeException(); }
  // not preceding
  public   ExceptionThrowingDelegationTokenProvider ()  { throw new RuntimeException(); }
  public  java.lang.String serviceName ()  { throw new RuntimeException(); }
  public  boolean delegationTokensRequired (org.apache.spark.SparkConf sparkConf, org.apache.hadoop.conf.Configuration hadoopConf)  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Object> obtainDelegationTokens (org.apache.hadoop.conf.Configuration hadoopConf, org.apache.spark.SparkConf sparkConf, org.apache.hadoop.security.Credentials creds)  { throw new RuntimeException(); }
}
