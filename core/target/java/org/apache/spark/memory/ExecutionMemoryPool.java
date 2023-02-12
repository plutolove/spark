package org.apache.spark.memory;
/**
 * Map from taskAttemptId -> memory consumption in bytes
 */
  class ExecutionMemoryPool extends org.apache.spark.memory.MemoryPool implements org.apache.spark.internal.Logging {
  // not preceding
  public   ExecutionMemoryPool (java.lang.Object lock, org.apache.spark.memory.MemoryMode memoryMode)  { throw new RuntimeException(); }
  /**
   * Try to acquire up to <code>numBytes</code> of memory for the given task and return the number of bytes
   * obtained, or 0 if none can be allocated.
   * <p>
   * This call may block until there is enough free memory in some situations, to make sure each
   * task has a chance to ramp up to at least 1 / 2N of the total memory pool (where N is the # of
   * active tasks) before it is forced to spill. This can happen if the number of tasks increase
   * but an older task had a lot of memory already.
   * <p>
   * @param numBytes number of bytes to acquire
   * @param taskAttemptId the task attempt acquiring memory
   * @param maybeGrowPool a callback that potentially grows the size of this pool. It takes in
   *                      one parameter (Long) that represents the desired amount of memory by
   *                      which this pool should be expanded.
   * @param computeMaxPoolSize a callback that returns the maximum allowable size of this pool
   *                           at this given moment. This is not a field because the max pool
   *                           size is variable in certain cases. For instance, in unified
   *                           memory management, the execution pool can be expanded by evicting
   *                           cached blocks, thereby shrinking the storage pool.
   * <p>
   * @return the number of bytes granted to the task.
   */
    long acquireMemory (long numBytes, long taskAttemptId, scala.Function1<java.lang.Object, scala.runtime.BoxedUnit> maybeGrowPool, scala.Function0<java.lang.Object> computeMaxPoolSize)  { throw new RuntimeException(); }
  /**
   * Returns the memory consumption, in bytes, for the given task.
   * @param taskAttemptId (undocumented)
   * @return (undocumented)
   */
  public  long getMemoryUsageForTask (long taskAttemptId)  { throw new RuntimeException(); }
  public  long memoryUsed ()  { throw new RuntimeException(); }
  /**
   * Release all memory for the given task and mark it as inactive (e.g. when a task ends).
   * @return the number of bytes freed.
   * @param taskAttemptId (undocumented)
   */
  public  long releaseAllMemoryForTask (long taskAttemptId)  { throw new RuntimeException(); }
  /**
   * Release <code>numBytes</code> of memory acquired by the given task.
   * @param numBytes (undocumented)
   * @param taskAttemptId (undocumented)
   */
  public  void releaseMemory (long numBytes, long taskAttemptId)  { throw new RuntimeException(); }
}
