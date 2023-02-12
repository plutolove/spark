package org.apache.spark.mllib.regression;
/**
 * Construct a StreamingLinearRegression object with default parameters:
 * {stepSize: 0.1, numIterations: 50, miniBatchFraction: 1.0}.
 * Initial weights must be set before using trainOn or predictOn
 * (see <code>StreamingLinearAlgorithm</code>)
 */
public  class StreamingLinearRegressionWithSGD extends org.apache.spark.mllib.regression.StreamingLinearAlgorithm<org.apache.spark.mllib.regression.LinearRegressionModel, org.apache.spark.mllib.regression.LinearRegressionWithSGD> implements scala.Serializable {
  // not preceding
     StreamingLinearRegressionWithSGD (double stepSize, int numIterations, double regParam, double miniBatchFraction)  { throw new RuntimeException(); }
  // not preceding
  public   StreamingLinearRegressionWithSGD ()  { throw new RuntimeException(); }
  public  org.apache.spark.mllib.regression.LinearRegressionWithSGD algorithm ()  { throw new RuntimeException(); }
  protected  scala.Option<org.apache.spark.mllib.regression.LinearRegressionModel> model ()  { throw new RuntimeException(); }
  /**
   * Set the convergence tolerance. Default: 0.001.
   * @param tolerance (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.regression.StreamingLinearRegressionWithSGD setConvergenceTol (double tolerance)  { throw new RuntimeException(); }
  /**
   * Set the initial weights.
   * @param initialWeights (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.regression.StreamingLinearRegressionWithSGD setInitialWeights (org.apache.spark.mllib.linalg.Vector initialWeights)  { throw new RuntimeException(); }
  /**
   * Set the fraction of each batch to use for updates. Default: 1.0.
   * @param miniBatchFraction (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.regression.StreamingLinearRegressionWithSGD setMiniBatchFraction (double miniBatchFraction)  { throw new RuntimeException(); }
  /**
   * Set the number of iterations of gradient descent to run per update. Default: 50.
   * @param numIterations (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.regression.StreamingLinearRegressionWithSGD setNumIterations (int numIterations)  { throw new RuntimeException(); }
  /**
   * Set the regularization parameter. Default: 0.0.
   * @param regParam (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.regression.StreamingLinearRegressionWithSGD setRegParam (double regParam)  { throw new RuntimeException(); }
  /**
   * Set the step size for gradient descent. Default: 0.1.
   * @param stepSize (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.regression.StreamingLinearRegressionWithSGD setStepSize (double stepSize)  { throw new RuntimeException(); }
}
