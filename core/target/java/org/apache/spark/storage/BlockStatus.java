package org.apache.spark.storage;
/**
 * Returns an {@link RpcEndpointRef} of the {@link BlockManagerSlaveEndpoint} for sending RPC messages.
 */
public  class BlockStatus implements scala.Product, scala.Serializable {
  // not preceding
  static public  org.apache.spark.storage.BlockStatus empty ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.storage.StorageLevel storageLevel ()  { throw new RuntimeException(); }
  public  long memSize ()  { throw new RuntimeException(); }
  public  long diskSize ()  { throw new RuntimeException(); }
  // not preceding
  public   BlockStatus (org.apache.spark.storage.StorageLevel storageLevel, long memSize, long diskSize)  { throw new RuntimeException(); }
  // not preceding
  public  boolean isCached ()  { throw new RuntimeException(); }
}
