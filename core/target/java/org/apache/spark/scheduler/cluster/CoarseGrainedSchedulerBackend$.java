package org.apache.spark.scheduler.cluster;
/**
 * Checks whether the executor is blacklisted. This is called when the executor tries to
 * register with the scheduler, and will deny registration if this method returns true.
 * <p>
 * This is in addition to the blacklist kept by the task scheduler, so custom implementations
 * don't need to check there.
 */
// not preceding
public  class CoarseGrainedSchedulerBackend$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final CoarseGrainedSchedulerBackend$ MODULE$ = null;
  public   CoarseGrainedSchedulerBackend$ ()  { throw new RuntimeException(); }
  // not preceding
  public  java.lang.String ENDPOINT_NAME ()  { throw new RuntimeException(); }
}
