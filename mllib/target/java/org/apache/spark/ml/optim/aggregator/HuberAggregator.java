package org.apache.spark.ml.optim.aggregator;
/**
 * Add a new training instance to this HuberAggregator, and update the loss and gradient
 * of the objective function.
 * <p>
 * param:  instance The instance of data point to be added.
 * @return This HuberAggregator object.
 */
  class HuberAggregator implements org.apache.spark.ml.optim.aggregator.DifferentiableLossAggregator<org.apache.spark.ml.feature.Instance, org.apache.spark.ml.optim.aggregator.HuberAggregator> {
  // not preceding
  public   HuberAggregator (boolean fitIntercept, double epsilon, org.apache.spark.broadcast.Broadcast<double[]> bcFeaturesStd, org.apache.spark.broadcast.Broadcast<org.apache.spark.ml.linalg.Vector> bcParameters)  { throw new RuntimeException(); }
  /**
   * Add a new training instance to this HuberAggregator, and update the loss and gradient
   * of the objective function.
   * <p>
   * @param instance The instance of data point to be added.
   * @return This HuberAggregator object.
   */
  public  org.apache.spark.ml.optim.aggregator.HuberAggregator add (org.apache.spark.ml.feature.Instance instance)  { throw new RuntimeException(); }
  // not preceding
  protected  int dim ()  { throw new RuntimeException(); }
  // not preceding
  protected  double[] gradientSumArray ()  { throw new RuntimeException(); }
  // not preceding
  protected  double lossSum ()  { throw new RuntimeException(); }
  // not preceding
  protected  double weightSum ()  { throw new RuntimeException(); }
}
