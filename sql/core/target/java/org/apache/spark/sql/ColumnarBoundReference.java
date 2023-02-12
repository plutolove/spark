package org.apache.spark.sql;
/**
 * A helper function to bind given expressions to an input schema.
 */
public  class ColumnarBoundReference extends org.apache.spark.sql.catalyst.expressions.BoundReference implements org.apache.spark.sql.ColumnarExpression {
  // not preceding
  public   ColumnarBoundReference (int ordinal, org.apache.spark.sql.types.DataType dataType, boolean nullable)  { throw new RuntimeException(); }
  // not preceding
  public  Object columnarEval (org.apache.spark.sql.vectorized.ColumnarBatch batch)  { throw new RuntimeException(); }
}
