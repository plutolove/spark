package org.apache.spark.sql.catalyst.plans.logical;
/**
 * The logical plan of the SHOW TABLE command that works for v2 catalogs.
 */
public  class ShowTables extends org.apache.spark.sql.catalyst.plans.logical.LogicalPlan implements org.apache.spark.sql.catalyst.plans.logical.Command, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan namespace ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> pattern ()  { throw new RuntimeException(); }
  // not preceding
  public   ShowTables (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan namespace, scala.Option<java.lang.String> pattern)  { throw new RuntimeException(); }
  // not preceding
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> children ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output ()  { throw new RuntimeException(); }
}
