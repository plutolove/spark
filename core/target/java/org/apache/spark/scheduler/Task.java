package org.apache.spark.scheduler;
/**
 * Called by {@link org.apache.spark.executor.Executor} to run this task.
 * <p>
 * param:  taskAttemptId an identifier for this task attempt that is unique within a SparkContext.
 * param:  attemptNumber how many times this task has been attempted (0 for the first attempt)
 * param:  resources other host resources (like gpus) that this task attempt can access
 * @return the result of the task along with updates of Accumulators.
 */
 abstract class Task<T extends java.lang.Object> implements scala.Serializable {
  public  int stageId ()  { throw new RuntimeException(); }
  public  int stageAttemptId ()  { throw new RuntimeException(); }
  public  int partitionId ()  { throw new RuntimeException(); }
  public  java.util.Properties localProperties ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Object> jobId ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> appId ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> appAttemptId ()  { throw new RuntimeException(); }
  public  boolean isBarrier ()  { throw new RuntimeException(); }
  // not preceding
  public   Task (int stageId, int stageAttemptId, int partitionId, java.util.Properties localProperties, byte[] serializedTaskMetrics, scala.Option<java.lang.Object> jobId, scala.Option<java.lang.String> appId, scala.Option<java.lang.String> appAttemptId, boolean isBarrier)  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.executor.TaskMetrics metrics ()  { throw new RuntimeException(); }
  /**
   * Called by {@link org.apache.spark.executor.Executor} to run this task.
   * <p>
   * @param taskAttemptId an identifier for this task attempt that is unique within a SparkContext.
   * @param attemptNumber how many times this task has been attempted (0 for the first attempt)
   * @param resources other host resources (like gpus) that this task attempt can access
   * @return the result of the task along with updates of Accumulators.
   * @param metricsSystem (undocumented)
   */
  public final  T run (long taskAttemptId, int attemptNumber, org.apache.spark.metrics.MetricsSystem metricsSystem, scala.collection.immutable.Map<java.lang.String, org.apache.spark.resource.ResourceInformation> resources)  { throw new RuntimeException(); }
  public  void setTaskMemoryManager (org.apache.spark.memory.TaskMemoryManager taskMemoryManager)  { throw new RuntimeException(); }
  public abstract  T runTask (org.apache.spark.TaskContext context)  ;
  public  scala.collection.Seq<org.apache.spark.scheduler.TaskLocation> preferredLocations ()  { throw new RuntimeException(); }
  public  long epoch ()  { throw new RuntimeException(); }
  public  org.apache.spark.TaskContext context ()  { throw new RuntimeException(); }
  protected  long _executorDeserializeTimeNs ()  { throw new RuntimeException(); }
  protected  long _executorDeserializeCpuTime ()  { throw new RuntimeException(); }
  /**
   * If defined, this task has been killed and this option contains the reason.
   * @return (undocumented)
   */
  public  scala.Option<java.lang.String> reasonIfKilled ()  { throw new RuntimeException(); }
  /**
   * Returns the amount of time spent deserializing the RDD and function to be run.
   * @return (undocumented)
   */
  public  long executorDeserializeTimeNs ()  { throw new RuntimeException(); }
  public  long executorDeserializeCpuTime ()  { throw new RuntimeException(); }
  /**
   * Collect the latest values of accumulators used in this task. If the task failed,
   * filter out the accumulators whose values should not be included on failures.
   * @param taskFailed (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.Seq<org.apache.spark.util.AccumulatorV2<?, ?>> collectAccumulatorUpdates (boolean taskFailed)  { throw new RuntimeException(); }
  /**
   * Kills a task by setting the interrupted flag to true. This relies on the upper level Spark
   * code and user code to properly handle the flag. This function should be idempotent so it can
   * be called multiple times.
   * If interruptThread is true, we will also call Thread.interrupt() on the Task's executor thread.
   * @param interruptThread (undocumented)
   * @param reason (undocumented)
   */
  public  void kill (boolean interruptThread, java.lang.String reason)  { throw new RuntimeException(); }
}
