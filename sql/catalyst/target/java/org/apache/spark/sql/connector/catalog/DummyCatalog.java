package org.apache.spark.sql.connector.catalog;
public  class DummyCatalog implements org.apache.spark.sql.connector.catalog.CatalogPlugin {
  // not preceding
  public   DummyCatalog ()  { throw new RuntimeException(); }
  public  java.lang.String[] defaultNamespace ()  { throw new RuntimeException(); }
  // not preceding
  public  void initialize (java.lang.String name, org.apache.spark.sql.util.CaseInsensitiveStringMap options)  { throw new RuntimeException(); }
  public  java.lang.String name ()  { throw new RuntimeException(); }
}
