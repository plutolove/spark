package org.apache.spark.streaming.receiver;
/**
 * This implementation stores the block into the block manager as well as a write ahead log.
 * It does this in parallel, using Scala Futures, and returns only after the block has
 * been stored in both places.
 */
  class WriteAheadLogBasedBlockHandler implements org.apache.spark.streaming.receiver.ReceivedBlockHandler, org.apache.spark.internal.Logging {
  /**
   * This implementation stores the block into the block manager as well as a write ahead log.
   * It does this in parallel, using Scala Futures, and returns only after the block has
   * been stored in both places.
   * @param checkpointDir (undocumented)
   * @param streamId (undocumented)
   * @return (undocumented)
   */
  static public  java.lang.String checkpointDirToLogDir (java.lang.String checkpointDir, int streamId)  { throw new RuntimeException(); }
  // not preceding
  public   WriteAheadLogBasedBlockHandler (org.apache.spark.storage.BlockManager blockManager, org.apache.spark.serializer.SerializerManager serializerManager, int streamId, org.apache.spark.storage.StorageLevel storageLevel, org.apache.spark.SparkConf conf, org.apache.hadoop.conf.Configuration hadoopConf, java.lang.String checkpointDir, org.apache.spark.util.Clock clock)  { throw new RuntimeException(); }
  /**
   * This implementation stores the block into the block manager as well as a write ahead log.
   * It does this in parallel, using Scala Futures, and returns only after the block has
   * been stored in both places.
   * @param blockId (undocumented)
   * @param block (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.streaming.receiver.ReceivedBlockStoreResult storeBlock (org.apache.spark.storage.StreamBlockId blockId, org.apache.spark.streaming.receiver.ReceivedBlock block)  { throw new RuntimeException(); }
  public  void cleanupOldBlocks (long threshTime)  { throw new RuntimeException(); }
  public  void stop ()  { throw new RuntimeException(); }
}
