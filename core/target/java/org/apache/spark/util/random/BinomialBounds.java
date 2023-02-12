package org.apache.spark.util.random;
/**
 * Returns a threshold <code>p</code> such that if we conduct n Bernoulli trials with success rate = <code>p</code>,
 * it is very unlikely to have more than <code>fraction * n</code> successes.
 */
// not preceding
public  class BinomialBounds {
  // not preceding
  static public  double minSamplingRate ()  { throw new RuntimeException(); }
  /**
   * Returns a threshold <code>p</code> such that if we conduct n Bernoulli trials with success rate = <code>p</code>,
   * it is very unlikely to have more than <code>fraction * n</code> successes.
   * @param delta (undocumented)
   * @param n (undocumented)
   * @param fraction (undocumented)
   * @return (undocumented)
   */
  static public  double getLowerBound (double delta, long n, double fraction)  { throw new RuntimeException(); }
  /**
   * Returns a threshold <code>p</code> such that if we conduct n Bernoulli trials with success rate = <code>p</code>,
   * it is very unlikely to have less than <code>fraction * n</code> successes.
   * @param delta (undocumented)
   * @param n (undocumented)
   * @param fraction (undocumented)
   * @return (undocumented)
   */
  static public  double getUpperBound (double delta, long n, double fraction)  { throw new RuntimeException(); }
}
