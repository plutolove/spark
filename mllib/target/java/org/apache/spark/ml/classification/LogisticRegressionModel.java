package org.apache.spark.ml.classification;
/**
 * A vector of model coefficients for "binomial" logistic regression. If this model was trained
 * using the "multinomial" family then an exception is thrown.
 * <p>
 * @return Vector
 */
public  class LogisticRegressionModel extends org.apache.spark.ml.classification.ProbabilisticClassificationModel<org.apache.spark.ml.linalg.Vector, org.apache.spark.ml.classification.LogisticRegressionModel> implements org.apache.spark.ml.util.MLWritable, org.apache.spark.ml.classification.LogisticRegressionParams, org.apache.spark.ml.util.HasTrainingSummary<org.apache.spark.ml.classification.LogisticRegressionTrainingSummary> {
  /** {@link MLWriter} instance for {@link LogisticRegressionModel} */
  static   class LogisticRegressionModelWriter extends org.apache.spark.ml.util.MLWriter implements org.apache.spark.internal.Logging {
    // not preceding
    public   LogisticRegressionModelWriter (org.apache.spark.ml.classification.LogisticRegressionModel instance)  { throw new RuntimeException(); }
    // not preceding
    protected  void saveImpl (java.lang.String path)  { throw new RuntimeException(); }
  }
  // not preceding
  static public  org.apache.spark.ml.util.MLReader<org.apache.spark.ml.classification.LogisticRegressionModel> read ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.classification.LogisticRegressionModel load (java.lang.String path)  { throw new RuntimeException(); }
  // not preceding
   final  scala.Option<org.apache.spark.ml.classification.LogisticRegressionTrainingSummary> trainingSummary ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.Param<java.lang.String> family ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.ml.param.Param<org.apache.spark.ml.linalg.Matrix> lowerBoundsOnCoefficients ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.ml.param.Param<org.apache.spark.ml.linalg.Matrix> upperBoundsOnCoefficients ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.ml.param.Param<org.apache.spark.ml.linalg.Vector> lowerBoundsOnIntercepts ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.ml.param.Param<org.apache.spark.ml.linalg.Vector> upperBoundsOnIntercepts ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.IntParam aggregationDepth ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.ml.param.DoubleParam threshold ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.Param<java.lang.String> weightCol ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.BooleanParam standardization ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.DoubleParam tol ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.BooleanParam fitIntercept ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.IntParam maxIter ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.DoubleParam elasticNetParam ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.DoubleParam regParam ()  { throw new RuntimeException(); }
  public  java.lang.String uid ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.linalg.Matrix coefficientMatrix ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.linalg.Vector interceptVector ()  { throw new RuntimeException(); }
  public  int numClasses ()  { throw new RuntimeException(); }
  // not preceding
     LogisticRegressionModel (java.lang.String uid, org.apache.spark.ml.linalg.Matrix coefficientMatrix, org.apache.spark.ml.linalg.Vector interceptVector, int numClasses, boolean isMultinomial)  { throw new RuntimeException(); }
     LogisticRegressionModel (java.lang.String uid, org.apache.spark.ml.linalg.Vector coefficients, double intercept)  { throw new RuntimeException(); }
  /**
   * A vector of model coefficients for "binomial" logistic regression. If this model was trained
   * using the "multinomial" family then an exception is thrown.
   * <p>
   * @return Vector
   */
  public  org.apache.spark.ml.linalg.Vector coefficients ()  { throw new RuntimeException(); }
  /**
   * The model intercept for "binomial" logistic regression. If this model was fit with the
   * "multinomial" family then an exception is thrown.
   * <p>
   * @return Double
   */
  public  double intercept ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.classification.LogisticRegressionModel setThreshold (double value)  { throw new RuntimeException(); }
  public  double getThreshold ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.classification.LogisticRegressionModel setThresholds (double[] value)  { throw new RuntimeException(); }
  public  double[] getThresholds ()  { throw new RuntimeException(); }
  public  int numFeatures ()  { throw new RuntimeException(); }
  /**
   * Gets summary of model on training set. An exception is thrown
   * if <code>hasSummary</code> is false.
   * @return (undocumented)
   */
  public  org.apache.spark.ml.classification.LogisticRegressionTrainingSummary summary ()  { throw new RuntimeException(); }
  /**
   * Gets summary of model on training set. An exception is thrown
   * if <code>hasSummary</code> is false or it is a multiclass model.
   * @return (undocumented)
   */
  public  org.apache.spark.ml.classification.BinaryLogisticRegressionTrainingSummary binarySummary ()  { throw new RuntimeException(); }
  /**
   * If the probability and prediction columns are set, this method returns the current model,
   * otherwise it generates new columns for them and sets them as columns on a new copy of
   * the current model
   * @return (undocumented)
   */
    scala.Tuple3<org.apache.spark.ml.classification.LogisticRegressionModel, java.lang.String, java.lang.String> findSummaryModel ()  { throw new RuntimeException(); }
  /**
   * Evaluates the model on a test dataset.
   * <p>
   * @param dataset Test dataset to evaluate model on.
   * @return (undocumented)
   */
  public  org.apache.spark.ml.classification.LogisticRegressionSummary evaluate (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  /**
   * Predict label for the given feature vector.
   * The behavior of this can be adjusted using <code>thresholds</code>.
   * @param features (undocumented)
   * @return (undocumented)
   */
  public  double predict (org.apache.spark.ml.linalg.Vector features)  { throw new RuntimeException(); }
  protected  org.apache.spark.ml.linalg.Vector raw2probabilityInPlace (org.apache.spark.ml.linalg.Vector rawPrediction)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.linalg.Vector predictRaw (org.apache.spark.ml.linalg.Vector features)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.classification.LogisticRegressionModel copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
  protected  double raw2prediction (org.apache.spark.ml.linalg.Vector rawPrediction)  { throw new RuntimeException(); }
  protected  double probability2prediction (org.apache.spark.ml.linalg.Vector probability)  { throw new RuntimeException(); }
  /**
   * Returns a {@link org.apache.spark.ml.util.MLWriter} instance for this ML instance.
   * <p>
   * For {@link LogisticRegressionModel}, this does NOT currently save the training {@link summary}.
   * An option to save {@link summary} may be added in the future.
   * <p>
   * This also does not save the {@link parent} currently.
   * @return (undocumented)
   */
  public  org.apache.spark.ml.util.MLWriter write ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
