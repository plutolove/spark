package org.apache.spark.sql.connector;
public  class DataSourceV2SQLSuite extends org.apache.spark.sql.connector.InsertIntoTests implements org.apache.spark.sql.connector.AlterTableTests {
  // not preceding
  public   DataSourceV2SQLSuite ()  { throw new RuntimeException(); }
  protected  java.lang.String catalogAndNamespace ()  { throw new RuntimeException(); }
  protected  void doInsert (java.lang.String tableName, org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> insert, org.apache.spark.sql.SaveMode mode)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.catalog.Table getTableMetadata (java.lang.String tableName)  { throw new RuntimeException(); }
  protected  java.lang.String v2Format ()  { throw new RuntimeException(); }
  public  void verifyTable (java.lang.String tableName, org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> expected)  { throw new RuntimeException(); }
}
