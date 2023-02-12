package org.apache.spark.ml.regression;
/** @group setParam */
public  class IsotonicRegressionModel extends org.apache.spark.ml.Model<org.apache.spark.ml.regression.IsotonicRegressionModel> implements org.apache.spark.ml.regression.IsotonicRegressionBase, org.apache.spark.ml.util.MLWritable {
  /** {@link MLWriter} instance for {@link IsotonicRegressionModel} */
  static   class IsotonicRegressionModelWriter extends org.apache.spark.ml.util.MLWriter implements org.apache.spark.internal.Logging {
    // not preceding
    public   IsotonicRegressionModelWriter (org.apache.spark.ml.regression.IsotonicRegressionModel instance)  { throw new RuntimeException(); }
    // not preceding
    protected  void saveImpl (java.lang.String path)  { throw new RuntimeException(); }
  }
  // not preceding
  static public  org.apache.spark.ml.util.MLReader<org.apache.spark.ml.regression.IsotonicRegressionModel> read ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.regression.IsotonicRegressionModel load (java.lang.String path)  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.BooleanParam isotonic ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.IntParam featureIndex ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.Param<java.lang.String> weightCol ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.Param<java.lang.String> predictionCol ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.Param<java.lang.String> labelCol ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.Param<java.lang.String> featuresCol ()  { throw new RuntimeException(); }
  public  java.lang.String uid ()  { throw new RuntimeException(); }
  // not preceding
     IsotonicRegressionModel (java.lang.String uid, org.apache.spark.mllib.regression.IsotonicRegressionModel oldModel)  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.ml.regression.IsotonicRegressionModel setFeaturesCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.regression.IsotonicRegressionModel setPredictionCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.regression.IsotonicRegressionModel setFeatureIndex (int value)  { throw new RuntimeException(); }
  /** Boundaries in increasing order for which predictions are known. */
  public  org.apache.spark.ml.linalg.Vector boundaries ()  { throw new RuntimeException(); }
  /**
   * Predictions associated with the boundaries at the same index, monotone because of isotonic
   * regression.
   * @return (undocumented)
   */
  public  org.apache.spark.ml.linalg.Vector predictions ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.regression.IsotonicRegressionModel copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> transform (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  public  double predict (double value)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.util.MLWriter write ()  { throw new RuntimeException(); }
  public  int numFeatures ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
