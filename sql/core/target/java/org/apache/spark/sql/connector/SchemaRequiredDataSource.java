package org.apache.spark.sql.connector;
public  class SchemaRequiredDataSource implements org.apache.spark.sql.connector.catalog.TableProvider {
  // not preceding
  public  class MyScanBuilder extends org.apache.spark.sql.connector.SimpleScanBuilder {
    // not preceding
    public   MyScanBuilder (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
    // not preceding
    public  org.apache.spark.sql.connector.read.InputPartition[] planInputPartitions ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.types.StructType readSchema ()  { throw new RuntimeException(); }
  }
  // not preceding
  public   SchemaRequiredDataSource ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.catalog.Table getTable (org.apache.spark.sql.types.StructType schema, org.apache.spark.sql.connector.expressions.Transform[] partitioning, java.util.Map<java.lang.String, java.lang.String> properties)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType inferSchema (org.apache.spark.sql.util.CaseInsensitiveStringMap options)  { throw new RuntimeException(); }
  // not preceding
  public  boolean supportsExternalMetadata ()  { throw new RuntimeException(); }
}
