package org.apache.spark.scheduler;
/**
 * Stop the listener bus. It will wait until the queued events have been processed, but drop the
 * new events after stopping.
 */
// not preceding
public  class LiveListenerBus$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final LiveListenerBus$ MODULE$ = null;
  public   LiveListenerBus$ ()  { throw new RuntimeException(); }
  // not preceding
  public  scala.util.DynamicVariable<java.lang.Object> withinListenerThread ()  { throw new RuntimeException(); }
    java.lang.String SHARED_QUEUE ()  { throw new RuntimeException(); }
    java.lang.String APP_STATUS_QUEUE ()  { throw new RuntimeException(); }
    java.lang.String EXECUTOR_MANAGEMENT_QUEUE ()  { throw new RuntimeException(); }
    java.lang.String EVENT_LOG_QUEUE ()  { throw new RuntimeException(); }
}
