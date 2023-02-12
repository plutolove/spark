package org.apache.spark.sql.connector;
/**
 * A V2SessionCatalog implementation that can be extended to generate arbitrary <code>Table</code> definitions
 * for testing DDL as well as write operations (through df.write.saveAsTable, df.write.insertInto
 * and SQL).
 */
public  interface TestV2SessionCatalogBase<T extends org.apache.spark.sql.connector.catalog.Table> {
  public  void clearTables ()  ;
  public  org.apache.spark.sql.connector.catalog.Table createTable (org.apache.spark.sql.connector.catalog.Identifier ident, org.apache.spark.sql.types.StructType schema, org.apache.spark.sql.connector.expressions.Transform[] partitions, java.util.Map<java.lang.String, java.lang.String> properties)  ;
  public  boolean dropTable (org.apache.spark.sql.connector.catalog.Identifier ident)  ;
  public  org.apache.spark.sql.connector.catalog.Table loadTable (org.apache.spark.sql.connector.catalog.Identifier ident)  ;
  public  T newTable (java.lang.String name, org.apache.spark.sql.types.StructType schema, org.apache.spark.sql.connector.expressions.Transform[] partitions, java.util.Map<java.lang.String, java.lang.String> properties)  ;
  public  java.util.Map<org.apache.spark.sql.connector.catalog.Identifier, T> tables ()  ;
}
