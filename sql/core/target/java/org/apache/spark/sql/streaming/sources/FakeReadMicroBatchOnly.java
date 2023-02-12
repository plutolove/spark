package org.apache.spark.sql.streaming.sources;
public  class FakeReadMicroBatchOnly implements org.apache.spark.sql.sources.DataSourceRegister, org.apache.spark.sql.internal.connector.SimpleTableProvider, org.apache.spark.sql.connector.catalog.SessionConfigSupport {
  // not preceding
  public   FakeReadMicroBatchOnly ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.catalog.Table getTable (org.apache.spark.sql.util.CaseInsensitiveStringMap options)  { throw new RuntimeException(); }
  public  java.lang.String keyPrefix ()  { throw new RuntimeException(); }
  // not preceding
  public  java.lang.String shortName ()  { throw new RuntimeException(); }
}
