package org.apache.spark.sql.catalyst.optimizer;
/**
 * Short circuit if the underlying expression is already normalized
 */
// not preceding
public  class NormalizeFloatingNumbers$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final NormalizeFloatingNumbers$ MODULE$ = null;
  public   NormalizeFloatingNumbers$ ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
    org.apache.spark.sql.catalyst.expressions.Expression normalize (org.apache.spark.sql.catalyst.expressions.Expression expr)  { throw new RuntimeException(); }
  public  scala.Function1<java.lang.Object, java.lang.Object> FLOAT_NORMALIZER ()  { throw new RuntimeException(); }
  public  scala.Function1<java.lang.Object, java.lang.Object> DOUBLE_NORMALIZER ()  { throw new RuntimeException(); }
}
