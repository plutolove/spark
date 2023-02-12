package org.apache.spark.sql.expressions.scalalang;
/**
 * Average aggregate function.
 * <p>
 * @since 2.0.0
 *
 * @deprecated please use untyped builtin aggregate functions. Since 3.0.0. 
 */
// not preceding
public  class typed$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final typed$ MODULE$ = null;
  public   typed$ ()  { throw new RuntimeException(); }
  /**
   * Average aggregate function.
   * <p>
   * @since 2.0.0
   * @param f (undocumented)
   * @return (undocumented)
   */
  public <IN extends java.lang.Object> org.apache.spark.sql.TypedColumn<IN, java.lang.Object> avg (scala.Function1<IN, java.lang.Object> f)  { throw new RuntimeException(); }
  /**
   * Count aggregate function.
   * <p>
   * @since 2.0.0
   * @param f (undocumented)
   * @return (undocumented)
   */
  public <IN extends java.lang.Object> org.apache.spark.sql.TypedColumn<IN, java.lang.Object> count (scala.Function1<IN, java.lang.Object> f)  { throw new RuntimeException(); }
  /**
   * Sum aggregate function for floating point (double) type.
   * <p>
   * @since 2.0.0
   * @param f (undocumented)
   * @return (undocumented)
   */
  public <IN extends java.lang.Object> org.apache.spark.sql.TypedColumn<IN, java.lang.Object> sum (scala.Function1<IN, java.lang.Object> f)  { throw new RuntimeException(); }
  /**
   * Sum aggregate function for integral (long, i.e. 64 bit integer) type.
   * <p>
   * @since 2.0.0
   * @param f (undocumented)
   * @return (undocumented)
   */
  public <IN extends java.lang.Object> org.apache.spark.sql.TypedColumn<IN, java.lang.Object> sumLong (scala.Function1<IN, java.lang.Object> f)  { throw new RuntimeException(); }
}
