package org.apache.spark.sql.streaming;
// not preceding
public  class FailureSingleton {
  // not preceding
  static public  boolean firstTime ()  { throw new RuntimeException(); }
}
