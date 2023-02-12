package org.apache.spark.sql.catalyst.analysis;
/**
 * A plan containing resolved (temp) views.
 */
public  class ResolvedView extends org.apache.spark.sql.catalyst.plans.logical.LeafNode implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.connector.catalog.Identifier identifier ()  { throw new RuntimeException(); }
  // not preceding
  public   ResolvedView (org.apache.spark.sql.connector.catalog.Identifier identifier)  { throw new RuntimeException(); }
  // not preceding
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output ()  { throw new RuntimeException(); }
}
