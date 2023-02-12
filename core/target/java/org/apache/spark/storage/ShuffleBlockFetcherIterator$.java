package org.apache.spark.storage;
/**
 * This function is used to merged blocks when doBatchFetch is true. Blocks which have the
 * same <code>mapId</code> can be merged into one block batch. The block batch is specified by a range
 * of reduceId, which implies the continuous shuffle blocks that we can fetch in a batch.
 * For example, input blocks like (shuffle_0_0_0, shuffle_0_0_1, shuffle_0_1_0) can be
 * merged into (shuffle_0_0_0_2, shuffle_0_1_0_1), and input blocks like (shuffle_0_0_0_2,
 * shuffle_0_0_2, shuffle_0_0_3) can be merged into (shuffle_0_0_0_4).
 * <p>
 * param:  blocks blocks to be merged if possible. May contains already merged blocks.
 * param:  doBatchFetch whether to merge blocks.
 * @return the input blocks if doBatchFetch=false, or the merged blocks if doBatchFetch=true.
 */
// not preceding
public  class ShuffleBlockFetcherIterator$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final ShuffleBlockFetcherIterator$ MODULE$ = null;
  public   ShuffleBlockFetcherIterator$ ()  { throw new RuntimeException(); }
  // not preceding
  public  scala.collection.Seq<org.apache.spark.storage.ShuffleBlockFetcherIterator.FetchBlockInfo> mergeContinuousShuffleBlockIdsIfNeeded (scala.collection.Seq<org.apache.spark.storage.ShuffleBlockFetcherIterator.FetchBlockInfo> blocks, boolean doBatchFetch)  { throw new RuntimeException(); }
}
