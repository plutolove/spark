package org.apache.spark.util;
/**
 * @return <code>ManualClock</code> with initial time 0
 */
  class ManualClock implements org.apache.spark.util.Clock {
  // not preceding
  public   ManualClock (long time)  { throw new RuntimeException(); }
  // not preceding
  public   ManualClock ()  { throw new RuntimeException(); }
  /**
   * @param timeToAdd time (in milliseconds) to add to the clock's time
   */
  public  void advance (long timeToAdd)  { throw new RuntimeException(); }
  public  long getTimeMillis ()  { throw new RuntimeException(); }
  public  long nanoTime ()  { throw new RuntimeException(); }
  /**
   * @param timeToSet new time (in milliseconds) that the clock should represent
   */
  public  void setTime (long timeToSet)  { throw new RuntimeException(); }
  /**
   * @param targetTime block until the clock time is set or advanced to at least this time
   * @return current time reported by the clock when waiting finishes
   */
  public  long waitTillTime (long targetTime)  { throw new RuntimeException(); }
}
