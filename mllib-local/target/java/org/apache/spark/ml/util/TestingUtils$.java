package org.apache.spark.ml.util;
/**
 * Private helper function for comparing two values using relative tolerance.
 * Note that if x or y is extremely close to zero, i.e., smaller than Double.MinPositiveValue,
 * the relative tolerance is meaningless, so the exception will be raised to warn users.
 */
// not preceding
public  class TestingUtils$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final TestingUtils$ MODULE$ = null;
  public   TestingUtils$ ()  { throw new RuntimeException(); }
  // not preceding
  public  java.lang.String ABS_TOL_MSG ()  { throw new RuntimeException(); }
  public  java.lang.String REL_TOL_MSG ()  { throw new RuntimeException(); }
  /**
   * Private helper function for comparing two values using absolute tolerance.
   * @param x (undocumented)
   * @param y (undocumented)
   * @param eps (undocumented)
   * @return (undocumented)
   */
    boolean AbsoluteErrorComparison (double x, double y, double eps)  { throw new RuntimeException(); }
}
