package org.apache.spark.sql.catalyst.expressions;
/**
 * A base class for generated/interpreted row ordering.
 */
public  class BaseOrdering implements scala.math.Ordering<org.apache.spark.sql.catalyst.InternalRow> {
  // not preceding
  public   BaseOrdering ()  { throw new RuntimeException(); }
  // not preceding
  public  int compare (org.apache.spark.sql.catalyst.InternalRow a, org.apache.spark.sql.catalyst.InternalRow b)  { throw new RuntimeException(); }
}
