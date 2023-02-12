package org.apache.spark.streaming.receiver;
/**
 * The BlockGenerator can be in 5 possible states, in the order as follows.
 * <p>
 *  - Initialized: Nothing has been started.
 *  - Active: start() has been called, and it is generating blocks on added data.
 *  - StoppedAddingData: stop() has been called, the adding of data has been stopped,
 *                       but blocks are still being generated and pushed.
 *  - StoppedGeneratingBlocks: Generating of blocks has been stopped, but
 *                             they are still being pushed.
 *  - StoppedAll: Everything has been stopped, and the BlockGenerator object can be GCed.
 */
  class BlockGenerator extends org.apache.spark.streaming.receiver.RateLimiter implements org.apache.spark.internal.Logging {
  // not preceding
  public   BlockGenerator (org.apache.spark.streaming.receiver.BlockGeneratorListener listener, int receiverId, org.apache.spark.SparkConf conf, org.apache.spark.util.Clock clock)  { throw new RuntimeException(); }
  /** Start block generating and pushing threads. */
  public  void start ()  { throw new RuntimeException(); }
  /**
   * Stop everything in the right order such that all the data added is pushed out correctly.
   * <p>
   *  - First, stop adding data to the current buffer.
   *  - Second, stop generating blocks.
   *  - Finally, wait for queue of to-be-pushed blocks to be drained.
   */
  public  void stop ()  { throw new RuntimeException(); }
  /**
   * Push a single data item into the buffer.
   * @param data (undocumented)
   */
  public  void addData (Object data)  { throw new RuntimeException(); }
  /**
   * Push a single data item into the buffer. After buffering the data, the
   * <code>BlockGeneratorListener.onAddData</code> callback will be called.
   * @param data (undocumented)
   * @param metadata (undocumented)
   */
  public  void addDataWithCallback (Object data, Object metadata)  { throw new RuntimeException(); }
  /**
   * Push multiple data items into the buffer. After buffering the data, the
   * <code>BlockGeneratorListener.onAddData</code> callback will be called. Note that all the data items
   * are atomically added to the buffer, and are hence guaranteed to be present in a single block.
   * @param dataIterator (undocumented)
   * @param metadata (undocumented)
   */
  public  void addMultipleDataWithCallback (scala.collection.Iterator<java.lang.Object> dataIterator, Object metadata)  { throw new RuntimeException(); }
  public  boolean isActive ()  { throw new RuntimeException(); }
  public  boolean isStopped ()  { throw new RuntimeException(); }
}
