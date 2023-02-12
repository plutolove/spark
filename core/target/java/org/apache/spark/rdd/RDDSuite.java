package org.apache.spark.rdd;
/**
 * This tests for the pathological condition in which the RDD dependency graph is cyclical.
 * <p>
 * Since RDD is part of the public API, applications may actually implement RDDs that allow
 * such graphs to be constructed. In such cases, getNarrowAncestor should not simply hang.
 */
public  class RDDSuite extends org.apache.spark.SparkFunSuite implements org.apache.spark.SharedSparkContext, org.scalatest.concurrent.Eventually {
  public  org.scalatest.concurrent.AbstractPatienceConfiguration.PatienceConfig$ PatienceConfig ()  { throw new RuntimeException(); }
  // not preceding
  public   RDDSuite ()  { throw new RuntimeException(); }
  public  void afterAll ()  { throw new RuntimeException(); }
  public  void beforeAll ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.SparkConf conf ()  { throw new RuntimeException(); }
  // not preceding
  public  java.io.File tempDir ()  { throw new RuntimeException(); }
}
