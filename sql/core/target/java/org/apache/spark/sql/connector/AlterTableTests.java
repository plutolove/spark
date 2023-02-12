package org.apache.spark.sql.connector;
public  interface AlterTableTests extends org.apache.spark.sql.test.SharedSparkSession {
  public  java.lang.String catalogAndNamespace ()  ;
  public  java.lang.String fullTableName (java.lang.String tableName)  ;
  public  org.apache.spark.sql.connector.catalog.Table getTableMetadata (java.lang.String tableName)  ;
  public  java.lang.String v2Format ()  ;
}
