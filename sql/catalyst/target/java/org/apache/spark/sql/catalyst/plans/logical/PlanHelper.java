package org.apache.spark.sql.catalyst.plans.logical;
/**
 * Check if there's any expression in this query plan operator that is
 * - A WindowExpression but the plan is not Window
 * - An AggregateExpresion but the plan is not Aggregate or Window
 * - A Generator but the plan is not Generate
 * Returns the list of invalid expressions that this operator hosts. This can happen when
 * 1. The input query from users contain invalid expressions.
 *    Example : SELECT * FROM tab WHERE max(c1) > 0
 * 2. Query rewrites inadvertently produce plans that are invalid.
 */
// not preceding
public  class PlanHelper {
  // not preceding
  static public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> specialExpressionsInUnsupportedOperator (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
}