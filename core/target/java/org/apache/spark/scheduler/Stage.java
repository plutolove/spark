package org.apache.spark.scheduler;
/** Set of jobs that this stage belongs to. */
 abstract class Stage implements org.apache.spark.internal.Logging {
  // not preceding
  public   Stage (int id, org.apache.spark.rdd.RDD<?> rdd, int numTasks, scala.collection.immutable.List<org.apache.spark.scheduler.Stage> parents, int firstJobId, org.apache.spark.util.CallSite callSite)  { throw new RuntimeException(); }
  public  org.apache.spark.util.CallSite callSite ()  { throw new RuntimeException(); }
    void clearFailures ()  { throw new RuntimeException(); }
  public  java.lang.String details ()  { throw new RuntimeException(); }
  public final  boolean equals (Object other)  { throw new RuntimeException(); }
  /**
   * Set of stage attempt IDs that have failed. We keep track of these failures in order to avoid
   * endless retries if a stage keeps failing.
   * We keep track of each attempt ID that has failed to avoid recording duplicate failures if
   * multiple tasks from the same stage attempt fail (SPARK-5945).
   * @return (undocumented)
   */
  public  scala.collection.mutable.HashSet<java.lang.Object> failedAttemptIds ()  { throw new RuntimeException(); }
  /** Returns the sequence of partition ids that are missing (i.e. needs to be computed). */
  public abstract  scala.collection.Seq<java.lang.Object> findMissingPartitions ()  ;
  public  int firstJobId ()  { throw new RuntimeException(); }
  public final  int hashCode ()  { throw new RuntimeException(); }
  public  int id ()  { throw new RuntimeException(); }
  public  boolean isIndeterminate ()  { throw new RuntimeException(); }
  /** Set of jobs that this stage belongs to. */
  public  scala.collection.mutable.HashSet<java.lang.Object> jobIds ()  { throw new RuntimeException(); }
  /** Returns the StageInfo for the most recent attempt for this stage. */
  public  org.apache.spark.scheduler.StageInfo latestInfo ()  { throw new RuntimeException(); }
  /** Creates a new attempt for this stage by creating a new StageInfo with a new attempt ID. */
  public  void makeNewStageAttempt (int numPartitionsToCompute, scala.collection.Seq<scala.collection.Seq<org.apache.spark.scheduler.TaskLocation>> taskLocalityPreferences)  { throw new RuntimeException(); }
  public  java.lang.String name ()  { throw new RuntimeException(); }
  // not preceding
  public  int numPartitions ()  { throw new RuntimeException(); }
  public  int numTasks ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.List<org.apache.spark.scheduler.Stage> parents ()  { throw new RuntimeException(); }
  public  org.apache.spark.rdd.RDD<?> rdd ()  { throw new RuntimeException(); }
}
