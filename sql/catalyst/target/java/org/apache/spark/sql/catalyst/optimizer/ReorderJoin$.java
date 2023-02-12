package org.apache.spark.sql.catalyst.optimizer;
/**
 * Join a list of plans together and push down the conditions into them.
 * <p>
 * The joined plan are picked from left to right, prefer those has at least one join condition.
 * <p>
 * param:  input a list of LogicalPlans to inner join and the type of inner join.
 * param:  conditions a list of condition for join.
 */
// not preceding
public  class ReorderJoin$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> implements org.apache.spark.sql.catalyst.expressions.PredicateHelper {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final ReorderJoin$ MODULE$ = null;
  public   ReorderJoin$ ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan createOrderedJoin (scala.collection.Seq<scala.Tuple2<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan, org.apache.spark.sql.catalyst.plans.InnerLike>> input, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> conditions)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
}
