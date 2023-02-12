package org.apache.spark.sql.connector;
// not preceding
public  class SimpleCounter {
  static public  void increaseCounter ()  { throw new RuntimeException(); }
  static public  int getCounter ()  { throw new RuntimeException(); }
  static public  void resetCounter ()  { throw new RuntimeException(); }
}
