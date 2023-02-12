package org.apache.spark.scheduler;
/**
 * This test creates three scheduling pools, and creates task set managers in the first
 * two scheduling pools. The test verifies that as tasks are scheduled, the fair scheduling
 * algorithm properly orders the two scheduling pools.
 */
public  class PoolSuite extends org.apache.spark.SparkFunSuite implements org.apache.spark.LocalSparkContext {
  public  java.lang.String APP_NAME ()  { throw new RuntimeException(); }
  // not preceding
  public  java.lang.String LOCAL ()  { throw new RuntimeException(); }
  // not preceding
  public   PoolSuite ()  { throw new RuntimeException(); }
  public  java.lang.String TEST_POOL ()  { throw new RuntimeException(); }
  public  org.apache.spark.scheduler.TaskSetManager createTaskSetManager (int stageId, int numTasks, org.apache.spark.scheduler.TaskSchedulerImpl taskScheduler)  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.SparkContext sc ()  { throw new RuntimeException(); }
  public  void scheduleTaskAndVerifyId (int taskId, org.apache.spark.scheduler.Pool rootPool, int expectedStageId)  { throw new RuntimeException(); }
}
