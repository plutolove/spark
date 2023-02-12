package org.apache.spark.sql.catalyst.plans;
/**
 * Since attribute references are given globally unique ids during analysis,
 * we must normalize them to check if two different queries are identical.
 */
public  interface PlanTestBase extends org.apache.spark.sql.catalyst.expressions.PredicateHelper, org.apache.spark.sql.catalyst.plans.SQLHelper {
  /** Fails the test if the two expressions do not match */
  public  void compareExpressions (org.apache.spark.sql.catalyst.expressions.Expression e1, org.apache.spark.sql.catalyst.expressions.Expression e2)  ;
  /** Fails the test if the join order in the two plans do not match */
  public  void compareJoinOrder (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan1, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan2)  ;
  /** Fails the test if the two plans do not match */
  public  void comparePlans (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan1, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan2, boolean checkAnalysis)  ;
  public  org.apache.spark.sql.internal.SQLConf conf ()  ;
  /**
   * Since attribute references are given globally unique ids during analysis,
   * we must normalize them to check if two different queries are identical.
   * @param plan (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan normalizeExprIds (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  ;
  /**
   * Normalizes plans:
   * - Filter the filter conditions that appear in a plan. For instance,
   *   ((expr 1 &amp;&amp; expr 2) &amp;&amp; expr 3), (expr 1 &amp;&amp; expr 2 &amp;&amp; expr 3), (expr 3 &amp;&amp; (expr 1 &amp;&amp; expr 2)
   *   etc., will all now be equivalent.
   * - Sample the seed will replaced by 0L.
   * - Join conditions will be resorted by hashCode.
   * @param plan (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan normalizePlan (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  ;
  /**
   * Rewrite {@link EqualTo} and {@link EqualNullSafe} operator to keep order. The following cases will be
   * equivalent:
   * 1. (a = b), (b = a);
   * 2. (a <=&gt; b), (b <=&gt; a).
   * @param condition (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.expressions.Expression rewriteEqual (org.apache.spark.sql.catalyst.expressions.Expression condition)  ;
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan rewriteNameFromAttrNullability (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  ;
  /** Consider symmetry for joins when comparing plans. */
  public  boolean sameJoinPlan (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan1, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan2)  ;
}
