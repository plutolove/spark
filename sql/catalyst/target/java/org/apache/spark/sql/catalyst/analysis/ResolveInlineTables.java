package org.apache.spark.sql.catalyst.analysis;
/**
 * Validates the input data dimension:
 * 1. All rows have the same cardinality.
 * 2. The number of column aliases defined is consistent with the number of columns in data.
 * <p>
 * This is package visible for unit testing.
 */
public  class ResolveInlineTables extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> implements org.apache.spark.sql.catalyst.analysis.CastSupport, scala.Product, scala.Serializable {
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.internal.SQLConf conf ()  { throw new RuntimeException(); }
  // not preceding
  public   ResolveInlineTables (org.apache.spark.sql.internal.SQLConf conf)  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  /**
   * Validates the input data dimension:
   * 1. All rows have the same cardinality.
   * 2. The number of column aliases defined is consistent with the number of columns in data.
   * <p>
   * This is package visible for unit testing.
   * @param table (undocumented)
   */
    void validateInputDimension (org.apache.spark.sql.catalyst.analysis.UnresolvedInlineTable table)  { throw new RuntimeException(); }
  /**
   * Validates that all inline table data are valid expressions that can be evaluated
   * (in this they must be foldable).
   * <p>
   * This is package visible for unit testing.
   * @param table (undocumented)
   */
    void validateInputEvaluable (org.apache.spark.sql.catalyst.analysis.UnresolvedInlineTable table)  { throw new RuntimeException(); }
  /**
   * Convert a valid (with right shape and foldable inputs) {@link UnresolvedInlineTable}
   * into a {@link LocalRelation}.
   * <p>
   * This function attempts to coerce inputs into consistent types.
   * <p>
   * This is package visible for unit testing.
   * @param table (undocumented)
   * @return (undocumented)
   */
    org.apache.spark.sql.catalyst.plans.logical.LocalRelation convert (org.apache.spark.sql.catalyst.analysis.UnresolvedInlineTable table)  { throw new RuntimeException(); }
}
