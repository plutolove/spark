package org.apache.spark;
/**
 * Program that creates a Spark driver but doesn't call SparkContext#stop() or
 * sys.exit() after finishing.
 */
// not preceding
public  class DriverWithoutCleanup {
  // not preceding
  static public  void main (java.lang.String[] args)  { throw new RuntimeException(); }
}
