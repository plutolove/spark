package org.apache.spark.sql.catalyst.rules;
/**
 * An execution strategy for rules that indicates the maximum number of executions. If the
 * execution reaches fix point (i.e. converge) before maxIterations, it will stop.
 */
public abstract class RuleExecutor<TreeType extends org.apache.spark.sql.catalyst.trees.TreeNode<?>> implements org.apache.spark.internal.Logging {
  // not preceding
  // not preceding
  public  class Once$ extends org.apache.spark.sql.catalyst.rules.RuleExecutor<TreeType>.Strategy implements scala.Product, scala.Serializable {
    public   Once$ ()  { throw new RuntimeException(); }
    // not preceding
    public  int maxIterations ()  { throw new RuntimeException(); }
  }
  // not preceding
  public  class FixedPoint extends org.apache.spark.sql.catalyst.rules.RuleExecutor<TreeType>.Strategy implements scala.Product, scala.Serializable {
    // not preceding
    public  int maxIterations ()  { throw new RuntimeException(); }
    public  boolean errorOnExceed ()  { throw new RuntimeException(); }
    public  java.lang.String maxIterationsSetting ()  { throw new RuntimeException(); }
    // not preceding
    public   FixedPoint (int maxIterations, boolean errorOnExceed, java.lang.String maxIterationsSetting)  { throw new RuntimeException(); }
  }
  // not preceding
  public  class FixedPoint$ extends scala.runtime.AbstractFunction3<java.lang.Object, java.lang.Object, java.lang.String, org.apache.spark.sql.catalyst.rules.RuleExecutor<TreeType>.FixedPoint> implements scala.Serializable {
    public   FixedPoint$ ()  { throw new RuntimeException(); }
  }
  // not preceding
  protected  class Batch implements scala.Product, scala.Serializable {
    // not preceding
    public  java.lang.String name ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.rules.RuleExecutor<TreeType>.Strategy strategy ()  { throw new RuntimeException(); }
    public  scala.collection.Seq<org.apache.spark.sql.catalyst.rules.Rule<TreeType>> rules ()  { throw new RuntimeException(); }
    // not preceding
    public   Batch (java.lang.String name, org.apache.spark.sql.catalyst.rules.RuleExecutor<TreeType>.Strategy strategy, scala.collection.Seq<org.apache.spark.sql.catalyst.rules.Rule<TreeType>> rules)  { throw new RuntimeException(); }
  }
  // not preceding
  protected  class Batch$ extends scala.runtime.AbstractFunction3<java.lang.String, org.apache.spark.sql.catalyst.rules.RuleExecutor<TreeType>.Strategy, scala.collection.Seq<org.apache.spark.sql.catalyst.rules.Rule<TreeType>>, org.apache.spark.sql.catalyst.rules.RuleExecutor<TreeType>.Batch> implements scala.Serializable {
    public   Batch$ ()  { throw new RuntimeException(); }
  }
  // not preceding
  public abstract class Strategy {
    // not preceding
    public   Strategy ()  { throw new RuntimeException(); }
    /** Whether to throw exception when exceeding the maximum number. */
    public  boolean errorOnExceed ()  { throw new RuntimeException(); }
    // not preceding
    public abstract  int maxIterations ()  ;
    /** The key of SQLConf setting to tune maxIterations */
    public  java.lang.String maxIterationsSetting ()  { throw new RuntimeException(); }
  }
  // not preceding
  static protected  org.apache.spark.sql.catalyst.rules.QueryExecutionMetering queryExecutionMeter ()  { throw new RuntimeException(); }
  /** Dump statistics about time spent running specific rules. */
  static public  java.lang.String dumpTimeSpent ()  { throw new RuntimeException(); }
  /** Resets statistics about time spent running specific rules */
  static public  void resetMetrics ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.catalyst.rules.QueryExecutionMetrics getCurrentMetrics ()  { throw new RuntimeException(); }
  /**
   * Accessor for nested Scala object
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.rules.RuleExecutor<TreeType>.Once$ Once ()  { throw new RuntimeException(); }
  // not preceding
  public   RuleExecutor ()  { throw new RuntimeException(); }
  // not preceding
  protected abstract  scala.collection.Seq<org.apache.spark.sql.catalyst.rules.RuleExecutor<TreeType>.Batch> batches ()  ;
  /** Once batches that are blacklisted in the idempotence checker */
  protected  scala.collection.immutable.Set<java.lang.String> blacklistedOnceBatches ()  { throw new RuntimeException(); }
  /**
   * Defines a check function that checks for structural integrity of the plan after the execution
   * of each rule. For example, we can check whether a plan is still resolved after each rule in
   * <code>Optimizer</code>, so we can catch rules that return invalid plans. The check function returns
   * <code>false</code> if the given plan doesn't pass the structural integrity check.
   * @param plan (undocumented)
   * @return (undocumented)
   */
  protected  boolean isPlanIntegral (TreeType plan)  { throw new RuntimeException(); }
  /**
   * Executes the batches of rules defined by the subclass, and also tracks timing info for each
   * rule using the provided tracker.
   * @see execute
   * @param plan (undocumented)
   * @param tracker (undocumented)
   * @return (undocumented)
   */
  public  TreeType executeAndTrack (TreeType plan, org.apache.spark.sql.catalyst.QueryPlanningTracker tracker)  { throw new RuntimeException(); }
  /**
   * Executes the batches of rules defined by the subclass. The batches are executed serially
   * using the defined execution strategy. Within each batch, rules are also executed serially.
   * @param plan (undocumented)
   * @return (undocumented)
   */
  public  TreeType execute (TreeType plan)  { throw new RuntimeException(); }
}
