package org.apache.spark.scheduler;
/**
 * Map from active stages's id =&gt; authorized task attempts for each partition id, which hold an
 * exclusive lock on committing task output for that partition, as well as any known failed
 * attempts in the stage.
 * <p>
 * Entries are added to the top-level map when stages start and are removed they finish
 * (either successfully or unsuccessfully).
 * <p>
 * Access to this map should be guarded by synchronizing on the OutputCommitCoordinator instance.
 */
  class OutputCommitCoordinator implements org.apache.spark.internal.Logging {
  // not preceding
  static   class OutputCommitCoordinatorEndpoint implements org.apache.spark.rpc.RpcEndpoint, org.apache.spark.internal.Logging {
    // not preceding
    public   OutputCommitCoordinatorEndpoint (org.apache.spark.rpc.RpcEnv rpcEnv, org.apache.spark.scheduler.OutputCommitCoordinator outputCommitCoordinator)  { throw new RuntimeException(); }
    public  scala.PartialFunction<java.lang.Object, scala.runtime.BoxedUnit> receive ()  { throw new RuntimeException(); }
    public  scala.PartialFunction<java.lang.Object, scala.runtime.BoxedUnit> receiveAndReply (org.apache.spark.rpc.RpcCallContext context)  { throw new RuntimeException(); }
    public  org.apache.spark.rpc.RpcEnv rpcEnv ()  { throw new RuntimeException(); }
  }
  // not preceding
  public   OutputCommitCoordinator (org.apache.spark.SparkConf conf, boolean isDriver)  { throw new RuntimeException(); }
  // not preceding
  public  scala.Option<org.apache.spark.rpc.RpcEndpointRef> coordinatorRef ()  { throw new RuntimeException(); }
  /**
   * Returns whether the OutputCommitCoordinator's internal data structures are all empty.
   * @return (undocumented)
   */
  public  boolean isEmpty ()  { throw new RuntimeException(); }
  /**
   * Called by tasks to ask whether they can commit their output to HDFS.
   * <p>
   * If a task attempt has been authorized to commit, then all other attempts to commit the same
   * task will be denied.  If the authorized task attempt fails (e.g. due to its executor being
   * lost), then a subsequent task attempt may be authorized to commit its output.
   * <p>
   * @param stage the stage number
   * @param partition the partition number
   * @param attemptNumber how many times this task has been attempted
   *                      (see {@link TaskContext.attemptNumber()})
   * @return true if this task is authorized to commit, false otherwise
   * @param stageAttempt (undocumented)
   */
  public  boolean canCommit (int stage, int stageAttempt, int partition, int attemptNumber)  { throw new RuntimeException(); }
  /**
   * Called by the DAGScheduler when a stage starts. Initializes the stage's state if it hasn't
   * yet been initialized.
   * <p>
   * @param stage the stage id.
   * @param maxPartitionId the maximum partition id that could appear in this stage's tasks (i.e.
   *                       the maximum possible value of <code>context.partitionId</code>).
   */
    void stageStart (int stage, int maxPartitionId)  { throw new RuntimeException(); }
    void stageEnd (int stage)  { throw new RuntimeException(); }
    void taskCompleted (int stage, int stageAttempt, int partition, int attemptNumber, org.apache.spark.TaskEndReason reason)  { throw new RuntimeException(); }
  public  void stop ()  { throw new RuntimeException(); }
    boolean handleAskPermissionToCommit (int stage, int stageAttempt, int partition, int attemptNumber)  { throw new RuntimeException(); }
}
