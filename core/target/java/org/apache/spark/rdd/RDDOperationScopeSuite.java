package org.apache.spark.rdd;
/**
 * Tests whether scopes are passed from the RDD operation to the RDDs correctly.
 */
public  class RDDOperationScopeSuite extends org.apache.spark.SparkFunSuite implements org.scalatest.BeforeAndAfter {
  // not preceding
  public   RDDOperationScopeSuite ()  { throw new RuntimeException(); }
}
