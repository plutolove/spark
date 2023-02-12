package org.apache.spark.rdd;
/**
 * Ensure the RDD is fully cached so the partitions can be recovered later.
 */
  class LocalRDDCheckpointData<T extends java.lang.Object> extends org.apache.spark.rdd.RDDCheckpointData<T> implements org.apache.spark.internal.Logging {
  // not preceding
  static public  org.apache.spark.storage.StorageLevel DEFAULT_STORAGE_LEVEL ()  { throw new RuntimeException(); }
  /**
   * Transform the specified storage level to one that uses disk.
   * <p>
   * This guarantees that the RDD can be recomputed multiple times correctly as long as
   * executors do not fail. Otherwise, if the RDD is cached in memory only, for instance,
   * the checkpoint data will be lost if the relevant block is evicted from memory.
   * <p>
   * This method is idempotent.
   * @param level (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.storage.StorageLevel transformStorageLevel (org.apache.spark.storage.StorageLevel level)  { throw new RuntimeException(); }
  // not preceding
  public   LocalRDDCheckpointData (org.apache.spark.rdd.RDD<T> rdd, scala.reflect.ClassTag<T> evidence$1)  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.rdd.CheckpointRDD<T> doCheckpoint ()  { throw new RuntimeException(); }
}
