package org.apache.spark.streaming;
/**
 * Process all registered streams for a numBatches batches, failing if
 * numExpectedOutput RDD's are not generated. Generated RDD's are collected
 * and returned, represented as a list for each batch interval.
 * <p>
 * Returns a sequence of RDD's. Each RDD is represented as several sequences of items, each
 * representing one partition.
 */
// not preceding
public  class JavaTestUtils$ extends org.apache.spark.SparkFunSuite implements org.apache.spark.streaming.JavaTestBase {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final JavaTestUtils$ MODULE$ = null;
  // not preceding
  public  java.lang.String checkpointDir ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.SparkConf conf ()  { throw new RuntimeException(); }
  // not preceding
  public  org.scalatest.concurrent.PatienceConfiguration.Timeout eventuallyTimeout ()  { throw new RuntimeException(); }
  public   JavaTestUtils$ ()  { throw new RuntimeException(); }
  // not preceding
  public  int maxWaitTimeMillis ()  { throw new RuntimeException(); }
}
