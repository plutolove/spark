package org.apache.spark.mllib.api.python;
/**
 * Returns gaussians as a List of Vectors and Matrices corresponding each MultivariateGaussian
 */
  class GaussianMixtureModelWrapper {
  // not preceding
  public   GaussianMixtureModelWrapper (org.apache.spark.mllib.clustering.GaussianMixtureModel model)  { throw new RuntimeException(); }
  /**
   * Returns gaussians as a List of Vectors and Matrices corresponding each MultivariateGaussian
   * @return (undocumented)
   */
  public  byte[] gaussians ()  { throw new RuntimeException(); }
  public  int k ()  { throw new RuntimeException(); }
  public  org.apache.spark.mllib.linalg.Vector predictSoft (org.apache.spark.mllib.linalg.Vector point)  { throw new RuntimeException(); }
  public  void save (org.apache.spark.SparkContext sc, java.lang.String path)  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.mllib.linalg.Vector weights ()  { throw new RuntimeException(); }
}
