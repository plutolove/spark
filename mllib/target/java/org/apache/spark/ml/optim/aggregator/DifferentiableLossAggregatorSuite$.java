package org.apache.spark.ml.optim.aggregator;
/**
 * Dummy aggregator that represents least squares cost with no intercept.
 */
// not preceding
public  class DifferentiableLossAggregatorSuite$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final DifferentiableLossAggregatorSuite$ MODULE$ = null;
  public   DifferentiableLossAggregatorSuite$ ()  { throw new RuntimeException(); }
  // not preceding
    scala.Tuple2<org.apache.spark.mllib.stat.MultivariateOnlineSummarizer, org.apache.spark.mllib.stat.MultivariateOnlineSummarizer> getRegressionSummarizers (org.apache.spark.ml.feature.Instance[] instances)  { throw new RuntimeException(); }
  /** Get feature and label summarizers for provided data. */
    scala.Tuple2<org.apache.spark.mllib.stat.MultivariateOnlineSummarizer, org.apache.spark.ml.classification.MultiClassSummarizer> getClassificationSummarizers (org.apache.spark.ml.feature.Instance[] instances)  { throw new RuntimeException(); }
}
