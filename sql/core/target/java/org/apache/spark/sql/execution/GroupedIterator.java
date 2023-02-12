package org.apache.spark.sql.execution;
/** Compares two input rows and returns 0 if they are in the same group. */
public  class GroupedIterator implements scala.collection.Iterator<scala.Tuple2<org.apache.spark.sql.catalyst.InternalRow, scala.collection.Iterator<org.apache.spark.sql.catalyst.InternalRow>>> {
  // not preceding
  static public  scala.collection.Iterator<scala.Tuple2<org.apache.spark.sql.catalyst.InternalRow, scala.collection.Iterator<org.apache.spark.sql.catalyst.InternalRow>>> apply (scala.collection.Iterator<org.apache.spark.sql.catalyst.InternalRow> input, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> keyExpressions, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> inputSchema)  { throw new RuntimeException(); }
  // not preceding
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.SortOrder> sortOrder ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.BaseOrdering keyOrdering ()  { throw new RuntimeException(); }
  /** Creates a row containing only the key for a given input row. */
  public  org.apache.spark.sql.catalyst.expressions.UnsafeProjection keyProjection ()  { throw new RuntimeException(); }
  /**
   * Holds null or the row that will be returned on next call to <code>next()</code> in the inner iterator.
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.InternalRow currentRow ()  { throw new RuntimeException(); }
  /** Holds a copy of an input row that is in the current group. */
  public  org.apache.spark.sql.catalyst.InternalRow currentGroup ()  { throw new RuntimeException(); }
  public  scala.collection.Iterator<org.apache.spark.sql.catalyst.InternalRow> currentIterator ()  { throw new RuntimeException(); }
  /**
   * Return true if we already have the next iterator or fetching a new iterator is successful.
   * <p>
   * Note that, if we get the iterator by <code>next</code>, we should consume it before call <code>hasNext</code>,
   * because we will consume the input data to skip to next group while fetching a new iterator,
   * thus make the previous iterator empty.
   * @return (undocumented)
   */
  public  boolean hasNext ()  { throw new RuntimeException(); }
  public  scala.Tuple2<org.apache.spark.sql.catalyst.InternalRow, scala.collection.Iterator<org.apache.spark.sql.catalyst.InternalRow>> next ()  { throw new RuntimeException(); }
}
