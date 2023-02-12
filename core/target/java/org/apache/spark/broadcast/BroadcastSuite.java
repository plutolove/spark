package org.apache.spark.broadcast;
/**
 * Verify the persistence of state associated with a TorrentBroadcast in a local-cluster.
 * <p>
 * This test creates a broadcast variable, uses it on all executors, and then unpersists it.
 * In between each step, this test verifies that the broadcast blocks are present only on the
 * expected nodes.
 */
public  class BroadcastSuite extends org.apache.spark.SparkFunSuite implements org.apache.spark.LocalSparkContext, org.apache.spark.security.EncryptionFunSuite {
  // not preceding
  public   BroadcastSuite ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.SparkContext sc ()  { throw new RuntimeException(); }
}
