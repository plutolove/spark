package org.apache.spark.util.random;
/**
 * Returns a lambda such that Pr[X {@literal >} s] is very small, where X ~ Pois(lambda).
 */
// not preceding
public  class PoissonBounds {
  // not preceding
  static public  double getLowerBound (double s)  { throw new RuntimeException(); }
  /**
   * Returns a lambda such that Pr[X {@literal <} s] is very small, where X ~ Pois(lambda).
   * <p>
   * @param s sample size
   * @return (undocumented)
   */
  static public  double getUpperBound (double s)  { throw new RuntimeException(); }
}
