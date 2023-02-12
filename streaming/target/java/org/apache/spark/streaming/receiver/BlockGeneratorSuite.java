package org.apache.spark.streaming.receiver;
/**
 * Helper method to stop the block generator with manual clock in a different thread,
 * so that the main thread can advance the clock that allows the stopping to proceed.
 */
public  class BlockGeneratorSuite extends org.apache.spark.SparkFunSuite implements org.scalatest.BeforeAndAfter, org.scalatest.concurrent.TimeLimits {
  // not preceding
  public   BlockGeneratorSuite ()  { throw new RuntimeException(); }
  // not preceding
  public  org.scalatest.concurrent.Signaler defaultSignaler ()  { throw new RuntimeException(); }
}
