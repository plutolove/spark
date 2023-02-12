package org.apache.spark.mllib.util;
/**
 * Generate an RDD containing test data for LogisticRegression.
 * <p>
 * param:  sc SparkContext to use for creating the RDD.
 * param:  nexamples Number of examples that will be contained in the RDD.
 * param:  nfeatures Number of features to generate for each example.
 * param:  eps Epsilon factor by which positive examples are scaled.
 * param:  nparts Number of partitions of the generated RDD. Default value is 2.
 * param:  probOne Probability that a label is 1 (and not 0). Default value is 0.5.
 */
// not preceding
public  class LogisticRegressionDataGenerator$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final LogisticRegressionDataGenerator$ MODULE$ = null;
  public   LogisticRegressionDataGenerator$ ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.rdd.RDD<org.apache.spark.mllib.regression.LabeledPoint> generateLogisticRDD (org.apache.spark.SparkContext sc, int nexamples, int nfeatures, double eps, int nparts, double probOne)  { throw new RuntimeException(); }
  public  void main (java.lang.String[] args)  { throw new RuntimeException(); }
}
