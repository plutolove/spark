package org.apache.spark.scheduler;
public  class FakeSchedulerBackend implements org.apache.spark.scheduler.SchedulerBackend {
  // not preceding
  public   FakeSchedulerBackend ()  { throw new RuntimeException(); }
  public  int defaultParallelism ()  { throw new RuntimeException(); }
  public  int maxNumConcurrentTasks ()  { throw new RuntimeException(); }
  public  void reviveOffers ()  { throw new RuntimeException(); }
  // not preceding
  public  void start ()  { throw new RuntimeException(); }
  public  void stop ()  { throw new RuntimeException(); }
}
