package org.apache.spark.sql.catalyst.expressions;
/** Number of (top level) fields in the resulting row. */
public  class InterpretedUnsafeProjection extends org.apache.spark.sql.catalyst.expressions.UnsafeProjection {
  // not preceding
  static public  org.apache.spark.sql.catalyst.expressions.UnsafeProjection createProjection (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> exprs)  { throw new RuntimeException(); }
  // not preceding
  public   InterpretedUnsafeProjection (org.apache.spark.sql.catalyst.expressions.Expression[] expressions)  { throw new RuntimeException(); }
  // not preceding
  public  void initialize (int partitionIndex)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.UnsafeRow apply (org.apache.spark.sql.catalyst.InternalRow row)  { throw new RuntimeException(); }
}
