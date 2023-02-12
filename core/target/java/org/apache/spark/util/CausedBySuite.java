package org.apache.spark.util;
public  class CausedBySuite extends org.apache.spark.SparkFunSuite {
  // not preceding
  public   CausedBySuite ()  { throw new RuntimeException(); }
}
