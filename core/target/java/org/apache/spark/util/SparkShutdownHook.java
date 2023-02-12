package org.apache.spark.util;
/**
 * Install a hook to run at shutdown and run all registered hooks in order.
 */
public  class SparkShutdownHook implements java.lang.Comparable<org.apache.spark.util.SparkShutdownHook> {
  // not preceding
  public   SparkShutdownHook (int priority, scala.Function0<scala.runtime.BoxedUnit> hook)  { throw new RuntimeException(); }
  // not preceding
  public  int compareTo (org.apache.spark.util.SparkShutdownHook other)  { throw new RuntimeException(); }
  public  void run ()  { throw new RuntimeException(); }
}
