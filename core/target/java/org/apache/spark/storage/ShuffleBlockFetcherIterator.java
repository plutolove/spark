package org.apache.spark.storage;
/**
 * Total number of blocks to fetch.
 */
 final class ShuffleBlockFetcherIterator implements scala.collection.Iterator<scala.Tuple2<org.apache.spark.storage.BlockId, java.io.InputStream>>, org.apache.spark.network.shuffle.DownloadFileManager, org.apache.spark.internal.Logging {
  /**
   * The block information to fetch used in FetchRequest.
   * param:  blockId block id
   * param:  size estimated size of the block. Note that this is NOT the exact bytes.
   *             Size of remote block is used to calculate bytesInFlight.
   * param:  mapIndex the mapIndex for this block, which indicate the index in the map stage.
   */
  static   class FetchBlockInfo implements scala.Product, scala.Serializable {
    // not preceding
    public  org.apache.spark.storage.BlockId blockId ()  { throw new RuntimeException(); }
    public  long size ()  { throw new RuntimeException(); }
    public  int mapIndex ()  { throw new RuntimeException(); }
    // not preceding
    public   FetchBlockInfo (org.apache.spark.storage.BlockId blockId, long size, int mapIndex)  { throw new RuntimeException(); }
  }
  // not preceding
  static public  class FetchBlockInfo$ extends scala.runtime.AbstractFunction3<org.apache.spark.storage.BlockId, java.lang.Object, java.lang.Object, org.apache.spark.storage.ShuffleBlockFetcherIterator.FetchBlockInfo> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final FetchBlockInfo$ MODULE$ = null;
    public   FetchBlockInfo$ ()  { throw new RuntimeException(); }
  }
  // not preceding
  static public  class FetchRequest implements scala.Product, scala.Serializable {
    // not preceding
    public  org.apache.spark.storage.BlockManagerId address ()  { throw new RuntimeException(); }
    public  scala.collection.Seq<org.apache.spark.storage.ShuffleBlockFetcherIterator.FetchBlockInfo> blocks ()  { throw new RuntimeException(); }
    // not preceding
    public   FetchRequest (org.apache.spark.storage.BlockManagerId address, scala.collection.Seq<org.apache.spark.storage.ShuffleBlockFetcherIterator.FetchBlockInfo> blocks)  { throw new RuntimeException(); }
    // not preceding
    public  long size ()  { throw new RuntimeException(); }
  }
  // not preceding
  static public  class FetchRequest$ extends scala.runtime.AbstractFunction2<org.apache.spark.storage.BlockManagerId, scala.collection.Seq<org.apache.spark.storage.ShuffleBlockFetcherIterator.FetchBlockInfo>, org.apache.spark.storage.ShuffleBlockFetcherIterator.FetchRequest> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final FetchRequest$ MODULE$ = null;
    public   FetchRequest$ ()  { throw new RuntimeException(); }
  }
  // not preceding
  static   class SuccessFetchResult implements org.apache.spark.storage.ShuffleBlockFetcherIterator.FetchResult, scala.Product, scala.Serializable {
    // not preceding
    public  org.apache.spark.storage.BlockId blockId ()  { throw new RuntimeException(); }
    public  int mapIndex ()  { throw new RuntimeException(); }
    public  org.apache.spark.storage.BlockManagerId address ()  { throw new RuntimeException(); }
    public  long size ()  { throw new RuntimeException(); }
    public  org.apache.spark.network.buffer.ManagedBuffer buf ()  { throw new RuntimeException(); }
    public  boolean isNetworkReqDone ()  { throw new RuntimeException(); }
    // not preceding
    public   SuccessFetchResult (org.apache.spark.storage.BlockId blockId, int mapIndex, org.apache.spark.storage.BlockManagerId address, long size, org.apache.spark.network.buffer.ManagedBuffer buf, boolean isNetworkReqDone)  { throw new RuntimeException(); }
  }
  // not preceding
  static public  class SuccessFetchResult$ extends scala.runtime.AbstractFunction6<org.apache.spark.storage.BlockId, java.lang.Object, org.apache.spark.storage.BlockManagerId, java.lang.Object, org.apache.spark.network.buffer.ManagedBuffer, java.lang.Object, org.apache.spark.storage.ShuffleBlockFetcherIterator.SuccessFetchResult> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final SuccessFetchResult$ MODULE$ = null;
    public   SuccessFetchResult$ ()  { throw new RuntimeException(); }
  }
  // not preceding
  static   class FailureFetchResult implements org.apache.spark.storage.ShuffleBlockFetcherIterator.FetchResult, scala.Product, scala.Serializable {
    // not preceding
    public  org.apache.spark.storage.BlockId blockId ()  { throw new RuntimeException(); }
    public  int mapIndex ()  { throw new RuntimeException(); }
    public  org.apache.spark.storage.BlockManagerId address ()  { throw new RuntimeException(); }
    public  java.lang.Throwable e ()  { throw new RuntimeException(); }
    // not preceding
    public   FailureFetchResult (org.apache.spark.storage.BlockId blockId, int mapIndex, org.apache.spark.storage.BlockManagerId address, java.lang.Throwable e)  { throw new RuntimeException(); }
  }
  // not preceding
  static public  class FailureFetchResult$ extends scala.runtime.AbstractFunction4<org.apache.spark.storage.BlockId, java.lang.Object, org.apache.spark.storage.BlockManagerId, java.lang.Throwable, org.apache.spark.storage.ShuffleBlockFetcherIterator.FailureFetchResult> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final FailureFetchResult$ MODULE$ = null;
    public   FailureFetchResult$ ()  { throw new RuntimeException(); }
  }
  // not preceding
  static public  interface FetchResult {
    public  org.apache.spark.storage.BlockManagerId address ()  ;
    // not preceding
    public  org.apache.spark.storage.BlockId blockId ()  ;
  }
  // not preceding
  static public  scala.collection.Seq<org.apache.spark.storage.ShuffleBlockFetcherIterator.FetchBlockInfo> mergeContinuousShuffleBlockIdsIfNeeded (scala.collection.Seq<org.apache.spark.storage.ShuffleBlockFetcherIterator.FetchBlockInfo> blocks, boolean doBatchFetch)  { throw new RuntimeException(); }
  // not preceding
  public   ShuffleBlockFetcherIterator (org.apache.spark.TaskContext context, org.apache.spark.network.shuffle.BlockStoreClient shuffleClient, org.apache.spark.storage.BlockManager blockManager, scala.collection.Iterator<scala.Tuple2<org.apache.spark.storage.BlockManagerId, scala.collection.Seq<scala.Tuple3<org.apache.spark.storage.BlockId, java.lang.Object, java.lang.Object>>>> blocksByAddress, scala.Function2<org.apache.spark.storage.BlockId, java.io.InputStream, java.io.InputStream> streamWrapper, long maxBytesInFlight, int maxReqsInFlight, int maxBlocksInFlightPerAddress, long maxReqSizeShuffleToMem, boolean detectCorrupt, boolean detectCorruptUseExtraMemory, org.apache.spark.shuffle.ShuffleReadMetricsReporter shuffleMetrics, boolean doBatchFetch)  { throw new RuntimeException(); }
    void releaseCurrentResultBuffer ()  { throw new RuntimeException(); }
  public  org.apache.spark.network.shuffle.DownloadFile createTempFile (org.apache.spark.network.util.TransportConf transportConf)  { throw new RuntimeException(); }
  public  boolean registerTempFileToClean (org.apache.spark.network.shuffle.DownloadFile file)  { throw new RuntimeException(); }
  /**
   * Mark the iterator as zombie, and release all buffers that haven't been deserialized yet.
   */
    void cleanup ()  { throw new RuntimeException(); }
  public  boolean hasNext ()  { throw new RuntimeException(); }
  /**
   * Fetches the next (BlockId, InputStream). If a task fails, the ManagedBuffers
   * underlying each InputStream will be freed by the cleanup() method registered with the
   * TaskCompletionListener. However, callers should close() these InputStreams
   * as soon as they are no longer needed, in order to release memory as early as possible.
   * <p>
   * Throws a FetchFailedException if the next block could not be fetched.
   * @return (undocumented)
   */
  public  scala.Tuple2<org.apache.spark.storage.BlockId, java.io.InputStream> next ()  { throw new RuntimeException(); }
  public  scala.collection.Iterator<scala.Tuple2<org.apache.spark.storage.BlockId, java.io.InputStream>> toCompletionIterator ()  { throw new RuntimeException(); }
    scala.runtime.Nothing$ throwFetchFailedException (org.apache.spark.storage.BlockId blockId, int mapIndex, org.apache.spark.storage.BlockManagerId address, java.lang.Throwable e)  { throw new RuntimeException(); }
}
