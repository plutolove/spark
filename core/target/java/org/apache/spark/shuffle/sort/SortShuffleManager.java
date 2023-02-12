package org.apache.spark.shuffle.sort;
/**
 * A mapping from shuffle ids to the task ids of mappers producing output for those shuffles.
 */
  class SortShuffleManager implements org.apache.spark.shuffle.ShuffleManager, org.apache.spark.internal.Logging {
  // not preceding
  static public  int MAX_SHUFFLE_OUTPUT_PARTITIONS_FOR_SERIALIZED_MODE ()  { throw new RuntimeException(); }
  /**
   * The local property key for continuous shuffle block fetching feature.
   * @return (undocumented)
   */
  static public  java.lang.String FETCH_SHUFFLE_BLOCKS_IN_BATCH_ENABLED_KEY ()  { throw new RuntimeException(); }
  /**
   * Helper method for determining whether a shuffle reader should fetch the continuous blocks
   * in batch.
   * @param startPartition (undocumented)
   * @param endPartition (undocumented)
   * @param context (undocumented)
   * @return (undocumented)
   */
  static public  boolean canUseBatchFetch (int startPartition, int endPartition, org.apache.spark.TaskContext context)  { throw new RuntimeException(); }
  /**
   * Helper method for determining whether a shuffle should use an optimized serialized shuffle
   * path or whether it should fall back to the original path that operates on deserialized objects.
   * @param dependency (undocumented)
   * @return (undocumented)
   */
  static public  boolean canUseSerializedShuffle (org.apache.spark.ShuffleDependency<?, ?, ?> dependency)  { throw new RuntimeException(); }
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
  public   SortShuffleManager (org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  public  org.apache.spark.shuffle.IndexShuffleBlockResolver shuffleBlockResolver ()  { throw new RuntimeException(); }
  /**
   * Obtains a {@link ShuffleHandle} to pass to tasks.
   * @param shuffleId (undocumented)
   * @param dependency (undocumented)
   * @return (undocumented)
   */
  public <K extends java.lang.Object, V extends java.lang.Object, C extends java.lang.Object> org.apache.spark.shuffle.ShuffleHandle registerShuffle (int shuffleId, org.apache.spark.ShuffleDependency<K, V, C> dependency)  { throw new RuntimeException(); }
  /**
   * Get a reader for a range of reduce partitions (startPartition to endPartition-1, inclusive).
   * Called on executors by reduce tasks.
   * @param handle (undocumented)
   * @param startPartition (undocumented)
   * @param endPartition (undocumented)
   * @param context (undocumented)
   * @param metrics (undocumented)
   * @return (undocumented)
   */
  public <K extends java.lang.Object, C extends java.lang.Object> org.apache.spark.shuffle.ShuffleReader<K, C> getReader (org.apache.spark.shuffle.ShuffleHandle handle, int startPartition, int endPartition, org.apache.spark.TaskContext context, org.apache.spark.shuffle.ShuffleReadMetricsReporter metrics)  { throw new RuntimeException(); }
  public <K extends java.lang.Object, C extends java.lang.Object> org.apache.spark.shuffle.ShuffleReader<K, C> getReaderForRange (org.apache.spark.shuffle.ShuffleHandle handle, int startMapIndex, int endMapIndex, int startPartition, int endPartition, org.apache.spark.TaskContext context, org.apache.spark.shuffle.ShuffleReadMetricsReporter metrics)  { throw new RuntimeException(); }
  /** Get a writer for a given partition. Called on executors by map tasks. */
  public <K extends java.lang.Object, V extends java.lang.Object> org.apache.spark.shuffle.ShuffleWriter<K, V> getWriter (org.apache.spark.shuffle.ShuffleHandle handle, long mapId, org.apache.spark.TaskContext context, org.apache.spark.shuffle.ShuffleWriteMetricsReporter metrics)  { throw new RuntimeException(); }
  /** Remove a shuffle's metadata from the ShuffleManager. */
  public  boolean unregisterShuffle (int shuffleId)  { throw new RuntimeException(); }
  /** Shut down this ShuffleManager. */
  public  void stop ()  { throw new RuntimeException(); }
}
