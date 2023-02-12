package org.apache.spark.sql.execution;
/**
 * Remove redundant SortExec node from the spark plan. A sort node is redundant when
 * its child satisfies both its sort orders and its required child distribution. Note
 * this rule differs from the Optimizer rule EliminateSorts in that this rule also checks
 * if the child satisfies the required distribution so that it is safe to remove not only a
 * local sort but also a global sort when its child already satisfies required sort orders.
 */
public  class RemoveRedundantSorts extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.execution.SparkPlan> implements scala.Product, scala.Serializable {
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.internal.SQLConf conf ()  { throw new RuntimeException(); }
  // not preceding
  public   RemoveRedundantSorts (org.apache.spark.sql.internal.SQLConf conf)  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.execution.SparkPlan apply (org.apache.spark.sql.execution.SparkPlan plan)  { throw new RuntimeException(); }
}
