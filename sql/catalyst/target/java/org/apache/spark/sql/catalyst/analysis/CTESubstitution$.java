package org.apache.spark.sql.catalyst.analysis;
/**
 * Spark 3.0 changes the CTE relations resolution, and inner relations take precedence. This is
 * correct but we need to warn users about this behavior change under EXCEPTION mode, when we see
 * CTE relations with conflicting names.
 * <p>
 * Note that, before Spark 3.0 the parser didn't support CTE in the FROM clause. For example,
 * <code>WITH ... SELECT * FROM (WITH ... SELECT ...)</code> was not supported. We should not fail for this
 * case, as Spark versions before 3.0 can't run it anyway. The parameter <code>startOfQuery</code> is used
 * to indicate where we can define CTE relations before Spark 3.0, and we should only check
 * name conflicts when <code>startOfQuery</code> is true.
 */
// not preceding
public  class CTESubstitution$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final CTESubstitution$ MODULE$ = null;
  public   CTESubstitution$ ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
}
