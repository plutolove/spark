package org.apache.spark.sql.execution;
/**
 * Fill the expression with collected result from executed plan.
 */
public abstract class ExecSubqueryExpression extends org.apache.spark.sql.catalyst.expressions.PlanExpression<org.apache.spark.sql.execution.BaseSubqueryExec> {
  // not preceding
  static public  boolean hasSubquery (org.apache.spark.sql.catalyst.expressions.Expression e)  { throw new RuntimeException(); }
  // not preceding
  public   ExecSubqueryExpression ()  { throw new RuntimeException(); }
  // not preceding
  public abstract  void updateResult ()  ;
  /** Updates the expression with a new plan. */
  public abstract  org.apache.spark.sql.execution.ExecSubqueryExpression withNewPlan (org.apache.spark.sql.execution.BaseSubqueryExec plan)  ;
}
