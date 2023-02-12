package org.apache.spark.sql.execution.dynamicpruning;
/**
 * Identify the shape in which keys of a given plan are broadcasted.
 */
public  class PlanDynamicPruningFilters extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.execution.SparkPlan> implements org.apache.spark.sql.catalyst.expressions.PredicateHelper, scala.Product, scala.Serializable {
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.SparkSession sparkSession ()  { throw new RuntimeException(); }
  // not preceding
  public   PlanDynamicPruningFilters (org.apache.spark.sql.SparkSession sparkSession)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.SparkPlan apply (org.apache.spark.sql.execution.SparkPlan plan)  { throw new RuntimeException(); }
}
