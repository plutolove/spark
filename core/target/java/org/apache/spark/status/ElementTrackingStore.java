package org.apache.spark.status;
/**
 * Register a trigger that will be fired once the number of elements of a given type reaches
 * the given threshold.
 * <p>
 * param:  klass The type to monitor.
 * param:  threshold The number of elements that should trigger the action.
 * param:  action Action to run when the threshold is reached; takes as a parameter the number
 *               of elements of the registered type currently known to be in the store.
 */
  class ElementTrackingStore implements org.apache.spark.util.kvstore.KVStore {
  // not preceding
  // not preceding
  static public  class WriteQueued$ implements org.apache.spark.status.ElementTrackingStore.WriteQueueResult {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final WriteQueued$ MODULE$ = null;
    public   WriteQueued$ ()  { throw new RuntimeException(); }
  }
  // not preceding
  // not preceding
  static public  class WriteSkippedQueue$ implements org.apache.spark.status.ElementTrackingStore.WriteQueueResult {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final WriteSkippedQueue$ MODULE$ = null;
    public   WriteSkippedQueue$ ()  { throw new RuntimeException(); }
  }
  // not preceding
  static public  interface WriteQueueResult {
  }
  // not preceding
  public   ElementTrackingStore (org.apache.spark.util.kvstore.KVStore store, org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  /**
   * Register a trigger that will be fired once the number of elements of a given type reaches
   * the given threshold.
   * <p>
   * @param klass The type to monitor.
   * @param threshold The number of elements that should trigger the action.
   * @param action Action to run when the threshold is reached; takes as a parameter the number
   *               of elements of the registered type currently known to be in the store.
   */
  public  void addTrigger (java.lang.Class<?> klass, long threshold, scala.Function1<java.lang.Object, scala.runtime.BoxedUnit> action)  { throw new RuntimeException(); }
  /**
   * Adds a trigger to be executed before the store is flushed. This normally happens before
   * closing, and is useful for flushing intermediate state to the store, e.g. when replaying
   * in-progress applications through the SHS.
   * <p>
   * Flush triggers are called synchronously in the same thread that is closing the store.
   * @param action (undocumented)
   */
  public  void onFlush (scala.Function0<scala.runtime.BoxedUnit> action)  { throw new RuntimeException(); }
  /**
   * Enqueues an action to be executed asynchronously. The task will run on the calling thread if
   * <code>ASYNC_TRACKING_ENABLED</code> is <code>false</code>.
   * @param fn (undocumented)
   */
  public  void doAsync (scala.Function0<scala.runtime.BoxedUnit> fn)  { throw new RuntimeException(); }
  public <T extends java.lang.Object> T read (java.lang.Class<T> klass, Object naturalKey)  { throw new RuntimeException(); }
  public  void write (Object value)  { throw new RuntimeException(); }
  /** Write an element to the store, optionally checking for whether to fire triggers. */
  public  org.apache.spark.status.ElementTrackingStore.WriteQueueResult write (Object value, boolean checkTriggers)  { throw new RuntimeException(); }
  public <T extends java.lang.Object> boolean removeAllByIndexValues (java.lang.Class<T> klass, java.lang.String index, scala.collection.Iterable<?> indexValues)  { throw new RuntimeException(); }
  public <T extends java.lang.Object> boolean removeAllByIndexValues (java.lang.Class<T> klass, java.lang.String index, java.util.Collection<?> indexValues)  { throw new RuntimeException(); }
  public  void delete (java.lang.Class<?> klass, Object naturalKey)  { throw new RuntimeException(); }
  public <T extends java.lang.Object> T getMetadata (java.lang.Class<T> klass)  { throw new RuntimeException(); }
  public  void setMetadata (Object value)  { throw new RuntimeException(); }
  public <T extends java.lang.Object> org.apache.spark.util.kvstore.KVStoreView<T> view (java.lang.Class<T> klass)  { throw new RuntimeException(); }
  public  long count (java.lang.Class<?> klass)  { throw new RuntimeException(); }
  public  long count (java.lang.Class<?> klass, java.lang.String index, Object indexedValue)  { throw new RuntimeException(); }
  public  void close ()  { throw new RuntimeException(); }
  /** A close() method that optionally leaves the parent store open. */
  public  void close (boolean closeParent)  { throw new RuntimeException(); }
}
