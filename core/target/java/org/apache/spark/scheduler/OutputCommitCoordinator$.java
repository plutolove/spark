package org.apache.spark.scheduler;
/**
 * Called by the DAGScheduler when a stage starts. Initializes the stage's state if it hasn't
 * yet been initialized.
 * <p>
 * param:  stage the stage id.
 * param:  maxPartitionId the maximum partition id that could appear in this stage's tasks (i.e.
 *                       the maximum possible value of <code>context.partitionId</code>).
 */
// not preceding
public  class OutputCommitCoordinator$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final OutputCommitCoordinator$ MODULE$ = null;
  public   OutputCommitCoordinator$ ()  { throw new RuntimeException(); }
}
