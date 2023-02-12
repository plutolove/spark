package org.apache.spark.ml.classification;
/** @group setParam */
public abstract class ProbabilisticClassificationModel<FeaturesType extends java.lang.Object, M extends org.apache.spark.ml.classification.ProbabilisticClassificationModel<FeaturesType, M>> extends org.apache.spark.ml.classification.ClassificationModel<FeaturesType, M> implements org.apache.spark.ml.classification.ProbabilisticClassifierParams {
  // not preceding
  static public  void normalizeToProbabilitiesInPlace (org.apache.spark.ml.linalg.DenseVector v)  { throw new RuntimeException(); }
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree().setOriginal(AppliedTypeTree(Ident(org.apache.spark.ml.classification.ProbabilisticClassificationModel), List(TypeTree().setOriginal(Ident(TypeName("FeaturesType"))), TypeTree().setOriginal(Ident(TypeName("M"))))))))
  public  org.apache.spark.ml.param.DoubleArrayParam thresholds ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.Param<java.lang.String> probabilityCol ()  { throw new RuntimeException(); }
  // not preceding
  public   ProbabilisticClassificationModel ()  { throw new RuntimeException(); }
  // not preceding
  public  M setProbabilityCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  M setThresholds (double[] value)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  /**
   * Transforms dataset by reading from {@link featuresCol}, and appending new columns as specified by
   * parameters:
   *  - predicted labels as {@link predictionCol} of type <code>Double</code>
   *  - raw predictions (confidences) as {@link rawPredictionCol} of type <code>Vector</code>
   *  - probability of each class as {@link probabilityCol} of type <code>Vector</code>.
   * <p>
   * @param dataset input dataset
   * @return transformed dataset
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> transform (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  /**
   * Estimate the probability of each class given the raw prediction,
   * doing the computation in-place.
   * These predictions are also called class conditional probabilities.
   * <p>
   * This internal method is used to implement <code>transform()</code> and output {@link probabilityCol}.
   * <p>
   * @return Estimated class conditional probabilities (modified input vector)
   * @param rawPrediction (undocumented)
   */
  protected abstract  org.apache.spark.ml.linalg.Vector raw2probabilityInPlace (org.apache.spark.ml.linalg.Vector rawPrediction)  ;
  /**
   * Non-in-place version of <code>raw2probabilityInPlace()</code>
   * @param rawPrediction (undocumented)
   * @return (undocumented)
   */
  protected  org.apache.spark.ml.linalg.Vector raw2probability (org.apache.spark.ml.linalg.Vector rawPrediction)  { throw new RuntimeException(); }
  protected  double raw2prediction (org.apache.spark.ml.linalg.Vector rawPrediction)  { throw new RuntimeException(); }
  /**
   * Predict the probability of each class given the features.
   * These predictions are also called class conditional probabilities.
   * <p>
   * This internal method is used to implement <code>transform()</code> and output {@link probabilityCol}.
   * <p>
   * @return Estimated class conditional probabilities
   * @param features (undocumented)
   */
  public  org.apache.spark.ml.linalg.Vector predictProbability (FeaturesType features)  { throw new RuntimeException(); }
  /**
   * Given a vector of class conditional probabilities, select the predicted label.
   * This supports thresholds which favor particular labels.
   * @return  predicted label
   * @param probability (undocumented)
   */
  protected  double probability2prediction (org.apache.spark.ml.linalg.Vector probability)  { throw new RuntimeException(); }
}
