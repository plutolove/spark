package org.apache.spark.rdd;
/**
 * Sort the RDD by key, so that each partition contains a sorted range of the elements. Calling
 * <code>collect</code> or <code>save</code> on the resulting RDD will return or output an ordered list of records
 * (in the <code>save</code> case, they will be written to multiple <code>part-X</code> files in the filesystem, in
 * order of the keys).
 */
public  class OrderedRDDFunctions<K extends java.lang.Object, V extends java.lang.Object, P extends scala.Product2<K, V>> implements org.apache.spark.internal.Logging, scala.Serializable {
  // not preceding
  public   OrderedRDDFunctions (org.apache.spark.rdd.RDD<P> self, scala.math.Ordering<K> evidence$1, scala.reflect.ClassTag<K> evidence$2, scala.reflect.ClassTag<V> evidence$3, scala.reflect.ClassTag<P> evidence$4)  { throw new RuntimeException(); }
  /**
   * Returns an RDD containing only the elements in the inclusive range <code>lower</code> to <code>upper</code>.
   * If the RDD has been partitioned using a <code>RangePartitioner</code>, then this operation can be
   * performed efficiently by only scanning the partitions that might contain matching elements.
   * Otherwise, a standard <code>filter</code> is applied to all partitions.
   * @param lower (undocumented)
   * @param upper (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.rdd.RDD<P> filterByRange (K lower, K upper)  { throw new RuntimeException(); }
  /**
   * Repartition the RDD according to the given partitioner and, within each resulting partition,
   * sort records by their keys.
   * <p>
   * This is more efficient than calling <code>repartition</code> and then sorting within each partition
   * because it can push the sorting down into the shuffle machinery.
   * @param partitioner (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.rdd.RDD<scala.Tuple2<K, V>> repartitionAndSortWithinPartitions (org.apache.spark.Partitioner partitioner)  { throw new RuntimeException(); }
  /**
   * Sort the RDD by key, so that each partition contains a sorted range of the elements. Calling
   * <code>collect</code> or <code>save</code> on the resulting RDD will return or output an ordered list of records
   * (in the <code>save</code> case, they will be written to multiple <code>part-X</code> files in the filesystem, in
   * order of the keys).
   * @param ascending (undocumented)
   * @param numPartitions (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.rdd.RDD<scala.Tuple2<K, V>> sortByKey (boolean ascending, int numPartitions)  { throw new RuntimeException(); }
}
