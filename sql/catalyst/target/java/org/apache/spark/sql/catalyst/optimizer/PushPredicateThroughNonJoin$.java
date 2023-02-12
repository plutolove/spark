package org.apache.spark.sql.catalyst.optimizer;
/**
 * Check if we can safely push a filter through a projection, by making sure that predicate
 * subqueries in the condition do not contain the same attributes as the plan they are moved
 * into. This can happen when the plan and predicate subquery have the same source.
 */
// not preceding
public  class PushPredicateThroughNonJoin$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> implements org.apache.spark.sql.catalyst.expressions.PredicateHelper {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final PushPredicateThroughNonJoin$ MODULE$ = null;
  public   PushPredicateThroughNonJoin$ ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  public  scala.PartialFunction<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> applyLocally ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.AttributeMap<org.apache.spark.sql.catalyst.expressions.Expression> getAliasMap (org.apache.spark.sql.catalyst.plans.logical.Project plan)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.AttributeMap<org.apache.spark.sql.catalyst.expressions.Expression> getAliasMap (org.apache.spark.sql.catalyst.plans.logical.Aggregate plan)  { throw new RuntimeException(); }
  public  boolean canPushThrough (org.apache.spark.sql.catalyst.plans.logical.UnaryNode p)  { throw new RuntimeException(); }
}
