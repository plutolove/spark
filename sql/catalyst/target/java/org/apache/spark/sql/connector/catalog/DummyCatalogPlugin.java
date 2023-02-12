package org.apache.spark.sql.connector.catalog;
public  class DummyCatalogPlugin implements org.apache.spark.sql.connector.catalog.CatalogPlugin, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  // not preceding
  public  java.lang.String name ()  { throw new RuntimeException(); }
  // not preceding
  public   DummyCatalogPlugin (java.lang.String name)  { throw new RuntimeException(); }
  // not preceding
  public  void initialize (java.lang.String name, org.apache.spark.sql.util.CaseInsensitiveStringMap options)  { throw new RuntimeException(); }
}
