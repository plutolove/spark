package org.apache.spark.status;
/**
 * Returns an updated view of entity data, to be stored in the status store, reflecting the
 * latest information collected by the listener.
 */
 abstract class LiveEntity {
  // not preceding
  public   LiveEntity ()  { throw new RuntimeException(); }
  /**
   * Returns an updated view of entity data, to be stored in the status store, reflecting the
   * latest information collected by the listener.
   * @return (undocumented)
   */
  protected abstract  Object doUpdate ()  ;
  // not preceding
  public  long lastWriteTime ()  { throw new RuntimeException(); }
  public  void write (org.apache.spark.status.ElementTrackingStore store, long now, boolean checkTriggers)  { throw new RuntimeException(); }
}
