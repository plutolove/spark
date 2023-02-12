package org.apache.spark.streaming;
/**
 * Wait until the server starts. Return true if the server starts in "millis" milliseconds.
 * Otherwise, return false to indicate it's timeout.
 */
public  class TestServer implements org.apache.spark.internal.Logging, org.scalatest.Assertions {
  // not preceding
  public  org.scalatest.Assertions.AssertionsHelper assertionsHelper ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.scalatest.compatible.Assertion succeed ()  { throw new RuntimeException(); }
  // not preceding
  public   TestServer (int portToBind)  { throw new RuntimeException(); }
  // not preceding
  public  java.util.concurrent.ArrayBlockingQueue<java.lang.String> queue ()  { throw new RuntimeException(); }
  public  java.net.ServerSocket serverSocket ()  { throw new RuntimeException(); }
  public  java.lang.Thread servingThread ()  { throw new RuntimeException(); }
  public  void start ()  { throw new RuntimeException(); }
  public  void send (java.lang.String msg)  { throw new RuntimeException(); }
  public  void stop ()  { throw new RuntimeException(); }
  public  int port ()  { throw new RuntimeException(); }
}
