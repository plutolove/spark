package org.apache.spark.sql;
/**
 * Inserts the specific input type and schema into any expressions that are expected to operate
 * on a decoded object.
 */
public  class TypedColumn<T extends java.lang.Object, U extends java.lang.Object> extends org.apache.spark.sql.Column {
  // not preceding
  public   TypedColumn (org.apache.spark.sql.catalyst.expressions.Expression expr, org.apache.spark.sql.catalyst.encoders.ExpressionEncoder<U> encoder)  { throw new RuntimeException(); }
    org.apache.spark.sql.catalyst.encoders.ExpressionEncoder<U> encoder ()  { throw new RuntimeException(); }
  /**
   * Gives the {@link TypedColumn} a name (alias).
   * If the current <code>TypedColumn</code> has metadata associated with it, this metadata will be propagated
   * to the new column.
   * <p>
   * @group expr_ops
   * @since 2.0.0
   * @param alias (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.TypedColumn<T, U> name (java.lang.String alias)  { throw new RuntimeException(); }
  // not preceding
    org.apache.spark.sql.TypedColumn<T, U> withInputType (org.apache.spark.sql.catalyst.encoders.ExpressionEncoder<?> inputEncoder, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> inputAttributes)  { throw new RuntimeException(); }
}
