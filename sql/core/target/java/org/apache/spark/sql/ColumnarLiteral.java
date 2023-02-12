package org.apache.spark.sql;
public  class ColumnarLiteral extends org.apache.spark.sql.catalyst.expressions.Literal implements org.apache.spark.sql.ColumnarExpression {
  // not preceding
  public   ColumnarLiteral (Object value, org.apache.spark.sql.types.DataType dataType)  { throw new RuntimeException(); }
  // not preceding
  public  Object columnarEval (org.apache.spark.sql.vectorized.ColumnarBatch batch)  { throw new RuntimeException(); }
}
