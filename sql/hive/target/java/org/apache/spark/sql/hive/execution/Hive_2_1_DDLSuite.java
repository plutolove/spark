package org.apache.spark.sql.hive.execution;
/**
 * A separate set of DDL tests that uses Hive 2.1 libraries, which behave a little differently
 * from the built-in ones.
 */
public  class Hive_2_1_DDLSuite extends org.apache.spark.SparkFunSuite implements org.apache.spark.sql.hive.test.TestHiveSingleton, org.scalatest.BeforeAndAfterEach, org.scalatest.BeforeAndAfterAll {
  // not preceding
  public   Hive_2_1_DDLSuite ()  { throw new RuntimeException(); }
  public  void afterAll ()  { throw new RuntimeException(); }
  public  void afterEach ()  { throw new RuntimeException(); }
  // not preceding
  protected  boolean enableAutoThreadAudit ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.hive.client.HiveClient hiveClient ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.hive.test.TestHiveContext hiveContext ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.SparkSession spark ()  { throw new RuntimeException(); }
}
