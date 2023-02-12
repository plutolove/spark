package org.apache.spark.sql.execution.python;
public  class PythonForeachWriterSuite extends org.apache.spark.SparkFunSuite implements org.scalatest.concurrent.Eventually, org.scalatestplus.mockito.MockitoSugar {
  public  class BufferTester {
    // not preceding
    public   BufferTester (long memBytes, int sleepPerRowReadMs)  { throw new RuntimeException(); }
    public  void add (scala.collection.Seq<java.lang.Object> ints)  { throw new RuntimeException(); }
    public  void allAdded ()  { throw new RuntimeException(); }
    public  void assertIteratorBlocked ()  { throw new RuntimeException(); }
    public  void assertOutput (scala.collection.Seq<java.lang.Object> expectedOutput)  { throw new RuntimeException(); }
    public  void assertThreadTerminated ()  { throw new RuntimeException(); }
    public  void close ()  { throw new RuntimeException(); }
  }
  public  org.scalatest.concurrent.AbstractPatienceConfiguration.PatienceConfig$ PatienceConfig ()  { throw new RuntimeException(); }
  // not preceding
  public   PythonForeachWriterSuite ()  { throw new RuntimeException(); }
  public  void testWithBuffer (java.lang.String name, long memBytes, int sleepPerRowReadMs, scala.Function1<org.apache.spark.sql.execution.python.PythonForeachWriterSuite.BufferTester, scala.runtime.BoxedUnit> f)  { throw new RuntimeException(); }
}
