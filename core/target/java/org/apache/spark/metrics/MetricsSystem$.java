package org.apache.spark.metrics;
/**
 * Build a name that uniquely identifies each metric source.
 * The name is structured as follows: <app ID>.<executor ID (or "driver")>.<source name>.
 * If either ID is not available, this defaults to just using <source name>.
 * <p>
 * param:  source Metric source to be named by this method.
 * @return A unique metric name for each combination of
 *         application, executor/driver and metric source.
 */
// not preceding
public  class MetricsSystem$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final MetricsSystem$ MODULE$ = null;
  public   MetricsSystem$ ()  { throw new RuntimeException(); }
  // not preceding
  public  scala.util.matching.Regex SINK_REGEX ()  { throw new RuntimeException(); }
  public  scala.util.matching.Regex SOURCE_REGEX ()  { throw new RuntimeException(); }
  public  void checkMinimalPollingPeriod (java.util.concurrent.TimeUnit pollUnit, int pollPeriod)  { throw new RuntimeException(); }
  public  org.apache.spark.metrics.MetricsSystem createMetricsSystem (java.lang.String instance, org.apache.spark.SparkConf conf, org.apache.spark.SecurityManager securityMgr)  { throw new RuntimeException(); }
}
