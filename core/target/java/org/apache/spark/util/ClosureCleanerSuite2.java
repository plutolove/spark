package org.apache.spark.util;
/** Assert that the given closure is serializable (or not). */
public  class ClosureCleanerSuite2 extends org.apache.spark.SparkFunSuite implements org.scalatest.BeforeAndAfterAll, org.scalatest.PrivateMethodTester {
  // not preceding
  public   ClosureCleanerSuite2 ()  { throw new RuntimeException(); }
  public  org.scalatest.PrivateMethodTester.PrivateMethod$ PrivateMethod ()  { throw new RuntimeException(); }
  public  void afterAll ()  { throw new RuntimeException(); }
  public  void beforeAll ()  { throw new RuntimeException(); }
}
