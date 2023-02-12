package org.apache.spark.sql.expressions;
/** Update the ith value of this buffer. */
public abstract class MutableAggregationBuffer implements org.apache.spark.sql.Row {
  // not preceding
  public   MutableAggregationBuffer ()  { throw new RuntimeException(); }
  // not preceding
  public abstract  void update (int i, Object value)  ;
}
