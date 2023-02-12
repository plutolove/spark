package org.apache.spark.sql.catalyst.analysis;
/**
 * Replaces ordinal in 'order by' or 'group by' with UnresolvedOrdinal expression.
 */
public  class SubstituteUnresolvedOrdinals extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
  // not preceding
  public   SubstituteUnresolvedOrdinals (org.apache.spark.sql.internal.SQLConf conf)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
}
