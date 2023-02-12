package org.apache.spark.shuffle;
/**
 * Register a shuffle with the manager and obtain a handle for it to pass to tasks.
 */
public  interface ShuffleManager {
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
  public <K extends java.lang.Object, C extends java.lang.Object> org.apache.spark.shuffle.ShuffleReader<K, C> getReader (org.apache.spark.shuffle.ShuffleHandle handle, int startPartition, int endPartition, org.apache.spark.TaskContext context, org.apache.spark.shuffle.ShuffleReadMetricsReporter metrics)  ;
  /**
   * Get a reader for a range of reduce partitions (startPartition to endPartition-1, inclusive) to
   * read from map output (startMapIndex to endMapIndex - 1, inclusive).
   * Called on executors by reduce tasks.
   * @param handle (undocumented)
   * @param startMapIndex (undocumented)
   * @param endMapIndex (undocumented)
   * @param startPartition (undocumented)
   * @param endPartition (undocumented)
   * @param context (undocumented)
   * @param metrics (undocumented)
   * @return (undocumented)
   */
  public <K extends java.lang.Object, C extends java.lang.Object> org.apache.spark.shuffle.ShuffleReader<K, C> getReaderForRange (org.apache.spark.shuffle.ShuffleHandle handle, int startMapIndex, int endMapIndex, int startPartition, int endPartition, org.apache.spark.TaskContext context, org.apache.spark.shuffle.ShuffleReadMetricsReporter metrics)  ;
  /** Get a writer for a given partition. Called on executors by map tasks. */
  public <K extends java.lang.Object, V extends java.lang.Object> org.apache.spark.shuffle.ShuffleWriter<K, V> getWriter (org.apache.spark.shuffle.ShuffleHandle handle, long mapId, org.apache.spark.TaskContext context, org.apache.spark.shuffle.ShuffleWriteMetricsReporter metrics)  ;
  // not preceding
  public <K extends java.lang.Object, V extends java.lang.Object, C extends java.lang.Object> org.apache.spark.shuffle.ShuffleHandle registerShuffle (int shuffleId, org.apache.spark.ShuffleDependency<K, V, C> dependency)  ;
  /**
   * Return a resolver capable of retrieving shuffle block data based on block coordinates.
   * @return (undocumented)
   */
  public  org.apache.spark.shuffle.ShuffleBlockResolver shuffleBlockResolver ()  ;
  /** Shut down this ShuffleManager. */
  public  void stop ()  ;
  /**
   * Remove a shuffle's metadata from the ShuffleManager.
   * @return true if the metadata removed successfully, otherwise false.
   * @param shuffleId (undocumented)
   */
  public  boolean unregisterShuffle (int shuffleId)  ;
}
