package org.apache.spark.sql.execution.adaptive;
/**
 * Returns an expression-id-to-execution-plan map for all the sub-queries.
 * For each sub-query, generate the adaptive execution plan for each sub-query by applying this
 * rule, or reuse the execution plan from another sub-query of the same semantics if possible.
 */
public  class SubqueryAdaptiveNotSupportedException extends java.lang.Exception implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan ()  { throw new RuntimeException(); }
  // not preceding
  public   SubqueryAdaptiveNotSupportedException (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
}
