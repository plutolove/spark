package org.apache.spark.sql.connector;
public  class InMemoryTableWithV1Fallback implements org.apache.spark.sql.connector.catalog.Table, org.apache.spark.sql.connector.catalog.SupportsWrite {
  // not preceding
  public   InMemoryTableWithV1Fallback (java.lang.String name, org.apache.spark.sql.types.StructType schema, org.apache.spark.sql.connector.expressions.Transform[] partitioning, java.util.Map<java.lang.String, java.lang.String> properties)  { throw new RuntimeException(); }
  public  java.util.Set<org.apache.spark.sql.connector.catalog.TableCapability> capabilities ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.Row> getData ()  { throw new RuntimeException(); }
  // not preceding
  public  java.lang.String name ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.write.WriteBuilder newWriteBuilder (org.apache.spark.sql.connector.write.LogicalWriteInfo info)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.expressions.Transform[] partitioning ()  { throw new RuntimeException(); }
  public  java.util.Map<java.lang.String, java.lang.String> properties ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType schema ()  { throw new RuntimeException(); }
}
