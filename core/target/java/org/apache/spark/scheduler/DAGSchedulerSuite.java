package org.apache.spark.scheduler;
/** Set of TaskSets the DAGScheduler has requested executed. */
public  class DAGSchedulerSuite extends org.apache.spark.SparkFunSuite implements org.apache.spark.LocalSparkContext, org.scalatest.concurrent.TimeLimits {
  /**
   * Listeners which records some information to verify in UTs. Getter-kind methods in this class
   * ensures the value is returned after ensuring there's no event to process, as well as the
   * value is immutable: prevent showing odd result by race condition.
   */
  public  class EventInfoRecordingListener extends org.apache.spark.scheduler.SparkListener {
    // not preceding
    public   EventInfoRecordingListener ()  { throw new RuntimeException(); }
    public  scala.collection.immutable.Set<java.lang.Object> endedTasks ()  { throw new RuntimeException(); }
    public  scala.collection.immutable.List<java.lang.Object> failedStages ()  { throw new RuntimeException(); }
    public  void onStageCompleted (org.apache.spark.scheduler.SparkListenerStageCompleted stageCompleted)  { throw new RuntimeException(); }
    public  void onStageSubmitted (org.apache.spark.scheduler.SparkListenerStageSubmitted stageSubmitted)  { throw new RuntimeException(); }
    public  void onTaskEnd (org.apache.spark.scheduler.SparkListenerTaskEnd taskEnd)  { throw new RuntimeException(); }
    public  scala.collection.immutable.List<java.lang.Object> stageByOrderOfExecution ()  { throw new RuntimeException(); }
    public  scala.collection.immutable.Set<org.apache.spark.scheduler.StageInfo> submittedStageInfos ()  { throw new RuntimeException(); }
    public  scala.collection.immutable.Set<java.lang.Object> successfulStages ()  { throw new RuntimeException(); }
  }
  public  class MyBlockManagerMaster extends org.apache.spark.storage.BlockManagerMaster {
    // not preceding
    public   MyBlockManagerMaster (org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
    // not preceding
    public  scala.collection.IndexedSeq<scala.collection.Seq<org.apache.spark.storage.BlockManagerId>> getLocations (org.apache.spark.storage.BlockId[] blockIds)  { throw new RuntimeException(); }
    public  void removeExecutor (java.lang.String execId)  { throw new RuntimeException(); }
  }
  /** A simple helper class for creating custom JobListeners */
  public  class SimpleListener implements org.apache.spark.scheduler.JobListener {
    // not preceding
    public   SimpleListener ()  { throw new RuntimeException(); }
    public  java.lang.Exception failure ()  { throw new RuntimeException(); }
    public  void jobFailed (java.lang.Exception exception)  { throw new RuntimeException(); }
    // not preceding
    public  scala.collection.mutable.HashMap<java.lang.Object, java.lang.Object> results ()  { throw new RuntimeException(); }
    public  void taskSucceeded (int index, Object result)  { throw new RuntimeException(); }
  }
  // not preceding
  public  class MyMapOutputTrackerMaster extends org.apache.spark.MapOutputTrackerMaster {
    // not preceding
    public   MyMapOutputTrackerMaster (org.apache.spark.SparkConf conf, org.apache.spark.broadcast.BroadcastManager broadcastManager)  { throw new RuntimeException(); }
    // not preceding
    public  void sendTracker (Object message)  { throw new RuntimeException(); }
  }
  public  class EndListener extends org.apache.spark.scheduler.SparkListener {
    // not preceding
    public   EndListener ()  { throw new RuntimeException(); }
    // not preceding
    public  void onJobEnd (org.apache.spark.scheduler.SparkListenerJobEnd jobEnd)  { throw new RuntimeException(); }
  }
  // not preceding
  static public  org.apache.spark.scheduler.MapStatus makeMapStatus (java.lang.String host, int reduces, byte sizes, long mapTaskId)  { throw new RuntimeException(); }
  static public  org.apache.spark.storage.BlockManagerId makeBlockManagerId (java.lang.String host)  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.SparkContext sc ()  { throw new RuntimeException(); }
  // not preceding
  public   DAGSchedulerSuite ()  { throw new RuntimeException(); }
  // not preceding
  public  org.scalatest.concurrent.Signaler defaultSignaler ()  { throw new RuntimeException(); }
  public  org.apache.spark.SparkConf conf ()  { throw new RuntimeException(); }
  /** Set of TaskSets the DAGScheduler has requested executed. */
  public  scala.collection.mutable.Buffer<org.apache.spark.scheduler.TaskSet> taskSets ()  { throw new RuntimeException(); }
  /** Stages for which the DAGScheduler has called TaskScheduler.cancelTasks(). */
  public  scala.collection.mutable.HashSet<java.lang.Object> cancelledStages ()  { throw new RuntimeException(); }
  public  scala.collection.mutable.ArrayBuffer<org.apache.spark.scheduler.Task<?>> tasksMarkedAsCompleted ()  { throw new RuntimeException(); }
  public  java.lang.Object taskScheduler ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.scheduler.DAGSchedulerSuite.EventInfoRecordingListener sparkListener ()  { throw new RuntimeException(); }
  public  org.apache.spark.storage.BlockManagerMaster blockManagerMaster ()  { throw new RuntimeException(); }
  public  org.apache.spark.MapOutputTrackerMaster mapOutputTracker ()  { throw new RuntimeException(); }
  public  org.apache.spark.broadcast.BroadcastManager broadcastManager ()  { throw new RuntimeException(); }
  public  org.apache.spark.SecurityManager securityMgr ()  { throw new RuntimeException(); }
  public  org.apache.spark.scheduler.DAGScheduler scheduler ()  { throw new RuntimeException(); }
  public  org.apache.spark.scheduler.DAGSchedulerEventProcessLoop dagEventProcessLoopTester ()  { throw new RuntimeException(); }
  /**
   * Set of cache locations to return from our mock BlockManagerMaster.
   * Keys are (rdd ID, partition ID). Anything not present will return an empty
   * list of cache locations silently.
   * @return (undocumented)
   */
  public  scala.collection.mutable.HashMap<scala.Tuple2<java.lang.Object, java.lang.Object>, scala.collection.Seq<org.apache.spark.storage.BlockManagerId>> cacheLocations ()  { throw new RuntimeException(); }
  // not preceding
  public  scala.collection.mutable.HashMap<java.lang.Object, java.lang.Object> results ()  { throw new RuntimeException(); }
  public  java.lang.Exception failure ()  { throw new RuntimeException(); }
  public  java.lang.Object jobListener ()  { throw new RuntimeException(); }
  // not preceding
  public  void beforeEach ()  { throw new RuntimeException(); }
  public  void afterEach ()  { throw new RuntimeException(); }
  public  void afterAll ()  { throw new RuntimeException(); }
  public  boolean ended ()  { throw new RuntimeException(); }
  public  org.apache.spark.scheduler.JobResult jobResult ()  { throw new RuntimeException(); }
  public  void checkJobPropertiesAndPriority (org.apache.spark.scheduler.TaskSet taskSet, java.lang.String expected, int priority)  { throw new RuntimeException(); }
  public  org.apache.spark.ShuffleDependency<java.lang.Object, java.lang.Object, scala.runtime.Nothing$> launchJobsThatShareStageAndCancelFirst ()  { throw new RuntimeException(); }
}
