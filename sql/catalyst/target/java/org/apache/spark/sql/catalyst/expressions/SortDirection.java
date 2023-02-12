package org.apache.spark.sql.catalyst.expressions;
public abstract class SortDirection {
  // not preceding
  public   SortDirection ()  { throw new RuntimeException(); }
  public abstract  org.apache.spark.sql.catalyst.expressions.NullOrdering defaultNullOrdering ()  ;
  // not preceding
  public abstract  java.lang.String sql ()  ;
}
