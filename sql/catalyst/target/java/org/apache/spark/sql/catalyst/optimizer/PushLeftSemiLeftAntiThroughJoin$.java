package org.apache.spark.sql.catalyst.optimizer;
/**
 * Define an enumeration to identify whether a LeftSemi/LeftAnti join can be pushed down to
 * the left leg or the right leg of the join.
 */
// not preceding
public  class PushLeftSemiLeftAntiThroughJoin$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> implements org.apache.spark.sql.catalyst.expressions.PredicateHelper {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final PushLeftSemiLeftAntiThroughJoin$ MODULE$ = null;
  public   PushLeftSemiLeftAntiThroughJoin$ ()  { throw new RuntimeException(); }
  /**
   * When the join condition is empty,
   * 1) if this is a left outer join or inner join, push leftsemi/anti join down
   *    to the left leg of join.
   * 2) if a right outer join, to the right leg of join,
   * @param plan (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
}
