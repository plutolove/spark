package org.apache.spark.executor;
/**
 * Function to poll executor metrics.
 * On start, if pollingInterval is positive, this is scheduled to run at that interval.
 * Otherwise, this is called by the reportHeartBeat function defined in Executor and passed
 * to its Heartbeater.
 */
  class ExecutorMetricsPoller implements org.apache.spark.internal.Logging {
  // not preceding
  public   ExecutorMetricsPoller (org.apache.spark.memory.MemoryManager memoryManager, long pollingInterval, scala.Option<org.apache.spark.executor.ExecutorMetricsSource> executorMetricsSource)  { throw new RuntimeException(); }
  /**
   * Called by the reportHeartBeat function defined in Executor and passed to its Heartbeater.
   * It resets the metric peaks in stageTCMP before returning the executor updates.
   * Thus, the executor updates contains the per-stage metric peaks since the last heartbeat
   * (the last time this method was called).
   * @return (undocumented)
   */
  public  scala.collection.mutable.HashMap<scala.Tuple2<java.lang.Object, java.lang.Object>, org.apache.spark.executor.ExecutorMetrics> getExecutorUpdates ()  { throw new RuntimeException(); }
  /**
   * Called by TaskRunner#run.
   * @param taskId (undocumented)
   * @return (undocumented)
   */
  public  long[] getTaskMetricPeaks (long taskId)  { throw new RuntimeException(); }
  /**
   * Called by TaskRunner#run. It should only be called if onTaskStart has been called with
   * the same arguments.
   * @param taskId (undocumented)
   * @param stageId (undocumented)
   * @param stageAttemptId (undocumented)
   */
  public  void onTaskCompletion (long taskId, int stageId, int stageAttemptId)  { throw new RuntimeException(); }
  /**
   * Called by TaskRunner#run.
   * @param taskId (undocumented)
   * @param stageId (undocumented)
   * @param stageAttemptId (undocumented)
   */
  public  void onTaskStart (long taskId, int stageId, int stageAttemptId)  { throw new RuntimeException(); }
  /**
   * Function to poll executor metrics.
   * On start, if pollingInterval is positive, this is scheduled to run at that interval.
   * Otherwise, this is called by the reportHeartBeat function defined in Executor and passed
   * to its Heartbeater.
   */
  public  void poll ()  { throw new RuntimeException(); }
  /** Starts the polling thread. */
  public  void start ()  { throw new RuntimeException(); }
  /** Stops the polling thread. */
  public  void stop ()  { throw new RuntimeException(); }
}
