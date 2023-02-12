package org.apache.spark.streaming.receiver;
/**
 * This method is called by the system when the receiver is started. This function
 * must initialize all resources (threads, buffers, etc.) necessary for receiving data.
 * This function must be non-blocking, so receiving the data must occur on a different
 * thread. Received data can be stored with Spark by calling <code>store(data)</code>.
 * <p>
 * If there are errors in threads started here, then following options can be done
 * (i) <code>reportError(...)</code> can be called to report the error to the driver.
 * The receiving of data will continue uninterrupted.
 * (ii) <code>stop(...)</code> can be called to stop receiving data. This will call <code>onStop()</code> to
 * clear up all resources allocated (threads, buffers, etc.) during <code>onStart()</code>.
 * (iii) <code>restart(...)</code> can be called to restart the receiver. This will call <code>onStop()</code>
 * immediately, and then <code>onStart()</code> after a delay.
 */
public abstract class Receiver<T extends java.lang.Object> implements scala.Serializable {
  // not preceding
  public   Receiver (org.apache.spark.storage.StorageLevel storageLevel)  { throw new RuntimeException(); }
  /** Attach Network Receiver executor to this receiver. */
    void attachSupervisor (org.apache.spark.streaming.receiver.ReceiverSupervisor exec)  { throw new RuntimeException(); }
  /** Check if the receiver has started or not. */
  public  boolean isStarted ()  { throw new RuntimeException(); }
  /**
   * Check if receiver has been marked for stopping. Use this to identify when
   * the receiving of data should be stopped.
   * @return (undocumented)
   */
  public  boolean isStopped ()  { throw new RuntimeException(); }
  // not preceding
  public abstract  void onStart ()  ;
  /**
   * This method is called by the system when the receiver is stopped. All resources
   * (threads, buffers, etc.) set up in <code>onStart()</code> must be cleaned up in this method.
   */
  public abstract  void onStop ()  ;
  /** Override this to specify a preferred location (hostname). */
  public  scala.Option<java.lang.String> preferredLocation ()  { throw new RuntimeException(); }
  /** Report exceptions in receiving data. */
  public  void reportError (java.lang.String message, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  /**
   * Restart the receiver. This method schedules the restart and returns
   * immediately. The stopping and subsequent starting of the receiver
   * (by calling <code>onStop()</code> and <code>onStart()</code>) is performed asynchronously
   * in a background thread. The delay between the stopping and the starting
   * is defined by the Spark configuration <code>spark.streaming.receiverRestartDelay</code>.
   * The <code>message</code> will be reported to the driver.
   * @param message (undocumented)
   */
  public  void restart (java.lang.String message)  { throw new RuntimeException(); }
  /**
   * Restart the receiver. This method schedules the restart and returns
   * immediately. The stopping and subsequent starting of the receiver
   * (by calling <code>onStop()</code> and <code>onStart()</code>) is performed asynchronously
   * in a background thread. The delay between the stopping and the starting
   * is defined by the Spark configuration <code>spark.streaming.receiverRestartDelay</code>.
   * The <code>message</code> and <code>exception</code> will be reported to the driver.
   * @param message (undocumented)
   * @param error (undocumented)
   */
  public  void restart (java.lang.String message, java.lang.Throwable error)  { throw new RuntimeException(); }
  /**
   * Restart the receiver. This method schedules the restart and returns
   * immediately. The stopping and subsequent starting of the receiver
   * (by calling <code>onStop()</code> and <code>onStart()</code>) is performed asynchronously
   * in a background thread.
   * @param message (undocumented)
   * @param error (undocumented)
   * @param millisecond (undocumented)
   */
  public  void restart (java.lang.String message, java.lang.Throwable error, int millisecond)  { throw new RuntimeException(); }
  /** Set the ID of the DStream that this receiver is associated with. */
    void setReceiverId (int _id)  { throw new RuntimeException(); }
  /** Stop the receiver completely. */
  public  void stop (java.lang.String message)  { throw new RuntimeException(); }
  /** Stop the receiver completely due to an exception */
  public  void stop (java.lang.String message, java.lang.Throwable error)  { throw new RuntimeException(); }
  public  org.apache.spark.storage.StorageLevel storageLevel ()  { throw new RuntimeException(); }
  /**
   * Store a single item of received data to Spark's memory.
   * These single items will be aggregated together into data blocks before
   * being pushed into Spark's memory.
   * @param dataItem (undocumented)
   */
  public  void store (T dataItem)  { throw new RuntimeException(); }
  /** Store an ArrayBuffer of received data as a data block into Spark's memory. */
  public  void store (scala.collection.mutable.ArrayBuffer<T> dataBuffer)  { throw new RuntimeException(); }
  /**
   * Store an ArrayBuffer of received data as a data block into Spark's memory.
   * The metadata will be associated with this block of data
   * for being used in the corresponding InputDStream.
   * @param dataBuffer (undocumented)
   * @param metadata (undocumented)
   */
  public  void store (scala.collection.mutable.ArrayBuffer<T> dataBuffer, Object metadata)  { throw new RuntimeException(); }
  /** Store an iterator of received data as a data block into Spark's memory. */
  public  void store (scala.collection.Iterator<T> dataIterator)  { throw new RuntimeException(); }
  /**
   * Store an iterator of received data as a data block into Spark's memory.
   * The metadata will be associated with this block of data
   * for being used in the corresponding InputDStream.
   * @param dataIterator (undocumented)
   * @param metadata (undocumented)
   */
  public  void store (java.util.Iterator<T> dataIterator, Object metadata)  { throw new RuntimeException(); }
  /** Store an iterator of received data as a data block into Spark's memory. */
  public  void store (java.util.Iterator<T> dataIterator)  { throw new RuntimeException(); }
  /**
   * Store an iterator of received data as a data block into Spark's memory.
   * The metadata will be associated with this block of data
   * for being used in the corresponding InputDStream.
   * @param dataIterator (undocumented)
   * @param metadata (undocumented)
   */
  public  void store (scala.collection.Iterator<T> dataIterator, Object metadata)  { throw new RuntimeException(); }
  /**
   * Store the bytes of received data as a data block into Spark's memory. Note
   * that the data in the ByteBuffer must be serialized using the same serializer
   * that Spark is configured to use.
   * @param bytes (undocumented)
   */
  public  void store (java.nio.ByteBuffer bytes)  { throw new RuntimeException(); }
  /**
   * Store the bytes of received data as a data block into Spark's memory.
   * The metadata will be associated with this block of data
   * for being used in the corresponding InputDStream.
   * @param bytes (undocumented)
   * @param metadata (undocumented)
   */
  public  void store (java.nio.ByteBuffer bytes, Object metadata)  { throw new RuntimeException(); }
  /**
   * Get the unique identifier the receiver input stream that this
   * receiver is associated with.
   * @return (undocumented)
   */
  public  int streamId ()  { throw new RuntimeException(); }
  /** Get the attached supervisor. */
    org.apache.spark.streaming.receiver.ReceiverSupervisor supervisor ()  { throw new RuntimeException(); }
}
