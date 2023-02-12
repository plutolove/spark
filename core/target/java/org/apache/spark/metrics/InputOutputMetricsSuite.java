package org.apache.spark.metrics;
/**
 * Tests the metrics from end to end.
 * 1) reading a hadoop file
 * 2) shuffle and writing to a hadoop file.
 * 3) writing to hadoop file.
 */
public  class InputOutputMetricsSuite extends org.apache.spark.SparkFunSuite implements org.apache.spark.SharedSparkContext, org.scalatest.BeforeAndAfter {
  // not preceding
  public   InputOutputMetricsSuite ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.SparkConf conf ()  { throw new RuntimeException(); }
  public  int numBuckets ()  { throw new RuntimeException(); }
  public  int numRecords ()  { throw new RuntimeException(); }
  // not preceding
  public  java.io.File tmpDir ()  { throw new RuntimeException(); }
  public  java.io.File tmpFile ()  { throw new RuntimeException(); }
  public  java.lang.String tmpFilePath ()  { throw new RuntimeException(); }
}
