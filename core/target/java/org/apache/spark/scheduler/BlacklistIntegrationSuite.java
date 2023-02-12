package org.apache.spark.scheduler;
/**
 * This backend just always fails if the task is executed on a bad host, but otherwise succeeds
 * all tasks.
 */
public  class BlacklistIntegrationSuite extends org.apache.spark.scheduler.SchedulerIntegrationSuite<org.apache.spark.scheduler.MultiExecutorMockBackend> {
  // not preceding
  public   BlacklistIntegrationSuite ()  { throw new RuntimeException(); }
  // not preceding
  public  java.lang.String badHost ()  { throw new RuntimeException(); }
  /**
   * This backend just always fails if the task is executed on a bad host, but otherwise succeeds
   * all tasks.
   */
  public  void badHostBackend ()  { throw new RuntimeException(); }
}
