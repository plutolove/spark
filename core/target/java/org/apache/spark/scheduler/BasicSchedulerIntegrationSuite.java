package org.apache.spark.scheduler;
/**
 * Very simple one stage job.  Backend successfully completes each task, one by one
 */
public  class BasicSchedulerIntegrationSuite extends org.apache.spark.scheduler.SchedulerIntegrationSuite<org.apache.spark.scheduler.SingleCoreMockBackend> {
  // not preceding
  public   BasicSchedulerIntegrationSuite ()  { throw new RuntimeException(); }
}
