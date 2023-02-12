package org.apache.spark.sql.execution.streaming;
/**
 * Internal helper class to consume input rows, generate join output rows using other sides
 * buffered state rows, and finally clean up this sides buffered state rows
 * <p>
 * param:  joinSide The JoinSide - either left or right.
 * param:  inputAttributes The input attributes for this side of the join.
 * param:  joinKeys The join keys.
 * param:  inputIter The iterator of input rows on this side to be joined.
 * param:  preJoinFilterExpr A filter over rows on this side. This filter rejects rows that could
 *                          never pass the overall join condition no matter what other side row
 *                          they're joined with.
 * param:  postJoinFilter A filter over joined rows. This filter completes the application of
 *                       the overall join condition, assuming that preJoinFilter on both sides
 *                       of the join has already been passed.
 *                       Passed as a function rather than expression to avoid creating the
 *                       predicate twice; we also need this filter later on in the parent exec.
 * param:  stateWatermarkPredicate The state watermark predicate. See
 *                                {@link StreamingSymmetricHashJoinExec} for further description of
 *                                state watermarks.
 * param:  partitionId A partition ID of source RDD.
 */
public  class StreamingSymmetricHashJoinExec extends org.apache.spark.sql.execution.SparkPlan implements org.apache.spark.sql.execution.BinaryExecNode, org.apache.spark.sql.execution.streaming.StateStoreWriter, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3, T4 v4, T5 v5, T6 v6, T7 v7, T8 v8, T9 v9, T10 v10)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  // not preceding
  public  scala.collection.immutable.Map<java.lang.String, org.apache.spark.sql.execution.metric.SQLMetric> metrics ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> leftKeys ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> rightKeys ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.JoinType joinType ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.streaming.StreamingSymmetricHashJoinHelper.JoinConditionSplitPredicates condition ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.sql.execution.streaming.StatefulOperatorStateInfo> stateInfo ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Object> eventTimeWatermark ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.streaming.StreamingSymmetricHashJoinHelper.JoinStateWatermarkPredicates stateWatermarkPredicates ()  { throw new RuntimeException(); }
  public  int stateFormatVersion ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.SparkPlan left ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.SparkPlan right ()  { throw new RuntimeException(); }
  // not preceding
  public   StreamingSymmetricHashJoinExec (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> leftKeys, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> rightKeys, org.apache.spark.sql.catalyst.plans.JoinType joinType, org.apache.spark.sql.execution.streaming.StreamingSymmetricHashJoinHelper.JoinConditionSplitPredicates condition, scala.Option<org.apache.spark.sql.execution.streaming.StatefulOperatorStateInfo> stateInfo, scala.Option<java.lang.Object> eventTimeWatermark, org.apache.spark.sql.execution.streaming.StreamingSymmetricHashJoinHelper.JoinStateWatermarkPredicates stateWatermarkPredicates, int stateFormatVersion, org.apache.spark.sql.execution.SparkPlan left, org.apache.spark.sql.execution.SparkPlan right)  { throw new RuntimeException(); }
  // not preceding
  public   StreamingSymmetricHashJoinExec (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> leftKeys, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> rightKeys, org.apache.spark.sql.catalyst.plans.JoinType joinType, scala.Option<org.apache.spark.sql.catalyst.expressions.Expression> condition, int stateFormatVersion, org.apache.spark.sql.execution.SparkPlan left, org.apache.spark.sql.execution.SparkPlan right)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.GenericInternalRow nullLeft ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.GenericInternalRow nullRight ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.plans.physical.Distribution> requiredChildDistribution ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.physical.Partitioning outputPartitioning ()  { throw new RuntimeException(); }
  public  boolean shouldRunAnotherBatch (org.apache.spark.sql.execution.streaming.OffsetSeqMetadata newMetadata)  { throw new RuntimeException(); }
  protected  org.apache.spark.rdd.RDD<org.apache.spark.sql.catalyst.InternalRow> doExecute ()  { throw new RuntimeException(); }
}
