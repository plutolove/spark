package org.apache.spark.sql.connector;
/** Used as a V2 DataSource for V2SessionCatalog DDL */
public  class FakeV2Provider implements org.apache.spark.sql.internal.connector.SimpleTableProvider {
  // not preceding
  public   FakeV2Provider ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.connector.catalog.Table getTable (org.apache.spark.sql.util.CaseInsensitiveStringMap options)  { throw new RuntimeException(); }
}
