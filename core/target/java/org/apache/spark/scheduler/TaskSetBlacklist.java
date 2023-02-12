package org.apache.spark.scheduler;
/**
 * A map from each executor to the task failures on that executor.  This is used for blacklisting
 * within this taskset, and it is also relayed onto {@link BlacklistTracker} for app-level
 * blacklisting if this taskset completes successfully.
 */
  class TaskSetBlacklist implements org.apache.spark.internal.Logging {
  // not preceding
  public   TaskSetBlacklist (org.apache.spark.scheduler.LiveListenerBus listenerBus, org.apache.spark.SparkConf conf, int stageId, int stageAttemptId, org.apache.spark.util.Clock clock)  { throw new RuntimeException(); }
  public  org.apache.spark.util.Clock clock ()  { throw new RuntimeException(); }
  public  org.apache.spark.SparkConf conf ()  { throw new RuntimeException(); }
  /**
   * A map from each executor to the task failures on that executor.  This is used for blacklisting
   * within this taskset, and it is also relayed onto {@link BlacklistTracker} for app-level
   * blacklisting if this taskset completes successfully.
   * @return (undocumented)
   */
  public  scala.collection.mutable.HashMap<java.lang.String, org.apache.spark.scheduler.ExecutorFailuresInTaskSet> execToFailures ()  { throw new RuntimeException(); }
  /**
   * Get the most recent failure reason of this TaskSet.
   * @return (undocumented)
   */
  public  java.lang.String getLatestFailureReason ()  { throw new RuntimeException(); }
  /**
   * Return true if this executor is blacklisted for the given task.  This does *not*
   * need to return true if the executor is blacklisted for the entire stage, or blacklisted
   * for the entire application.  That is to keep this method as fast as possible in the inner-loop
   * of the scheduler, where those filters will have already been applied.
   * @param executorId (undocumented)
   * @param index (undocumented)
   * @return (undocumented)
   */
  public  boolean isExecutorBlacklistedForTask (java.lang.String executorId, int index)  { throw new RuntimeException(); }
  /**
   * Return true if this executor is blacklisted for the given stage.  Completely ignores whether
   * the executor is blacklisted for the entire application (or anything to do with the node the
   * executor is on).  That is to keep this method as fast as possible in the inner-loop of the
   * scheduler, where those filters will already have been applied.
   * @param executorId (undocumented)
   * @return (undocumented)
   */
  public  boolean isExecutorBlacklistedForTaskSet (java.lang.String executorId)  { throw new RuntimeException(); }
  public  boolean isNodeBlacklistedForTask (java.lang.String node, int index)  { throw new RuntimeException(); }
  public  boolean isNodeBlacklistedForTaskSet (java.lang.String node)  { throw new RuntimeException(); }
  public  int stageAttemptId ()  { throw new RuntimeException(); }
  public  int stageId ()  { throw new RuntimeException(); }
    void updateBlacklistForFailedTask (java.lang.String host, java.lang.String exec, int index, java.lang.String failureReason)  { throw new RuntimeException(); }
}
