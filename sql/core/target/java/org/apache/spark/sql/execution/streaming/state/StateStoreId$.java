package org.apache.spark.sql.execution.streaming.state;
/**
 * Checkpoint directory to be used by a single state store, identified uniquely by the tuple
 * (operatorId, partitionId, storeName). All implementations of {@link StateStoreProvider} should
 * use this path for saving state data, as this ensures that distinct stores will write to
 * different locations.
 */
// not preceding
public  class StateStoreId$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final StateStoreId$ MODULE$ = null;
  public   StateStoreId$ ()  { throw new RuntimeException(); }
  /**
   * Checkpoint directory to be used by a single state store, identified uniquely by the tuple
   * (operatorId, partitionId, storeName). All implementations of {@link StateStoreProvider} should
   * use this path for saving state data, as this ensures that distinct stores will write to
   * different locations.
   * @return (undocumented)
   */
  public  java.lang.String DEFAULT_STORE_NAME ()  { throw new RuntimeException(); }
}
