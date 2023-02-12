package org.apache.spark.mllib.tree;
/**
 * param:  boostingStrategy Parameters for the gradient boosting algorithm.
 */
public  class GradientBoostedTrees implements scala.Serializable, org.apache.spark.internal.Logging {
  // not preceding
  static public  org.apache.spark.mllib.tree.model.GradientBoostedTreesModel train (org.apache.spark.rdd.RDD<org.apache.spark.mllib.regression.LabeledPoint> input, org.apache.spark.mllib.tree.configuration.BoostingStrategy boostingStrategy)  { throw new RuntimeException(); }
  /**
   * Java-friendly API for <code>org.apache.spark.mllib.tree.GradientBoostedTrees.train</code>
   * @param input (undocumented)
   * @param boostingStrategy (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.mllib.tree.model.GradientBoostedTreesModel train (org.apache.spark.api.java.JavaRDD<org.apache.spark.mllib.regression.LabeledPoint> input, org.apache.spark.mllib.tree.configuration.BoostingStrategy boostingStrategy)  { throw new RuntimeException(); }
  static public  org.slf4j.Logger org$apache$spark$internal$Logging$$log_ ()  { throw new RuntimeException(); }
  static public  void org$apache$spark$internal$Logging$$log__$eq (org.slf4j.Logger x$1)  { throw new RuntimeException(); }
  static protected  java.lang.String logName ()  { throw new RuntimeException(); }
  static protected  org.slf4j.Logger log ()  { throw new RuntimeException(); }
  static protected  void logInfo (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logDebug (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logTrace (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logWarning (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logError (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logInfo (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logDebug (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logTrace (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logWarning (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logError (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  boolean isTraceEnabled ()  { throw new RuntimeException(); }
  static protected  void initializeLogIfNecessary (boolean isInterpreter)  { throw new RuntimeException(); }
  static protected  boolean initializeLogIfNecessary (boolean isInterpreter, boolean silent)  { throw new RuntimeException(); }
  static protected  boolean initializeLogIfNecessary$default$2 ()  { throw new RuntimeException(); }
  static   void initializeForcefully (boolean isInterpreter, boolean silent)  { throw new RuntimeException(); }
  // not preceding
     GradientBoostedTrees (org.apache.spark.mllib.tree.configuration.BoostingStrategy boostingStrategy, int seed)  { throw new RuntimeException(); }
  // not preceding
  public   GradientBoostedTrees (org.apache.spark.mllib.tree.configuration.BoostingStrategy boostingStrategy)  { throw new RuntimeException(); }
  /**
   * Method to train a gradient boosting model
   * <p>
   * @param input Training dataset: RDD of {@link org.apache.spark.mllib.regression.LabeledPoint}.
   * @return GradientBoostedTreesModel that can be used for prediction.
   */
  public  org.apache.spark.mllib.tree.model.GradientBoostedTreesModel run (org.apache.spark.rdd.RDD<org.apache.spark.mllib.regression.LabeledPoint> input)  { throw new RuntimeException(); }
  /**
   * Java-friendly API for <code>org.apache.spark.mllib.tree.GradientBoostedTrees.run</code>.
   * @param input (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.tree.model.GradientBoostedTreesModel run (org.apache.spark.api.java.JavaRDD<org.apache.spark.mllib.regression.LabeledPoint> input)  { throw new RuntimeException(); }
  /**
   * Method to validate a gradient boosting model
   * <p>
   * @param input Training dataset: RDD of {@link org.apache.spark.mllib.regression.LabeledPoint}.
   * @param validationInput Validation dataset.
   *                        This dataset should be different from the training dataset,
   *                        but it should follow the same distribution.
   *                        E.g., these two datasets could be created from an original dataset
   *                        by using <code>org.apache.spark.rdd.RDD.randomSplit()</code>
   * @return GradientBoostedTreesModel that can be used for prediction.
   */
  public  org.apache.spark.mllib.tree.model.GradientBoostedTreesModel runWithValidation (org.apache.spark.rdd.RDD<org.apache.spark.mllib.regression.LabeledPoint> input, org.apache.spark.rdd.RDD<org.apache.spark.mllib.regression.LabeledPoint> validationInput)  { throw new RuntimeException(); }
  /**
   * Java-friendly API for <code>org.apache.spark.mllib.tree.GradientBoostedTrees.runWithValidation</code>.
   * @param input (undocumented)
   * @param validationInput (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.tree.model.GradientBoostedTreesModel runWithValidation (org.apache.spark.api.java.JavaRDD<org.apache.spark.mllib.regression.LabeledPoint> input, org.apache.spark.api.java.JavaRDD<org.apache.spark.mllib.regression.LabeledPoint> validationInput)  { throw new RuntimeException(); }
}
