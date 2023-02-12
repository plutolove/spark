package org.apache.spark.sql.execution.adaptive;
/**
 * A rule to coalesce the shuffle partitions based on the map output statistics, which can
 * avoid many small reduce tasks that hurt performance.
 */
public  class CoalesceShufflePartitions extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.execution.SparkPlan> implements scala.Product, scala.Serializable {
  // not preceding
  static public  java.lang.String COALESCED_SHUFFLE_READER_DESCRIPTION ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.SparkSession session ()  { throw new RuntimeException(); }
  // not preceding
  public   CoalesceShufflePartitions (org.apache.spark.sql.SparkSession session)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.SparkPlan apply (org.apache.spark.sql.execution.SparkPlan plan)  { throw new RuntimeException(); }
}
