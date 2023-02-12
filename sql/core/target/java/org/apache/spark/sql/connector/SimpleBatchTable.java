package org.apache.spark.sql.connector;
public abstract class SimpleBatchTable implements org.apache.spark.sql.connector.catalog.Table, org.apache.spark.sql.connector.catalog.SupportsRead {
  // not preceding
  public   SimpleBatchTable ()  { throw new RuntimeException(); }
  public  java.util.Set<org.apache.spark.sql.connector.catalog.TableCapability> capabilities ()  { throw new RuntimeException(); }
  public  java.lang.String name ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.types.StructType schema ()  { throw new RuntimeException(); }
}
