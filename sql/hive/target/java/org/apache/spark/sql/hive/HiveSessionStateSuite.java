package org.apache.spark.sql.hive;
/**
 * Run all tests from <code>SessionStateSuite</code> with a Hive based <code>SessionState</code>.
 */
public  class HiveSessionStateSuite extends org.apache.spark.sql.SessionStateSuite implements org.apache.spark.sql.hive.test.TestHiveSingleton {
  // not preceding
  public   HiveSessionStateSuite ()  { throw new RuntimeException(); }
  public  void afterAll ()  { throw new RuntimeException(); }
  // not preceding
  public  void beforeAll ()  { throw new RuntimeException(); }
  // not preceding
  protected  boolean enableAutoThreadAudit ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.hive.client.HiveClient hiveClient ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.hive.test.TestHiveContext hiveContext ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.SparkSession spark ()  { throw new RuntimeException(); }
}
