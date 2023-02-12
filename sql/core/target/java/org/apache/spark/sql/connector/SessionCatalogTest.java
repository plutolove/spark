package org.apache.spark.sql.connector;
public  interface SessionCatalogTest<T extends org.apache.spark.sql.connector.catalog.Table, Catalog extends org.apache.spark.sql.connector.TestV2SessionCatalogBase<T>> extends org.apache.spark.sql.test.SharedSparkSession, org.scalatest.BeforeAndAfter {
  public  void afterEach ()  ;
  public  org.apache.spark.sql.connector.catalog.CatalogPlugin catalog (java.lang.String name)  ;
  public  java.lang.String catalogClassName ()  ;
  public  java.lang.String v2Format ()  ;
  public  void verifyTable (java.lang.String tableName, org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> expected)  ;
}
