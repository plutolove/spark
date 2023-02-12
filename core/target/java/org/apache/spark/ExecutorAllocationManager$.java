package org.apache.spark;
/**
 * Metric source for ExecutorAllocationManager to expose its internal executor allocation
 * status to MetricsSystem.
 * Note: These metrics heavily rely on the internal implementation of
 * ExecutorAllocationManager, metrics or value of metrics will be changed when internal
 * implementation is changed, so these metrics are not stable across Spark version.
 */
// not preceding
public  class ExecutorAllocationManager$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final ExecutorAllocationManager$ MODULE$ = null;
  public   ExecutorAllocationManager$ ()  { throw new RuntimeException(); }
  /**
   * Metric source for ExecutorAllocationManager to expose its internal executor allocation
   * status to MetricsSystem.
   * Note: These metrics heavily rely on the internal implementation of
   * ExecutorAllocationManager, metrics or value of metrics will be changed when internal
   * implementation is changed, so these metrics are not stable across Spark version.
   * @return (undocumented)
   */
  public  long NOT_SET ()  { throw new RuntimeException(); }
}
