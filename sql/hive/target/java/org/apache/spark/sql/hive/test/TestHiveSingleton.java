package org.apache.spark.sql.hive.test;
public  interface TestHiveSingleton extends org.scalatest.BeforeAndAfterAll {
  public  void afterAll ()  ;
  public  boolean enableAutoThreadAudit ()  ;
  public  org.apache.spark.sql.hive.client.HiveClient hiveClient ()  ;
  public  org.apache.spark.sql.hive.test.TestHiveContext hiveContext ()  ;
  public  org.apache.spark.sql.SparkSession spark ()  ;
}
