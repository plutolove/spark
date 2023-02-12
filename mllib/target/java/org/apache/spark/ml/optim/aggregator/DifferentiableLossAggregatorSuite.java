package org.apache.spark.ml.optim.aggregator;
public  class DifferentiableLossAggregatorSuite extends org.apache.spark.SparkFunSuite {
  // not preceding
  static public  class TestAggregator implements org.apache.spark.ml.optim.aggregator.DifferentiableLossAggregator<org.apache.spark.ml.feature.Instance, org.apache.spark.ml.optim.aggregator.DifferentiableLossAggregatorSuite.TestAggregator> {
    // not preceding
    public   TestAggregator (int numFeatures, org.apache.spark.ml.linalg.Vector coefficients)  { throw new RuntimeException(); }
    public  org.apache.spark.ml.optim.aggregator.DifferentiableLossAggregatorSuite.TestAggregator add (org.apache.spark.ml.feature.Instance instance)  { throw new RuntimeException(); }
    // not preceding
    protected  int dim ()  { throw new RuntimeException(); }
    // not preceding
    protected  double[] gradientSumArray ()  { throw new RuntimeException(); }
    // not preceding
    protected  double lossSum ()  { throw new RuntimeException(); }
    // not preceding
    protected  double weightSum ()  { throw new RuntimeException(); }
  }
  // not preceding
  static   scala.Tuple2<org.apache.spark.mllib.stat.MultivariateOnlineSummarizer, org.apache.spark.mllib.stat.MultivariateOnlineSummarizer> getRegressionSummarizers (org.apache.spark.ml.feature.Instance[] instances)  { throw new RuntimeException(); }
  /** Get feature and label summarizers for provided data. */
  static   scala.Tuple2<org.apache.spark.mllib.stat.MultivariateOnlineSummarizer, org.apache.spark.ml.classification.MultiClassSummarizer> getClassificationSummarizers (org.apache.spark.ml.feature.Instance[] instances)  { throw new RuntimeException(); }
  // not preceding
  public   DifferentiableLossAggregatorSuite ()  { throw new RuntimeException(); }
}
