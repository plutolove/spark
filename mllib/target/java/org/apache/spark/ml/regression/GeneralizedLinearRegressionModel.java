package org.apache.spark.ml.regression;
/**
 * Sets the link prediction (linear predictor) column name.
 * <p>
 * @group setParam
 */
public  class GeneralizedLinearRegressionModel extends org.apache.spark.ml.regression.RegressionModel<org.apache.spark.ml.linalg.Vector, org.apache.spark.ml.regression.GeneralizedLinearRegressionModel> implements org.apache.spark.ml.regression.GeneralizedLinearRegressionBase, org.apache.spark.ml.util.MLWritable, org.apache.spark.ml.util.HasTrainingSummary<org.apache.spark.ml.regression.GeneralizedLinearRegressionTrainingSummary> {
  /** {@link MLWriter} instance for {@link GeneralizedLinearRegressionModel} */
  static   class GeneralizedLinearRegressionModelWriter extends org.apache.spark.ml.util.MLWriter implements org.apache.spark.internal.Logging {
    // not preceding
    public   GeneralizedLinearRegressionModelWriter (org.apache.spark.ml.regression.GeneralizedLinearRegressionModel instance)  { throw new RuntimeException(); }
    // not preceding
    protected  void saveImpl (java.lang.String path)  { throw new RuntimeException(); }
  }
  // not preceding
  static public  org.apache.spark.ml.util.MLReader<org.apache.spark.ml.regression.GeneralizedLinearRegressionModel> read ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.regression.GeneralizedLinearRegressionModel load (java.lang.String path)  { throw new RuntimeException(); }
  // not preceding
   final  scala.Option<org.apache.spark.ml.regression.GeneralizedLinearRegressionTrainingSummary> trainingSummary ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.Param<java.lang.String> family ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.DoubleParam variancePower ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.Param<java.lang.String> link ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.DoubleParam linkPower ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.Param<java.lang.String> linkPredictionCol ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.Param<java.lang.String> offsetCol ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.Param<java.lang.String> solver ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.IntParam aggregationDepth ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.Param<java.lang.String> weightCol ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.DoubleParam regParam ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.DoubleParam tol ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.IntParam maxIter ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.BooleanParam fitIntercept ()  { throw new RuntimeException(); }
  public  java.lang.String uid ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.linalg.Vector coefficients ()  { throw new RuntimeException(); }
  public  double intercept ()  { throw new RuntimeException(); }
  // not preceding
     GeneralizedLinearRegressionModel (java.lang.String uid, org.apache.spark.ml.linalg.Vector coefficients, double intercept)  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.ml.regression.GeneralizedLinearRegressionModel setLinkPredictionCol (java.lang.String value)  { throw new RuntimeException(); }
  public  double predict (org.apache.spark.ml.linalg.Vector features)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> transform (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> transformImpl (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  /**
   * Gets R-like summary of model on training set. An exception is
   * thrown if there is no summary available.
   * @return (undocumented)
   */
  public  org.apache.spark.ml.regression.GeneralizedLinearRegressionTrainingSummary summary ()  { throw new RuntimeException(); }
  /**
   * Evaluate the model on the given dataset, returning a summary of the results.
   * @param dataset (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.regression.GeneralizedLinearRegressionSummary evaluate (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.regression.GeneralizedLinearRegressionModel copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
  /**
   * Returns a {@link org.apache.spark.ml.util.MLWriter} instance for this ML instance.
   * <p>
   * For {@link GeneralizedLinearRegressionModel}, this does NOT currently save the
   * training {@link summary}. An option to save {@link summary} may be added in the future.
   * <p>
   * @return (undocumented)
   */
  public  org.apache.spark.ml.util.MLWriter write ()  { throw new RuntimeException(); }
  public  int numFeatures ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
