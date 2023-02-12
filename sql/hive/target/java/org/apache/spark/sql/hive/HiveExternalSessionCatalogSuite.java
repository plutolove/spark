package org.apache.spark.sql.hive;
public  class HiveExternalSessionCatalogSuite extends org.apache.spark.sql.catalyst.catalog.SessionCatalogSuite implements org.apache.spark.sql.hive.test.TestHiveSingleton {
  // not preceding
  public   HiveExternalSessionCatalogSuite ()  { throw new RuntimeException(); }
  // not preceding
  protected  boolean enableAutoThreadAudit ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.hive.client.HiveClient hiveClient ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.hive.test.TestHiveContext hiveContext ()  { throw new RuntimeException(); }
  // not preceding
  protected  boolean isHiveExternalCatalog ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.SparkSession spark ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.catalog.CatalogTestUtils utils ()  { throw new RuntimeException(); }
}
