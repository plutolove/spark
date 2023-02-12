package org.apache.spark.internal;
/**
 * If sparkShellThresholdLevel is not defined, this filter is a no-op.
 * If log level of event is not equal to root level, the event is allowed. Otherwise,
 * the decision is made based on whether the log came from root or some custom configuration
 * param:  loggingEvent
 * @return decision for accept/deny log event
 */
public  class SparkShellLoggingFilter extends org.apache.log4j.spi.Filter {
  // not preceding
  public   SparkShellLoggingFilter ()  { throw new RuntimeException(); }
  // not preceding
  public  int decide (org.apache.log4j.spi.LoggingEvent loggingEvent)  { throw new RuntimeException(); }
}
