package org.apache.spark.ml.stat;
/** Used to construct output schema of test */
// not preceding
public  class KolmogorovSmirnovTest {
  // not preceding
  static public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> test (org.apache.spark.sql.Dataset<?> dataset, java.lang.String sampleCol, java.lang.String distName, double... params)  { throw new RuntimeException(); }
  /**
   * Conduct the two-sided Kolmogorov-Smirnov (KS) test for data sampled from a
   * continuous distribution. By comparing the largest difference between the empirical cumulative
   * distribution of the sample data and the theoretical distribution we can provide a test for the
   * the null hypothesis that the sample data comes from that theoretical distribution.
   * <p>
   * @param dataset A <code>Dataset</code> or a <code>DataFrame</code> containing the sample of data to test
   * @param sampleCol Name of sample column in dataset, of any numerical type
   * @param cdf a <code>Double =&gt; Double</code> function to calculate the theoretical CDF at a given value
   * @return DataFrame containing the test result for the input sampled data.
   *         This DataFrame will contain a single Row with the following fields:
   *          - <code>pValue: Double</code>
   *          - <code>statistic: Double</code>
   */
  static public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> test (org.apache.spark.sql.Dataset<?> dataset, java.lang.String sampleCol, scala.Function1<java.lang.Object, java.lang.Object> cdf)  { throw new RuntimeException(); }
  /**
   * Java-friendly version of <code>test(dataset: DataFrame, sampleCol: String, cdf: Double =&gt; Double)</code>
   * @param dataset (undocumented)
   * @param sampleCol (undocumented)
   * @param cdf (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> test (org.apache.spark.sql.Dataset<?> dataset, java.lang.String sampleCol, org.apache.spark.api.java.function.Function<java.lang.Double, java.lang.Double> cdf)  { throw new RuntimeException(); }
  /**
   * Convenience function to conduct a one-sample, two-sided Kolmogorov-Smirnov test for probability
   * distribution equality. Currently supports the normal distribution, taking as parameters
   * the mean and standard deviation.
   * <p>
   * @param dataset A <code>Dataset</code> or a <code>DataFrame</code> containing the sample of data to test
   * @param sampleCol Name of sample column in dataset, of any numerical type
   * @param distName a <code>String</code> name for a theoretical distribution, currently only support "norm".
   * @param params <code>Double*</code> specifying the parameters to be used for the theoretical distribution.
   *              For "norm" distribution, the parameters includes mean and variance.
   * @return DataFrame containing the test result for the input sampled data.
   *         This DataFrame will contain a single Row with the following fields:
   *          - <code>pValue: Double</code>
   *          - <code>statistic: Double</code>
   */
  static public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> test (org.apache.spark.sql.Dataset<?> dataset, java.lang.String sampleCol, java.lang.String distName, scala.collection.Seq<java.lang.Object> params)  { throw new RuntimeException(); }
}
