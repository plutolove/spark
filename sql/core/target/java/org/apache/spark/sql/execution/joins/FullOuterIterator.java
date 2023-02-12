package org.apache.spark.sql.execution.joins;
/**
 * Scan the left and right buffers for the next valid match.
 * <p>
 * Note: this method mutates <code>joinedRow</code> to point to the latest matching rows in the buffers.
 * If a left row has no valid matches on the right, or a right row has no valid matches on the
 * left, then the row is joined with the null row and the result is considered a valid match.
 * <p>
 * @return true if a valid match is found, false otherwise.
 */
public  class FullOuterIterator extends org.apache.spark.sql.execution.RowIterator {
  // not preceding
  public   FullOuterIterator (org.apache.spark.sql.execution.joins.SortMergeFullOuterJoinScanner smjScanner, scala.Function1<org.apache.spark.sql.catalyst.InternalRow, org.apache.spark.sql.catalyst.InternalRow> resultProj, org.apache.spark.sql.execution.metric.SQLMetric numRows)  { throw new RuntimeException(); }
  // not preceding
  public  boolean advanceNext ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.InternalRow getRow ()  { throw new RuntimeException(); }
}
