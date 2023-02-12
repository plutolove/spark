package org.apache.spark.ml.tree.impl;
/**
 * Starts a new timer, or re-starts a stopped timer.
 */
  class TimeTracker implements scala.Serializable {
  // not preceding
  public   TimeTracker ()  { throw new RuntimeException(); }
  /**
   * Starts a new timer, or re-starts a stopped timer.
   * @param timerLabel (undocumented)
   */
  public  void start (java.lang.String timerLabel)  { throw new RuntimeException(); }
  /**
   * Stops a timer and returns the elapsed time in seconds.
   * @param timerLabel (undocumented)
   * @return (undocumented)
   */
  public  double stop (java.lang.String timerLabel)  { throw new RuntimeException(); }
  /**
   * Print all timing results in seconds.
   * @return (undocumented)
   */
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}