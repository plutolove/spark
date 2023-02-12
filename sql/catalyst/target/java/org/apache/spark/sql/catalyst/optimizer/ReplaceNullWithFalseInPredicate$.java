package org.apache.spark.sql.catalyst.optimizer;
/**
 * Recursively traverse the Boolean-type expression to replace
 * <code>Literal(null, BooleanType)</code> with <code>FalseLiteral</code>, if possible.
 * <p>
 * Note that <code>transformExpressionsDown</code> can not be used here as we must stop as soon as we hit
 * an expression that is not {@link CaseWhen}, {@link If}, {@link And}, {@link Or} or
 * <code>Literal(null, BooleanType)</code>.
 */
// not preceding
public  class ReplaceNullWithFalseInPredicate$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final ReplaceNullWithFalseInPredicate$ MODULE$ = null;
  public   ReplaceNullWithFalseInPredicate$ ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
}
