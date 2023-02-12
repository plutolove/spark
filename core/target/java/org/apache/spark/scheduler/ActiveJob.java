package org.apache.spark.scheduler;
/**
 * Number of partitions we need to compute for this job. Note that result stages may not need
 * to compute all partitions in their target RDD, for actions like first() and lookup().
 */
  class ActiveJob {
  // not preceding
  public   ActiveJob (int jobId, org.apache.spark.scheduler.Stage finalStage, org.apache.spark.util.CallSite callSite, org.apache.spark.scheduler.JobListener listener, java.util.Properties properties)  { throw new RuntimeException(); }
  public  org.apache.spark.util.CallSite callSite ()  { throw new RuntimeException(); }
  public  org.apache.spark.scheduler.Stage finalStage ()  { throw new RuntimeException(); }
  /** Which partitions of the stage have finished */
  public  boolean[] finished ()  { throw new RuntimeException(); }
  // not preceding
  public  int jobId ()  { throw new RuntimeException(); }
  public  org.apache.spark.scheduler.JobListener listener ()  { throw new RuntimeException(); }
  public  int numFinished ()  { throw new RuntimeException(); }
  // not preceding
  public  int numPartitions ()  { throw new RuntimeException(); }
  public  java.util.Properties properties ()  { throw new RuntimeException(); }
  /** Resets the status of all partitions in this stage so they are marked as not finished. */
  public  void resetAllPartitions ()  { throw new RuntimeException(); }
}
