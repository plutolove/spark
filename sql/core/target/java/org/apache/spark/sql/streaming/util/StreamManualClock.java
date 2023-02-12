package org.apache.spark.sql.streaming.util;
/** Is the streaming thread waiting for the clock to advance when it is at the given time */
public  class StreamManualClock extends org.apache.spark.util.ManualClock implements scala.Serializable {
  // not preceding
  public   StreamManualClock (long time)  { throw new RuntimeException(); }
  public  long waitTillTime (long targetTime)  { throw new RuntimeException(); }
  /** Is the streaming thread waiting for the clock to advance when it is at the given time */
  public  boolean isStreamWaitingAt (long time)  { throw new RuntimeException(); }
  /** Is the streaming thread waiting for clock to advance to the given time */
  public  boolean isStreamWaitingFor (long target)  { throw new RuntimeException(); }
}
