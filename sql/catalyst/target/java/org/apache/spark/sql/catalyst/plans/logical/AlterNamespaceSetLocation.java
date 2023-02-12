package org.apache.spark.sql.catalyst.plans.logical;
/**
 * The logical plan of the ALTER (DATABASE|SCHEMA|NAMESPACE) ... SET LOCATION
 * command that works for v2 catalogs.
 */
public  class AlterNamespaceSetLocation extends org.apache.spark.sql.catalyst.plans.logical.LogicalPlan implements org.apache.spark.sql.catalyst.plans.logical.Command, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan namespace ()  { throw new RuntimeException(); }
  public  java.lang.String location ()  { throw new RuntimeException(); }
  // not preceding
  public   AlterNamespaceSetLocation (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan namespace, java.lang.String location)  { throw new RuntimeException(); }
  // not preceding
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> children ()  { throw new RuntimeException(); }
}
