package org.apache.spark.sql.catalyst.optimizer;
/**
 * Collapse Adjacent Window Expression.
 * - If the partition specs and order specs are the same and the window expression are
 *   independent and are of the same window function type, collapse into the parent.
 */
// not preceding
public  class CollapseWindow$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final CollapseWindow$ MODULE$ = null;
  public   CollapseWindow$ ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
}
