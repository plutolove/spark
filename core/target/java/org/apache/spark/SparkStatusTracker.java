package org.apache.spark;
/**
 * Return a list of all known jobs in a particular job group.  If <code>jobGroup</code> is <code>null</code>, then
 * returns all known jobs that are not associated with a job group.
 * <p>
 * The returned list may contain running, failed, and completed jobs, and may vary across
 * invocations of this method.  This method does not guarantee the order of the elements in
 * its result.
 */
public  class SparkStatusTracker {
  // not preceding
     SparkStatusTracker (org.apache.spark.SparkContext sc, org.apache.spark.status.AppStatusStore store)  { throw new RuntimeException(); }
  /**
   * Returns an array containing the ids of all active jobs.
   * <p>
   * This method does not guarantee the order of the elements in its result.
   * @return (undocumented)
   */
  public  int[] getActiveJobIds ()  { throw new RuntimeException(); }
  /**
   * Returns an array containing the ids of all active stages.
   * <p>
   * This method does not guarantee the order of the elements in its result.
   * @return (undocumented)
   */
  public  int[] getActiveStageIds ()  { throw new RuntimeException(); }
  /**
   * Returns information of all known executors, including host, port, cacheSize, numRunningTasks
   * and memory metrics.
   * Note this include information for both the driver and executors.
   * @return (undocumented)
   */
  public  org.apache.spark.SparkExecutorInfo[] getExecutorInfos ()  { throw new RuntimeException(); }
  // not preceding
  public  int[] getJobIdsForGroup (java.lang.String jobGroup)  { throw new RuntimeException(); }
  /**
   * Returns job information, or <code>None</code> if the job info could not be found or was garbage collected.
   * @param jobId (undocumented)
   * @return (undocumented)
   */
  public  scala.Option<org.apache.spark.SparkJobInfo> getJobInfo (int jobId)  { throw new RuntimeException(); }
  /**
   * Returns stage information, or <code>None</code> if the stage info could not be found or was
   * garbage collected.
   * @param stageId (undocumented)
   * @return (undocumented)
   */
  public  scala.Option<org.apache.spark.SparkStageInfo> getStageInfo (int stageId)  { throw new RuntimeException(); }
}
