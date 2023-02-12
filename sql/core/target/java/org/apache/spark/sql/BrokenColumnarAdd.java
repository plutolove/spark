package org.apache.spark.sql;
/**
 * A version of add that supports columnar processing for longs.  This version is broken
 * on purpose so it adds the numbers plus 1 so that the tests can show that it was replaced.
 */
public  class BrokenColumnarAdd extends org.apache.spark.sql.catalyst.expressions.Add implements org.apache.spark.sql.ColumnarExpression {
  // not preceding
  public   BrokenColumnarAdd (org.apache.spark.sql.ColumnarExpression left, org.apache.spark.sql.ColumnarExpression right)  { throw new RuntimeException(); }
  public  Object columnarEval (org.apache.spark.sql.vectorized.ColumnarBatch batch)  { throw new RuntimeException(); }
  // not preceding
  public  boolean supportsColumnar ()  { throw new RuntimeException(); }
}
