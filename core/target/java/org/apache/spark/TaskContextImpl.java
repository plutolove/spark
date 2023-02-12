package org.apache.spark;
/** List of callback functions to execute when the task completes. */
  class TaskContextImpl extends org.apache.spark.TaskContext implements org.apache.spark.internal.Logging {
  public  int stageId ()  { throw new RuntimeException(); }
  public  int stageAttemptNumber ()  { throw new RuntimeException(); }
  public  int partitionId ()  { throw new RuntimeException(); }
  public  long taskAttemptId ()  { throw new RuntimeException(); }
  public  int attemptNumber ()  { throw new RuntimeException(); }
  public  org.apache.spark.memory.TaskMemoryManager taskMemoryManager ()  { throw new RuntimeException(); }
  public  org.apache.spark.executor.TaskMetrics taskMetrics ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, org.apache.spark.resource.ResourceInformation> resources ()  { throw new RuntimeException(); }
  // not preceding
  public   TaskContextImpl (int stageId, int stageAttemptNumber, int partitionId, long taskAttemptId, int attemptNumber, org.apache.spark.memory.TaskMemoryManager taskMemoryManager, java.util.Properties localProperties, org.apache.spark.metrics.MetricsSystem metricsSystem, org.apache.spark.executor.TaskMetrics taskMetrics, scala.collection.immutable.Map<java.lang.String, org.apache.spark.resource.ResourceInformation> resources)  { throw new RuntimeException(); }
  public  org.apache.spark.TaskContextImpl addTaskCompletionListener (org.apache.spark.util.TaskCompletionListener listener)  { throw new RuntimeException(); }
  public  org.apache.spark.TaskContextImpl addTaskFailureListener (org.apache.spark.util.TaskFailureListener listener)  { throw new RuntimeException(); }
  public  java.util.Map<java.lang.String, org.apache.spark.resource.ResourceInformation> resourcesJMap ()  { throw new RuntimeException(); }
    void markTaskFailed (java.lang.Throwable error)  { throw new RuntimeException(); }
    void markTaskCompleted (scala.Option<java.lang.Throwable> error)  { throw new RuntimeException(); }
    void markInterrupted (java.lang.String reason)  { throw new RuntimeException(); }
    void killTaskIfInterrupted ()  { throw new RuntimeException(); }
    scala.Option<java.lang.String> getKillReason ()  { throw new RuntimeException(); }
  public  boolean isCompleted ()  { throw new RuntimeException(); }
  public  boolean isInterrupted ()  { throw new RuntimeException(); }
  public  java.lang.String getLocalProperty (java.lang.String key)  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.metrics.source.Source> getMetricsSources (java.lang.String sourceName)  { throw new RuntimeException(); }
    void registerAccumulator (org.apache.spark.util.AccumulatorV2<?, ?> a)  { throw new RuntimeException(); }
    void setFetchFailed (org.apache.spark.shuffle.FetchFailedException fetchFailed)  { throw new RuntimeException(); }
    scala.Option<org.apache.spark.shuffle.FetchFailedException> fetchFailed ()  { throw new RuntimeException(); }
    java.util.Properties getLocalProperties ()  { throw new RuntimeException(); }
}
