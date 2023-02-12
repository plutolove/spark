package org.apache.spark.sql.hive.execution;
public  class HiveCatalogedDDLSuite extends org.apache.spark.sql.execution.command.DDLSuite implements org.apache.spark.sql.hive.test.TestHiveSingleton, org.scalatest.BeforeAndAfterEach {
  // not preceding
  public   HiveCatalogedDDLSuite ()  { throw new RuntimeException(); }
  // not preceding
  public  void afterEach ()  { throw new RuntimeException(); }
  // not preceding
  protected  boolean enableAutoThreadAudit ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.catalog.CatalogTable generateTable (org.apache.spark.sql.catalyst.catalog.SessionCatalog catalog, org.apache.spark.sql.catalyst.TableIdentifier name, boolean isDataSource, scala.collection.Seq<java.lang.String> partitionCols)  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.hive.client.HiveClient hiveClient ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.hive.test.TestHiveContext hiveContext ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.catalog.CatalogTable normalizeCatalogTable (org.apache.spark.sql.catalyst.catalog.CatalogTable table)  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.SparkSession spark ()  { throw new RuntimeException(); }
}
