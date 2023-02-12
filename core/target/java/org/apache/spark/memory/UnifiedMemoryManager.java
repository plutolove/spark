package org.apache.spark.memory;
/**
 * Try to acquire up to <code>numBytes</code> of execution memory for the current task and return the
 * number of bytes obtained, or 0 if none can be allocated.
 * <p>
 * This call may block until there is enough free memory in some situations, to make sure each
 * task has a chance to ramp up to at least 1 / 2N of the total memory pool (where N is the # of
 * active tasks) before it is forced to spill. This can happen if the number of tasks increase
 * but an older task had a lot of memory already.
 */
  class UnifiedMemoryManager extends org.apache.spark.memory.MemoryManager {
  static public  org.apache.spark.memory.UnifiedMemoryManager apply (org.apache.spark.SparkConf conf, int numCores)  { throw new RuntimeException(); }
  // not preceding
  public  long maxHeapMemory ()  { throw new RuntimeException(); }
  // not preceding
  public   UnifiedMemoryManager (org.apache.spark.SparkConf conf, long maxHeapMemory, long onHeapStorageRegionSize, int numCores)  { throw new RuntimeException(); }
  public  long maxOnHeapStorageMemory ()  { throw new RuntimeException(); }
  public  long maxOffHeapStorageMemory ()  { throw new RuntimeException(); }
  /**
   * Grow the execution pool by evicting cached blocks, thereby shrinking the storage pool.
   * <p>
   * When acquiring memory for a task, the execution pool may need to make multiple
   * attempts. Each attempt must be able to evict storage in case another task jumps in
   * and caches a large block between the attempts. This is called once per attempt.
   * @param numBytes (undocumented)
   * @param taskAttemptId (undocumented)
   * @param memoryMode (undocumented)
   * @return (undocumented)
   */
    long acquireExecutionMemory (long numBytes, long taskAttemptId, org.apache.spark.memory.MemoryMode memoryMode)  { throw new RuntimeException(); }
  /**
   * The size the execution pool would have after evicting storage memory.
   * <p>
   * The execution memory pool divides this quantity among the active tasks evenly to cap
   * the execution memory allocation for each task. It is important to keep this greater
   * than the execution pool size, which doesn't take into account potential memory that
   * could be freed by evicting storage. Otherwise we may hit SPARK-12155.
   * <p>
   * Additionally, this quantity should be kept below <code>maxMemory</code> to arbitrate fairness
   * in execution memory allocation across tasks, Otherwise, a task may occupy more than
   * its fair share of execution memory, mistakenly thinking that other tasks can acquire
   * the portion of storage memory that cannot be evicted.
   * @param blockId (undocumented)
   * @param numBytes (undocumented)
   * @param memoryMode (undocumented)
   * @return (undocumented)
   */
  public  boolean acquireStorageMemory (org.apache.spark.storage.BlockId blockId, long numBytes, org.apache.spark.memory.MemoryMode memoryMode)  { throw new RuntimeException(); }
  public  boolean acquireUnrollMemory (org.apache.spark.storage.BlockId blockId, long numBytes, org.apache.spark.memory.MemoryMode memoryMode)  { throw new RuntimeException(); }
}
