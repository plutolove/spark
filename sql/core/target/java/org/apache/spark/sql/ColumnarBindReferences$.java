package org.apache.spark.sql;
/**
 * A helper function to bind given expressions to an input schema.
 */
// not preceding
public  class ColumnarBindReferences$ implements org.apache.spark.internal.Logging {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final ColumnarBindReferences$ MODULE$ = null;
  public   ColumnarBindReferences$ ()  { throw new RuntimeException(); }
  // not preceding
  public <A extends org.apache.spark.sql.ColumnarExpression> A bindReference (A expression, org.apache.spark.sql.catalyst.expressions.AttributeSeq input, boolean allowFailures)  { throw new RuntimeException(); }
  /**
   * A helper function to bind given expressions to an input schema.
   * @param expressions (undocumented)
   * @param input (undocumented)
   * @return (undocumented)
   */
  public <A extends org.apache.spark.sql.ColumnarExpression> scala.collection.Seq<A> bindReferences (scala.collection.Seq<A> expressions, org.apache.spark.sql.catalyst.expressions.AttributeSeq input)  { throw new RuntimeException(); }
}
