package org.apache.spark.sql.catalyst.optimizer;
/**
 * Splits join condition expressions or filter predicates (on a given join's output) into three
 * categories based on the attributes required to evaluate them. Note that we explicitly exclude
 * non-deterministic (i.e., stateful) condition expressions in canEvaluateInLeft or
 * canEvaluateInRight to prevent pushing these predicates on either side of the join.
 * <p>
 * @return (canEvaluateInLeft, canEvaluateInRight, haveToEvaluateInBoth)
 */
// not preceding
public  class PushPredicateThroughJoin$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> implements org.apache.spark.sql.catalyst.expressions.PredicateHelper {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final PushPredicateThroughJoin$ MODULE$ = null;
  public   PushPredicateThroughJoin$ ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  public  scala.PartialFunction<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> applyLocally ()  { throw new RuntimeException(); }
}
