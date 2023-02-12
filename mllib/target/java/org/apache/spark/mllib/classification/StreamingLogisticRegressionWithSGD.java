package org.apache.spark.mllib.classification;
/**
 * Construct a StreamingLogisticRegression object with default parameters:
 * {stepSize: 0.1, numIterations: 50, miniBatchFraction: 1.0, regParam: 0.0}.
 * Initial weights must be set before using trainOn or predictOn
 * (see <code>StreamingLinearAlgorithm</code>)
 */
public  class StreamingLogisticRegressionWithSGD extends org.apache.spark.mllib.regression.StreamingLinearAlgorithm<org.apache.spark.mllib.classification.LogisticRegressionModel, org.apache.spark.mllib.classification.LogisticRegressionWithSGD> implements scala.Serializable {
  // not preceding
     StreamingLogisticRegressionWithSGD (double stepSize, int numIterations, double miniBatchFraction, double regParam)  { throw new RuntimeException(); }
  // not preceding
  public   StreamingLogisticRegressionWithSGD ()  { throw new RuntimeException(); }
  protected  org.apache.spark.mllib.classification.LogisticRegressionWithSGD algorithm ()  { throw new RuntimeException(); }
  protected  scala.Option<org.apache.spark.mllib.classification.LogisticRegressionModel> model ()  { throw new RuntimeException(); }
  /** Set the initial weights. Default: [0.0, 0.0]. */
  public  org.apache.spark.mllib.classification.StreamingLogisticRegressionWithSGD setInitialWeights (org.apache.spark.mllib.linalg.Vector initialWeights)  { throw new RuntimeException(); }
  /** Set the fraction of each batch to use for updates. Default: 1.0. */
  public  org.apache.spark.mllib.classification.StreamingLogisticRegressionWithSGD setMiniBatchFraction (double miniBatchFraction)  { throw new RuntimeException(); }
  /** Set the number of iterations of gradient descent to run per update. Default: 50. */
  public  org.apache.spark.mllib.classification.StreamingLogisticRegressionWithSGD setNumIterations (int numIterations)  { throw new RuntimeException(); }
  /** Set the regularization parameter. Default: 0.0. */
  public  org.apache.spark.mllib.classification.StreamingLogisticRegressionWithSGD setRegParam (double regParam)  { throw new RuntimeException(); }
  /** Set the step size for gradient descent. Default: 0.1. */
  public  org.apache.spark.mllib.classification.StreamingLogisticRegressionWithSGD setStepSize (double stepSize)  { throw new RuntimeException(); }
}
