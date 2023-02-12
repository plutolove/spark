package org.apache.spark.ml.classification;
/**
 * Predict label for the given features.
 * This internal method is used to implement <code>transform()</code> and output {@link predictionCol}.
 */
public  class MultilayerPerceptronClassificationModel extends org.apache.spark.ml.classification.ProbabilisticClassificationModel<org.apache.spark.ml.linalg.Vector, org.apache.spark.ml.classification.MultilayerPerceptronClassificationModel> implements org.apache.spark.ml.classification.MultilayerPerceptronParams, scala.Serializable, org.apache.spark.ml.util.MLWritable {
  /** {@link MLWriter} instance for {@link MultilayerPerceptronClassificationModel} */
  static   class MultilayerPerceptronClassificationModelWriter extends org.apache.spark.ml.util.MLWriter {
    // not preceding
    public   MultilayerPerceptronClassificationModelWriter (org.apache.spark.ml.classification.MultilayerPerceptronClassificationModel instance)  { throw new RuntimeException(); }
    // not preceding
    protected  void saveImpl (java.lang.String path)  { throw new RuntimeException(); }
  }
  // not preceding
  static public  org.apache.spark.ml.util.MLReader<org.apache.spark.ml.classification.MultilayerPerceptronClassificationModel> read ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.classification.MultilayerPerceptronClassificationModel load (java.lang.String path)  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.IntArrayParam layers ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.Param<java.lang.String> solver ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.Param<org.apache.spark.ml.linalg.Vector> initialWeights ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.IntParam blockSize ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.ml.param.DoubleParam stepSize ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.DoubleParam tol ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.IntParam maxIter ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.LongParam seed ()  { throw new RuntimeException(); }
  public  java.lang.String uid ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.linalg.Vector weights ()  { throw new RuntimeException(); }
  // not preceding
     MultilayerPerceptronClassificationModel (java.lang.String uid, org.apache.spark.ml.linalg.Vector weights)  { throw new RuntimeException(); }
  // not preceding
  public  int numFeatures ()  { throw new RuntimeException(); }
  // not preceding
    org.apache.spark.ml.ann.TopologyModel mlpModel ()  { throw new RuntimeException(); }
  /**
   * Predict label for the given features.
   * This internal method is used to implement <code>transform()</code> and output {@link predictionCol}.
   * @param features (undocumented)
   * @return (undocumented)
   */
  public  double predict (org.apache.spark.ml.linalg.Vector features)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.classification.MultilayerPerceptronClassificationModel copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.util.MLWriter write ()  { throw new RuntimeException(); }
  protected  org.apache.spark.ml.linalg.Vector raw2probabilityInPlace (org.apache.spark.ml.linalg.Vector rawPrediction)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.linalg.Vector predictRaw (org.apache.spark.ml.linalg.Vector features)  { throw new RuntimeException(); }
  public  int numClasses ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
