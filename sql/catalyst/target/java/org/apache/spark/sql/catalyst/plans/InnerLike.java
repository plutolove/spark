package org.apache.spark.sql.catalyst.plans;
/**
 * The explicitCartesian flag indicates if the inner join was constructed with a CROSS join
 * indicating a cartesian product has been explicitly requested.
 */
public abstract class InnerLike extends org.apache.spark.sql.catalyst.plans.JoinType {
  // not preceding
  public   InnerLike ()  { throw new RuntimeException(); }
  // not preceding
  public abstract  boolean explicitCartesian ()  ;
}
