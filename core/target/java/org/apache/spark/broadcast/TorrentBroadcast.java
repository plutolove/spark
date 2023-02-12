package org.apache.spark.broadcast;
/**
 * Value of the broadcast object on executors. This is reconstructed by {@link readBroadcastBlock},
 * which builds this value by reading blocks from the driver and/or other executors.
 * <p>
 * On the driver, if the value is required, it is read lazily from the block manager. We hold
 * a soft reference so that it can be garbage collected if required, as we can always reconstruct
 * in the future.
 */
  class TorrentBroadcast<T extends java.lang.Object> extends org.apache.spark.broadcast.Broadcast<T> implements org.apache.spark.internal.Logging, java.io.Serializable {
  static public <T extends java.lang.Object> java.nio.ByteBuffer[] blockifyObject (T obj, int blockSize, org.apache.spark.serializer.Serializer serializer, scala.Option<org.apache.spark.io.CompressionCodec> compressionCodec, scala.reflect.ClassTag<T> evidence$2)  { throw new RuntimeException(); }
  static public <T extends java.lang.Object> T unBlockifyObject (java.io.InputStream[] blocks, org.apache.spark.serializer.Serializer serializer, scala.Option<org.apache.spark.io.CompressionCodec> compressionCodec, scala.reflect.ClassTag<T> evidence$3)  { throw new RuntimeException(); }
  /**
   * Remove all persisted blocks associated with this torrent broadcast on the executors.
   * If removeFromDriver is true, also remove these persisted blocks on the driver.
   * @param id (undocumented)
   * @param removeFromDriver (undocumented)
   * @param blocking (undocumented)
   */
  static public  void unpersist (long id, boolean removeFromDriver, boolean blocking)  { throw new RuntimeException(); }
  static public  org.slf4j.Logger org$apache$spark$internal$Logging$$log_ ()  { throw new RuntimeException(); }
  static public  void org$apache$spark$internal$Logging$$log__$eq (org.slf4j.Logger x$1)  { throw new RuntimeException(); }
  static protected  java.lang.String logName ()  { throw new RuntimeException(); }
  static protected  org.slf4j.Logger log ()  { throw new RuntimeException(); }
  static protected  void logInfo (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logDebug (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logTrace (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logWarning (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logError (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logInfo (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logDebug (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logTrace (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logWarning (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logError (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  boolean isTraceEnabled ()  { throw new RuntimeException(); }
  static protected  void initializeLogIfNecessary (boolean isInterpreter)  { throw new RuntimeException(); }
  static protected  boolean initializeLogIfNecessary (boolean isInterpreter, boolean silent)  { throw new RuntimeException(); }
  static protected  boolean initializeLogIfNecessary$default$2 ()  { throw new RuntimeException(); }
  static   void initializeForcefully (boolean isInterpreter, boolean silent)  { throw new RuntimeException(); }
  // not preceding
  public   TorrentBroadcast (T obj, long id, scala.reflect.ClassTag<T> evidence$1)  { throw new RuntimeException(); }
  protected  T getValue ()  { throw new RuntimeException(); }
  /**
   * Remove all persisted state associated with this Torrent broadcast on the executors.
   * @param blocking (undocumented)
   */
  protected  void doUnpersist (boolean blocking)  { throw new RuntimeException(); }
  /**
   * Remove all persisted state associated with this Torrent broadcast on the executors
   * and driver.
   * @param blocking (undocumented)
   */
  protected  void doDestroy (boolean blocking)  { throw new RuntimeException(); }
}
