package org.apache.spark.graphx.util.collection;
/**
 * Allocate an OpenHashMap with a fixed initial capacity
 */
  class GraphXPrimitiveKeyOpenHashMap<K extends java.lang.Object, V extends java.lang.Object> implements scala.collection.Iterable<scala.Tuple2<K, V>>, scala.Serializable {
  // not preceding
  public   GraphXPrimitiveKeyOpenHashMap (org.apache.spark.util.collection.OpenHashSet<K> keySet, java.lang.Object _values, scala.reflect.ClassTag<K> evidence$1, scala.reflect.ClassTag<V> evidence$2)  { throw new RuntimeException(); }
  // not preceding
  public   GraphXPrimitiveKeyOpenHashMap (int initialCapacity, scala.reflect.ClassTag<K> evidence$3, scala.reflect.ClassTag<V> evidence$4)  { throw new RuntimeException(); }
  /**
   * Allocate an OpenHashMap with a default initial capacity, providing a true
   * no-argument constructor.
   * @param evidence$5 (undocumented)
   * @param evidence$6 (undocumented)
   */
  public   GraphXPrimitiveKeyOpenHashMap (scala.reflect.ClassTag<K> evidence$5, scala.reflect.ClassTag<V> evidence$6)  { throw new RuntimeException(); }
  /**
   * Allocate an OpenHashMap with a fixed initial capacity
   * @param keySet (undocumented)
   * @param evidence$7 (undocumented)
   * @param evidence$8 (undocumented)
   */
  public   GraphXPrimitiveKeyOpenHashMap (org.apache.spark.util.collection.OpenHashSet<K> keySet, scala.reflect.ClassTag<K> evidence$7, scala.reflect.ClassTag<V> evidence$8)  { throw new RuntimeException(); }
  public  java.lang.Object _values ()  { throw new RuntimeException(); }
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
  /** Get the value for a given key, or returns elseValue if it doesn't exist. */
  public  V getOrElse (K k, V elseValue)  { throw new RuntimeException(); }
  /** Get the next value we should return from next(), or null if we're finished iterating */
  protected  scala.Function1<java.lang.Object, scala.runtime.BoxedUnit> grow ()  { throw new RuntimeException(); }
  /** Get the next value we should return from next(), or null if we're finished iterating */
  public  scala.collection.Iterator<scala.Tuple2<K, V>> iterator ()  { throw new RuntimeException(); }
  public  org.apache.spark.util.collection.OpenHashSet<K> keySet ()  { throw new RuntimeException(); }
  protected  scala.Function2<java.lang.Object, java.lang.Object, scala.runtime.BoxedUnit> move ()  { throw new RuntimeException(); }
  /** Set the value for a key */
  public  void setMerge (K k, V v, scala.Function2<V, V, V> mergeF)  { throw new RuntimeException(); }
  public  int size ()  { throw new RuntimeException(); }
  /** Set the value for a key */
  public  void update (K k, V v)  { throw new RuntimeException(); }
}
