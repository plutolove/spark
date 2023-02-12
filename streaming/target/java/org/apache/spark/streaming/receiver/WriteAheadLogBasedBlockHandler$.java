package org.apache.spark.streaming.receiver;
/**
 * This implementation stores the block into the block manager as well as a write ahead log.
 * It does this in parallel, using Scala Futures, and returns only after the block has
 * been stored in both places.
 */
// not preceding
public  class WriteAheadLogBasedBlockHandler$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final WriteAheadLogBasedBlockHandler$ MODULE$ = null;
  public   WriteAheadLogBasedBlockHandler$ ()  { throw new RuntimeException(); }
  /**
   * This implementation stores the block into the block manager as well as a write ahead log.
   * It does this in parallel, using Scala Futures, and returns only after the block has
   * been stored in both places.
   * @param checkpointDir (undocumented)
   * @param streamId (undocumented)
   * @return (undocumented)
   */
  public  java.lang.String checkpointDirToLogDir (java.lang.String checkpointDir, int streamId)  { throw new RuntimeException(); }
}
