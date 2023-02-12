package org.apache.spark.sql.execution;
/**
 * Advance this iterator by a single row. Returns <code>false</code> if this iterator has no more rows
 * and <code>true</code> otherwise. If this returns <code>true</code>, then the new row can be retrieved by calling
 * {@link getRow}.
 */
public abstract class RowIterator {
  // not preceding
  static public  org.apache.spark.sql.execution.RowIterator fromScala (scala.collection.Iterator<org.apache.spark.sql.catalyst.InternalRow> scalaIter)  { throw new RuntimeException(); }
  // not preceding
  public   RowIterator ()  { throw new RuntimeException(); }
  // not preceding
  public abstract  boolean advanceNext ()  ;
  /**
   * Retrieve the row from this iterator. This method is idempotent. It is illegal to call this
   * method after {@link advanceNext()} has returned <code>false</code>.
   * @return (undocumented)
   */
  public abstract  org.apache.spark.sql.catalyst.InternalRow getRow ()  ;
  /**
   * Convert this RowIterator into a {@link scala.collection.Iterator}.
   * @return (undocumented)
   */
  public  scala.collection.Iterator<org.apache.spark.sql.catalyst.InternalRow> toScala ()  { throw new RuntimeException(); }
}
