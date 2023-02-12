package org.apache.spark.ml.optim.aggregator;
/**
 * Add a new training instance to this LeastSquaresAggregator, and update the loss and gradient
 * of the objective function.
 * <p>
 * param:  instance The instance of data point to be added.
 * @return This LeastSquaresAggregator object.
 */
  class LeastSquaresAggregator implements org.apache.spark.ml.optim.aggregator.DifferentiableLossAggregator<org.apache.spark.ml.feature.Instance, org.apache.spark.ml.optim.aggregator.LeastSquaresAggregator> {
  // not preceding
  public   LeastSquaresAggregator (double labelStd, double labelMean, boolean fitIntercept, org.apache.spark.broadcast.Broadcast<double[]> bcFeaturesStd, org.apache.spark.broadcast.Broadcast<double[]> bcFeaturesMean, org.apache.spark.broadcast.Broadcast<org.apache.spark.ml.linalg.Vector> bcCoefficients)  { throw new RuntimeException(); }
  /**
   * Add a new training instance to this LeastSquaresAggregator, and update the loss and gradient
   * of the objective function.
   * <p>
   * @param instance The instance of data point to be added.
   * @return This LeastSquaresAggregator object.
   */
  public  org.apache.spark.ml.optim.aggregator.LeastSquaresAggregator add (org.apache.spark.ml.feature.Instance instance)  { throw new RuntimeException(); }
  protected  int dim ()  { throw new RuntimeException(); }
  // not preceding
  protected  double[] gradientSumArray ()  { throw new RuntimeException(); }
  // not preceding
  protected  double lossSum ()  { throw new RuntimeException(); }
  // not preceding
  protected  double weightSum ()  { throw new RuntimeException(); }
}
