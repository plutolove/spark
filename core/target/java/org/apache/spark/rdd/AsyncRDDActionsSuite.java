package org.apache.spark.rdd;
/**
 * Make sure onComplete, onSuccess, and onFailure are invoked correctly in the case
 * of a successful job execution.
 */
public  class AsyncRDDActionsSuite extends org.apache.spark.SparkFunSuite implements org.scalatest.BeforeAndAfterAll, org.scalatest.concurrent.TimeLimits {
  // not preceding
  public   AsyncRDDActionsSuite ()  { throw new RuntimeException(); }
  public  void afterAll ()  { throw new RuntimeException(); }
  public  void beforeAll ()  { throw new RuntimeException(); }
  public  org.scalatest.concurrent.Signaler defaultSignaler ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.rdd.EmptyRDD<java.lang.Object> zeroPartRdd ()  { throw new RuntimeException(); }
}
