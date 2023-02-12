package org.apache.spark.mllib.evaluation;
/**
 * Defaults <code>numBins</code> to 0.
 */
public  class BinaryClassificationMetrics implements org.apache.spark.internal.Logging {
  public  org.apache.spark.rdd.RDD<? extends scala.Product> scoreAndLabels ()  { throw new RuntimeException(); }
  public  int numBins ()  { throw new RuntimeException(); }
  // not preceding
  public   BinaryClassificationMetrics (org.apache.spark.rdd.RDD<? extends scala.Product> scoreAndLabels, int numBins)  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, scala.Tuple2<java.lang.Object, java.lang.Object>>> scoreLabelsWeight ()  { throw new RuntimeException(); }
  /**
   * Defaults <code>numBins</code> to 0.
   * @param scoreAndLabels (undocumented)
   */
  public   BinaryClassificationMetrics (org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, java.lang.Object>> scoreAndLabels)  { throw new RuntimeException(); }
  /**
   * An auxiliary constructor taking a DataFrame.
   * @param scoreAndLabels a DataFrame with two double columns: score and label
   */
     BinaryClassificationMetrics (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> scoreAndLabels)  { throw new RuntimeException(); }
  /**
   * Unpersist intermediate RDDs used in the computation.
   */
  public  void unpersist ()  { throw new RuntimeException(); }
  /**
   * Returns thresholds in descending order.
   * @return (undocumented)
   */
  public  org.apache.spark.rdd.RDD<java.lang.Object> thresholds ()  { throw new RuntimeException(); }
  /**
   * Returns the receiver operating characteristic (ROC) curve,
   * which is an RDD of (false positive rate, true positive rate)
   * with (0.0, 0.0) prepended and (1.0, 1.0) appended to it.
   * @see <a href="http://en.wikipedia.org/wiki/Receiver_operating_characteristic">
   * Receiver operating characteristic (Wikipedia)</a>
   * @return (undocumented)
   */
  public  org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, java.lang.Object>> roc ()  { throw new RuntimeException(); }
  /**
   * Computes the area under the receiver operating characteristic (ROC) curve.
   * @return (undocumented)
   */
  public  double areaUnderROC ()  { throw new RuntimeException(); }
  /**
   * Returns the precision-recall curve, which is an RDD of (recall, precision),
   * NOT (precision, recall), with (0.0, p) prepended to it, where p is the precision
   * associated with the lowest recall on the curve.
   * @see <a href="http://en.wikipedia.org/wiki/Precision_and_recall">
   * Precision and recall (Wikipedia)</a>
   * @return (undocumented)
   */
  public  org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, java.lang.Object>> pr ()  { throw new RuntimeException(); }
  /**
   * Computes the area under the precision-recall curve.
   * @return (undocumented)
   */
  public  double areaUnderPR ()  { throw new RuntimeException(); }
  /**
   * Returns the (threshold, F-Measure) curve.
   * @param beta the beta factor in F-Measure computation.
   * @return an RDD of (threshold, F-Measure) pairs.
   * @see <a href="http://en.wikipedia.org/wiki/F1_score">F1 score (Wikipedia)</a>
   */
  public  org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, java.lang.Object>> fMeasureByThreshold (double beta)  { throw new RuntimeException(); }
  /**
   * Returns the (threshold, F-Measure) curve with beta = 1.0.
   * @return (undocumented)
   */
  public  org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, java.lang.Object>> fMeasureByThreshold ()  { throw new RuntimeException(); }
  /**
   * Returns the (threshold, precision) curve.
   * @return (undocumented)
   */
  public  org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, java.lang.Object>> precisionByThreshold ()  { throw new RuntimeException(); }
  /**
   * Returns the (threshold, recall) curve.
   * @return (undocumented)
   */
  public  org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, java.lang.Object>> recallByThreshold ()  { throw new RuntimeException(); }
}
