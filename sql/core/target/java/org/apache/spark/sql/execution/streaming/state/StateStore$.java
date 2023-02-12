package org.apache.spark.sql.execution.streaming.state;
/**
 * Runs the <code>task</code> periodically and automatically cancels it if there is an exception. <code>onError</code>
 * will be called when an exception happens.
 */
// not preceding
public  class StateStore$ implements org.apache.spark.internal.Logging {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final StateStore$ MODULE$ = null;
  public   StateStore$ ()  { throw new RuntimeException(); }
  // not preceding
  public  java.lang.String MAINTENANCE_INTERVAL_CONFIG ()  { throw new RuntimeException(); }
  public  int MAINTENANCE_INTERVAL_DEFAULT_SECS ()  { throw new RuntimeException(); }
  /** Get or create a store associated with the id. */
  public  org.apache.spark.sql.execution.streaming.state.StateStore get (org.apache.spark.sql.execution.streaming.state.StateStoreProviderId storeProviderId, org.apache.spark.sql.types.StructType keySchema, org.apache.spark.sql.types.StructType valueSchema, scala.Option<java.lang.Object> indexOrdinal, long version, org.apache.spark.sql.execution.streaming.state.StateStoreConf storeConf, org.apache.hadoop.conf.Configuration hadoopConf)  { throw new RuntimeException(); }
  /** Unload a state store provider */
  public  void unload (org.apache.spark.sql.execution.streaming.state.StateStoreProviderId storeProviderId)  { throw new RuntimeException(); }
  /** Whether a state store provider is loaded or not */
  public  boolean isLoaded (org.apache.spark.sql.execution.streaming.state.StateStoreProviderId storeProviderId)  { throw new RuntimeException(); }
  public  boolean isMaintenanceRunning ()  { throw new RuntimeException(); }
  /** Unload and stop all state store providers */
  public  void stop ()  { throw new RuntimeException(); }
}
