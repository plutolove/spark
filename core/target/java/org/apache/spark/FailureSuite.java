package org.apache.spark;
public  class FailureSuite extends org.apache.spark.SparkFunSuite implements org.apache.spark.LocalSparkContext {
  // not preceding
  public   FailureSuite ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.SparkContext sc ()  { throw new RuntimeException(); }
}
