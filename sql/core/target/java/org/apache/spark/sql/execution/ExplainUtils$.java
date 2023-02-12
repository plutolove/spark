package org.apache.spark.sql.execution;
/**
 * Given a input physical plan, performs the following tasks.
 *   1. Computes the operator id for current operator and records it in the operaror
 *      by setting a tag.
 *   2. Computes the whole stage codegen id for current operator and records it in the
 *      operator by setting a tag.
 *   3. Generate the two part explain output for this plan.
 *      1. First part explains the operator tree with each operator tagged with an unique
 *         identifier.
 *      2. Second part explans each operator in a verbose manner.
 * <p>
 * Note : This function skips over subqueries. They are handled by its caller.
 * <p>
 * param:  plan Input query plan to process
 * param:  append function used to append the explain output
 * param:  startOperatorID The start value of operation id. The subsequent operations will
 *                         be assigned higher value.
 * <p>
 * @return The last generated operation id for this input plan. This is to ensure we
 *         always assign incrementing unique id to each operator.
 * <p>
 */
// not preceding
public  class ExplainUtils$ implements org.apache.spark.sql.execution.adaptive.AdaptiveSparkPlanHelper {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final ExplainUtils$ MODULE$ = null;
  public   ExplainUtils$ ()  { throw new RuntimeException(); }
  /**
   * Given a input physical plan, performs the following tasks.
   *   1. Generates the explain output for the input plan excluding the subquery plans.
   *   2. Generates the explain output for each subquery referenced in the plan.
   * @param plan (undocumented)
   * @param append (undocumented)
   */
  public <T extends org.apache.spark.sql.catalyst.plans.QueryPlan<T>> void processPlan (scala.Function0<org.apache.spark.sql.catalyst.plans.QueryPlan<T>> plan, scala.Function1<java.lang.String, scala.runtime.BoxedUnit> append)  { throw new RuntimeException(); }
  /**
   * Generate detailed field string with different format based on type of input value
   * @param fieldName (undocumented)
   * @param values (undocumented)
   * @return (undocumented)
   */
  public  java.lang.String generateFieldString (java.lang.String fieldName, Object values)  { throw new RuntimeException(); }
  /**
   * Returns the operator identifier for the supplied plan by retrieving the
   * <code>operationId</code> tag value.
   * @param plan (undocumented)
   * @return (undocumented)
   */
  public  java.lang.String getOpId (org.apache.spark.sql.catalyst.plans.QueryPlan<?> plan)  { throw new RuntimeException(); }
  public  void removeTags (org.apache.spark.sql.catalyst.plans.QueryPlan<?> plan)  { throw new RuntimeException(); }
}
