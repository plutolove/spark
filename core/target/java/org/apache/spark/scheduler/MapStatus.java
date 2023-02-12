package org.apache.spark.scheduler;
/** Location where this task was run. */
public  interface MapStatus {
  // not preceding
  public  org.apache.spark.storage.BlockManagerId location ()  ;
  /**
   * Estimated size for the reduce block, in bytes.
   * <p>
   * If a block is non-empty, then this method MUST return a non-zero size.  This invariant is
   * necessary for correctness, since block fetchers are allowed to skip zero-size blocks.
   * @param reduceId (undocumented)
   * @return (undocumented)
   */
  public  long getSizeForBlock (int reduceId)  ;
  /**
   * The unique ID of this shuffle map task, if spark.shuffle.useOldFetchProtocol enabled we use
   * partitionId of the task or taskContext.taskAttemptId is used.
   * @return (undocumented)
   */
  public  long mapId ()  ;
}
