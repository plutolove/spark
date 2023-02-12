package org.apache.spark.sql.connector;
public  class V1WriteFallbackSessionCatalogSuite extends org.apache.spark.sql.connector.InsertIntoTests implements org.apache.spark.sql.connector.SessionCatalogTest<org.apache.spark.sql.connector.InMemoryTableWithV1Fallback, org.apache.spark.sql.connector.V1FallbackTableCatalog> {
  // not preceding
  public   V1WriteFallbackSessionCatalogSuite ()  { throw new RuntimeException(); }
  protected  java.lang.String catalogAndNamespace ()  { throw new RuntimeException(); }
  protected  java.lang.String catalogClassName ()  { throw new RuntimeException(); }
  protected  void doInsert (java.lang.String tableName, org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> insert, org.apache.spark.sql.SaveMode mode)  { throw new RuntimeException(); }
  // not preceding
  protected  java.lang.String v2Format ()  { throw new RuntimeException(); }
  protected  void verifyTable (java.lang.String tableName, org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> expected)  { throw new RuntimeException(); }
}
