package org.apache.spark.sql.execution.python;
/**
 * Add a row to the end of it, returns true iff the row has been added to the queue.
 */
public  interface RowQueue {
  // not preceding
  public  boolean add (org.apache.spark.sql.catalyst.expressions.UnsafeRow row)  ;
  /**
   * Cleanup all the resources.
   */
  public  void close ()  ;
  /**
   * Retrieve and remove the first row, returns null if it's empty.
   * <p>
   * It can only be called after add is called, otherwise it will fail (NPE).
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.expressions.UnsafeRow remove ()  ;
}
