package org.apache.spark;
/**
 * Program that creates a Spark driver but doesn't call SparkContext#stop() or
 * sys.exit() after finishing.
 */
// not preceding
public  class DriverWithoutCleanup$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final DriverWithoutCleanup$ MODULE$ = null;
  public   DriverWithoutCleanup$ ()  { throw new RuntimeException(); }
  // not preceding
  public  void main (java.lang.String[] args)  { throw new RuntimeException(); }
}
