package org.apache.spark;
/** Set to the MapOutputTrackerMasterEndpoint living on the driver. */
 abstract class MapOutputTracker implements org.apache.spark.internal.Logging {
  // not preceding
  static public  java.lang.String ENDPOINT_NAME ()  { throw new RuntimeException(); }
  static public  scala.Tuple2<byte[], org.apache.spark.broadcast.Broadcast<byte[]>> serializeMapStatuses (org.apache.spark.scheduler.MapStatus[] statuses, org.apache.spark.broadcast.BroadcastManager broadcastManager, boolean isLocal, int minBroadcastSize, org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  static public  org.apache.spark.scheduler.MapStatus[] deserializeMapStatuses (byte[] bytes, org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  /**
   * Given an array of map statuses and a range of map output partitions, returns a sequence that,
   * for each block manager ID, lists the shuffle block IDs and corresponding shuffle block sizes
   * stored at that block manager.
   * Note that empty blocks are filtered in the result.
   * <p>
   * If any of the statuses is null (indicating a missing location due to a failed mapper),
   * throws a FetchFailedException.
   * <p>
   * @param shuffleId Identifier for the shuffle
   * @param startPartition Start of map output partition ID range (included in range)
   * @param endPartition End of map output partition ID range (excluded from range)
   * @param statuses List of map statuses, indexed by map partition index.
   * @param startMapIndex Start Map index.
   * @param endMapIndex End Map index.
   * @return A sequence of 2-item tuples, where the first item in the tuple is a BlockManagerId,
   *         and the second item is a sequence of (shuffle block id, shuffle block size, map index)
   *         tuples describing the shuffle blocks that are stored at that block manager.
   */
  static public  scala.collection.Iterator<scala.Tuple2<org.apache.spark.storage.BlockManagerId, scala.collection.Seq<scala.Tuple3<org.apache.spark.storage.BlockId, java.lang.Object, java.lang.Object>>>> convertMapStatuses (int shuffleId, int startPartition, int endPartition, org.apache.spark.scheduler.MapStatus[] statuses, int startMapIndex, int endMapIndex)  { throw new RuntimeException(); }
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
  public   MapOutputTracker (org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.rpc.RpcEndpointRef trackerEndpoint ()  { throw new RuntimeException(); }
  /**
   * The driver-side counter is incremented every time that a map output is lost. This value is sent
   * to executors as part of tasks, where executors compare the new epoch number to the highest
   * epoch number that they received in the past. If the new epoch number is higher then executors
   * will clear their local caches of map output statuses and will re-fetch (possibly updated)
   * statuses from the driver.
   * @return (undocumented)
   */
  protected  long epoch ()  { throw new RuntimeException(); }
  protected  java.lang.Object epochLock ()  { throw new RuntimeException(); }
  /**
   * Send a message to the trackerEndpoint and get its result within a default timeout, or
   * throw a SparkException if this fails.
   * @param message (undocumented)
   * @param evidence$1 (undocumented)
   * @return (undocumented)
   */
  protected <T extends java.lang.Object> T askTracker (Object message, scala.reflect.ClassTag<T> evidence$1)  { throw new RuntimeException(); }
  /** Send a one-way message to the trackerEndpoint, to which we expect it to reply with true. */
  protected  void sendTracker (Object message)  { throw new RuntimeException(); }
  public  scala.collection.Iterator<scala.Tuple2<org.apache.spark.storage.BlockManagerId, scala.collection.Seq<scala.Tuple3<org.apache.spark.storage.BlockId, java.lang.Object, java.lang.Object>>>> getMapSizesByExecutorId (int shuffleId, int reduceId)  { throw new RuntimeException(); }
  /**
   * Called from executors to get the server URIs and output sizes for each shuffle block that
   * needs to be read from a given range of map output partitions (startPartition is included but
   * endPartition is excluded from the range).
   * <p>
   * @return A sequence of 2-item tuples, where the first item in the tuple is a BlockManagerId,
   *         and the second item is a sequence of (shuffle block id, shuffle block size, map index)
   *         tuples describing the shuffle blocks that are stored at that block manager.
   * @param shuffleId (undocumented)
   * @param startPartition (undocumented)
   * @param endPartition (undocumented)
   */
  public abstract  scala.collection.Iterator<scala.Tuple2<org.apache.spark.storage.BlockManagerId, scala.collection.Seq<scala.Tuple3<org.apache.spark.storage.BlockId, java.lang.Object, java.lang.Object>>>> getMapSizesByExecutorId (int shuffleId, int startPartition, int endPartition)  ;
  /**
   * Called from executors to get the server URIs and output sizes for each shuffle block that
   * needs to be read from a given range of map output partitions (startPartition is included but
   * endPartition is excluded from the range) and is produced by
   * a range of mappers (startMapIndex, endMapIndex, startMapIndex is included and
   * the endMapIndex is excluded).
   * <p>
   * @return A sequence of 2-item tuples, where the first item in the tuple is a BlockManagerId,
   *         and the second item is a sequence of (shuffle block id, shuffle block size, map index)
   *         tuples describing the shuffle blocks that are stored at that block manager.
   * @param shuffleId (undocumented)
   * @param startMapIndex (undocumented)
   * @param endMapIndex (undocumented)
   * @param startPartition (undocumented)
   * @param endPartition (undocumented)
   */
  public abstract  scala.collection.Iterator<scala.Tuple2<org.apache.spark.storage.BlockManagerId, scala.collection.Seq<scala.Tuple3<org.apache.spark.storage.BlockId, java.lang.Object, java.lang.Object>>>> getMapSizesByRange (int shuffleId, int startMapIndex, int endMapIndex, int startPartition, int endPartition)  ;
  /**
   * Deletes map output status information for the specified shuffle stage.
   * @param shuffleId (undocumented)
   */
  public abstract  void unregisterShuffle (int shuffleId)  ;
  public  void stop ()  { throw new RuntimeException(); }
}
