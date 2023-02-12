package org.apache.spark.util.collection;
/** Get the value for a given key */
public  class AppendOnlyMap<K extends java.lang.Object, V extends java.lang.Object> implements scala.collection.Iterable<scala.Tuple2<K, V>>, scala.Serializable {
  /**
   * Return whether the next insert will cause the map to grow
   * @return (undocumented)
   */
  static public  int MAXIMUM_CAPACITY ()  { throw new RuntimeException(); }
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  public   AppendOnlyMap (int initialCapacity)  { throw new RuntimeException(); }
  /** Get the value for a given key */
  public  V apply (K key)  { throw new RuntimeException(); }
  /** Set the value for a key */
  public  void update (K key, V value)  { throw new RuntimeException(); }
  /**
   * Set the value for key to updateFunc(hadValue, oldValue), where oldValue will be the old value
   * for key, if any, or null otherwise. Returns the newly updated value.
   * @param key (undocumented)
   * @param updateFunc (undocumented)
   * @return (undocumented)
   */
  public  V changeValue (K key, scala.Function2<java.lang.Object, V, V> updateFunc)  { throw new RuntimeException(); }
  /** Get the next value we should return from next(), or null if we're finished iterating */
  public  scala.collection.Iterator<scala.Tuple2<K, V>> iterator ()  { throw new RuntimeException(); }
  /** Get the next value we should return from next(), or null if we're finished iterating */
  public  int size ()  { throw new RuntimeException(); }
  /** Double the table's size and re-hash everything */
  protected  void growTable ()  { throw new RuntimeException(); }
  /**
   * Return an iterator of the map in sorted order. This provides a way to sort the map without
   * using additional memory, at the expense of destroying the validity of the map.
   * @param keyComparator (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.Iterator<scala.Tuple2<K, V>> destructiveSortedIterator (java.util.Comparator<K> keyComparator)  { throw new RuntimeException(); }
  /**
   * Return whether the next insert will cause the map to grow
   * @return (undocumented)
   */
  public  boolean atGrowThreshold ()  { throw new RuntimeException(); }
}
