package org.apache.spark.sql.execution.adaptive;
/**
 * Return type for <code>createQueryStages</code>
 * param:  newPlan the new plan with created query stages.
 * param:  allChildStagesMaterialized whether all child stages have been materialized.
 * param:  newStages the newly created query stages, including new reused query stages.
 */
public  class AdaptiveSparkPlanExec extends org.apache.spark.sql.execution.SparkPlan implements org.apache.spark.sql.execution.LeafExecNode, scala.Product, scala.Serializable {
  // not preceding
  static   scala.concurrent.ExecutionContextExecutorService executionContext ()  { throw new RuntimeException(); }
  /**
   * The temporary {@link LogicalPlan} link for query stages.
   * <p>
   * Physical nodes wrapped in a {@link LogicalQueryStage} can be shared among different physical plans
   * and thus their usual logical links can be overwritten during query planning, leading to
   * situations where those nodes point to a new logical plan and the rest point to the current
   * logical plan. In this case we use temp logical links to make sure we can always trace back to
   * the original logical links until a new physical plan is adopted, by which time we can clear up
   * the temp logical links.
   * @return (undocumented)
   */
  static public  org.apache.spark.sql.catalyst.trees.TreeNodeTag<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> TEMP_LOGICAL_PLAN_TAG ()  { throw new RuntimeException(); }
  /**
   * Apply a list of physical operator rules on a {@link SparkPlan}.
   * @param plan (undocumented)
   * @param rules (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.sql.execution.SparkPlan applyPhysicalRules (org.apache.spark.sql.execution.SparkPlan plan, scala.collection.Seq<org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.execution.SparkPlan>> rules)  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.execution.SparkPlan initialPlan ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.adaptive.AdaptiveExecutionContext context ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.execution.SparkPlan>> preprocessingRules ()  { throw new RuntimeException(); }
  public  boolean isSubquery ()  { throw new RuntimeException(); }
  // not preceding
  public   AdaptiveSparkPlanExec (org.apache.spark.sql.execution.SparkPlan initialPlan, org.apache.spark.sql.execution.adaptive.AdaptiveExecutionContext context, scala.collection.Seq<org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.execution.SparkPlan>> preprocessingRules, boolean isSubquery)  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.execution.SparkPlan executedPlan ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.internal.SQLConf conf ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.SparkPlan doCanonicalize ()  { throw new RuntimeException(); }
  public  void resetMetrics ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.InternalRow[] executeCollect ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.InternalRow[] executeTake (int n)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.InternalRow[] executeTail (int n)  { throw new RuntimeException(); }
  public  org.apache.spark.rdd.RDD<org.apache.spark.sql.catalyst.InternalRow> doExecute ()  { throw new RuntimeException(); }
  protected  scala.collection.Iterator<java.lang.Object> stringArgs ()  { throw new RuntimeException(); }
  public  void generateTreeString (int depth, scala.collection.Seq<java.lang.Object> lastChildren, scala.Function1<java.lang.String, scala.runtime.BoxedUnit> append, boolean verbose, java.lang.String prefix, boolean addSuffix, int maxFields, boolean printNodeId)  { throw new RuntimeException(); }
  public  int hashCode ()  { throw new RuntimeException(); }
  public  boolean equals (Object obj)  { throw new RuntimeException(); }
}
