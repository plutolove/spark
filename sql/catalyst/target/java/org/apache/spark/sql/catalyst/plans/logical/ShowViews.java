package org.apache.spark.sql.catalyst.plans.logical;
/**
 * The logical plan of the SHOW VIEWS command that works for v1 and v2 catalogs.
 * <p>
 * Notes: v2 catalogs do not support views API yet, the command will fallback to
 * v1 ShowViewsCommand during ResolveSessionCatalog.
 */
public  class ShowViews extends org.apache.spark.sql.catalyst.plans.logical.LogicalPlan implements org.apache.spark.sql.catalyst.plans.logical.Command, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan namespace ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> pattern ()  { throw new RuntimeException(); }
  // not preceding
  public   ShowViews (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan namespace, scala.Option<java.lang.String> pattern)  { throw new RuntimeException(); }
  // not preceding
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> children ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output ()  { throw new RuntimeException(); }
}
