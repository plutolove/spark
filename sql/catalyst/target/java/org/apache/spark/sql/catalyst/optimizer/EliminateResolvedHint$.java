package org.apache.spark.sql.catalyst.optimizer;
/**
 * Combine a list of {@link HintInfo}s into one {@link HintInfo}.
 */
// not preceding
public  class EliminateResolvedHint$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final EliminateResolvedHint$ MODULE$ = null;
  public   EliminateResolvedHint$ ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  /**
   * Extract all hints from the plan, returning a list of extracted hints and the transformed plan
   * with {@link ResolvedHint} nodes removed. The returned hint list comes in top-down order.
   * Note that hints can only be extracted from under certain nodes. Those that cannot be extracted
   * in this method will be cleaned up later by this rule, and may emit warnings depending on the
   * configurations.
   * @param plan (undocumented)
   * @return (undocumented)
   */
    scala.Tuple2<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan, scala.collection.Seq<org.apache.spark.sql.catalyst.plans.logical.HintInfo>> extractHintsFromPlan (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
}
