package org.apache.spark.util;
/** A monitor to protect "uninterruptible" and "interrupted" */
  class UninterruptibleThread extends java.lang.Thread {
  // not preceding
  public   UninterruptibleThread (java.lang.Runnable target, java.lang.String name)  { throw new RuntimeException(); }
  // not preceding
  public   UninterruptibleThread (java.lang.String name)  { throw new RuntimeException(); }
  /**
   * Interrupt <code>this</code> thread if possible. If <code>this</code> is in the uninterruptible status, it won't be
   * interrupted until it enters into the interruptible status.
   */
  public  void interrupt ()  { throw new RuntimeException(); }
  /**
   * Run <code>f</code> uninterruptibly in <code>this</code> thread. The thread won't be interrupted before returning
   * from <code>f</code>.
   * <p>
   * Note: this method should be called only in <code>this</code> thread.
   * @param f (undocumented)
   * @return (undocumented)
   */
  public <T extends java.lang.Object> T runUninterruptibly (scala.Function0<T> f)  { throw new RuntimeException(); }
}
