package org.apache.spark.mllib.clustering;
/**
 * Constructs a default instance. The default parameters are {k: 2, convergenceTol: 0.01,
 * maxIterations: 100, seed: random}.
 */
public  class GaussianMixture implements scala.Serializable {
  // not preceding
  static   int MAX_NUM_FEATURES ()  { throw new RuntimeException(); }
  /**
   * Heuristic to distribute the computation of the <code>MultivariateGaussian</code>s, approximately when
   * d is greater than 25 except for when k is very small.
   * @param k  Number of topics
   * @param d  Number of features
   * @return (undocumented)
   */
  static public  boolean shouldDistributeGaussians (int k, int d)  { throw new RuntimeException(); }
  // not preceding
  public   GaussianMixture ()  { throw new RuntimeException(); }
  /**
   * Set the initial GMM starting point, bypassing the random initialization.
   * You must call setK() prior to calling this method, and the condition
   * (model.k == this.k) must be met; failure will result in an IllegalArgumentException
   * @param model (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.clustering.GaussianMixture setInitialModel (org.apache.spark.mllib.clustering.GaussianMixtureModel model)  { throw new RuntimeException(); }
  /**
   * Return the user supplied initial GMM, if supplied
   * @return (undocumented)
   */
  public  scala.Option<org.apache.spark.mllib.clustering.GaussianMixtureModel> getInitialModel ()  { throw new RuntimeException(); }
  /**
   * Set the number of Gaussians in the mixture model.  Default: 2
   * @param k (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.clustering.GaussianMixture setK (int k)  { throw new RuntimeException(); }
  /**
   * Return the number of Gaussians in the mixture model
   * @return (undocumented)
   */
  public  int getK ()  { throw new RuntimeException(); }
  /**
   * Set the maximum number of iterations allowed. Default: 100
   * @param maxIterations (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.clustering.GaussianMixture setMaxIterations (int maxIterations)  { throw new RuntimeException(); }
  /**
   * Return the maximum number of iterations allowed
   * @return (undocumented)
   */
  public  int getMaxIterations ()  { throw new RuntimeException(); }
  /**
   * Set the largest change in log-likelihood at which convergence is
   * considered to have occurred.
   * @param convergenceTol (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.clustering.GaussianMixture setConvergenceTol (double convergenceTol)  { throw new RuntimeException(); }
  /**
   * Return the largest change in log-likelihood at which convergence is
   * considered to have occurred.
   * @return (undocumented)
   */
  public  double getConvergenceTol ()  { throw new RuntimeException(); }
  /**
   * Set the random seed
   * @param seed (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.clustering.GaussianMixture setSeed (long seed)  { throw new RuntimeException(); }
  /**
   * Return the random seed
   * @return (undocumented)
   */
  public  long getSeed ()  { throw new RuntimeException(); }
  /**
   * Perform expectation maximization
   * @param data (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.clustering.GaussianMixtureModel run (org.apache.spark.rdd.RDD<org.apache.spark.mllib.linalg.Vector> data)  { throw new RuntimeException(); }
  /**
   * Java-friendly version of <code>run()</code>
   * @param data (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.clustering.GaussianMixtureModel run (org.apache.spark.api.java.JavaRDD<org.apache.spark.mllib.linalg.Vector> data)  { throw new RuntimeException(); }
}
