package org.apache.spark.streaming.rdd;
/**
 * Gets the partition data by getting the corresponding block from the block manager.
 * If the block does not exist, then the data is read from the corresponding record
 * in write ahead log files.
 */
  class WriteAheadLogBackedBlockRDD<T extends java.lang.Object> extends org.apache.spark.rdd.BlockRDD<T> {
  public  org.apache.spark.streaming.util.WriteAheadLogRecordHandle[] walRecordHandles ()  { throw new RuntimeException(); }
  // not preceding
  public   WriteAheadLogBackedBlockRDD (org.apache.spark.SparkContext sc, org.apache.spark.storage.BlockId[] _blockIds, org.apache.spark.streaming.util.WriteAheadLogRecordHandle[] walRecordHandles, boolean[] isBlockIdValid, boolean storeInBlockManager, org.apache.spark.storage.StorageLevel storageLevel, scala.reflect.ClassTag<T> evidence$1)  { throw new RuntimeException(); }
  public  boolean isValid ()  { throw new RuntimeException(); }
  public  org.apache.spark.Partition[] getPartitions ()  { throw new RuntimeException(); }
  /**
   * Gets the partition data by getting the corresponding block from the block manager.
   * If the block does not exist, then the data is read from the corresponding record
   * in write ahead log files.
   * @param split (undocumented)
   * @param context (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.Iterator<T> compute (org.apache.spark.Partition split, org.apache.spark.TaskContext context)  { throw new RuntimeException(); }
  /**
   * Get the preferred location of the partition. This returns the locations of the block
   * if it is present in the block manager, else if FileBasedWriteAheadLogSegment is used,
   * it returns the location of the corresponding file segment in HDFS .
   * @param split (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.Seq<java.lang.String> getPreferredLocations (org.apache.spark.Partition split)  { throw new RuntimeException(); }
}
