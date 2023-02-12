package org.apache.spark.sql.execution.window;
/** Prepare the frame for calculating a new partition. Process all rows eagerly. */
public final class UnboundedWindowFunctionFrame extends org.apache.spark.sql.execution.window.WindowFunctionFrame {
  // not preceding
  public   UnboundedWindowFunctionFrame (org.apache.spark.sql.catalyst.InternalRow target, org.apache.spark.sql.execution.window.AggregateProcessor processor)  { throw new RuntimeException(); }
  public  int currentLowerBound ()  { throw new RuntimeException(); }
  public  int currentUpperBound ()  { throw new RuntimeException(); }
  // not preceding
  public  int lowerBound ()  { throw new RuntimeException(); }
  /** Prepare the frame for calculating a new partition. Process all rows eagerly. */
  public  void prepare (org.apache.spark.sql.execution.ExternalAppendOnlyUnsafeRowArray rows)  { throw new RuntimeException(); }
  public  int upperBound ()  { throw new RuntimeException(); }
  /** Write the frame columns for the current row to the given target row. */
  public  void write (int index, org.apache.spark.sql.catalyst.InternalRow current)  { throw new RuntimeException(); }
}
