package org.apache.spark.sql.catalyst.analysis;
/**
 * Check if the arguments of a function are either resolved or a lambda function.
 */
public  class ResolveHigherOrderFunctions extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> implements scala.Product, scala.Serializable {
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.catalyst.catalog.SessionCatalog catalog ()  { throw new RuntimeException(); }
  // not preceding
  public   ResolveHigherOrderFunctions (org.apache.spark.sql.catalyst.catalog.SessionCatalog catalog)  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
}
