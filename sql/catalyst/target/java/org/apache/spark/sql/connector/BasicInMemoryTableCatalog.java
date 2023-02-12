package org.apache.spark.sql.connector;
public  class BasicInMemoryTableCatalog implements org.apache.spark.sql.connector.catalog.TableCatalog {
  // not preceding
  public   BasicInMemoryTableCatalog ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.catalog.Table alterTable (org.apache.spark.sql.connector.catalog.Identifier ident, scala.collection.Seq<org.apache.spark.sql.connector.catalog.TableChange> changes)  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.connector.catalog.Table alterTable (org.apache.spark.sql.connector.catalog.Identifier ident, org.apache.spark.sql.connector.catalog.TableChange[] changes)  { throw new RuntimeException(); }
  public  void clearTables ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.catalog.Table createTable (org.apache.spark.sql.connector.catalog.Identifier ident, org.apache.spark.sql.types.StructType schema, org.apache.spark.sql.connector.expressions.Transform[] partitions, java.util.Map<java.lang.String, java.lang.String> properties)  { throw new RuntimeException(); }
  public  boolean dropTable (org.apache.spark.sql.connector.catalog.Identifier ident)  { throw new RuntimeException(); }
  public  void initialize (java.lang.String name, org.apache.spark.sql.util.CaseInsensitiveStringMap options)  { throw new RuntimeException(); }
  public  void invalidateTable (org.apache.spark.sql.connector.catalog.Identifier ident)  { throw new RuntimeException(); }
  public  boolean isTableInvalidated (org.apache.spark.sql.connector.catalog.Identifier ident)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.catalog.Identifier[] listTables (java.lang.String[] namespace)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.catalog.Table loadTable (org.apache.spark.sql.connector.catalog.Identifier ident)  { throw new RuntimeException(); }
  public  java.lang.String name ()  { throw new RuntimeException(); }
  // not preceding
  protected  java.util.Map<scala.collection.immutable.List<java.lang.String>, scala.collection.immutable.Map<java.lang.String, java.lang.String>> namespaces ()  { throw new RuntimeException(); }
  public  void renameTable (org.apache.spark.sql.connector.catalog.Identifier oldIdent, org.apache.spark.sql.connector.catalog.Identifier newIdent)  { throw new RuntimeException(); }
  protected  java.util.Map<org.apache.spark.sql.connector.catalog.Identifier, org.apache.spark.sql.connector.catalog.Table> tables ()  { throw new RuntimeException(); }
}
