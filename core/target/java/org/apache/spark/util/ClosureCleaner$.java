package org.apache.spark.util;
/**
 * Return a list of classes that represent closures enclosed in the given closure object.
 */
// not preceding
public  class ClosureCleaner$ implements org.apache.spark.internal.Logging {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final ClosureCleaner$ MODULE$ = null;
  public   ClosureCleaner$ ()  { throw new RuntimeException(); }
  // not preceding
    org.apache.xbean.asm7.ClassReader getClassReader (java.lang.Class<?> cls)  { throw new RuntimeException(); }
  /**
   * Clean the given closure in place.
   * <p>
   * More specifically, this renders the given closure serializable as long as it does not
   * explicitly reference unserializable objects.
   * <p>
   * @param closure the closure to clean
   * @param checkSerializable whether to verify that the closure is serializable after cleaning
   * @param cleanTransitively whether to clean enclosing closures transitively
   */
  public  void clean (java.lang.Object closure, boolean checkSerializable, boolean cleanTransitively)  { throw new RuntimeException(); }
}
