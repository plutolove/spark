package org.apache.spark.util.collection;
/**
 * Sorts the input buffer within range [lo, hi).
 */
  class Sorter<K extends java.lang.Object, Buffer extends java.lang.Object> {
  // not preceding
  public   Sorter (org.apache.spark.util.collection.SortDataFormat<K, Buffer> s)  { throw new RuntimeException(); }
  /**
   * Sorts the input buffer within range [lo, hi).
   * @param a (undocumented)
   * @param lo (undocumented)
   * @param hi (undocumented)
   * @param c (undocumented)
   */
  public  void sort (Buffer a, int lo, int hi, java.util.Comparator<? super K> c)  { throw new RuntimeException(); }
}
