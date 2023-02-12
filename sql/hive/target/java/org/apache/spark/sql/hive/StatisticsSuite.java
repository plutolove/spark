package org.apache.spark.sql.hive;
/**
 * To see if stats exist, we need to check spark's stats properties instead of catalog
 * statistics, because hive would change stats in metastore and thus change catalog statistics.
 */
public  class StatisticsSuite extends org.apache.spark.sql.StatisticsCollectionTestBase implements org.apache.spark.sql.hive.test.TestHiveSingleton {
  // not preceding
  public   StatisticsSuite ()  { throw new RuntimeException(); }
  // not preceding
  protected  boolean enableAutoThreadAudit ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.hive.client.HiveClient hiveClient ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.hive.test.TestHiveContext hiveContext ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.SparkSession spark ()  { throw new RuntimeException(); }
}
