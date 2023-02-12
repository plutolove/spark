package org.apache.spark.sql.execution.streaming.state;
/**
 * Checkpoint directory to be used by a single state store, identified uniquely by the tuple
 * (operatorId, partitionId, storeName). All implementations of {@link StateStoreProvider} should
 * use this path for saving state data, as this ensures that distinct stores will write to
 * different locations.
 */
public  class StateStoreId implements scala.Product, scala.Serializable {
  /**
   * Checkpoint directory to be used by a single state store, identified uniquely by the tuple
   * (operatorId, partitionId, storeName). All implementations of {@link StateStoreProvider} should
   * use this path for saving state data, as this ensures that distinct stores will write to
   * different locations.
   * @return (undocumented)
   */
  static public  java.lang.String DEFAULT_STORE_NAME ()  { throw new RuntimeException(); }
  // not preceding
  public  java.lang.String checkpointRootLocation ()  { throw new RuntimeException(); }
  public  long operatorId ()  { throw new RuntimeException(); }
  public  int partitionId ()  { throw new RuntimeException(); }
  public  java.lang.String storeName ()  { throw new RuntimeException(); }
  // not preceding
  public   StateStoreId (java.lang.String checkpointRootLocation, long operatorId, int partitionId, java.lang.String storeName)  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.hadoop.fs.Path storeCheckpointLocation ()  { throw new RuntimeException(); }
}
