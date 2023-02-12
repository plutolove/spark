package org.apache.spark;
/**
 * Verify that the settings specified through the config are valid.
 * If not, throw an appropriate exception.
 */
  class ExecutorAllocationManager implements org.apache.spark.internal.Logging {
  // not preceding
    class ExecutorAllocationListener extends org.apache.spark.scheduler.SparkListener {
    // not preceding
    public   ExecutorAllocationListener ()  { throw new RuntimeException(); }
    public  void onSpeculativeTaskSubmitted (org.apache.spark.scheduler.SparkListenerSpeculativeTaskSubmitted speculativeTask)  { throw new RuntimeException(); }
    public  void onStageCompleted (org.apache.spark.scheduler.SparkListenerStageCompleted stageCompleted)  { throw new RuntimeException(); }
    public  void onStageSubmitted (org.apache.spark.scheduler.SparkListenerStageSubmitted stageSubmitted)  { throw new RuntimeException(); }
    public  void onTaskEnd (org.apache.spark.scheduler.SparkListenerTaskEnd taskEnd)  { throw new RuntimeException(); }
    public  void onTaskStart (org.apache.spark.scheduler.SparkListenerTaskStart taskStart)  { throw new RuntimeException(); }
    public  int pendingSpeculativeTasks ()  { throw new RuntimeException(); }
    /**
     * An estimate of the total number of pending tasks remaining for currently running stages. Does
     * not account for tasks which may have failed and been resubmitted.
     * <p>
     * Note: This is not thread-safe without the caller owning the <code>allocationManager</code> lock.
     * @return (undocumented)
     */
    public  int pendingTasks ()  { throw new RuntimeException(); }
    public  int totalPendingTasks ()  { throw new RuntimeException(); }
    /**
     * The number of tasks currently running across all stages.
     * Include running-but-zombie stage attempts
     * @return (undocumented)
     */
    public  int totalRunningTasks ()  { throw new RuntimeException(); }
    /**
     * Update the Executor placement hints (the number of tasks with locality preferences,
     * a map where each pair is a node and the number of tasks that would like to be scheduled
     * on that node).
     * <p>
     * These hints are updated when stages arrive and complete, so are not up-to-date at task
     * granularity within stages.
     */
    public  void updateExecutorPlacementHints ()  { throw new RuntimeException(); }
  }
  // not preceding
    class ExecutorAllocationManagerSource implements org.apache.spark.metrics.source.Source {
    // not preceding
    public   ExecutorAllocationManagerSource ()  { throw new RuntimeException(); }
    public  com.codahale.metrics.MetricRegistry metricRegistry ()  { throw new RuntimeException(); }
    // not preceding
    public  java.lang.String sourceName ()  { throw new RuntimeException(); }
  }
  /**
   * Metric source for ExecutorAllocationManager to expose its internal executor allocation
   * status to MetricsSystem.
   * Note: These metrics heavily rely on the internal implementation of
   * ExecutorAllocationManager, metrics or value of metrics will be changed when internal
   * implementation is changed, so these metrics are not stable across Spark version.
   * @return (undocumented)
   */
  static public  long NOT_SET ()  { throw new RuntimeException(); }
  // not preceding
  public   ExecutorAllocationManager (org.apache.spark.ExecutorAllocationClient client, org.apache.spark.scheduler.LiveListenerBus listenerBus, org.apache.spark.SparkConf conf, scala.Option<org.apache.spark.ContextCleaner> cleaner, org.apache.spark.util.Clock clock)  { throw new RuntimeException(); }
  public  org.apache.spark.ExecutorAllocationManager.ExecutorAllocationListener listener ()  { throw new RuntimeException(); }
  public  org.apache.spark.scheduler.dynalloc.ExecutorMonitor executorMonitor ()  { throw new RuntimeException(); }
  public  org.apache.spark.ExecutorAllocationManager.ExecutorAllocationManagerSource executorAllocationManagerSource ()  { throw new RuntimeException(); }
  /**
   * Register for scheduler callbacks to decide when to add and remove executors, and start
   * the scheduling task.
   */
  public  void start ()  { throw new RuntimeException(); }
  /**
   * Stop the allocation manager.
   */
  public  void stop ()  { throw new RuntimeException(); }
  /**
   * Reset the allocation manager when the cluster manager loses track of the driver's state.
   * This is currently only done in YARN client mode, when the AM is restarted.
   * <p>
   * This method forgets about any state about existing executors, and forces the scheduler to
   * re-evaluate the number of needed executors the next time it's run.
   */
  public  void reset ()  { throw new RuntimeException(); }
}
