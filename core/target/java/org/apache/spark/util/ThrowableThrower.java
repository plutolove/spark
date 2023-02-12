package org.apache.spark.util;
// not preceding
public  class ThrowableThrower {
  // not preceding
  static public  class ThrowerThread extends java.lang.Thread {
    // not preceding
    public   ThrowerThread (java.lang.String name, boolean exitOnUncaughtException)  { throw new RuntimeException(); }
    // not preceding
    public  void run ()  { throw new RuntimeException(); }
  }
  // not preceding
  static public  void main (java.lang.String[] args)  { throw new RuntimeException(); }
}
