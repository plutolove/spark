package org.apache.spark.sql.catalyst.optimizer;
/**
 * Extracts items of consecutive inner joins and join conditions.
 * This method works for bushy trees and left/right deep trees.
 */
// not preceding
public  class CostBasedJoinReorder$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> implements org.apache.spark.sql.catalyst.expressions.PredicateHelper {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final CostBasedJoinReorder$ MODULE$ = null;
  public   CostBasedJoinReorder$ ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
}
