package org.apache.spark.scheduler;
/**
 * This backend just always fails if the task is executed on a bad host, but otherwise succeeds
 * all tasks.
 */
public  class MultiExecutorMockBackend extends org.apache.spark.scheduler.MockBackend {
  // not preceding
  public   MultiExecutorMockBackend (org.apache.spark.SparkConf conf, org.apache.spark.scheduler.TaskSchedulerImpl taskScheduler)  { throw new RuntimeException(); }
  public  int defaultParallelism ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, org.apache.spark.scheduler.ExecutorTaskStatus> executorIdToExecutor ()  { throw new RuntimeException(); }
  public  int nCoresPerExecutor ()  { throw new RuntimeException(); }
  public  int nExecutorsPerHost ()  { throw new RuntimeException(); }
  // not preceding
  public  int nHosts ()  { throw new RuntimeException(); }
}
