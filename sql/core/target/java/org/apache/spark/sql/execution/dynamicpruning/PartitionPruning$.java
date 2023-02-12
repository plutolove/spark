package org.apache.spark.sql.execution.dynamicpruning;
/**
 * Search the partitioned table scan for a given partition column in a logical plan
 */
// not preceding
public  class PartitionPruning$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> implements org.apache.spark.sql.catalyst.expressions.PredicateHelper {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final PartitionPruning$ MODULE$ = null;
  public   PartitionPruning$ ()  { throw new RuntimeException(); }
  // not preceding
  public  scala.Option<org.apache.spark.sql.execution.datasources.LogicalRelation> getPartitionTableScan (org.apache.spark.sql.catalyst.expressions.Expression a, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
}
