package org.apache.spark.sql.execution.joins;
/**
 * The join key for the rows buffered in <code>bufferedMatches</code>, or null if <code>bufferedMatches</code> is empty
 */
  class SortMergeJoinScanner {
  // not preceding
  public   SortMergeJoinScanner (org.apache.spark.sql.catalyst.expressions.Projection streamedKeyGenerator, org.apache.spark.sql.catalyst.expressions.Projection bufferedKeyGenerator, scala.math.Ordering<org.apache.spark.sql.catalyst.InternalRow> keyOrdering, org.apache.spark.sql.execution.RowIterator streamedIter, org.apache.spark.sql.execution.RowIterator bufferedIter, int inMemoryThreshold, int spillThreshold, scala.Function0<scala.runtime.BoxedUnit> eagerCleanupResources)  { throw new RuntimeException(); }
  /**
   * Advances both input iterators, stopping when we have found rows with matching join keys. If no
   * join rows found, try to do the eager resources cleanup.
   * @return true if matching rows have been found and false otherwise. If this returns true, then
   *         {@link getStreamedRow} and {@link getBufferedMatches} can be called to construct the join
   *         results.
   */
  public final  boolean findNextInnerJoinRows ()  { throw new RuntimeException(); }
  /**
   * Advances the streamed input iterator and buffers all rows from the buffered input that
   * have matching keys. If no join rows found, try to do the eager resources cleanup.
   * @return true if the streamed iterator returned a row, false otherwise. If this returns true,
   *         then {@link getStreamedRow} and {@link getBufferedMatches} can be called to produce the outer
   *         join results.
   */
  public final  boolean findNextOuterJoinRows ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.ExternalAppendOnlyUnsafeRowArray getBufferedMatches ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.InternalRow getStreamedRow ()  { throw new RuntimeException(); }
}
