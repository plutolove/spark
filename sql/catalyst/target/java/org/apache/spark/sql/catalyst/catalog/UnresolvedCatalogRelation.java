package org.apache.spark.sql.catalyst.catalog;
/**
 * A placeholder for a table relation, which will be replaced by concrete relation like
 * <code>LogicalRelation</code> or <code>HiveTableRelation</code>, during analysis.
 */
public  class UnresolvedCatalogRelation extends org.apache.spark.sql.catalyst.plans.logical.LeafNode implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.catalyst.catalog.CatalogTable tableMeta ()  { throw new RuntimeException(); }
  // not preceding
  public   UnresolvedCatalogRelation (org.apache.spark.sql.catalyst.catalog.CatalogTable tableMeta)  { throw new RuntimeException(); }
  // not preceding
  public  boolean resolved ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output ()  { throw new RuntimeException(); }
}
