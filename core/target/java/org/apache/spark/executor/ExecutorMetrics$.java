package org.apache.spark.executor;
/**
 * Get the current executor metrics. These are returned as an array, with the index
 * determined by ExecutorMetricType.metricToOffset.
 * <p>
 * param:  memoryManager the memory manager for execution and storage memory
 * @return the values of the metrics
 */
// not preceding
public  class ExecutorMetrics$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final ExecutorMetrics$ MODULE$ = null;
  public   ExecutorMetrics$ ()  { throw new RuntimeException(); }
  // not preceding
  public  long[] getCurrentMetrics (org.apache.spark.memory.MemoryManager memoryManager)  { throw new RuntimeException(); }
}
