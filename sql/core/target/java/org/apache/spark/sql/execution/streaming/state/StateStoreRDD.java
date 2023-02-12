package org.apache.spark.sql.execution.streaming.state;
/**
 * Set the preferred location of each partition using the executor that has the related
 * {@link StateStoreProvider} already loaded.
 */
public  class StateStoreRDD<T extends java.lang.Object, U extends java.lang.Object> extends org.apache.spark.rdd.RDD<U> {
  // not preceding
  public   StateStoreRDD (org.apache.spark.rdd.RDD<T> dataRDD, scala.Function2<org.apache.spark.sql.execution.streaming.state.StateStore, scala.collection.Iterator<T>, scala.collection.Iterator<U>> storeUpdateFunction, java.lang.String checkpointLocation, java.util.UUID queryRunId, long operatorId, long storeVersion, org.apache.spark.sql.types.StructType keySchema, org.apache.spark.sql.types.StructType valueSchema, scala.Option<java.lang.Object> indexOrdinal, org.apache.spark.sql.internal.SessionState sessionState, scala.Option<org.apache.spark.sql.execution.streaming.state.StateStoreCoordinatorRef> storeCoordinator, scala.reflect.ClassTag<T> evidence$1, scala.reflect.ClassTag<U> evidence$2)  { throw new RuntimeException(); }
  public  scala.collection.Iterator<U> compute (org.apache.spark.Partition partition, org.apache.spark.TaskContext ctxt)  { throw new RuntimeException(); }
  protected  org.apache.spark.Partition[] getPartitions ()  { throw new RuntimeException(); }
  /**
   * Set the preferred location of each partition using the executor that has the related
   * {@link StateStoreProvider} already loaded.
   * @param partition (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.Seq<java.lang.String> getPreferredLocations (org.apache.spark.Partition partition)  { throw new RuntimeException(); }
}
