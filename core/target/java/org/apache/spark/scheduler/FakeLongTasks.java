package org.apache.spark.scheduler;
public  class FakeLongTasks extends org.apache.spark.scheduler.FakeTask {
  // not preceding
  public   FakeLongTasks (int stageId, int partitionId)  { throw new RuntimeException(); }
  // not preceding
  public  int runTask (org.apache.spark.TaskContext context)  { throw new RuntimeException(); }
}
