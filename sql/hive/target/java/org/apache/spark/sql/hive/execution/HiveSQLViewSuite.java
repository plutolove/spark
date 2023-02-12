package org.apache.spark.sql.hive.execution;
/**
 * A test suite for Hive view related functionality.
 */
public  class HiveSQLViewSuite extends org.apache.spark.sql.execution.SQLViewSuite implements org.apache.spark.sql.hive.test.TestHiveSingleton {
  // not preceding
  public   HiveSQLViewSuite ()  { throw new RuntimeException(); }
  // not preceding
  protected  boolean enableAutoThreadAudit ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.hive.client.HiveClient hiveClient ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.hive.test.TestHiveContext hiveContext ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.SparkSession spark ()  { throw new RuntimeException(); }
}
