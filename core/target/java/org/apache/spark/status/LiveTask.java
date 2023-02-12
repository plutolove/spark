package org.apache.spark.status;
/**
 * Update the metrics for the task and return the difference between the previous and new
 * values.
 */
public  class LiveTask extends org.apache.spark.status.LiveEntity {
  // not preceding
  public   LiveTask (org.apache.spark.scheduler.TaskInfo info, int stageId, int stageAttemptId, scala.Option<java.lang.Object> lastUpdateTime)  { throw new RuntimeException(); }
  /**
   * SPARK-26260: For non successful tasks, store the metrics as negative to avoid
   * the calculation in the task summary. <code>toApi</code> method in the <code>TaskDataWrapper</code> will make
   * it actual value.
   * @return (undocumented)
   */
  protected  Object doUpdate ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> errorMessage ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.scheduler.TaskInfo info ()  { throw new RuntimeException(); }
  /**
   * Update the metrics for the task and return the difference between the previous and new
   * values.
   * @param metrics (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.status.api.v1.TaskMetrics updateMetrics (org.apache.spark.executor.TaskMetrics metrics)  { throw new RuntimeException(); }
}
