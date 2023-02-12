package org.apache.spark.sql.execution.adaptive;
/**
 * A partition is considered as a skewed partition if its size is larger than the median
 * partition size * SKEW_JOIN_SKEWED_PARTITION_FACTOR and also larger than
 * SKEW_JOIN_SKEWED_PARTITION_THRESHOLD.
 */
public  class OptimizeSkewedJoin extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.execution.SparkPlan> implements scala.Product, scala.Serializable {
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.internal.SQLConf conf ()  { throw new RuntimeException(); }
  // not preceding
  public   OptimizeSkewedJoin (org.apache.spark.sql.internal.SQLConf conf)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.SparkPlan optimizeSkewJoin (org.apache.spark.sql.execution.SparkPlan plan)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.SparkPlan apply (org.apache.spark.sql.execution.SparkPlan plan)  { throw new RuntimeException(); }
}
