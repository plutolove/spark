package org.apache.spark.sql.catalyst.analysis;
/**
 * A plan containing resolved table.
 */
public  class ResolvedTable extends org.apache.spark.sql.catalyst.plans.logical.LeafNode implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.connector.catalog.TableCatalog catalog ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.catalog.Identifier identifier ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.catalog.Table table ()  { throw new RuntimeException(); }
  // not preceding
  public   ResolvedTable (org.apache.spark.sql.connector.catalog.TableCatalog catalog, org.apache.spark.sql.connector.catalog.Identifier identifier, org.apache.spark.sql.connector.catalog.Table table)  { throw new RuntimeException(); }
  // not preceding
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output ()  { throw new RuntimeException(); }
}
