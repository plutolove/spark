package org.apache.spark.sql;
/**
 * This has a variable to check if <code>onSuccess</code> is actually called or not. Currently, this is for
 * the test case in PySpark. See SPARK-23942.
 */
// not preceding
public  class OnSuccessCall$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final OnSuccessCall$ MODULE$ = null;
  public   OnSuccessCall$ ()  { throw new RuntimeException(); }
  // not preceding
  public  java.util.concurrent.atomic.AtomicBoolean isOnSuccessCalled ()  { throw new RuntimeException(); }
  public  boolean isCalled ()  { throw new RuntimeException(); }
  public  void clear ()  { throw new RuntimeException(); }
}
