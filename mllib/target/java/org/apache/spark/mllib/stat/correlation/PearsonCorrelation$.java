package org.apache.spark.mllib.stat.correlation;
/**
 * Compute the Pearson correlation for two datasets. NaN if either vector has 0 variance.
 */
// not preceding
public  class PearsonCorrelation$ implements org.apache.spark.mllib.stat.correlation.Correlation, org.apache.spark.internal.Logging {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final PearsonCorrelation$ MODULE$ = null;
  public   PearsonCorrelation$ ()  { throw new RuntimeException(); }
  // not preceding
  public  double computeCorrelation (org.apache.spark.rdd.RDD<java.lang.Object> x, org.apache.spark.rdd.RDD<java.lang.Object> y)  { throw new RuntimeException(); }
  /**
   * Compute the Pearson correlation matrix S, for the input matrix, where S(i, j) is the
   * correlation between column i and j. 0 covariance results in a correlation value of Double.NaN.
   * @param X (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.linalg.Matrix computeCorrelationMatrix (org.apache.spark.rdd.RDD<org.apache.spark.mllib.linalg.Vector> X)  { throw new RuntimeException(); }
  /**
   * Compute the Pearson correlation matrix from the covariance matrix.
   * 0 variance results in a correlation value of Double.NaN.
   * @param covarianceMatrix (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.linalg.Matrix computeCorrelationMatrixFromCovariance (org.apache.spark.mllib.linalg.Matrix covarianceMatrix)  { throw new RuntimeException(); }
}
