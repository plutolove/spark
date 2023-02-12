package org.apache.spark.scheduler;
/**
 * The active job for this result stage. Will be empty if the job has already finished
 * (e.g., because the job was cancelled).
 */
  class ResultStage extends org.apache.spark.scheduler.Stage {
  // not preceding
  public   ResultStage (int id, org.apache.spark.rdd.RDD<?> rdd, scala.Function2<org.apache.spark.TaskContext, scala.collection.Iterator<?>, ?> func, int[] partitions, scala.collection.immutable.List<org.apache.spark.scheduler.Stage> parents, int firstJobId, org.apache.spark.util.CallSite callSite)  { throw new RuntimeException(); }
  // not preceding
  public  scala.Option<org.apache.spark.scheduler.ActiveJob> activeJob ()  { throw new RuntimeException(); }
  /**
   * Returns the sequence of partition ids that are missing (i.e. needs to be computed).
   * <p>
   * This can only be called when there is an active job.
   * @return (undocumented)
   */
  public  scala.collection.Seq<java.lang.Object> findMissingPartitions ()  { throw new RuntimeException(); }
  // not preceding
  public  scala.Function2<org.apache.spark.TaskContext, scala.collection.Iterator<?>, ?> func ()  { throw new RuntimeException(); }
  public  int[] partitions ()  { throw new RuntimeException(); }
  public  void removeActiveJob ()  { throw new RuntimeException(); }
  public  void setActiveJob (org.apache.spark.scheduler.ActiveJob job)  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
