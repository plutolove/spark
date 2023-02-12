package org.apache.spark.sql.execution.adaptive;
/**
 * Returns an expression-id-to-execution-plan map for all the sub-queries.
 * For each sub-query, generate the adaptive execution plan for each sub-query by applying this
 * rule, or reuse the execution plan from another sub-query of the same semantics if possible.
 */
public  class InsertAdaptiveSparkPlan extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.execution.SparkPlan> implements scala.Product, scala.Serializable {
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.execution.adaptive.AdaptiveExecutionContext adaptiveExecutionContext ()  { throw new RuntimeException(); }
  // not preceding
  public   InsertAdaptiveSparkPlan (org.apache.spark.sql.execution.adaptive.AdaptiveExecutionContext adaptiveExecutionContext)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.SparkPlan apply (org.apache.spark.sql.execution.SparkPlan plan)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.SparkPlan compileSubquery (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
}
