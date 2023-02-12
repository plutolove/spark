package org.apache.spark.sql.hive;
public  class HiveShowCreateTableSuite extends org.apache.spark.sql.ShowCreateTableSuite implements org.apache.spark.sql.hive.test.TestHiveSingleton {
  // not preceding
  public   HiveShowCreateTableSuite ()  { throw new RuntimeException(); }
  // not preceding
  protected  boolean enableAutoThreadAudit ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.hive.client.HiveClient hiveClient ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.hive.test.TestHiveContext hiveContext ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.SparkSession spark ()  { throw new RuntimeException(); }
}
