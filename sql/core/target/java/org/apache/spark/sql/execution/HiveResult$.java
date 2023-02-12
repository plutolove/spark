package org.apache.spark.sql.execution;
/**
 * Returns the result as a hive compatible sequence of strings. This is used in tests and
 * <code>SparkSQLDriver</code> for CLI applications.
 */
// not preceding
public  class HiveResult$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final HiveResult$ MODULE$ = null;
  public   HiveResult$ ()  { throw new RuntimeException(); }
  // not preceding
  public  scala.collection.Seq<java.lang.String> hiveResultString (org.apache.spark.sql.execution.SparkPlan executedPlan)  { throw new RuntimeException(); }
  /** Formats a datum (based on the given data type) and returns the string representation. */
  public  java.lang.String toHiveString (scala.Tuple2<java.lang.Object, org.apache.spark.sql.types.DataType> a, boolean nested)  { throw new RuntimeException(); }
}
