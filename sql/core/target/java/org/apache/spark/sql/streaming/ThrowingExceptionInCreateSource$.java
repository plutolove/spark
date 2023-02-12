package org.apache.spark.sql.streaming;
/**
 * A latch to allow the user to wait until <code>ThrowingExceptionInCreateSource.createSource</code> is
 * called.
 */
// not preceding
public  class ThrowingExceptionInCreateSource$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final ThrowingExceptionInCreateSource$ MODULE$ = null;
  public   ThrowingExceptionInCreateSource$ ()  { throw new RuntimeException(); }
  // not preceding
  public  java.util.concurrent.CountDownLatch createSourceLatch ()  { throw new RuntimeException(); }
  public  java.lang.Exception exception ()  { throw new RuntimeException(); }
}
