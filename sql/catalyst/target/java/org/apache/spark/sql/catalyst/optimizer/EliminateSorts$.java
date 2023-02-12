package org.apache.spark.sql.catalyst.optimizer;
/**
 * Removes Sort operation. This can happen:
 * 1) if the sort order is empty or the sort order does not have any reference
 * 2) if the Sort operator is a local sort and the child is already sorted
 * 3) if there is another Sort operator separated by 0...n Project/Filter operators
 * 4) if the Sort operator is within Join separated by 0...n Project/Filter operators only,
 *    and the Join conditions is deterministic
 * 5) if the Sort operator is within GroupBy separated by 0...n Project/Filter operators only,
 *    and the aggregate function is order irrelevant
 */
// not preceding
public  class EliminateSorts$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final EliminateSorts$ MODULE$ = null;
  public   EliminateSorts$ ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
}
