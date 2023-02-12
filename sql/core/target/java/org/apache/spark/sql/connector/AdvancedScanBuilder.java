package org.apache.spark.sql.connector;
public  class AdvancedScanBuilder implements org.apache.spark.sql.connector.read.ScanBuilder, org.apache.spark.sql.connector.read.Scan, org.apache.spark.sql.connector.read.SupportsPushDownFilters, org.apache.spark.sql.connector.read.SupportsPushDownRequiredColumns {
  // not preceding
  public   AdvancedScanBuilder ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.read.Scan build ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.sources.Filter[] filters ()  { throw new RuntimeException(); }
  public  void pruneColumns (org.apache.spark.sql.types.StructType requiredSchema)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.sources.Filter[] pushFilters (org.apache.spark.sql.sources.Filter[] filters)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.sources.Filter[] pushedFilters ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType readSchema ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.types.StructType requiredSchema ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.read.Batch toBatch ()  { throw new RuntimeException(); }
}
