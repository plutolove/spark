package org.apache.spark.util.random;
/**
 * Returns a lambda such that Pr[X {@literal >} s] is very small, where X ~ Pois(lambda).
 */
// not preceding
public  class PoissonBounds$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final PoissonBounds$ MODULE$ = null;
  public   PoissonBounds$ ()  { throw new RuntimeException(); }
  // not preceding
  public  double getLowerBound (double s)  { throw new RuntimeException(); }
  /**
   * Returns a lambda such that Pr[X {@literal <} s] is very small, where X ~ Pois(lambda).
   * <p>
   * @param s sample size
   * @return (undocumented)
   */
  public  double getUpperBound (double s)  { throw new RuntimeException(); }
}
