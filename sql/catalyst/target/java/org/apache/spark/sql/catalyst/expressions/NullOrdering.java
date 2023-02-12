package org.apache.spark.sql.catalyst.expressions;
public abstract class NullOrdering {
  // not preceding
  public   NullOrdering ()  { throw new RuntimeException(); }
  // not preceding
  public abstract  java.lang.String sql ()  ;
}
