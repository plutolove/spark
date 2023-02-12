package org.apache.spark.scheduler;
/** Set of TaskSets the DAGScheduler has requested executed. */
public  class TestTaskScheduler extends org.apache.spark.scheduler.TaskSchedulerImpl {
  // not preceding
  public   TestTaskScheduler (org.apache.spark.SparkContext sc)  { throw new RuntimeException(); }
  // not preceding
  public  scala.collection.mutable.HashSet<org.apache.spark.scheduler.TaskSet> runningTaskSets ()  { throw new RuntimeException(); }
  public  void submitTasks (org.apache.spark.scheduler.TaskSet taskSet)  { throw new RuntimeException(); }
  public  void taskSetFinished (org.apache.spark.scheduler.TaskSetManager manager)  { throw new RuntimeException(); }
}
