package org.apache.spark.util;
/**
 * Estimate the number of bytes that the given object takes up on the JVM heap. The estimate
 * includes space taken up by objects referenced by the given object, their references, and so on
 * and so forth.
 * <p>
 * This is useful for determining the amount of heap space a broadcast variable will occupy on
 * each executor or the amount of space each object will take when caching objects in
 * deserialized form. This is not the same as the serialized size of the object, which will
 * typically be much smaller.
 */
// not preceding
public  class SizeEstimator$ implements org.apache.spark.internal.Logging {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final SizeEstimator$ MODULE$ = null;
  public   SizeEstimator$ ()  { throw new RuntimeException(); }
  // not preceding
  public  long estimate (java.lang.Object obj)  { throw new RuntimeException(); }
}
