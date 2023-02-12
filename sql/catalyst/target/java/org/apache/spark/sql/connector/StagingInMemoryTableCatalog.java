package org.apache.spark.sql.connector;
public  class StagingInMemoryTableCatalog extends org.apache.spark.sql.connector.InMemoryTableCatalog implements org.apache.spark.sql.connector.catalog.StagingTableCatalog {
  // not preceding
  public   StagingInMemoryTableCatalog ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.connector.catalog.StagedTable stageCreate (org.apache.spark.sql.connector.catalog.Identifier ident, org.apache.spark.sql.types.StructType schema, org.apache.spark.sql.connector.expressions.Transform[] partitions, java.util.Map<java.lang.String, java.lang.String> properties)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.catalog.StagedTable stageCreateOrReplace (org.apache.spark.sql.connector.catalog.Identifier ident, org.apache.spark.sql.types.StructType schema, org.apache.spark.sql.connector.expressions.Transform[] partitions, java.util.Map<java.lang.String, java.lang.String> properties)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.catalog.StagedTable stageReplace (org.apache.spark.sql.connector.catalog.Identifier ident, org.apache.spark.sql.types.StructType schema, org.apache.spark.sql.connector.expressions.Transform[] partitions, java.util.Map<java.lang.String, java.lang.String> properties)  { throw new RuntimeException(); }
}
