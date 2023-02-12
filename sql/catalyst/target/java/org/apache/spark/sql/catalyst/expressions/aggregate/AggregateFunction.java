package org.apache.spark.sql.catalyst.expressions.aggregate;
/** An aggregate function is not foldable. */
public abstract class AggregateFunction extends org.apache.spark.sql.catalyst.expressions.Expression {
  // not preceding
  public   AggregateFunction ()  { throw new RuntimeException(); }
  /** Attributes of fields in aggBufferSchema. */
  public abstract  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.AttributeReference> aggBufferAttributes ()  ;
  /** The schema of the aggregation buffer. */
  public abstract  org.apache.spark.sql.types.StructType aggBufferSchema ()  ;
  /**
   * Result of the aggregate function when the input is empty.
   * @return (undocumented)
   */
  public  scala.Option<org.apache.spark.sql.catalyst.expressions.Literal> defaultResult ()  { throw new RuntimeException(); }
  // not preceding
  public final  boolean foldable ()  { throw new RuntimeException(); }
  /**
   * Attributes of fields in input aggregation buffers (immutable aggregation buffers that are
   * merged with mutable aggregation buffers in the merge() function or merge expressions).
   * These attributes are created automatically by cloning the {@link aggBufferAttributes}.
   * @return (undocumented)
   */
  public abstract  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.AttributeReference> inputAggBufferAttributes ()  ;
  public  java.lang.String sql (boolean isDistinct)  { throw new RuntimeException(); }
  /** String representation used in explain plans. */
  public  java.lang.String toAggString (boolean isDistinct)  { throw new RuntimeException(); }
  /**
   * Creates {@link AggregateExpression} with <code>isDistinct</code> flag disabled.
   * <p>
   * @see <code>toAggregateExpression(isDistinct: Boolean)</code> for detailed description
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.expressions.aggregate.AggregateExpression toAggregateExpression ()  { throw new RuntimeException(); }
  /**
   * Wraps this {@link AggregateFunction} in an {@link AggregateExpression} and sets <code>isDistinct</code>
   * flag of the {@link AggregateExpression} to the given value because
   * {@link AggregateExpression} is the container of an {@link AggregateFunction}, aggregation mode,
   * and the flag indicating if this aggregation is distinct aggregation or not.
   * An {@link AggregateFunction} should not be used without being wrapped in
   * an {@link AggregateExpression}.
   * @param isDistinct (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.expressions.aggregate.AggregateExpression toAggregateExpression (boolean isDistinct)  { throw new RuntimeException(); }
}