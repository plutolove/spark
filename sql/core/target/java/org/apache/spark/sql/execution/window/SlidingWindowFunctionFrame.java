package org.apache.spark.sql.execution.window;
/** Rows of the partition currently being processed. */
public final class SlidingWindowFunctionFrame extends org.apache.spark.sql.execution.window.WindowFunctionFrame {
  // not preceding
  public   SlidingWindowFunctionFrame (org.apache.spark.sql.catalyst.InternalRow target, org.apache.spark.sql.execution.window.AggregateProcessor processor, org.apache.spark.sql.execution.window.BoundOrdering lbound, org.apache.spark.sql.execution.window.BoundOrdering ubound)  { throw new RuntimeException(); }
  public  int currentLowerBound ()  { throw new RuntimeException(); }
  public  int currentUpperBound ()  { throw new RuntimeException(); }
  // not preceding
  public  void prepare (org.apache.spark.sql.execution.ExternalAppendOnlyUnsafeRowArray rows)  { throw new RuntimeException(); }
  /** Write the frame columns for the current row to the given target row. */
  public  void write (int index, org.apache.spark.sql.catalyst.InternalRow current)  { throw new RuntimeException(); }
}
