package org.apache.spark.sql;
/**
 * This has a variable to check if <code>onSuccess</code> is actually called or not. Currently, this is for
 * the test case in PySpark. See SPARK-23942.
 */
// not preceding
public  class OnSuccessCall {
  // not preceding
  static public  java.util.concurrent.atomic.AtomicBoolean isOnSuccessCalled ()  { throw new RuntimeException(); }
  static public  boolean isCalled ()  { throw new RuntimeException(); }
  static public  void clear ()  { throw new RuntimeException(); }
}
