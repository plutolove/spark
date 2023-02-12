package org.apache.spark.sql;
/**
 * Returns true if this expression supports columnar processing through {@link columnarEval}.
 */
public  interface ColumnarExpression extends scala.Serializable {
  /**
   * Returns the result of evaluating this expression on the entire
   * {@link org.apache.spark.sql.vectorized.ColumnarBatch}. The result of
   * calling this may be a single {@link org.apache.spark.sql.vectorized.ColumnVector} or a scalar
   * value. Scalar values typically happen if they are a part of the expression i.e. col("a") + 100.
   * In this case the 100 is a {@link org.apache.spark.sql.catalyst.expressions.Literal} that
   * {@link org.apache.spark.sql.catalyst.expressions.Add} would have to be able to handle.
   * <p>
   * By convention any {@link org.apache.spark.sql.vectorized.ColumnVector} returned by {@link columnarEval}
   * is owned by the caller and will need to be closed by them. This can happen by putting it into
   * a {@link org.apache.spark.sql.vectorized.ColumnarBatch} and closing the batch or by closing the
   * vector directly if it is a temporary value.
   * @param batch (undocumented)
   * @return (undocumented)
   */
  public  Object columnarEval (org.apache.spark.sql.vectorized.ColumnarBatch batch)  ;
  public  boolean equals (Object other)  ;
  public  int hashCode ()  ;
  /**
   * Returns true if this expression supports columnar processing through {@link columnarEval}.
   * @return (undocumented)
   */
  public  boolean supportsColumnar ()  ;
}
