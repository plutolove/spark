package org.apache.spark.sql.streaming;
/**
 * A latch to allow the user to wait until <code>ThrowingInterruptedIOException.createSource</code> is
 * called.
 */
public  class TestStateStoreProvider implements org.apache.spark.sql.execution.streaming.state.StateStoreProvider {
  // not preceding
  public   TestStateStoreProvider ()  { throw new RuntimeException(); }
  public  void close ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.streaming.state.StateStore getStore (long version)  { throw new RuntimeException(); }
  // not preceding
  public  void init (org.apache.spark.sql.execution.streaming.state.StateStoreId stateStoreId, org.apache.spark.sql.types.StructType keySchema, org.apache.spark.sql.types.StructType valueSchema, scala.Option<java.lang.Object> indexOrdinal, org.apache.spark.sql.execution.streaming.state.StateStoreConf storeConfs, org.apache.hadoop.conf.Configuration hadoopConf)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.streaming.state.StateStoreId stateStoreId ()  { throw new RuntimeException(); }
}
