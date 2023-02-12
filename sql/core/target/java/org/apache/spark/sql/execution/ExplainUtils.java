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
public  class ExplainUtils {
  /**
   * Given a input physical plan, performs the following tasks.
   *   1. Generates the explain output for the input plan excluding the subquery plans.
   *   2. Generates the explain output for each subquery referenced in the plan.
   * @param plan (undocumented)
   * @param append (undocumented)
   */
  static public <T extends org.apache.spark.sql.catalyst.plans.QueryPlan<T>> void processPlan (scala.Function0<org.apache.spark.sql.catalyst.plans.QueryPlan<T>> plan, scala.Function1<java.lang.String, scala.runtime.BoxedUnit> append)  { throw new RuntimeException(); }
  /**
   * Generate detailed field string with different format based on type of input value
   * @param fieldName (undocumented)
   * @param values (undocumented)
   * @return (undocumented)
   */
  static public  java.lang.String generateFieldString (java.lang.String fieldName, Object values)  { throw new RuntimeException(); }
  /**
   * Returns the operator identifier for the supplied plan by retrieving the
   * <code>operationId</code> tag value.
   * @param plan (undocumented)
   * @return (undocumented)
   */
  static public  java.lang.String getOpId (org.apache.spark.sql.catalyst.plans.QueryPlan<?> plan)  { throw new RuntimeException(); }
  static public  void removeTags (org.apache.spark.sql.catalyst.plans.QueryPlan<?> plan)  { throw new RuntimeException(); }
  static public  scala.Option<org.apache.spark.sql.execution.SparkPlan> find (org.apache.spark.sql.execution.SparkPlan p, scala.Function1<org.apache.spark.sql.execution.SparkPlan, java.lang.Object> f)  { throw new RuntimeException(); }
  static public  void foreach (org.apache.spark.sql.execution.SparkPlan p, scala.Function1<org.apache.spark.sql.execution.SparkPlan, scala.runtime.BoxedUnit> f)  { throw new RuntimeException(); }
  static public  void foreachUp (org.apache.spark.sql.execution.SparkPlan p, scala.Function1<org.apache.spark.sql.execution.SparkPlan, scala.runtime.BoxedUnit> f)  { throw new RuntimeException(); }
  static public <A extends java.lang.Object> scala.collection.Seq<A> mapPlans (org.apache.spark.sql.execution.SparkPlan p, scala.Function1<org.apache.spark.sql.execution.SparkPlan, A> f)  { throw new RuntimeException(); }
  static public <A extends java.lang.Object> scala.collection.Seq<A> flatMap (org.apache.spark.sql.execution.SparkPlan p, scala.Function1<org.apache.spark.sql.execution.SparkPlan, scala.collection.TraversableOnce<A>> f)  { throw new RuntimeException(); }
  static public <B extends java.lang.Object> scala.collection.Seq<B> collect (org.apache.spark.sql.execution.SparkPlan p, scala.PartialFunction<org.apache.spark.sql.execution.SparkPlan, B> pf)  { throw new RuntimeException(); }
  static public  scala.collection.Seq<org.apache.spark.sql.execution.SparkPlan> collectLeaves (org.apache.spark.sql.execution.SparkPlan p)  { throw new RuntimeException(); }
  static public <B extends java.lang.Object> scala.Option<B> collectFirst (org.apache.spark.sql.execution.SparkPlan p, scala.PartialFunction<org.apache.spark.sql.execution.SparkPlan, B> pf)  { throw new RuntimeException(); }
  static public <B extends java.lang.Object> scala.collection.Seq<B> collectWithSubqueries (org.apache.spark.sql.execution.SparkPlan p, scala.PartialFunction<org.apache.spark.sql.execution.SparkPlan, B> f)  { throw new RuntimeException(); }
  static public  scala.collection.Seq<org.apache.spark.sql.execution.SparkPlan> subqueriesAll (org.apache.spark.sql.execution.SparkPlan p)  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.execution.SparkPlan stripAQEPlan (org.apache.spark.sql.execution.SparkPlan p)  { throw new RuntimeException(); }
  static public <T extends java.lang.Object> org.apache.spark.sql.SparkSession getOrCloneSessionWithAqeOff (org.apache.spark.sql.SparkSession session)  { throw new RuntimeException(); }
}
