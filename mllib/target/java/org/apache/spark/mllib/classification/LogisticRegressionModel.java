package org.apache.spark.mllib.classification;
/**
 * Constructs a {@link LogisticRegressionModel} with weights and intercept for binary classification.
 */
public  class LogisticRegressionModel extends org.apache.spark.mllib.regression.GeneralizedLinearModel implements org.apache.spark.mllib.classification.ClassificationModel, scala.Serializable, org.apache.spark.mllib.util.Saveable, org.apache.spark.mllib.pmml.PMMLExportable {
  // not preceding
  static public  org.apache.spark.mllib.classification.LogisticRegressionModel load (org.apache.spark.SparkContext sc, java.lang.String path)  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.mllib.linalg.Vector weights ()  { throw new RuntimeException(); }
  public  double intercept ()  { throw new RuntimeException(); }
  public  int numFeatures ()  { throw new RuntimeException(); }
  public  int numClasses ()  { throw new RuntimeException(); }
  // not preceding
  public   LogisticRegressionModel (org.apache.spark.mllib.linalg.Vector weights, double intercept, int numFeatures, int numClasses)  { throw new RuntimeException(); }
  /**
   * Constructs a {@link LogisticRegressionModel} with weights and intercept for binary classification.
   * @param weights (undocumented)
   * @param intercept (undocumented)
   */
  public   LogisticRegressionModel (org.apache.spark.mllib.linalg.Vector weights, double intercept)  { throw new RuntimeException(); }
  /**
   * Sets the threshold that separates positive predictions from negative predictions
   * in Binary Logistic Regression. An example with prediction score greater than or equal to
   * this threshold is identified as a positive, and negative otherwise. The default value is 0.5.
   * It is only used for binary classification.
   * @param threshold (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.classification.LogisticRegressionModel setThreshold (double threshold)  { throw new RuntimeException(); }
  /**
   * Returns the threshold (if any) used for converting raw prediction scores into 0/1 predictions.
   * It is only used for binary classification.
   * @return (undocumented)
   */
  public  scala.Option<java.lang.Object> getThreshold ()  { throw new RuntimeException(); }
  /**
   * Clears the threshold so that <code>predict</code> will output raw prediction scores.
   * It is only used for binary classification.
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.classification.LogisticRegressionModel clearThreshold ()  { throw new RuntimeException(); }
  /**
   * Compute and find the one with maximum margins. If the maxMargin is negative, then the
   * prediction result will be the first class.
   * <p>
   * PS, if you want to compute the probabilities for each outcome instead of the outcome
   * with maximum probability, remember to subtract the maxMargin from margins if maxMargin
   * is positive to prevent overflow.
   * @param dataMatrix (undocumented)
   * @param weightMatrix (undocumented)
   * @param intercept (undocumented)
   * @return (undocumented)
   */
  protected  double predictPoint (org.apache.spark.mllib.linalg.Vector dataMatrix, org.apache.spark.mllib.linalg.Vector weightMatrix, double intercept)  { throw new RuntimeException(); }
  /**
   * Compute and find the one with maximum margins. If the maxMargin is negative, then the
   * prediction result will be the first class.
   * <p>
   * PS, if you want to compute the probabilities for each outcome instead of the outcome
   * with maximum probability, remember to subtract the maxMargin from margins if maxMargin
   * is positive to prevent overflow.
   * @param sc (undocumented)
   * @param path (undocumented)
   */
  public  void save (org.apache.spark.SparkContext sc, java.lang.String path)  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
