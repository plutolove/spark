package org.apache.spark.metrics;
/**
 * Get any UI handlers used by this metrics system; can only be called after start().
 */
  class MetricsSystem implements org.apache.spark.internal.Logging {
  // not preceding
  static public  scala.util.matching.Regex SINK_REGEX ()  { throw new RuntimeException(); }
  static public  scala.util.matching.Regex SOURCE_REGEX ()  { throw new RuntimeException(); }
  static public  void checkMinimalPollingPeriod (java.util.concurrent.TimeUnit pollUnit, int pollPeriod)  { throw new RuntimeException(); }
  static public  org.apache.spark.metrics.MetricsSystem createMetricsSystem (java.lang.String instance, org.apache.spark.SparkConf conf, org.apache.spark.SecurityManager securityMgr)  { throw new RuntimeException(); }
  public  java.lang.String instance ()  { throw new RuntimeException(); }
  /**
   * Get any UI handlers used by this metrics system; can only be called after start().
   * @return (undocumented)
   */
  public  org.eclipse.jetty.servlet.ServletContextHandler[] getServletHandlers ()  { throw new RuntimeException(); }
  public  void start (boolean registerStaticSources)  { throw new RuntimeException(); }
  public  void stop ()  { throw new RuntimeException(); }
  public  void report ()  { throw new RuntimeException(); }
  /**
   * Build a name that uniquely identifies each metric source.
   * The name is structured as follows: <app ID>.<executor ID (or "driver")>.<source name>.
   * If either ID is not available, this defaults to just using <source name>.
   * <p>
   * @param source Metric source to be named by this method.
   * @return A unique metric name for each combination of
   *         application, executor/driver and metric source.
   */
    java.lang.String buildRegistryName (org.apache.spark.metrics.source.Source source)  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.metrics.source.Source> getSourcesByName (java.lang.String sourceName)  { throw new RuntimeException(); }
  public  void registerSource (org.apache.spark.metrics.source.Source source)  { throw new RuntimeException(); }
  public  void removeSource (org.apache.spark.metrics.source.Source source)  { throw new RuntimeException(); }
}
