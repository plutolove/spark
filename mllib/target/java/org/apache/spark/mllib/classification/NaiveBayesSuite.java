package org.apache.spark.mllib.classification;
/**
 * param:  model Multinomial Naive Bayes model
 * param:  testData input to compute posterior probabilities for
 * @return posterior class probabilities (in order of labels) for input
 */
public  class NaiveBayesSuite extends org.apache.spark.SparkFunSuite implements org.apache.spark.mllib.util.MLlibTestSparkContext {
  static public  scala.collection.Seq<org.apache.spark.mllib.regression.LabeledPoint> generateNaiveBayesInput (double[] pi, double[][] theta, int nPoints, int seed, java.lang.String modelType, int sample)  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.SparkSession spark ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.SparkContext sc ()  { throw new RuntimeException(); }
  // not preceding
  public  java.lang.String checkpointDir ()  { throw new RuntimeException(); }
  public  org.apache.spark.mllib.util.MLlibTestSparkContext.testImplicits$ testImplicits ()  { throw new RuntimeException(); }
  // not preceding
  public   NaiveBayesSuite ()  { throw new RuntimeException(); }
  // not preceding
  public  void validatePrediction (scala.collection.Seq<java.lang.Object> predictions, scala.collection.Seq<org.apache.spark.mllib.regression.LabeledPoint> input)  { throw new RuntimeException(); }
  public  void validateModelFit (double[] piData, double[][] thetaData, org.apache.spark.mllib.classification.NaiveBayesModel model)  { throw new RuntimeException(); }
}
