package org.apache.spark.sql.execution.streaming.sources;
/** Calculate the end value we will emit at the time `seconds`. */
// not preceding
public  class RateStreamProvider$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final RateStreamProvider$ MODULE$ = null;
  public   RateStreamProvider$ ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.types.StructType SCHEMA ()  { throw new RuntimeException(); }
  public  int VERSION ()  { throw new RuntimeException(); }
  public  java.lang.String NUM_PARTITIONS ()  { throw new RuntimeException(); }
  public  java.lang.String ROWS_PER_SECOND ()  { throw new RuntimeException(); }
  public  java.lang.String RAMP_UP_TIME ()  { throw new RuntimeException(); }
  /** Calculate the end value we will emit at the time `seconds`. */
  public  long valueAtSecond (long seconds, long rowsPerSecond, long rampUpTimeSeconds)  { throw new RuntimeException(); }
}
