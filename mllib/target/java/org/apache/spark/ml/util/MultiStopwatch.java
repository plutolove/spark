package org.apache.spark.ml.util;
/**
 * Adds a local stopwatch.
 * param:  name stopwatch name
 */
  class MultiStopwatch implements scala.Serializable {
  // not preceding
  public   MultiStopwatch (org.apache.spark.SparkContext sc)  { throw new RuntimeException(); }
  /**
   * Adds a distributed stopwatch.
   * @param name stopwatch name
   * @return (undocumented)
   */
  public  org.apache.spark.ml.util.MultiStopwatch addDistributed (java.lang.String name)  { throw new RuntimeException(); }
  /**
   * Adds a local stopwatch.
   * @param name stopwatch name
   * @return (undocumented)
   */
  public  org.apache.spark.ml.util.MultiStopwatch addLocal (java.lang.String name)  { throw new RuntimeException(); }
  /**
   * Gets a stopwatch.
   * @param name stopwatch name
   * @return (undocumented)
   */
  public  org.apache.spark.ml.util.Stopwatch apply (java.lang.String name)  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
