package org.apache.spark.streaming;
public  class TestException extends java.lang.Exception {
  // not preceding
  public   TestException (java.lang.String msg)  { throw new RuntimeException(); }
}
