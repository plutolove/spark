package org.apache.spark.sql.catalyst.plans.logical;
/**
 * The logical plan of the DESCRIBE NAMESPACE command that works for v2 catalogs.
 */
public  class DescribeNamespace extends org.apache.spark.sql.catalyst.plans.logical.LogicalPlan implements org.apache.spark.sql.catalyst.plans.logical.Command, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan namespace ()  { throw new RuntimeException(); }
  public  boolean extended ()  { throw new RuntimeException(); }
  // not preceding
  public   DescribeNamespace (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan namespace, boolean extended)  { throw new RuntimeException(); }
  // not preceding
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> children ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output ()  { throw new RuntimeException(); }
}
