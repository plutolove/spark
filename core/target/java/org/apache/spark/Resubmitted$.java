package org.apache.spark;
/**
 * :: DeveloperApi ::
 * A <code>org.apache.spark.scheduler.ShuffleMapTask</code> that completed successfully earlier, but we
 * lost the executor before the stage completed. This means Spark needs to reschedule the task
 * to be re-executed on a different executor.
 */
// not preceding
public  class Resubmitted$ implements org.apache.spark.TaskFailedReason, scala.Product, scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final Resubmitted$ MODULE$ = null;
  public   Resubmitted$ ()  { throw new RuntimeException(); }
  // not preceding
  public  java.lang.String toErrorString ()  { throw new RuntimeException(); }
}
