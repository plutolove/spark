package org.apache.spark.sql;
/**
 * Allows extra strategies to be injected into the query planner at runtime.  Note this API
 * should be considered experimental and is not intended to be stable across releases.
 * <p>
 * @since 1.3.0
 */
public  class ExperimentalMethods {
  // not preceding
     ExperimentalMethods ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.ExperimentalMethods clone ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan>> extraOptimizations ()  { throw new RuntimeException(); }
  // not preceding
  public  scala.collection.Seq<org.apache.spark.sql.execution.SparkStrategy> extraStrategies ()  { throw new RuntimeException(); }
}
