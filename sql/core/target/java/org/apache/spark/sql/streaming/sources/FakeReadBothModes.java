package org.apache.spark.sql.streaming.sources;
public  class FakeReadBothModes implements org.apache.spark.sql.sources.DataSourceRegister, org.apache.spark.sql.internal.connector.SimpleTableProvider {
  // not preceding
  public   FakeReadBothModes ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.catalog.Table getTable (org.apache.spark.sql.util.CaseInsensitiveStringMap options)  { throw new RuntimeException(); }
  // not preceding
  public  java.lang.String shortName ()  { throw new RuntimeException(); }
}