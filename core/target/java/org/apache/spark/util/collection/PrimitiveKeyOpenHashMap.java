package org.apache.spark.util.collection;
/** Tests whether this map contains a binding for a key. */
  class PrimitiveKeyOpenHashMap<K extends java.lang.Object, V extends java.lang.Object> implements scala.collection.Iterable<scala.Tuple2<K, V>>, scala.Serializable {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  public   PrimitiveKeyOpenHashMap (int initialCapacity, scala.reflect.ClassTag<K> evidence$1, scala.reflect.ClassTag<V> evidence$2)  { throw new RuntimeException(); }
  // not preceding
  public   PrimitiveKeyOpenHashMap (scala.reflect.ClassTag<K> evidence$3, scala.reflect.ClassTag<V> evidence$4)  { throw new RuntimeException(); }
  protected  org.apache.spark.util.collection.OpenHashSet<K> _keySet ()  { throw new RuntimeException(); }
  /** Get the value for a given key */
  public  V apply (K k)  { throw new RuntimeException(); }
  /**
   * If the key doesn't exist yet in the hash map, set its value to defaultValue; otherwise,
   * set its value to mergeValue(oldValue).
   * <p>
   * @return the newly updated value.
   * @param k (undocumented)
   * @param defaultValue (undocumented)
   * @param mergeValue (undocumented)
   */
  public  V changeValue (K k, scala.Function0<V> defaultValue, scala.Function1<V, V> mergeValue)  { throw new RuntimeException(); }
  /** Tests whether this map contains a binding for a key. */
  public  boolean contains (K k)  { throw new RuntimeException(); }
  /** Get the value for a given key, or returns elseValue if it doesn't exist. */
  public  V getOrElse (K k, V elseValue)  { throw new RuntimeException(); }
  /** Get the next value we should return from next(), or null if we're finished iterating */
  protected  scala.Function1<java.lang.Object, scala.runtime.BoxedUnit> grow ()  { throw new RuntimeException(); }
  /** Get the next value we should return from next(), or null if we're finished iterating */
  public  scala.collection.Iterator<scala.Tuple2<K, V>> iterator ()  { throw new RuntimeException(); }
  protected  scala.Function2<java.lang.Object, java.lang.Object, scala.runtime.BoxedUnit> move ()  { throw new RuntimeException(); }
  public  int size ()  { throw new RuntimeException(); }
  /** Set the value for a key */
  public  void update (K k, V v)  { throw new RuntimeException(); }
}
