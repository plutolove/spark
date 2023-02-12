package org.apache.spark.executor;
/**
 * When an executor is unable to send heartbeats to the driver more than <code>HEARTBEAT_MAX_FAILURES</code>
 * times, it should kill itself. The default value is 60. For example, if max failures is 60 and
 * heartbeat interval is 10s, then it will try to send heartbeats for up to 600s (10 minutes).
 */
  class Executor implements org.apache.spark.internal.Logging {
  /** If specified, this task has been killed and this option contains the reason. */
  public  class TaskRunner implements java.lang.Runnable {
    // not preceding
    public   TaskRunner (org.apache.spark.executor.ExecutorBackend execBackend, org.apache.spark.scheduler.TaskDescription taskDescription)  { throw new RuntimeException(); }
    public  long getThreadId ()  { throw new RuntimeException(); }
    public  boolean isFinished ()  { throw new RuntimeException(); }
    public  void kill (boolean interruptThread, java.lang.String reason)  { throw new RuntimeException(); }
    public  void run ()  { throw new RuntimeException(); }
    /** How much the JVM process has spent in GC when the task starts to run. */
    public  long startGCTime ()  { throw new RuntimeException(); }
    /**
     * The task to run. This will be set in run() by deserializing the task binary coming
     * from the driver. Once it is set, it will never be changed.
     * @return (undocumented)
     */
    public  org.apache.spark.scheduler.Task<java.lang.Object> task ()  { throw new RuntimeException(); }
    // not preceding
    public  long taskId ()  { throw new RuntimeException(); }
    public  java.lang.String threadName ()  { throw new RuntimeException(); }
  }
  /** Reports heartbeat and metrics for active tasks to the driver. */
  static public  java.lang.ThreadLocal<java.util.Properties> taskDeserializationProps ()  { throw new RuntimeException(); }
  // not preceding
  public   Executor (java.lang.String executorId, java.lang.String executorHostname, org.apache.spark.SparkEnv env, scala.collection.Seq<java.net.URL> userClassPath, boolean isLocal, java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler, scala.collection.immutable.Map<java.lang.String, org.apache.spark.resource.ResourceInformation> resources)  { throw new RuntimeException(); }
  public  java.lang.Object stopHookReference ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.executor.ExecutorMetricsSource> executorMetricsSource ()  { throw new RuntimeException(); }
    org.apache.spark.executor.ExecutorMetricsPoller metricsPoller ()  { throw new RuntimeException(); }
    int numRunningTasks ()  { throw new RuntimeException(); }
  public  void launchTask (org.apache.spark.executor.ExecutorBackend context, org.apache.spark.scheduler.TaskDescription taskDescription)  { throw new RuntimeException(); }
  public  void killTask (long taskId, boolean interruptThread, java.lang.String reason)  { throw new RuntimeException(); }
  /**
   * Function to kill the running tasks in an executor.
   * This can be called by executor back-ends to kill the
   * tasks instead of taking the JVM down.
   * @param interruptThread whether to interrupt the task thread
   * @param reason (undocumented)
   */
  public  void killAllTasks (boolean interruptThread, java.lang.String reason)  { throw new RuntimeException(); }
  public  void stop ()  { throw new RuntimeException(); }
}
