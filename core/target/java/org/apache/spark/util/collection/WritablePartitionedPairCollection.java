package org.apache.spark.util.collection;
/**
 * Insert a key-value pair with a partition into the collection
 */
public  interface WritablePartitionedPairCollection<K extends java.lang.Object, V extends java.lang.Object> {
  /**
   * Insert a key-value pair with a partition into the collection
   * @param partition (undocumented)
   * @param key (undocumented)
   * @param value (undocumented)
   */
  public  void insert (int partition, K key, V value)  ;
  /**
   * Iterate through the data in order of partition ID and then the given comparator. This may
   * destroy the underlying collection.
   * @param keyComparator (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.Iterator<scala.Tuple2<scala.Tuple2<java.lang.Object, K>, V>> partitionedDestructiveSortedIterator (scala.Option<java.util.Comparator<K>> keyComparator)  ;
  /**
   * Iterate through the data and write out the elements instead of returning them. Records are
   * returned in order of their partition ID and then the given comparator.
   * This may destroy the underlying collection.
   * @param keyComparator (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.util.collection.WritablePartitionedIterator destructiveSortedWritablePartitionedIterator (scala.Option<java.util.Comparator<K>> keyComparator)  ;
}
