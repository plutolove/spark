package org.apache.spark.sql.connector;
public  class InMemoryTableSessionCatalog extends org.apache.spark.sql.connector.catalog.DelegatingCatalogExtension implements org.apache.spark.sql.connector.TestV2SessionCatalogBase<org.apache.spark.sql.connector.InMemoryTable> {
  static public  void withCustomIdentifierResolver (scala.Function1<org.apache.spark.sql.connector.catalog.Identifier, org.apache.spark.sql.connector.catalog.Identifier> resolver, scala.Function0<scala.runtime.BoxedUnit> f)  { throw new RuntimeException(); }
  // not preceding
  protected  java.util.Map<org.apache.spark.sql.connector.catalog.Identifier, org.apache.spark.sql.connector.InMemoryTable> tables ()  { throw new RuntimeException(); }
  // not preceding
  public   InMemoryTableSessionCatalog ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.connector.InMemoryTable newTable (java.lang.String name, org.apache.spark.sql.types.StructType schema, org.apache.spark.sql.connector.expressions.Transform[] partitions, java.util.Map<java.lang.String, java.lang.String> properties)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.catalog.Table loadTable (org.apache.spark.sql.connector.catalog.Identifier ident)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.catalog.Table alterTable (org.apache.spark.sql.connector.catalog.Identifier ident, scala.collection.Seq<org.apache.spark.sql.connector.catalog.TableChange> changes)  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.connector.catalog.Table alterTable (org.apache.spark.sql.connector.catalog.Identifier ident, org.apache.spark.sql.connector.catalog.TableChange[] changes)  { throw new RuntimeException(); }
}
