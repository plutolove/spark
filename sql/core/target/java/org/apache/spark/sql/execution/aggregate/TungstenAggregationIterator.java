package org.apache.spark.sql.execution.aggregate;
/**
 * Switch to sort-based aggregation when the hash-based approach is unable to acquire memory.
 */
public  class TungstenAggregationIterator extends org.apache.spark.sql.execution.aggregate.AggregationIterator implements org.apache.spark.internal.Logging {
  // not preceding
  public   TungstenAggregationIterator (int partIndex, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> groupingExpressions, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.aggregate.AggregateExpression> aggregateExpressions, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> aggregateAttributes, int initialInputBufferOffset, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> resultExpressions, scala.Function2<scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression>, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute>, org.apache.spark.sql.catalyst.expressions.MutableProjection> newMutableProjection, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> originalInputAttributes, scala.collection.Iterator<org.apache.spark.sql.catalyst.InternalRow> inputIter, scala.Option<scala.Tuple2<java.lang.Object, java.lang.Object>> testFallbackStartsAt, org.apache.spark.sql.execution.metric.SQLMetric numOutputRows, org.apache.spark.sql.execution.metric.SQLMetric peakMemory, org.apache.spark.sql.execution.metric.SQLMetric spillSize, org.apache.spark.sql.execution.metric.SQLMetric avgHashProbe)  { throw new RuntimeException(); }
  protected  scala.Function2<org.apache.spark.sql.catalyst.expressions.UnsafeRow, org.apache.spark.sql.catalyst.InternalRow, org.apache.spark.sql.catalyst.expressions.UnsafeRow> generateResultProjection ()  { throw new RuntimeException(); }
  public final  boolean hasNext ()  { throw new RuntimeException(); }
  public final  org.apache.spark.sql.catalyst.expressions.UnsafeRow next ()  { throw new RuntimeException(); }
  /**
   * Generate an output row when there is no input and there is no grouping expression.
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.expressions.UnsafeRow outputForEmptyGroupingKeyWithoutInput ()  { throw new RuntimeException(); }
}
