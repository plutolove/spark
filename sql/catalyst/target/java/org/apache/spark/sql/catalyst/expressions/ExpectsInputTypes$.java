package org.apache.spark.sql.catalyst.expressions;
/**
 * Expected input types from child expressions. The i-th position in the returned seq indicates
 * the type requirement for the i-th child.
 * <p>
 * The possible values at each position are:
 * 1. a specific data type, e.g. LongType, StringType.
 * 2. a non-leaf abstract data type, e.g. NumericType, IntegralType, FractionalType.
 */
// not preceding
public  class ExpectsInputTypes$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final ExpectsInputTypes$ MODULE$ = null;
  public   ExpectsInputTypes$ ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.catalyst.analysis.TypeCheckResult checkInputDataTypes (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> inputs, scala.collection.Seq<org.apache.spark.sql.types.AbstractDataType> inputTypes)  { throw new RuntimeException(); }
}
