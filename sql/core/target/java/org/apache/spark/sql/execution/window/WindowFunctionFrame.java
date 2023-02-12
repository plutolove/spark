package org.apache.spark.sql.execution.window;
/**
 * Prepare the frame for calculating the results for a partition.
 * <p>
 * param:  rows to calculate the frame results for.
 */
public abstract class WindowFunctionFrame {
  // not preceding
  static public  org.apache.spark.sql.catalyst.expressions.UnsafeRow getNextOrNull (scala.collection.Iterator<org.apache.spark.sql.catalyst.expressions.UnsafeRow> iterator)  { throw new RuntimeException(); }
  // not preceding
  public   WindowFunctionFrame ()  { throw new RuntimeException(); }
  // not preceding
  public abstract  void prepare (org.apache.spark.sql.execution.ExternalAppendOnlyUnsafeRowArray rows)  ;
  /**
   * Write the current results to the target row.
   * @param index (undocumented)
   * @param current (undocumented)
   */
  public abstract  void write (int index, org.apache.spark.sql.catalyst.InternalRow current)  ;
  /**
   * The current lower window bound in the row array (inclusive).
   * <p>
   * This should be called after the current row is updated via <code>write</code>.
   * @return (undocumented)
   */
  public abstract  int currentLowerBound ()  ;
  /**
   * The current row index of the upper window bound in the row array (exclusive)
   * <p>
   * This should be called after the current row is updated via <code>write</code>.
   * @return (undocumented)
   */
  public abstract  int currentUpperBound ()  ;
}
