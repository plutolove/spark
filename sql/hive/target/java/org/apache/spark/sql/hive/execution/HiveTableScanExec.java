package org.apache.spark.sql.hive.execution;
/**
 * Prunes partitions not involve the query plan.
 * <p>
 * param:  partitions All partitions of the relation.
 * @return Partitions that are involved in the query plan.
 */
  class HiveTableScanExec extends org.apache.spark.sql.execution.SparkPlan implements org.apache.spark.sql.execution.LeafExecNode, org.apache.spark.sql.catalyst.analysis.CastSupport, scala.Product, scala.Serializable {
  // not preceding
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> requestedAttributes ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.catalog.HiveTableRelation relation ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> partitionPruningPred ()  { throw new RuntimeException(); }
  // not preceding
  public   HiveTableScanExec (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> requestedAttributes, org.apache.spark.sql.catalyst.catalog.HiveTableRelation relation, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> partitionPruningPred, org.apache.spark.sql.SparkSession sparkSession)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.internal.SQLConf conf ()  { throw new RuntimeException(); }
  public  java.lang.String nodeName ()  { throw new RuntimeException(); }
  // not preceding
  public  scala.collection.immutable.Map<java.lang.String, org.apache.spark.sql.execution.metric.SQLMetric> metrics ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.AttributeSet producedAttributes ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output ()  { throw new RuntimeException(); }
  /**
   * Prunes partitions not involve the query plan.
   * <p>
   * @param partitions All partitions of the relation.
   * @return Partitions that are involved in the query plan.
   */
    scala.collection.Seq<org.apache.hadoop.hive.ql.metadata.Partition> prunePartitions (scala.collection.Seq<org.apache.hadoop.hive.ql.metadata.Partition> partitions)  { throw new RuntimeException(); }
  // not preceding
  public  scala.collection.Seq<org.apache.hadoop.hive.ql.metadata.Partition> rawPartitions ()  { throw new RuntimeException(); }
  protected  org.apache.spark.rdd.RDD<org.apache.spark.sql.catalyst.InternalRow> doExecute ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.hive.execution.HiveTableScanExec doCanonicalize ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.Object> otherCopyArgs ()  { throw new RuntimeException(); }
}
