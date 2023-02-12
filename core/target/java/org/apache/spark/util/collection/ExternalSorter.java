package org.apache.spark.util.collection;
/**
 * Number of files this sorter has spilled so far.
 * Exposed for testing.
 */
  class ExternalSorter<K extends java.lang.Object, V extends java.lang.Object, C extends java.lang.Object> extends org.apache.spark.util.collection.Spillable<org.apache.spark.util.collection.WritablePartitionedPairCollection<K, C>> implements org.apache.spark.internal.Logging {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  public   ExternalSorter (org.apache.spark.TaskContext context, scala.Option<org.apache.spark.Aggregator<K, V, C>> aggregator, scala.Option<org.apache.spark.Partitioner> partitioner, scala.Option<scala.math.Ordering<K>> ordering, org.apache.spark.serializer.Serializer serializer)  { throw new RuntimeException(); }
  public  long diskBytesSpilled ()  { throw new RuntimeException(); }
  public  long peakMemoryUsedBytes ()  { throw new RuntimeException(); }
  /**
   * Number of files this sorter has spilled so far.
   * Exposed for testing.
   * @return (undocumented)
   */
    int numSpills ()  { throw new RuntimeException(); }
  public  void insertAll (scala.collection.Iterator<scala.Product2<K, V>> records)  { throw new RuntimeException(); }
  /**
   * Spill our in-memory collection to a sorted file that we can merge later.
   * We add this file into <code>spilledFiles</code> to find it later.
   * <p>
   * @param collection whichever collection we're using (map or buffer)
   */
  protected  void spill (org.apache.spark.util.collection.WritablePartitionedPairCollection<K, C> collection)  { throw new RuntimeException(); }
  /**
   * Force to spilling the current in-memory collection to disk to release memory,
   * It will be called by TaskMemoryManager when there is not enough memory for the task.
   * @return (undocumented)
   */
  protected  boolean forceSpill ()  { throw new RuntimeException(); }
  // not preceding
  public  scala.collection.Iterator<scala.Tuple2<scala.Tuple2<java.lang.Object, K>, C>> destructiveIterator (scala.collection.Iterator<scala.Tuple2<scala.Tuple2<java.lang.Object, K>, C>> memoryIterator)  { throw new RuntimeException(); }
  /**
   * Return an iterator over all the data written to this object, grouped by partition and
   * aggregated by the requested aggregator. For each partition we then have an iterator over its
   * contents, and these are expected to be accessed in order (you can't "skip ahead" to one
   * partition without reading the previous one). Guaranteed to return a key-value pair for each
   * partition, in order of partition ID.
   * <p>
   * For now, we just merge all the spilled files in once pass, but this can be modified to
   * support hierarchical merging.
   * Exposed for testing.
   * @return (undocumented)
   */
  public  scala.collection.Iterator<scala.Tuple2<java.lang.Object, scala.collection.Iterator<scala.Product2<K, C>>>> partitionedIterator ()  { throw new RuntimeException(); }
  /**
   * Return an iterator over all the data written to this object, aggregated by our aggregator.
   * @return (undocumented)
   */
  public  scala.collection.Iterator<scala.Product2<K, C>> iterator ()  { throw new RuntimeException(); }
  /**
   * TODO(SPARK-28764): remove this, as this is only used by UnsafeRowSerializerSuite in the SQL
   * project. We should figure out an alternative way to test that so that we can remove this
   * otherwise unused code path.
   * @param blockId (undocumented)
   * @param outputFile (undocumented)
   * @return (undocumented)
   */
  public  long[] writePartitionedFile (org.apache.spark.storage.BlockId blockId, java.io.File outputFile)  { throw new RuntimeException(); }
  /**
   * Write all the data added into this ExternalSorter into a map output writer that pushes bytes
   * to some arbitrary backing store. This is called by the SortShuffleWriter.
   * <p>
   * @return array of lengths, in bytes, of each partition of the file (used by map output tracker)
   * @param shuffleId (undocumented)
   * @param mapId (undocumented)
   * @param mapOutputWriter (undocumented)
   */
  public  void writePartitionedMapOutput (int shuffleId, long mapId, org.apache.spark.shuffle.api.ShuffleMapOutputWriter mapOutputWriter)  { throw new RuntimeException(); }
  public  void stop ()  { throw new RuntimeException(); }
}
