package org.apache.spark.sql.catalyst.expressions.codegen;
public abstract class UnsafeRowJoiner {
  // not preceding
  public   UnsafeRowJoiner ()  { throw new RuntimeException(); }
  // not preceding
  public abstract  org.apache.spark.sql.catalyst.expressions.UnsafeRow join (org.apache.spark.sql.catalyst.expressions.UnsafeRow row1, org.apache.spark.sql.catalyst.expressions.UnsafeRow row2)  ;
}
