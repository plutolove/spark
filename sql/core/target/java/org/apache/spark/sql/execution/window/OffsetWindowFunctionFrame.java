package org.apache.spark.sql.execution.window;
/** Rows of the partition currently being processed. */
public final class OffsetWindowFunctionFrame extends org.apache.spark.sql.execution.window.WindowFunctionFrame {
  // not preceding
  public   OffsetWindowFunctionFrame (org.apache.spark.sql.catalyst.InternalRow target, int ordinal, org.apache.spark.sql.catalyst.expressions.OffsetWindowFunction[] expressions, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> inputSchema, scala.Function2<scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression>, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute>, org.apache.spark.sql.catalyst.expressions.MutableProjection> newMutableProjection, int offset)  { throw new RuntimeException(); }
  public  int currentLowerBound ()  { throw new RuntimeException(); }
  public  int currentUpperBound ()  { throw new RuntimeException(); }
  // not preceding
  public  void prepare (org.apache.spark.sql.execution.ExternalAppendOnlyUnsafeRowArray rows)  { throw new RuntimeException(); }
  public  void write (int index, org.apache.spark.sql.catalyst.InternalRow current)  { throw new RuntimeException(); }
}
