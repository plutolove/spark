package org.apache.spark.memory;
/**
 * Make a {@link UnifiedMemoryManager} and a {@link MemoryStore} with limited class dependencies.
 */
public  class UnifiedMemoryManagerSuite extends org.apache.spark.SparkFunSuite implements org.apache.spark.memory.MemoryManagerSuite, org.scalatest.PrivateMethodTester {
  public  org.scalatest.PrivateMethodTester.PrivateMethod$ PrivateMethod ()  { throw new RuntimeException(); }
  // not preceding
  public   UnifiedMemoryManagerSuite ()  { throw new RuntimeException(); }
  protected  org.apache.spark.memory.UnifiedMemoryManager createMemoryManager (long maxOnHeapExecutionMemory, long maxOffHeapExecutionMemory)  { throw new RuntimeException(); }
  // not preceding
  public  scala.concurrent.ExecutionContextExecutor ec ()  { throw new RuntimeException(); }
  // not preceding
  protected  scala.collection.mutable.ArrayBuffer<scala.Tuple2<org.apache.spark.storage.BlockId, org.apache.spark.storage.BlockStatus>> evictedBlocks ()  { throw new RuntimeException(); }
}
