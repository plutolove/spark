package org.apache.spark.sql.catalyst.expressions;
public abstract class AggregateWindowFunction extends org.apache.spark.sql.catalyst.expressions.aggregate.DeclarativeAggregate implements org.apache.spark.sql.catalyst.expressions.WindowFunction {
  // not preceding
  public   AggregateWindowFunction ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.DataType dataType ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.catalyst.expressions.SpecifiedWindowFrame frame ()  { throw new RuntimeException(); }
  // not preceding
  public  scala.runtime.Nothing$ mergeExpressions ()  { throw new RuntimeException(); }
  public  boolean nullable ()  { throw new RuntimeException(); }
}
