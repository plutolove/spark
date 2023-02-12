package org.apache.spark.broadcast;
/**
 * Flag signifying whether the broadcast variable is valid
 * (that is, not already destroyed) or not.
 */
public abstract class Broadcast<T extends java.lang.Object> implements java.io.Serializable, org.apache.spark.internal.Logging {
  // not preceding
  public   Broadcast (long id, scala.reflect.ClassTag<T> evidence$1)  { throw new RuntimeException(); }
  /** Check if this broadcast is valid. If not valid, exception is thrown. */
  protected  void assertValid ()  { throw new RuntimeException(); }
  /**
   * Destroy all data and metadata related to this broadcast variable. Use this with caution;
   * once a broadcast variable has been destroyed, it cannot be used again.
   */
  public  void destroy ()  { throw new RuntimeException(); }
  /**
   * Destroy all data and metadata related to this broadcast variable. Use this with caution;
   * once a broadcast variable has been destroyed, it cannot be used again.
   * @param blocking Whether to block until destroy has completed
   */
    void destroy (boolean blocking)  { throw new RuntimeException(); }
  /**
   * Actually destroy all data and metadata related to this broadcast variable.
   * Implementation of Broadcast class must define their own logic to destroy their own
   * state.
   * @param blocking (undocumented)
   */
  protected abstract  void doDestroy (boolean blocking)  ;
  /**
   * Actually unpersist the broadcasted value on the executors. Concrete implementations of
   * Broadcast class must define their own logic to unpersist their own data.
   * @param blocking (undocumented)
   */
  protected abstract  void doUnpersist (boolean blocking)  ;
  /**
   * Actually get the broadcasted value. Concrete implementations of Broadcast class must
   * define their own way to get the value.
   * @return (undocumented)
   */
  protected abstract  T getValue ()  ;
  public  long id ()  { throw new RuntimeException(); }
  /**
   * Whether this Broadcast is actually usable. This should be false once persisted state is
   * removed from the driver.
   * @return (undocumented)
   */
    boolean isValid ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
  /**
   * Asynchronously delete cached copies of this broadcast on the executors.
   * If the broadcast is used after this is called, it will need to be re-sent to each executor.
   */
  public  void unpersist ()  { throw new RuntimeException(); }
  /**
   * Delete cached copies of this broadcast on the executors. If the broadcast is used after
   * this is called, it will need to be re-sent to each executor.
   * @param blocking Whether to block until unpersisting has completed
   */
  public  void unpersist (boolean blocking)  { throw new RuntimeException(); }
  /** Get the broadcasted value. */
  public  T value ()  { throw new RuntimeException(); }
}
