package org.apache.spark.io;
/**
 * This mocks a channel which only accepts a limited number of bytes at a time.  It also verifies
 * the written data matches our expectations as the data is received.
 */
public  class ChunkedByteBufferFileRegionSuite extends org.apache.spark.SparkFunSuite implements org.scalatestplus.mockito.MockitoSugar, org.scalatest.BeforeAndAfterEach {
  // not preceding
  public   ChunkedByteBufferFileRegionSuite ()  { throw new RuntimeException(); }
  protected  void afterEach ()  { throw new RuntimeException(); }
  // not preceding
  protected  void beforeEach ()  { throw new RuntimeException(); }
}
