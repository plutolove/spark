package org.apache.spark.sql.catalyst.expressions.aggregate;
/**
 * Expressions for initializing empty aggregation buffers.
 */
public abstract class DeclarativeAggregate extends org.apache.spark.sql.catalyst.expressions.aggregate.AggregateFunction implements scala.Serializable, org.apache.spark.sql.catalyst.expressions.Unevaluable {
  /** Represents this attribute at the mutable buffer side. */
  public  class RichAttribute {
    // not preceding
    public   RichAttribute (org.apache.spark.sql.catalyst.expressions.AttributeReference a)  { throw new RuntimeException(); }
    // not preceding
    public  org.apache.spark.sql.catalyst.expressions.AttributeReference left ()  { throw new RuntimeException(); }
    /** Represents this attribute at the input buffer side (the data value is read-only). */
    public  org.apache.spark.sql.catalyst.expressions.AttributeReference right ()  { throw new RuntimeException(); }
  }
  // not preceding
  public   DeclarativeAggregate ()  { throw new RuntimeException(); }
  /** An expression-based aggregate's bufferSchema is derived from bufferAttributes. */
  public final  org.apache.spark.sql.types.StructType aggBufferSchema ()  { throw new RuntimeException(); }
  /**
   * An expression which returns the final value for this aggregate function. Its data type should
   * match this expression's {@link dataType}.
   * @return (undocumented)
   */
  public abstract  org.apache.spark.sql.catalyst.expressions.Expression evaluateExpression ()  ;
  // not preceding
  public abstract  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> initialValues ()  ;
  // not preceding
  public final  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.AttributeReference> inputAggBufferAttributes ()  { throw new RuntimeException(); }
  /**
   * A sequence of expressions for merging two aggregation buffers together. When defining these
   * expressions, you can use the syntax <code>attributeName.left</code> and <code>attributeName.right</code> to refer
   * to the attributes corresponding to each of the buffers being merged (this magic is enabled
   * by the {@link RichAttribute} implicit class).
   * @return (undocumented)
   */
  public abstract  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> mergeExpressions ()  ;
  /**
   * Expressions for updating the mutable aggregation buffer based on an input row.
   * @return (undocumented)
   */
  public abstract  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> updateExpressions ()  ;
}
