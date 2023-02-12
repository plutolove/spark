package org.apache.spark.sql.connector;
public  class TableWithV1ReadFallback implements org.apache.spark.sql.connector.catalog.Table, org.apache.spark.sql.connector.catalog.SupportsRead {
  // not preceding
  public   TableWithV1ReadFallback (java.lang.String name)  { throw new RuntimeException(); }
  public  java.util.Set<org.apache.spark.sql.connector.catalog.TableCapability> capabilities ()  { throw new RuntimeException(); }
  // not preceding
  public  java.lang.String name ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.read.ScanBuilder newScanBuilder (org.apache.spark.sql.util.CaseInsensitiveStringMap options)  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.types.StructType schema ()  { throw new RuntimeException(); }
}
