package org.apache.spark.sql.execution.joins;
/**
 * Advance to the next row on the stream side and populate the buffer with matches.
 * @return whether there are more rows in the stream to consume.
 */
public abstract class OneSideOuterIterator extends org.apache.spark.sql.execution.RowIterator {
  // not preceding
  public   OneSideOuterIterator (org.apache.spark.sql.execution.joins.SortMergeJoinScanner smjScanner, org.apache.spark.sql.catalyst.InternalRow bufferedSideNullRow, scala.Function1<org.apache.spark.sql.catalyst.InternalRow, java.lang.Object> boundCondition, scala.Function1<org.apache.spark.sql.catalyst.InternalRow, org.apache.spark.sql.catalyst.InternalRow> resultProj, org.apache.spark.sql.execution.metric.SQLMetric numOutputRows)  { throw new RuntimeException(); }
  public  boolean advanceNext ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.InternalRow getRow ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.catalyst.expressions.JoinedRow joinedRow ()  { throw new RuntimeException(); }
  protected abstract  void setBufferedSideOutput (org.apache.spark.sql.catalyst.InternalRow row)  ;
  protected abstract  void setStreamSideOutput (org.apache.spark.sql.catalyst.InternalRow row)  ;
}
