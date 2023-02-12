package org.apache.spark.util.collection;
/** Add an element into the buffer */
  class PartitionedPairBuffer<K extends java.lang.Object, V extends java.lang.Object> implements org.apache.spark.util.collection.WritablePartitionedPairCollection<K, V>, org.apache.spark.util.collection.SizeTracker {
  /** Iterate through the data in a given order. For this class this is not really destructive. */
  static public  int MAXIMUM_CAPACITY ()  { throw new RuntimeException(); }
  // not preceding
  public   PartitionedPairBuffer (int initialCapacity)  { throw new RuntimeException(); }
  /** Add an element into the buffer */
  public  void insert (int partition, K key, V value)  { throw new RuntimeException(); }
  /** Iterate through the data in a given order. For this class this is not really destructive. */
  public  scala.collection.Iterator<scala.Tuple2<scala.Tuple2<java.lang.Object, K>, V>> partitionedDestructiveSortedIterator (scala.Option<java.util.Comparator<K>> keyComparator)  { throw new RuntimeException(); }
}
