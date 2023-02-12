package org.apache.spark.sql.execution.exchange;
/**
 * When the physical operators are created for JOIN, the ordering of join keys is based on order
 * in which the join keys appear in the user query. That might not match with the output
 * partitioning of the join node's children (thus leading to extra sort / shuffle being
 * introduced). This rule will change the ordering of the join keys to match with the
 * partitioning of the join nodes' children.
 */
public  class EnsureRequirements extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.execution.SparkPlan> implements scala.Product, scala.Serializable {
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.internal.SQLConf conf ()  { throw new RuntimeException(); }
  // not preceding
  public   EnsureRequirements (org.apache.spark.sql.internal.SQLConf conf)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.SparkPlan apply (org.apache.spark.sql.execution.SparkPlan plan)  { throw new RuntimeException(); }
}
