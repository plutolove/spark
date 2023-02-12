package org.apache.spark.mllib.evaluation;
/**
 * An auxiliary constructor taking a DataFrame.
 * param:  predictionAndLabels a DataFrame with columns: prediction, label, weight (optional)
 *                            and probability (only for logLoss)
 */
public  class MulticlassMetrics {
  // not preceding
  public   MulticlassMetrics (org.apache.spark.rdd.RDD<? extends scala.Product> predictionAndLabels)  { throw new RuntimeException(); }
  // not preceding
     MulticlassMetrics (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> predictionAndLabels)  { throw new RuntimeException(); }
  // not preceding
  public  double accuracy ()  { throw new RuntimeException(); }
  /**
   * Returns confusion matrix:
   * predicted classes are in columns,
   * they are ordered by class label ascending,
   * as in "labels"
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.linalg.Matrix confusionMatrix ()  { throw new RuntimeException(); }
  /**
   * Returns f-measure for a given label (category)
   * @param label the label.
   * @param beta the beta parameter.
   * @return (undocumented)
   */
  public  double fMeasure (double label, double beta)  { throw new RuntimeException(); }
  /**
   * Returns f1-measure for a given label (category)
   * @param label the label.
   * @return (undocumented)
   */
  public  double fMeasure (double label)  { throw new RuntimeException(); }
  /**
   * Returns false positive rate for a given label (category)
   * @param label the label.
   * @return (undocumented)
   */
  public  double falsePositiveRate (double label)  { throw new RuntimeException(); }
  // not preceding
  public  double hammingLoss ()  { throw new RuntimeException(); }
  // not preceding
  public  double[] labels ()  { throw new RuntimeException(); }
  /**
   * Returns the log-loss, aka logistic loss or cross-entropy loss.
   * @param eps log-loss is undefined for p=0 or p=1, so probabilities are
   *            clipped to max(eps, min(1 - eps, p)).
   * @return (undocumented)
   */
  public  double logLoss (double eps)  { throw new RuntimeException(); }
  /**
   * Returns precision for a given label (category)
   * @param label the label.
   * @return (undocumented)
   */
  public  double precision (double label)  { throw new RuntimeException(); }
  /**
   * Returns recall for a given label (category)
   * @param label the label.
   * @return (undocumented)
   */
  public  double recall (double label)  { throw new RuntimeException(); }
  /**
   * Returns true positive rate for a given label (category)
   * @param label the label.
   * @return (undocumented)
   */
  public  double truePositiveRate (double label)  { throw new RuntimeException(); }
  /**
   * Returns weighted averaged f-measure
   * @param beta the beta parameter.
   * @return (undocumented)
   */
  public  double weightedFMeasure (double beta)  { throw new RuntimeException(); }
  // not preceding
  public  double weightedFMeasure ()  { throw new RuntimeException(); }
  // not preceding
  public  double weightedFalsePositiveRate ()  { throw new RuntimeException(); }
  // not preceding
  public  double weightedPrecision ()  { throw new RuntimeException(); }
  // not preceding
  public  double weightedRecall ()  { throw new RuntimeException(); }
  // not preceding
  public  double weightedTruePositiveRate ()  { throw new RuntimeException(); }
}
