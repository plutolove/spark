package org.apache.spark.sql.catalyst.optimizer;
/**
 * Given a predicate expression and an input plan, it rewrites any embedded existential sub-query
 * into an existential join. It returns the rewritten expression together with the updated plan.
 * Currently, it does not support NOT IN nested inside a NOT expression. This case is blocked in
 * the Analyzer.
 */
// not preceding
public  class RewritePredicateSubquery$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> implements org.apache.spark.sql.catalyst.expressions.PredicateHelper {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final RewritePredicateSubquery$ MODULE$ = null;
  public   RewritePredicateSubquery$ ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
}
