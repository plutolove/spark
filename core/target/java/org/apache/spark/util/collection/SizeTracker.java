package org.apache.spark.util.collection;
/**
 * Controls the base of the exponential which governs the rate of sampling.
 * E.g., a value of 2 would mean we sample at 1, 2, 4, 8, ... elements.
 */
public  interface SizeTracker {
  // not preceding
  static public  class Sample implements scala.Product, scala.Serializable {
    // not preceding
    public  long size ()  { throw new RuntimeException(); }
    public  long numUpdates ()  { throw new RuntimeException(); }
    // not preceding
    public   Sample (long size, long numUpdates)  { throw new RuntimeException(); }
  }
  // not preceding
  static public  class Sample$ extends scala.runtime.AbstractFunction2<java.lang.Object, java.lang.Object, org.apache.spark.util.collection.SizeTracker.Sample> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final Sample$ MODULE$ = null;
    public   Sample$ ()  { throw new RuntimeException(); }
  }
  /**
   * Reset samples collected so far.
   * This should be called after the collection undergoes a dramatic change in size.
   */
  public  void resetSamples ()  ;
  /**
   * Callback to be invoked after every update.
   */
  public  void afterUpdate ()  ;
  /**
   * Take a new sample of the current collection's size.
   */
  public  void takeSample ()  ;
  /**
   * Estimate the current size of the collection in bytes. O(1) time.
   * @return (undocumented)
   */
  public  long estimateSize ()  ;
}
