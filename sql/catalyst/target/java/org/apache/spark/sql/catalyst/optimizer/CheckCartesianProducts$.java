package org.apache.spark.sql.catalyst.optimizer;
/**
 * Check if a join is a cartesian product. Returns true if
 * there are no join conditions involving references from both left and right.
 */
// not preceding
public  class CheckCartesianProducts$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> implements org.apache.spark.sql.catalyst.expressions.PredicateHelper {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final CheckCartesianProducts$ MODULE$ = null;
  public   CheckCartesianProducts$ ()  { throw new RuntimeException(); }
  // not preceding
  public  boolean isCartesianProduct (org.apache.spark.sql.catalyst.plans.logical.Join join)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
}
