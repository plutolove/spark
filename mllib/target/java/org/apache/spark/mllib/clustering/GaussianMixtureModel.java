package org.apache.spark.mllib.clustering;
/**
 * Number of gaussians in mixture
 */
public  class GaussianMixtureModel implements scala.Serializable, org.apache.spark.mllib.util.Saveable {
  // not preceding
  static public  org.apache.spark.mllib.clustering.GaussianMixtureModel load (org.apache.spark.SparkContext sc, java.lang.String path)  { throw new RuntimeException(); }
  // not preceding
  public  double[] weights ()  { throw new RuntimeException(); }
  public  org.apache.spark.mllib.stat.distribution.MultivariateGaussian[] gaussians ()  { throw new RuntimeException(); }
  // not preceding
  public   GaussianMixtureModel (double[] weights, org.apache.spark.mllib.stat.distribution.MultivariateGaussian[] gaussians)  { throw new RuntimeException(); }
  public  void save (org.apache.spark.SparkContext sc, java.lang.String path)  { throw new RuntimeException(); }
  /**
   * Number of gaussians in mixture
   * @return (undocumented)
   */
  public  int k ()  { throw new RuntimeException(); }
  /**
   * Maps given points to their cluster indices.
   * @param points (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.rdd.RDD<java.lang.Object> predict (org.apache.spark.rdd.RDD<org.apache.spark.mllib.linalg.Vector> points)  { throw new RuntimeException(); }
  /**
   * Maps given point to its cluster index.
   * @param point (undocumented)
   * @return (undocumented)
   */
  public  int predict (org.apache.spark.mllib.linalg.Vector point)  { throw new RuntimeException(); }
  /**
   * Java-friendly version of <code>predict()</code>
   * @param points (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.api.java.JavaRDD<java.lang.Integer> predict (org.apache.spark.api.java.JavaRDD<org.apache.spark.mllib.linalg.Vector> points)  { throw new RuntimeException(); }
  /**
   * Given the input vectors, return the membership value of each vector
   * to all mixture components.
   * @param points (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.rdd.RDD<double[]> predictSoft (org.apache.spark.rdd.RDD<org.apache.spark.mllib.linalg.Vector> points)  { throw new RuntimeException(); }
  /**
   * Given the input vector, return the membership values to all mixture components.
   * @param point (undocumented)
   * @return (undocumented)
   */
  public  double[] predictSoft (org.apache.spark.mllib.linalg.Vector point)  { throw new RuntimeException(); }
}
