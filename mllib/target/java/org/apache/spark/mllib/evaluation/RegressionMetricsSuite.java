package org.apache.spark.mllib.evaluation;
/**
 * The following values are hand calculated using the formula:
 * {@link https://en.wikipedia.org/wiki/Weighted_arithmetic_mean#Reliability_weights}
 * preds = c(2.25, -0.25, 1.75, 7.75)
 * obs = c(3.0, -0.5, 2.0, 7.0)
 * weights = c(0.1, 0.2, 0.15, 0.05)
 * count = 4
 * <p>
 * Weighted metrics can be calculated with MultivariateStatisticalSummary.
 *             (observations, observations - predictions)
 * mean        (1.7, 0.05)
 * variance    (7.3, 0.3)
 * numNonZeros (0.5, 0.5)
 * max         (7.0, 0.75)
 * min         (-0.5, -0.75)
 * normL2      (2.0, 0.32596)
 * normL1      (1.05, 0.2)
 * <p>
 * explainedVariance: sum(pow((preds - 1.7),2)*weight) / weightedCount = 5.2425
 * meanAbsoluteError: normL1(1) / weightedCount = 0.4
 * meanSquaredError: pow(normL2(1),2) / weightedCount = 0.2125
 * rootMeanSquaredError: sqrt(meanSquaredError) = 0.46098
 * r2: 1 - pow(normL2(1),2) / (variance(0) * (weightedCount - 1)) = 1.02910
 */
public  class RegressionMetricsSuite extends org.apache.spark.SparkFunSuite implements org.apache.spark.mllib.util.MLlibTestSparkContext {
  // not preceding
  public   RegressionMetricsSuite ()  { throw new RuntimeException(); }
  // not preceding
  public  java.lang.String checkpointDir ()  { throw new RuntimeException(); }
  public  double eps ()  { throw new RuntimeException(); }
  // not preceding
  public  scala.collection.immutable.List<java.lang.Object> obs ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.SparkContext sc ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.SparkSession spark ()  { throw new RuntimeException(); }
  public  org.apache.spark.mllib.util.MLlibTestSparkContext.testImplicits$ testImplicits ()  { throw new RuntimeException(); }
}
