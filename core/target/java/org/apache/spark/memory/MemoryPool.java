package org.apache.spark.memory;
/**
 * Returns the current size of the pool, in bytes.
 */
 abstract class MemoryPool {
  // not preceding
  public   MemoryPool (java.lang.Object lock)  { throw new RuntimeException(); }
  /**
   * Shrinks the pool by <code>delta</code> bytes.
   * @param delta (undocumented)
   */
  public final  void decrementPoolSize (long delta)  { throw new RuntimeException(); }
  /**
   * Expands the pool by <code>delta</code> bytes.
   * @param delta (undocumented)
   */
  public final  void incrementPoolSize (long delta)  { throw new RuntimeException(); }
  /**
   * Returns the amount of free memory in the pool, in bytes.
   * @return (undocumented)
   */
  public final  long memoryFree ()  { throw new RuntimeException(); }
  /**
   * Returns the amount of used memory in this pool (in bytes).
   * @return (undocumented)
   */
  public abstract  long memoryUsed ()  ;
  // not preceding
  public final  long poolSize ()  { throw new RuntimeException(); }
}
