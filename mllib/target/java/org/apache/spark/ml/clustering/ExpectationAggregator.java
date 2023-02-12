package org.apache.spark.ml.clustering;
/**
 * Add a new training instance to this ExpectationAggregator, update the weights,
 * means and covariances for each distributions, and update the log likelihood.
 * <p>
 * param:  instance The instance of data point to be added.
 * param:  weight The instance weight.
 * @return This ExpectationAggregator object.
 */
public  class ExpectationAggregator implements scala.Serializable {
  // not preceding
  public   ExpectationAggregator (int numFeatures, org.apache.spark.broadcast.Broadcast<double[]> bcWeights, org.apache.spark.broadcast.Broadcast<scala.Tuple2<org.apache.spark.ml.linalg.DenseVector, org.apache.spark.ml.linalg.DenseVector>[]> bcGaussians)  { throw new RuntimeException(); }
  /**
   * Add a new training instance to this ExpectationAggregator, update the weights,
   * means and covariances for each distributions, and update the log likelihood.
   * <p>
   * @param instance The instance of data point to be added.
   * @param weight The instance weight.
   * @return This ExpectationAggregator object.
   */
  public  org.apache.spark.ml.clustering.ExpectationAggregator add (org.apache.spark.ml.linalg.Vector instance, double weight)  { throw new RuntimeException(); }
  public  long count ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.linalg.DenseVector[] covs ()  { throw new RuntimeException(); }
  public  double logLikelihood ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.linalg.DenseVector[] means ()  { throw new RuntimeException(); }
  /**
   * Merge another ExpectationAggregator, update the weights, means and covariances
   * for each distributions, and update the log likelihood.
   * (Note that it's in place merging; as a result, <code>this</code> object will be modified.)
   * <p>
   * @param other The other ExpectationAggregator to be merged.
   * @return This ExpectationAggregator object.
   */
  public  org.apache.spark.ml.clustering.ExpectationAggregator merge (org.apache.spark.ml.clustering.ExpectationAggregator other)  { throw new RuntimeException(); }
  public  double[] weights ()  { throw new RuntimeException(); }
}
