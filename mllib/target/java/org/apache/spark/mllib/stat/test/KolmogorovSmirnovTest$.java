package org.apache.spark.mllib.stat.test;
/**
 * Runs a KS test for 1 set of sample data, comparing it to a theoretical distribution
 * param:  data <code>RDD[Double]</code> data on which to run test
 * param:  cdf <code>Double =&gt; Double</code> function to calculate the theoretical CDF
 * @return {@link org.apache.spark.mllib.stat.test.KolmogorovSmirnovTestResult} summarizing the test
 *        results (p-value, statistic, and null hypothesis)
 */
// not preceding
public  class KolmogorovSmirnovTest$ implements org.apache.spark.internal.Logging {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final KolmogorovSmirnovTest$ MODULE$ = null;
  /**
   * A convenience function that allows running the KS test for 1 set of sample data against
   * a named distribution
   * @param data the sample data that we wish to evaluate
   * @param distName the name of the theoretical distribution
   * @param params Variable length parameter for distribution's parameters
   * @return {@link org.apache.spark.mllib.stat.test.KolmogorovSmirnovTestResult} summarizing the
   *        test results (p-value, statistic, and null hypothesis)
   */
  public  org.apache.spark.mllib.stat.test.KolmogorovSmirnovTestResult testOneSample (org.apache.spark.rdd.RDD<java.lang.Object> data, java.lang.String distName, double... params)  { throw new RuntimeException(); }
  public   KolmogorovSmirnovTest$ ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.mllib.stat.test.KolmogorovSmirnovTestResult testOneSample (org.apache.spark.rdd.RDD<java.lang.Object> data, scala.Function1<java.lang.Object, java.lang.Object> cdf)  { throw new RuntimeException(); }
  /**
   * Runs a KS test for 1 set of sample data, comparing it to a theoretical distribution
   * @param data <code>RDD[Double]</code> data on which to run test
   * @param distObj <code>RealDistribution</code> a theoretical distribution
   * @return {@link org.apache.spark.mllib.stat.test.KolmogorovSmirnovTestResult} summarizing the test
   *        results (p-value, statistic, and null hypothesis)
   */
  public  org.apache.spark.mllib.stat.test.KolmogorovSmirnovTestResult testOneSample (org.apache.spark.rdd.RDD<java.lang.Object> data, org.apache.commons.math3.distribution.RealDistribution distObj)  { throw new RuntimeException(); }
  /**
   * A convenience function that allows running the KS test for 1 set of sample data against
   * a named distribution
   * @param data the sample data that we wish to evaluate
   * @param distName the name of the theoretical distribution
   * @param params Variable length parameter for distribution's parameters
   * @return {@link org.apache.spark.mllib.stat.test.KolmogorovSmirnovTestResult} summarizing the
   *        test results (p-value, statistic, and null hypothesis)
   */
  public  org.apache.spark.mllib.stat.test.KolmogorovSmirnovTestResult testOneSample (org.apache.spark.rdd.RDD<java.lang.Object> data, java.lang.String distName, scala.collection.Seq<java.lang.Object> params)  { throw new RuntimeException(); }
}
