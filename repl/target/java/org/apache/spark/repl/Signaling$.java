package org.apache.spark.repl;
/**
 * Register a SIGINT handler, that terminates all active spark jobs or terminates
 * when no jobs are currently running.
 * This makes it possible to interrupt a running shell job by pressing Ctrl+C.
 */
// not preceding
public  class Signaling$ implements org.apache.spark.internal.Logging {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final Signaling$ MODULE$ = null;
  public   Signaling$ ()  { throw new RuntimeException(); }
  // not preceding
  public  void cancelOnInterrupt ()  { throw new RuntimeException(); }
}
