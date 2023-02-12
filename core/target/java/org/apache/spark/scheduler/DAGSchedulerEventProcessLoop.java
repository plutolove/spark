package org.apache.spark.scheduler;
/**
 * The main event loop of the DAG scheduler.
 */
  class DAGSchedulerEventProcessLoop extends org.apache.spark.util.EventLoop<org.apache.spark.scheduler.DAGSchedulerEvent> implements org.apache.spark.internal.Logging {
  // not preceding
  public   DAGSchedulerEventProcessLoop (org.apache.spark.scheduler.DAGScheduler dagScheduler)  { throw new RuntimeException(); }
  public  void onError (java.lang.Throwable e)  { throw new RuntimeException(); }
  // not preceding
  public  void onReceive (org.apache.spark.scheduler.DAGSchedulerEvent event)  { throw new RuntimeException(); }
  public  void onStop ()  { throw new RuntimeException(); }
}
