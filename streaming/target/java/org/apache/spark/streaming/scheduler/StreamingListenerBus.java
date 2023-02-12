package org.apache.spark.streaming.scheduler;
/**
 * Post a StreamingListenerEvent to the Spark listener bus asynchronously. This event will be
 * dispatched to all StreamingListeners in the thread of the Spark listener bus.
 */
  class StreamingListenerBus extends org.apache.spark.scheduler.SparkListener implements org.apache.spark.util.ListenerBus<org.apache.spark.streaming.scheduler.StreamingListener, org.apache.spark.streaming.scheduler.StreamingListenerEvent> {
  // not preceding
  public   StreamingListenerBus (org.apache.spark.scheduler.LiveListenerBus sparkListenerBus)  { throw new RuntimeException(); }
  protected  void doPostEvent (org.apache.spark.streaming.scheduler.StreamingListener listener, org.apache.spark.streaming.scheduler.StreamingListenerEvent event)  { throw new RuntimeException(); }
  public  void onOtherEvent (org.apache.spark.scheduler.SparkListenerEvent event)  { throw new RuntimeException(); }
  // not preceding
  public  void post (org.apache.spark.streaming.scheduler.StreamingListenerEvent event)  { throw new RuntimeException(); }
  /**
   * Register this one with the Spark listener bus so that it can receive Streaming events and
   * forward them to StreamingListeners.
   */
  public  void start ()  { throw new RuntimeException(); }
  /**
   * Unregister this one with the Spark listener bus and all StreamingListeners won't receive any
   * events after that.
   */
  public  void stop ()  { throw new RuntimeException(); }
}
