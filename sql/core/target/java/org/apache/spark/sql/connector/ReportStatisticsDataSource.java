package org.apache.spark.sql.connector;
public  class ReportStatisticsDataSource extends org.apache.spark.sql.connector.SimpleWritableDataSource {
  // not preceding
  public  class MyScanBuilder extends org.apache.spark.sql.connector.SimpleScanBuilder implements org.apache.spark.sql.connector.read.SupportsReportStatistics {
    // not preceding
    public   MyScanBuilder ()  { throw new RuntimeException(); }
    // not preceding
    public  org.apache.spark.sql.connector.read.Statistics estimateStatistics ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.connector.read.InputPartition[] planInputPartitions ()  { throw new RuntimeException(); }
  }
  // not preceding
  public   ReportStatisticsDataSource ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.connector.catalog.Table getTable (org.apache.spark.sql.util.CaseInsensitiveStringMap options)  { throw new RuntimeException(); }
}
