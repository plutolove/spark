package org.apache.spark.sql.connector;
public  class InMemoryTableCatalog extends org.apache.spark.sql.connector.BasicInMemoryTableCatalog implements org.apache.spark.sql.connector.catalog.SupportsNamespaces {
  // not preceding
  static public  java.lang.String SIMULATE_FAILED_CREATE_PROPERTY ()  { throw new RuntimeException(); }
  static public  java.lang.String SIMULATE_DROP_BEFORE_REPLACE_PROPERTY ()  { throw new RuntimeException(); }
  static public  void maybeSimulateFailedTableCreation (java.util.Map<java.lang.String, java.lang.String> tableProperties)  { throw new RuntimeException(); }
  // not preceding
  public   InMemoryTableCatalog ()  { throw new RuntimeException(); }
  public  boolean namespaceExists (java.lang.String[] namespace)  { throw new RuntimeException(); }
  public  java.lang.String[][] listNamespaces ()  { throw new RuntimeException(); }
  public  java.lang.String[][] listNamespaces (java.lang.String[] namespace)  { throw new RuntimeException(); }
  public  java.util.Map<java.lang.String, java.lang.String> loadNamespaceMetadata (java.lang.String[] namespace)  { throw new RuntimeException(); }
  public  void createNamespace (java.lang.String[] namespace, java.util.Map<java.lang.String, java.lang.String> metadata)  { throw new RuntimeException(); }
  public  void alterNamespace (java.lang.String[] namespace, scala.collection.Seq<org.apache.spark.sql.connector.catalog.NamespaceChange> changes)  { throw new RuntimeException(); }
  public  boolean dropNamespace (java.lang.String[] namespace)  { throw new RuntimeException(); }
  // not preceding
  public  void alterNamespace (java.lang.String[] namespace, org.apache.spark.sql.connector.catalog.NamespaceChange[] changes)  { throw new RuntimeException(); }
}
