package org.apache.spark.mllib.classification;
/**
 * Compute and find the one with maximum margins. If the maxMargin is negative, then the
 * prediction result will be the first class.
 * <p>
 * PS, if you want to compute the probabilities for each outcome instead of the outcome
 * with maximum probability, remember to subtract the maxMargin from margins if maxMargin
 * is positive to prevent overflow.
 */
// not preceding
public  class LogisticRegressionModel$ implements org.apache.spark.mllib.util.Loader<org.apache.spark.mllib.classification.LogisticRegressionModel>, scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final LogisticRegressionModel$ MODULE$ = null;
  public   LogisticRegressionModel$ ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.mllib.classification.LogisticRegressionModel load (org.apache.spark.SparkContext sc, java.lang.String path)  { throw new RuntimeException(); }
}
