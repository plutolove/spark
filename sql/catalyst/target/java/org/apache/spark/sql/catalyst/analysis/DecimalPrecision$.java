package org.apache.spark.sql.catalyst.analysis;
/** Decimal precision promotion for +, -, *, /, %, pmod, and binary comparison. */
// not preceding
public  class DecimalPrecision$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> implements org.apache.spark.sql.catalyst.analysis.TypeCoercionRule {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final DecimalPrecision$ MODULE$ = null;
  public   DecimalPrecision$ ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.DecimalType widerDecimalType (org.apache.spark.sql.types.DecimalType d1, org.apache.spark.sql.types.DecimalType d2)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.DecimalType widerDecimalType (int p1, int s1, int p2, int s2)  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan coerceTypes (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  /** Decimal precision promotion for +, -, *, /, %, pmod, and binary comparison. */
    scala.PartialFunction<org.apache.spark.sql.catalyst.expressions.Expression, org.apache.spark.sql.catalyst.expressions.Expression> decimalAndDecimal ()  { throw new RuntimeException(); }
}
