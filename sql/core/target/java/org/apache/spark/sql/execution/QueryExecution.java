package org.apache.spark.sql.execution;
/**
 * Internal version of the RDD. Avoids copies and has no schema.
 * Note for callers: Spark may apply various optimization including reusing object: this means
 * the row is valid only for the iteration it is retrieved. You should avoid storing row and
 * accessing after iteration. (Calling <code>collect()</code> is one of known bad usage.)
 * If you want to store these rows into collection, please apply some converter or copy row
 * which produces new object per iteration.
 * Given QueryExecution is not a public class, end users are discouraged to use this: please
 * use <code>Dataset.rdd</code> instead where conversion will be applied.
 */
public  class QueryExecution {
  /**
   * Prints to stdout all the generated code found in this plan (i.e. the output of each
   * WholeStageCodegen subtree).
   */
  // not preceding
  public  class debug$ {
    public   debug$ ()  { throw new RuntimeException(); }
    // not preceding
    public  void codegen ()  { throw new RuntimeException(); }
    /**
     * Get WholeStageCodegenExec subtrees and the codegen in a query plan
     * <p>
     * @return Sequence of WholeStageCodegen subtrees and corresponding codegen
     */
    public  scala.collection.Seq<scala.Tuple3<java.lang.String, java.lang.String, org.apache.spark.sql.catalyst.expressions.codegen.ByteCodeStats>> codegenToSeq ()  { throw new RuntimeException(); }
    /**
     * Dumps debug information about query execution into the specified file.
     * <p>
     * @param maxFields maximum number of fields converted to string representation.
     * @param path (undocumented)
     */
    public  void toFile (java.lang.String path, int maxFields)  { throw new RuntimeException(); }
  }
  /**
   * Prepares a planned {@link SparkPlan} for execution by inserting shuffle operations and internal
   * row format conversions as needed.
   * @param preparations (undocumented)
   * @param plan (undocumented)
   * @return (undocumented)
   */
  static   org.apache.spark.sql.execution.SparkPlan prepareForExecution (scala.collection.Seq<org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.execution.SparkPlan>> preparations, org.apache.spark.sql.execution.SparkPlan plan)  { throw new RuntimeException(); }
  /**
   * Transform a {@link LogicalPlan} into a {@link SparkPlan}.
   * <p>
   * Note that the returned physical plan still needs to be prepared for execution.
   * @param sparkSession (undocumented)
   * @param planner (undocumented)
   * @param plan (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.sql.execution.SparkPlan createSparkPlan (org.apache.spark.sql.SparkSession sparkSession, org.apache.spark.sql.execution.SparkPlanner planner, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  /**
   * Prepare the {@link SparkPlan} for execution.
   * @param spark (undocumented)
   * @param plan (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.sql.execution.SparkPlan prepareExecutedPlan (org.apache.spark.sql.SparkSession spark, org.apache.spark.sql.execution.SparkPlan plan)  { throw new RuntimeException(); }
  /**
   * Transform the subquery's {@link LogicalPlan} into a {@link SparkPlan} and prepare the resulting
   * {@link SparkPlan} for execution.
   * @param spark (undocumented)
   * @param plan (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.sql.execution.SparkPlan prepareExecutedPlan (org.apache.spark.sql.SparkSession spark, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  /**
   * Accessor for nested Scala object
   * @return (undocumented)
   */
  public  org.apache.spark.sql.execution.QueryExecution.debug$ debug ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.SparkSession sparkSession ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan logical ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.QueryPlanningTracker tracker ()  { throw new RuntimeException(); }
  // not preceding
  public   QueryExecution (org.apache.spark.sql.SparkSession sparkSession, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan logical, org.apache.spark.sql.catalyst.QueryPlanningTracker tracker)  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.execution.SparkPlanner planner ()  { throw new RuntimeException(); }
  public  void assertAnalyzed ()  { throw new RuntimeException(); }
  public  void assertSupported ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan analyzed ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan withCachedData ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan optimizedPlan ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.execution.SparkPlan sparkPlan ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.execution.SparkPlan executedPlan ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.rdd.RDD<org.apache.spark.sql.catalyst.InternalRow> toRdd ()  { throw new RuntimeException(); }
  /** Get the metrics observed during the execution of the query plan. */
  public  scala.collection.immutable.Map<java.lang.String, org.apache.spark.sql.Row> observedMetrics ()  { throw new RuntimeException(); }
  protected  scala.collection.Seq<org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.execution.SparkPlan>> preparations ()  { throw new RuntimeException(); }
  protected <T extends java.lang.Object> T executePhase (java.lang.String phase, scala.Function0<T> block)  { throw new RuntimeException(); }
  public  java.lang.String simpleString ()  { throw new RuntimeException(); }
  public  java.lang.String simpleString (boolean formatted)  { throw new RuntimeException(); }
  public  java.lang.String explainString (org.apache.spark.sql.execution.ExplainMode mode)  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  java.lang.String stringWithStats ()  { throw new RuntimeException(); }
}
