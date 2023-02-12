package org.apache.spark.sql.connector;
public  class V1FallbackTableCatalog extends org.apache.spark.sql.connector.catalog.DelegatingCatalogExtension implements org.apache.spark.sql.connector.TestV2SessionCatalogBase<org.apache.spark.sql.connector.InMemoryTableWithV1Fallback> {
  // not preceding
  public   V1FallbackTableCatalog ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.connector.InMemoryTableWithV1Fallback newTable (java.lang.String name, org.apache.spark.sql.types.StructType schema, org.apache.spark.sql.connector.expressions.Transform[] partitions, java.util.Map<java.lang.String, java.lang.String> properties)  { throw new RuntimeException(); }
  // not preceding
  protected  java.util.Map<org.apache.spark.sql.connector.catalog.Identifier, org.apache.spark.sql.connector.InMemoryTableWithV1Fallback> tables ()  { throw new RuntimeException(); }
}
