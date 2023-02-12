package org.apache.spark.mllib.stat.test;
/**
 * Runs a KS test for 1 set of sample data, comparing it to a theoretical distribution
 * param:  data <code>RDD[Double]</code> data on which to run test
 * param:  cdf <code>Double =&gt; Double</code> function to calculate the theoretical CDF
 * @return {@link org.apache.spark.mllib.stat.test.KolmogorovSmirnovTestResult} summarizing the test
 *        results (p-value, statistic, and null hypothesis)
 */
// not preceding
public  class KolmogorovSmirnovTest {
  // not preceding
  // not preceding
  static public  class NullHypothesis$ extends scala.Enumeration {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final NullHypothesis$ MODULE$ = null;
    public   NullHypothesis$ ()  { throw new RuntimeException(); }
    public  scala.Enumeration.Value OneSampleTwoSided ()  { throw new RuntimeException(); }
  }
  /**
   * A convenience function that allows running the KS test for 1 set of sample data against
   * a named distribution
   * @param data the sample data that we wish to evaluate
   * @param distName the name of the theoretical distribution
   * @param params Variable length parameter for distribution's parameters
   * @return {@link org.apache.spark.mllib.stat.test.KolmogorovSmirnovTestResult} summarizing the
   *        test results (p-value, statistic, and null hypothesis)
   */
  static public  org.apache.spark.mllib.stat.test.KolmogorovSmirnovTestResult testOneSample (org.apache.spark.rdd.RDD<java.lang.Object> data, java.lang.String distName, double... params)  { throw new RuntimeException(); }
  // not preceding
  static public  org.apache.spark.mllib.stat.test.KolmogorovSmirnovTestResult testOneSample (org.apache.spark.rdd.RDD<java.lang.Object> data, scala.Function1<java.lang.Object, java.lang.Object> cdf)  { throw new RuntimeException(); }
  /**
   * Runs a KS test for 1 set of sample data, comparing it to a theoretical distribution
   * @param data <code>RDD[Double]</code> data on which to run test
   * @param distObj <code>RealDistribution</code> a theoretical distribution
   * @return {@link org.apache.spark.mllib.stat.test.KolmogorovSmirnovTestResult} summarizing the test
   *        results (p-value, statistic, and null hypothesis)
   */
  static public  org.apache.spark.mllib.stat.test.KolmogorovSmirnovTestResult testOneSample (org.apache.spark.rdd.RDD<java.lang.Object> data, org.apache.commons.math3.distribution.RealDistribution distObj)  { throw new RuntimeException(); }
  /**
   * A convenience function that allows running the KS test for 1 set of sample data against
   * a named distribution
   * @param data the sample data that we wish to evaluate
   * @param distName the name of the theoretical distribution
   * @param params Variable length parameter for distribution's parameters
   * @return {@link org.apache.spark.mllib.stat.test.KolmogorovSmirnovTestResult} summarizing the
   *        test results (p-value, statistic, and null hypothesis)
   */
  static public  org.apache.spark.mllib.stat.test.KolmogorovSmirnovTestResult testOneSample (org.apache.spark.rdd.RDD<java.lang.Object> data, java.lang.String distName, scala.collection.Seq<java.lang.Object> params)  { throw new RuntimeException(); }
  static public  org.slf4j.Logger org$apache$spark$internal$Logging$$log_ ()  { throw new RuntimeException(); }
  static public  void org$apache$spark$internal$Logging$$log__$eq (org.slf4j.Logger x$1)  { throw new RuntimeException(); }
  static protected  java.lang.String logName ()  { throw new RuntimeException(); }
  static protected  org.slf4j.Logger log ()  { throw new RuntimeException(); }
  static protected  void logInfo (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logDebug (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logTrace (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logWarning (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logError (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logInfo (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logDebug (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logTrace (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logWarning (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logError (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  boolean isTraceEnabled ()  { throw new RuntimeException(); }
  static protected  void initializeLogIfNecessary (boolean isInterpreter)  { throw new RuntimeException(); }
  static protected  boolean initializeLogIfNecessary (boolean isInterpreter, boolean silent)  { throw new RuntimeException(); }
  static protected  boolean initializeLogIfNecessary$default$2 ()  { throw new RuntimeException(); }
  static   void initializeForcefully (boolean isInterpreter, boolean silent)  { throw new RuntimeException(); }
}
