package org.apache.spark.sql.execution.streaming;
/**
 * RunIds of active queries whose events are supposed to be forwarded by this ListenerBus
 * to registered <code>StreamingQueryListeners</code>.
 * <p>
 * Note 1: We need to track runIds instead of ids because the runId is unique for every started
 * query, even it its a restart. So even if a query is restarted, this bus will identify them
 * separately and correctly account for the restart.
 * <p>
 * Note 2: This list needs to be maintained separately from the
 * <code>StreamingQueryManager.activeQueries</code> because a terminated query is cleared from
 * <code>StreamingQueryManager.activeQueries</code> as soon as it is stopped, but the this ListenerBus
 * must clear a query only after the termination event of that query has been posted.
 */
public  class StreamingQueryListenerBus extends org.apache.spark.scheduler.SparkListener implements org.apache.spark.util.ListenerBus<org.apache.spark.sql.streaming.StreamingQueryListener, org.apache.spark.sql.streaming.StreamingQueryListener.Event> {
  // not preceding
  static public  java.lang.String STREAM_EVENT_QUERY ()  { throw new RuntimeException(); }
  // not preceding
  public   StreamingQueryListenerBus (org.apache.spark.scheduler.LiveListenerBus sparkListenerBus)  { throw new RuntimeException(); }
  /**
   * Post a StreamingQueryListener event to the added StreamingQueryListeners.
   * Note that only the QueryStarted event is posted to the listener synchronously. Other events
   * are dispatched to Spark listener bus. This method is guaranteed to be called by queries in
   * the same SparkSession as this listener.
   * @param event (undocumented)
   */
  public  void post (org.apache.spark.sql.streaming.StreamingQueryListener.Event event)  { throw new RuntimeException(); }
  /**
   * Override the parent <code>postToAll</code> to remove the query id from <code>activeQueryRunIds</code> after all
   * the listeners process <code>QueryTerminatedEvent</code>. (SPARK-19594)
   * @param event (undocumented)
   */
  public  void postToAll (org.apache.spark.sql.streaming.StreamingQueryListener.Event event)  { throw new RuntimeException(); }
  public  void onOtherEvent (org.apache.spark.scheduler.SparkListenerEvent event)  { throw new RuntimeException(); }
  /**
   * Dispatch events to registered StreamingQueryListeners. Only the events associated queries
   * started in the same SparkSession as this ListenerBus will be dispatched to the listeners.
   * @param listener (undocumented)
   * @param event (undocumented)
   */
  protected  void doPostEvent (org.apache.spark.sql.streaming.StreamingQueryListener listener, org.apache.spark.sql.streaming.StreamingQueryListener.Event event)  { throw new RuntimeException(); }
}
