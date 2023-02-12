package org.apache.spark.ml.regression;
/**
 * Add a new training data to this AFTAggregator, and update the loss and gradient
 * of the objective function.
 * <p>
 * param:  data The AFTPoint representation for one data point to be added into this aggregator.
 * @return This AFTAggregator object.
 */
public  class AFTAggregator implements scala.Serializable {
  // not preceding
  public   AFTAggregator (org.apache.spark.broadcast.Broadcast<breeze.linalg.DenseVector<java.lang.Object>> bcParameters, boolean fitIntercept, org.apache.spark.broadcast.Broadcast<double[]> bcFeaturesStd)  { throw new RuntimeException(); }
  /**
   * Add a new training data to this AFTAggregator, and update the loss and gradient
   * of the objective function.
   * <p>
   * @param data The AFTPoint representation for one data point to be added into this aggregator.
   * @return This AFTAggregator object.
   */
  public  org.apache.spark.ml.regression.AFTAggregator add (org.apache.spark.ml.regression.AFTPoint data)  { throw new RuntimeException(); }
  public  long count ()  { throw new RuntimeException(); }
  public  breeze.linalg.DenseVector<java.lang.Object> gradient ()  { throw new RuntimeException(); }
  public  double loss ()  { throw new RuntimeException(); }
  /**
   * Merge another AFTAggregator, and update the loss and gradient
   * of the objective function.
   * (Note that it's in place merging; as a result, <code>this</code> object will be modified.)
   * <p>
   * @param other The other AFTAggregator to be merged.
   * @return This AFTAggregator object.
   */
  public  org.apache.spark.ml.regression.AFTAggregator merge (org.apache.spark.ml.regression.AFTAggregator other)  { throw new RuntimeException(); }
}
