package org.apache.spark.shuffle;
/**
 * This test makes sure that, when data is read from a HashShuffleReader, the underlying
 * ManagedBuffers that contain the data are eventually released.
 */
public  class BlockStoreShuffleReaderSuite extends org.apache.spark.SparkFunSuite implements org.apache.spark.LocalSparkContext {
  // not preceding
  public   BlockStoreShuffleReaderSuite ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.SparkContext sc ()  { throw new RuntimeException(); }
}
