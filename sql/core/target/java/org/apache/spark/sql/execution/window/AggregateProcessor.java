package org.apache.spark.sql.execution.window;
/** Create the initial state. */
 final class AggregateProcessor {
  // not preceding
  static public  org.apache.spark.sql.execution.window.AggregateProcessor apply (org.apache.spark.sql.catalyst.expressions.Expression[] functions, int ordinal, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> inputAttributes, scala.Function2<scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression>, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute>, org.apache.spark.sql.catalyst.expressions.MutableProjection> newMutableProjection)  { throw new RuntimeException(); }
  // not preceding
  public   AggregateProcessor (org.apache.spark.sql.catalyst.expressions.AttributeReference[] bufferSchema, org.apache.spark.sql.catalyst.expressions.MutableProjection initialProjection, org.apache.spark.sql.catalyst.expressions.MutableProjection updateProjection, org.apache.spark.sql.catalyst.expressions.MutableProjection evaluateProjection, org.apache.spark.sql.catalyst.expressions.aggregate.ImperativeAggregate[] imperatives, boolean trackPartitionSize)  { throw new RuntimeException(); }
  /** Create the initial state. */
  public  void initialize (int size)  { throw new RuntimeException(); }
  /** Update the buffer. */
  public  void update (org.apache.spark.sql.catalyst.InternalRow input)  { throw new RuntimeException(); }
  /** Evaluate buffer. */
  public  void evaluate (org.apache.spark.sql.catalyst.InternalRow target)  { throw new RuntimeException(); }
}
