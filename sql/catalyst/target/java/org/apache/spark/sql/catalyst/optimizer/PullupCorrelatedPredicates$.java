package org.apache.spark.sql.catalyst.optimizer;
/**
 * Returns the correlated predicates and a updated plan that removes the outer references.
 */
// not preceding
public  class PullupCorrelatedPredicates$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> implements org.apache.spark.sql.catalyst.expressions.PredicateHelper {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final PullupCorrelatedPredicates$ MODULE$ = null;
  public   PullupCorrelatedPredicates$ ()  { throw new RuntimeException(); }
  /**
   * Pull up the correlated predicates and rewrite all subqueries in an operator tree..
   * @param plan (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
}
