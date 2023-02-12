package org.apache.spark.streaming.scheduler;
/**
 * Returns if the clock is blocking and the time it started to block is the parameter <code>time</code>.
 */
public  class StreamManualClock extends org.apache.spark.util.ManualClock implements scala.Serializable {
  // not preceding
  public   StreamManualClock (long time)  { throw new RuntimeException(); }
  public  long waitTillTime (long targetTime)  { throw new RuntimeException(); }
  /**
   * Returns if the clock is blocking and the time it started to block is the parameter <code>time</code>.
   * @param time (undocumented)
   * @return (undocumented)
   */
  public  boolean isStreamWaitingAt (long time)  { throw new RuntimeException(); }
}
