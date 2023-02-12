package org.apache.spark.sql.catalyst.expressions;
/**
 * Expected input types from child expressions. The i-th position in the returned seq indicates
 * the type requirement for the i-th child.
 * <p>
 * The possible values at each position are:
 * 1. a specific data type, e.g. LongType, StringType.
 * 2. a non-leaf abstract data type, e.g. NumericType, IntegralType, FractionalType.
 */
public  interface ExpectsInputTypes {
  /**
   * Expected input types from child expressions. The i-th position in the returned seq indicates
   * the type requirement for the i-th child.
   * <p>
   * The possible values at each position are:
   * 1. a specific data type, e.g. LongType, StringType.
   * 2. a non-leaf abstract data type, e.g. NumericType, IntegralType, FractionalType.
   * @return (undocumented)
   */
  public  scala.collection.Seq<org.apache.spark.sql.types.AbstractDataType> inputTypes ()  ;
  public  org.apache.spark.sql.catalyst.analysis.TypeCheckResult checkInputDataTypes ()  ;
}
