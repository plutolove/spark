package org.apache.spark.util;
/**
 * @return the same time (milliseconds since the epoch)
 *         as is reported by <code>System.currentTimeMillis()</code>
 */
  class SystemClock implements org.apache.spark.util.Clock {
  // not preceding
  public   SystemClock ()  { throw new RuntimeException(); }
  /**
   * @return the same time (milliseconds since the epoch)
   *         as is reported by <code>System.currentTimeMillis()</code>
   */
  public  long getTimeMillis ()  { throw new RuntimeException(); }
  // not preceding
  public  long minPollTime ()  { throw new RuntimeException(); }
  /**
   * @return value reported by <code>System.nanoTime()</code>.
   */
  public  long nanoTime ()  { throw new RuntimeException(); }
  /**
   * @param targetTime block until the current time is at least this value
   * @return current system time when wait has completed
   */
  public  long waitTillTime (long targetTime)  { throw new RuntimeException(); }
}
