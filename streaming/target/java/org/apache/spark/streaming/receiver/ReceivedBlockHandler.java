package org.apache.spark.streaming.receiver;
/** Store a received block with the given block id and return related metadata */
public  interface ReceivedBlockHandler {
  /** Cleanup old blocks older than the given threshold time */
  public  void cleanupOldBlocks (long threshTime)  ;
  // not preceding
  public  org.apache.spark.streaming.receiver.ReceivedBlockStoreResult storeBlock (org.apache.spark.storage.StreamBlockId blockId, org.apache.spark.streaming.receiver.ReceivedBlock receivedBlock)  ;
}
