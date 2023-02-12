package org.apache.spark.sql.catalyst.plans.logical;
/**
 * The logical plan of the ALTER (DATABASE|SCHEMA|NAMESPACE) ... SET (DBPROPERTIES|PROPERTIES)
 * command that works for v2 catalogs.
 */
public  class AlterNamespaceSetProperties extends org.apache.spark.sql.catalyst.plans.logical.LogicalPlan implements org.apache.spark.sql.catalyst.plans.logical.Command, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan namespace ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, java.lang.String> properties ()  { throw new RuntimeException(); }
  // not preceding
  public   AlterNamespaceSetProperties (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan namespace, scala.collection.immutable.Map<java.lang.String, java.lang.String> properties)  { throw new RuntimeException(); }
  // not preceding
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> children ()  { throw new RuntimeException(); }
}