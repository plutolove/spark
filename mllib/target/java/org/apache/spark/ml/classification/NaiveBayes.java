package org.apache.spark.ml.classification;
/**
 * Set the smoothing parameter.
 * Default is 1.0.
 * @group setParam
 */
public  class NaiveBayes extends org.apache.spark.ml.classification.ProbabilisticClassifier<org.apache.spark.ml.linalg.Vector, org.apache.spark.ml.classification.NaiveBayes, org.apache.spark.ml.classification.NaiveBayesModel> implements org.apache.spark.ml.classification.NaiveBayesParams, org.apache.spark.ml.util.DefaultParamsWritable {
  // not preceding
  static   java.lang.String Multinomial ()  { throw new RuntimeException(); }
  /** String name for Bernoulli model type. */
  static   java.lang.String Bernoulli ()  { throw new RuntimeException(); }
  /** String name for Gaussian model type. */
  static   java.lang.String Gaussian ()  { throw new RuntimeException(); }
  /** String name for Complement model type. */
  static   java.lang.String Complement ()  { throw new RuntimeException(); }
  static   scala.collection.immutable.Set<java.lang.String> supportedModelTypes ()  { throw new RuntimeException(); }
  static   void requireNonnegativeValues (org.apache.spark.ml.linalg.Vector v)  { throw new RuntimeException(); }
  static   void requireZeroOneBernoulliValues (org.apache.spark.ml.linalg.Vector v)  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.classification.NaiveBayes load (java.lang.String path)  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.util.MLReader<T> read ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.DoubleParam smoothing ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.Param<java.lang.String> modelType ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.Param<java.lang.String> weightCol ()  { throw new RuntimeException(); }
  public  java.lang.String uid ()  { throw new RuntimeException(); }
  // not preceding
  public   NaiveBayes (java.lang.String uid)  { throw new RuntimeException(); }
  // not preceding
  public   NaiveBayes ()  { throw new RuntimeException(); }
  /**
   * Set the smoothing parameter.
   * Default is 1.0.
   * @group setParam
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.classification.NaiveBayes setSmoothing (double value)  { throw new RuntimeException(); }
  /**
   * Set the model type using a string (case-sensitive).
   * Supported options: "multinomial", "complement", "bernoulli", and "gaussian".
   * Default is "multinomial"
   * @group setParam
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.classification.NaiveBayes setModelType (java.lang.String value)  { throw new RuntimeException(); }
  /**
   * Sets the value of param {@link weightCol}.
   * If this is not set or empty, we treat all instance weights as 1.0.
   * Default is not set, so all instances have weight one.
   * <p>
   * @group setParam
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.classification.NaiveBayes setWeightCol (java.lang.String value)  { throw new RuntimeException(); }
  protected  org.apache.spark.ml.classification.NaiveBayesModel train (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  /**
   * ml assumes input labels in range [0, numClasses). But this implementation
   * is also called by mllib NaiveBayes which allows other kinds of input labels
   * such as {-1, +1}. <code>positiveLabel</code> is used to determine whether the label
   * should be checked and it should be removed when we remove mllib NaiveBayes.
   * @param dataset (undocumented)
   * @param positiveLabel (undocumented)
   * @return (undocumented)
   */
    org.apache.spark.ml.classification.NaiveBayesModel trainWithLabelCheck (org.apache.spark.sql.Dataset<?> dataset, boolean positiveLabel)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.classification.NaiveBayes copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
}
