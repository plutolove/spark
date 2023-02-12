package org.apache.spark.util.logging;
/** Whether rollover should be initiated at this moment */
public  interface RollingPolicy {
  /** Notify that bytes have been written */
  public  void bytesWritten (long bytes)  ;
  /** Get the desired name of the rollover file */
  public  java.lang.String generateRolledOverFileSuffix ()  ;
  /** Notify that rollover has occurred */
  public  void rolledOver ()  ;
  // not preceding
  public  boolean shouldRollover (long bytesToBeWritten)  ;
}
