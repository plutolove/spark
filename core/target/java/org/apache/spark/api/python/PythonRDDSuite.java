package org.apache.spark.api.python;
public  class PythonRDDSuite extends org.apache.spark.SparkFunSuite implements org.apache.spark.LocalSparkContext {
  public  class ExceptionPythonServer extends org.apache.spark.security.SocketAuthServer<scala.runtime.BoxedUnit> {
    // not preceding
    public   ExceptionPythonServer (org.apache.spark.security.SocketAuthHelper authHelper)  { throw new RuntimeException(); }
    // not preceding
    public  void handleConnection (java.net.Socket sock)  { throw new RuntimeException(); }
  }
  // not preceding
  public   PythonRDDSuite ()  { throw new RuntimeException(); }
  public  void afterAll ()  { throw new RuntimeException(); }
  public  void beforeAll ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.SparkContext sc ()  { throw new RuntimeException(); }
  // not preceding
  public  java.io.File tempDir ()  { throw new RuntimeException(); }
}
