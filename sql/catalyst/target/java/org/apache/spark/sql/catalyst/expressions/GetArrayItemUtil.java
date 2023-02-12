package org.apache.spark.sql.catalyst.expressions;
/** `Null` is returned for invalid ordinals. */
public  interface GetArrayItemUtil {
  /** `Null` is returned for invalid ordinals. */
  public  boolean computeNullabilityFromArray (org.apache.spark.sql.catalyst.expressions.Expression child, org.apache.spark.sql.catalyst.expressions.Expression ordinal)  ;
}
