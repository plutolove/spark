package org.apache.spark.api.java;
/**
 * Return a list of all known jobs in a particular job group.  If <code>jobGroup</code> is <code>null</code>, then
 * returns all known jobs that are not associated with a job group.
 * <p>
 * The returned list may contain running, failed, and completed jobs, and may vary across
 * invocations of this method.  This method does not guarantee the order of the elements in
 * its result.
 */
public  class JavaSparkStatusTracker {
  // not preceding
     JavaSparkStatusTracker (org.apache.spark.SparkContext sc)  { throw new RuntimeException(); }
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
  // not preceding
  public  int[] getJobIdsForGroup (java.lang.String jobGroup)  { throw new RuntimeException(); }
  /**
   * Returns job information, or <code>null</code> if the job info could not be found or was garbage collected.
   * @param jobId (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.SparkJobInfo getJobInfo (int jobId)  { throw new RuntimeException(); }
  /**
   * Returns stage information, or <code>null</code> if the stage info could not be found or was
   * garbage collected.
   * @param stageId (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.SparkStageInfo getStageInfo (int stageId)  { throw new RuntimeException(); }
}
