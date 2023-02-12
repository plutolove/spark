package org.apache.spark.memory;
/**
 * Helper methods for mocking out memory-management-related classes in tests.
 */
// not preceding
public  class MemoryTestingUtils {
  // not preceding
  static public  org.apache.spark.TaskContext fakeTaskContext (org.apache.spark.SparkEnv env)  { throw new RuntimeException(); }
}
