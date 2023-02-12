package org.apache.spark.util.collection;
/**
 * A set of specialized hash function implementation to avoid boxing hash code computation
 * in the specialized implementation of OpenHashSet.
 */
// not preceding
public  class OpenHashSet$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final OpenHashSet$ MODULE$ = null;
  public   OpenHashSet$ ()  { throw new RuntimeException(); }
  // not preceding
  public  int MAX_CAPACITY ()  { throw new RuntimeException(); }
  public  int INVALID_POS ()  { throw new RuntimeException(); }
  public  int NONEXISTENCE_MASK ()  { throw new RuntimeException(); }
  public  int POSITION_MASK ()  { throw new RuntimeException(); }
}
