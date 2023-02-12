package org.apache.spark.sql.catalyst.optimizer;
/**
 * Check if we can safely push a join through a project or union by making sure that attributes
 * referred in join condition do not contain the same attributes as the plan they are moved
 * into. This can happen when both sides of join refers to the same source (self join). This
 * function makes sure that the join condition refers to attributes that are not ambiguous (i.e
 * present in both the legs of the join) or else the resultant plan will be invalid.
 */
// not preceding
public  class PushDownLeftSemiAntiJoin$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> implements org.apache.spark.sql.catalyst.expressions.PredicateHelper {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final PushDownLeftSemiAntiJoin$ MODULE$ = null;
  public   PushDownLeftSemiAntiJoin$ ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
}
