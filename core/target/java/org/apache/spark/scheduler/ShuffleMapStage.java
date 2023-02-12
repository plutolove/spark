package org.apache.spark.scheduler;
/**
 * Partitions that either haven't yet been computed, or that were computed on an executor
 * that has since been lost, so should be re-computed.  This variable is used by the
 * DAGScheduler to determine when a stage has completed. Task successes in both the active
 * attempt for the stage or in earlier attempts for this stage can cause paritition ids to get
 * removed from pendingPartitions. As a result, this variable may be inconsistent with the pending
 * tasks in the TaskSetManager for the active attempt for the stage (the partitions stored here
 * will always be a subset of the partitions that the TaskSetManager thinks are pending).
 */
  class ShuffleMapStage extends org.apache.spark.scheduler.Stage {
  // not preceding
  public   ShuffleMapStage (int id, org.apache.spark.rdd.RDD<?> rdd, int numTasks, scala.collection.immutable.List<org.apache.spark.scheduler.Stage> parents, int firstJobId, org.apache.spark.util.CallSite callSite, org.apache.spark.ShuffleDependency<?, ?, ?> shuffleDep, org.apache.spark.MapOutputTrackerMaster mapOutputTrackerMaster)  { throw new RuntimeException(); }
  /** Adds the job to the active job list. */
  public  void addActiveJob (org.apache.spark.scheduler.ActiveJob job)  { throw new RuntimeException(); }
  /** Returns the sequence of partition ids that are missing (i.e. needs to be computed). */
  public  scala.collection.Seq<java.lang.Object> findMissingPartitions ()  { throw new RuntimeException(); }
  /**
   * Returns true if the map stage is ready, i.e. all partitions have shuffle outputs.
   * @return (undocumented)
   */
  public  boolean isAvailable ()  { throw new RuntimeException(); }
  /**
   * Returns the list of active jobs,
   * i.e. map-stage jobs that were submitted to execute this stage independently (if any).
   * @return (undocumented)
   */
  public  scala.collection.Seq<org.apache.spark.scheduler.ActiveJob> mapStageJobs ()  { throw new RuntimeException(); }
  /**
   * Number of partitions that have shuffle outputs.
   * When this reaches {@link numPartitions}, this map stage is ready.
   * @return (undocumented)
   */
  public  int numAvailableOutputs ()  { throw new RuntimeException(); }
  // not preceding
  public  scala.collection.mutable.HashSet<java.lang.Object> pendingPartitions ()  { throw new RuntimeException(); }
  /** Removes the job from the active job list. */
  public  void removeActiveJob (org.apache.spark.scheduler.ActiveJob job)  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.ShuffleDependency<?, ?, ?> shuffleDep ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
