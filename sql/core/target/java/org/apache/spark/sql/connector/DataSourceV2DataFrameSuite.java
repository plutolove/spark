package org.apache.spark.sql.connector;
public  class DataSourceV2DataFrameSuite extends org.apache.spark.sql.connector.InsertIntoTests {
  // not preceding
  public   DataSourceV2DataFrameSuite ()  { throw new RuntimeException(); }
  protected  java.lang.String catalogAndNamespace ()  { throw new RuntimeException(); }
  protected  void doInsert (java.lang.String tableName, org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> insert, org.apache.spark.sql.SaveMode mode)  { throw new RuntimeException(); }
  protected  java.lang.String v2Format ()  { throw new RuntimeException(); }
  public  void verifyTable (java.lang.String tableName, org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> expected)  { throw new RuntimeException(); }
}
