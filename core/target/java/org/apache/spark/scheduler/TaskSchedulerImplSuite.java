package org.apache.spark.scheduler;
/**
 * Helper for performance tests.  Takes the explicitly blacklisted nodes and executors; verifies
 * that the blacklists are used efficiently to ensure scheduling is not O(numPendingTasks).
 * Creates 1 offer on executor[1-3].  Executor1 &amp; 2 are on host1, executor3 is on host2.  Passed
 * in nodes and executors should be on that list.
 */
public  class TaskSchedulerImplSuite extends org.apache.spark.SparkFunSuite implements org.apache.spark.LocalSparkContext, org.scalatest.BeforeAndAfterEach, org.apache.spark.internal.Logging, org.scalatestplus.mockito.MockitoSugar, org.scalatest.concurrent.Eventually {
  public  org.scalatest.concurrent.AbstractPatienceConfiguration.PatienceConfig$ PatienceConfig ()  { throw new RuntimeException(); }
  // not preceding
  public   TaskSchedulerImplSuite ()  { throw new RuntimeException(); }
  public  void afterEach ()  { throw new RuntimeException(); }
  public  void beforeEach ()  { throw new RuntimeException(); }
  public  org.apache.spark.scheduler.BlacklistTracker blacklist ()  { throw new RuntimeException(); }
  public  org.apache.spark.scheduler.DAGScheduler dagScheduler ()  { throw new RuntimeException(); }
  public  boolean failedTaskSet ()  { throw new RuntimeException(); }
  // not preceding
  public  scala.Option<java.lang.Throwable> failedTaskSetException ()  { throw new RuntimeException(); }
  public  java.lang.String failedTaskSetReason ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.SparkContext sc ()  { throw new RuntimeException(); }
  public  org.apache.spark.scheduler.TaskSchedulerImpl setupHelper ()  { throw new RuntimeException(); }
  public  org.apache.spark.scheduler.TaskSchedulerImpl setupScheduler (scala.collection.Seq<scala.Tuple2<java.lang.String, java.lang.String>> confs)  { throw new RuntimeException(); }
  public  org.apache.spark.scheduler.TaskSchedulerImpl setupScheduler (int numCores, scala.collection.Seq<scala.Tuple2<java.lang.String, java.lang.String>> confs)  { throw new RuntimeException(); }
  public  org.apache.spark.scheduler.TaskSchedulerImpl setupSchedulerWithMaster (java.lang.String master, scala.collection.Seq<scala.Tuple2<java.lang.String, java.lang.String>> confs)  { throw new RuntimeException(); }
  public  org.apache.spark.scheduler.TaskSchedulerImpl setupSchedulerWithMockTaskSetBlacklist (scala.collection.Seq<scala.Tuple2<java.lang.String, java.lang.String>> confs)  { throw new RuntimeException(); }
  public  scala.collection.mutable.HashMap<java.lang.Object, org.apache.spark.scheduler.TaskSetBlacklist> stageToMockTaskSetBlacklist ()  { throw new RuntimeException(); }
  public  scala.collection.mutable.HashMap<java.lang.Object, org.apache.spark.scheduler.TaskSetManager> stageToMockTaskSetManager ()  { throw new RuntimeException(); }
  public  org.apache.spark.scheduler.TaskSchedulerImpl taskScheduler ()  { throw new RuntimeException(); }
}
