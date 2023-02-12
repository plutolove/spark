package org.apache.spark.ml.optim.aggregator;
/** Update gradient and loss using binary loss function. */
  class LogisticAggregator implements org.apache.spark.ml.optim.aggregator.DifferentiableLossAggregator<org.apache.spark.ml.feature.Instance, org.apache.spark.ml.optim.aggregator.LogisticAggregator>, org.apache.spark.internal.Logging {
  // not preceding
  public   LogisticAggregator (org.apache.spark.broadcast.Broadcast<double[]> bcFeaturesStd, int numClasses, boolean fitIntercept, boolean multinomial, org.apache.spark.broadcast.Broadcast<org.apache.spark.ml.linalg.Vector> bcCoefficients)  { throw new RuntimeException(); }
  /**
   * Add a new training instance to this LogisticAggregator, and update the loss and gradient
   * of the objective function.
   * <p>
   * @param instance The instance of data point to be added.
   * @return This LogisticAggregator object.
   */
  public  org.apache.spark.ml.optim.aggregator.LogisticAggregator add (org.apache.spark.ml.feature.Instance instance)  { throw new RuntimeException(); }
  protected  int dim ()  { throw new RuntimeException(); }
  // not preceding
  protected  double[] gradientSumArray ()  { throw new RuntimeException(); }
  // not preceding
  protected  double lossSum ()  { throw new RuntimeException(); }
  // not preceding
  protected  double weightSum ()  { throw new RuntimeException(); }
}
