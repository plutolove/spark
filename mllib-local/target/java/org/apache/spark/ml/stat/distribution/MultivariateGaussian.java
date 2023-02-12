package org.apache.spark.ml.stat.distribution;
/** Private constructor taking Breeze types */
public  class MultivariateGaussian implements scala.Serializable {
  // not preceding
  public   MultivariateGaussian (org.apache.spark.ml.linalg.Vector mean, org.apache.spark.ml.linalg.Matrix cov)  { throw new RuntimeException(); }
  /** Private constructor taking Breeze types */
     MultivariateGaussian (breeze.linalg.DenseVector<java.lang.Object> mean, breeze.linalg.DenseMatrix<java.lang.Object> cov)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.linalg.Matrix cov ()  { throw new RuntimeException(); }
  /**
   * Returns the log-density of this multivariate Gaussian at given point, x
   * @param x (undocumented)
   * @return (undocumented)
   */
  public  double logpdf (org.apache.spark.ml.linalg.Vector x)  { throw new RuntimeException(); }
  /** Returns the log-density of this multivariate Gaussian at given point, x */
    double logpdf (breeze.linalg.Vector<java.lang.Object> x)  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.ml.linalg.Vector mean ()  { throw new RuntimeException(); }
  /**
   * Returns density of this multivariate Gaussian at given point, x
   * @param x (undocumented)
   * @return (undocumented)
   */
  public  double pdf (org.apache.spark.ml.linalg.Vector x)  { throw new RuntimeException(); }
  /** Returns density of this multivariate Gaussian at given point, x */
    double pdf (breeze.linalg.Vector<java.lang.Object> x)  { throw new RuntimeException(); }
}
