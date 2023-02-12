package org.apache.spark;
/**
 * A {@link KeyLock} whose key is a shuffle id to ensure there is only one thread fetching
 * the same shuffle block.
 */
  class MapOutputTrackerWorker extends org.apache.spark.MapOutputTracker {
  // not preceding
  public   MapOutputTrackerWorker (org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  public  scala.collection.Iterator<scala.Tuple2<org.apache.spark.storage.BlockManagerId, scala.collection.Seq<scala.Tuple3<org.apache.spark.storage.BlockId, java.lang.Object, java.lang.Object>>>> getMapSizesByExecutorId (int shuffleId, int startPartition, int endPartition)  { throw new RuntimeException(); }
  public  scala.collection.Iterator<scala.Tuple2<org.apache.spark.storage.BlockManagerId, scala.collection.Seq<scala.Tuple3<org.apache.spark.storage.BlockId, java.lang.Object, java.lang.Object>>>> getMapSizesByRange (int shuffleId, int startMapIndex, int endMapIndex, int startPartition, int endPartition)  { throw new RuntimeException(); }
  // not preceding
  public  scala.collection.mutable.Map<java.lang.Object, org.apache.spark.scheduler.MapStatus[]> mapStatuses ()  { throw new RuntimeException(); }
  /** Unregister shuffle data. */
  public  void unregisterShuffle (int shuffleId)  { throw new RuntimeException(); }
  /**
   * Called from executors to update the epoch number, potentially clearing old outputs
   * because of a fetch failure. Each executor task calls this with the latest epoch
   * number on the driver at the time it was created.
   * @param newEpoch (undocumented)
   */
  public  void updateEpoch (long newEpoch)  { throw new RuntimeException(); }
}
