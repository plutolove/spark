package org.apache.spark.metrics;
/**
 * Executor metric types for executor-level metrics stored in ExecutorMetrics.
 */
public  interface ExecutorMetricType {
  // not preceding
    long[] getMetricValues (org.apache.spark.memory.MemoryManager memoryManager)  ;
    scala.collection.Seq<java.lang.String> names ()  ;
}
