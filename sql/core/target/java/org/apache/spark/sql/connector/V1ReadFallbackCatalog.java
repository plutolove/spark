package org.apache.spark.sql.connector;
public  class V1ReadFallbackCatalog extends org.apache.spark.sql.connector.BasicInMemoryTableCatalog {
  // not preceding
  static public  org.apache.spark.sql.types.StructType schema ()  { throw new RuntimeException(); }
  // not preceding
  public   V1ReadFallbackCatalog ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.connector.catalog.Table createTable (org.apache.spark.sql.connector.catalog.Identifier ident, org.apache.spark.sql.types.StructType schema, org.apache.spark.sql.connector.expressions.Transform[] partitions, java.util.Map<java.lang.String, java.lang.String> properties)  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.connector.catalog.Table alterTable (org.apache.spark.sql.connector.catalog.Identifier ident, org.apache.spark.sql.connector.catalog.TableChange[] changes)  { throw new RuntimeException(); }
}
