package org.apache.spark.mllib.clustering;
/**
 * Heuristic to distribute the computation of the <code>MultivariateGaussian</code>s, approximately when
 * d is greater than 25 except for when k is very small.
 * param:  k  Number of topics
 * param:  d  Number of features
 */
// not preceding
public  class ExpectationSum$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final ExpectationSum$ MODULE$ = null;
  public   ExpectationSum$ ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.mllib.clustering.ExpectationSum zero (int k, int d)  { throw new RuntimeException(); }
  public  org.apache.spark.mllib.clustering.ExpectationSum add (double[] weights, org.apache.spark.mllib.stat.distribution.MultivariateGaussian[] dists, org.apache.spark.mllib.clustering.ExpectationSum sums, breeze.linalg.Vector<java.lang.Object> x)  { throw new RuntimeException(); }
}
