package org.apache.spark.mllib.stat.test;
/**
 * param:  name String name for the method.
 * param:  chiSqFunc Function for computing the statistic given the observed and expected counts.
 */
// not preceding
public  class ChiSqTest$ implements org.apache.spark.internal.Logging {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final ChiSqTest$ MODULE$ = null;
  public   ChiSqTest$ ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.mllib.stat.test.ChiSqTest.Method PEARSON ()  { throw new RuntimeException(); }
  /**
   * Max number of categories when indexing labels and features
   * @return (undocumented)
   */
    int maxCategories ()  { throw new RuntimeException(); }
  /**
   * Conduct Pearson's independence test for each feature against the label across the input RDD.
   * The contingency table is constructed from the raw (feature, label) pairs and used to conduct
   * the independence test.
   * Returns an array containing the ChiSquaredTestResult for every feature against the label.
   * @param data (undocumented)
   * @param methodName (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.stat.test.ChiSqTestResult[] chiSquaredFeatures (org.apache.spark.rdd.RDD<org.apache.spark.mllib.regression.LabeledPoint> data, java.lang.String methodName)  { throw new RuntimeException(); }
  public  org.apache.spark.mllib.stat.test.ChiSqTestResult chiSquared (org.apache.spark.mllib.linalg.Vector observed, org.apache.spark.mllib.linalg.Vector expected, java.lang.String methodName)  { throw new RuntimeException(); }
  public  org.apache.spark.mllib.stat.test.ChiSqTestResult chiSquaredMatrix (org.apache.spark.mllib.linalg.Matrix counts, java.lang.String methodName)  { throw new RuntimeException(); }
}
