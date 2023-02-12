package org.apache.spark.examples.sql.streaming;
/** Duration of the session, between the first and last events */
public  class SessionInfo implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  // not preceding
  public  int numEvents ()  { throw new RuntimeException(); }
  public  long startTimestampMs ()  { throw new RuntimeException(); }
  public  long endTimestampMs ()  { throw new RuntimeException(); }
  // not preceding
  public   SessionInfo (int numEvents, long startTimestampMs, long endTimestampMs)  { throw new RuntimeException(); }
  // not preceding
  public  long durationMs ()  { throw new RuntimeException(); }
}
