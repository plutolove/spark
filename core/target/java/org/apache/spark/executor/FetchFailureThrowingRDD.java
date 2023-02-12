package org.apache.spark.executor;
/**
 * Helper for testing some cases where a FetchFailure should *not* get sent back, because it's
 * superseded by another error, either an OOM or intentionally killing a task.
 * param:  oom if true, throw an OOM after the FetchFailure; else, interrupt the task after the
 *            FetchFailure
 * param:  poll if true, poll executor metrics after launching task
 */
public  class FetchFailureThrowingRDD extends org.apache.spark.rdd.RDD<java.lang.Object> {
  // not preceding
  public   FetchFailureThrowingRDD (org.apache.spark.SparkContext sc)  { throw new RuntimeException(); }
  // not preceding
  public  scala.collection.Iterator<java.lang.Object> compute (org.apache.spark.Partition split, org.apache.spark.TaskContext context)  { throw new RuntimeException(); }
  protected  org.apache.spark.Partition[] getPartitions ()  { throw new RuntimeException(); }
}
