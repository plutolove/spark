package org.apache.spark.streaming.util;
/**
 * Write a byte buffer to the log file. This method adds the byteBuffer to a queue and blocks
 * until the record is properly written by the parent.
 */
  class BatchedWriteAheadLog extends org.apache.spark.streaming.util.WriteAheadLog implements org.apache.spark.internal.Logging {
  // not preceding
  static public  class Record implements scala.Product, scala.Serializable {
    // not preceding
    public  java.nio.ByteBuffer data ()  { throw new RuntimeException(); }
    public  long time ()  { throw new RuntimeException(); }
    public  scala.concurrent.Promise<org.apache.spark.streaming.util.WriteAheadLogRecordHandle> promise ()  { throw new RuntimeException(); }
    // not preceding
    public   Record (java.nio.ByteBuffer data, long time, scala.concurrent.Promise<org.apache.spark.streaming.util.WriteAheadLogRecordHandle> promise)  { throw new RuntimeException(); }
  }
  // not preceding
  static public  class Record$ extends scala.runtime.AbstractFunction3<java.nio.ByteBuffer, java.lang.Object, scala.concurrent.Promise<org.apache.spark.streaming.util.WriteAheadLogRecordHandle>, org.apache.spark.streaming.util.BatchedWriteAheadLog.Record> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final Record$ MODULE$ = null;
    public   Record$ ()  { throw new RuntimeException(); }
  }
  // not preceding
  static public  java.nio.ByteBuffer aggregate (scala.collection.Seq<org.apache.spark.streaming.util.BatchedWriteAheadLog.Record> records)  { throw new RuntimeException(); }
  /**
   * De-aggregate serialized ReceivedBlockTrackerLogEvents in a single ByteBuffer.
   * A stream may not have used batching initially, but started using it after a restart. This
   * method therefore needs to be backwards compatible.
   * @param buffer (undocumented)
   * @return (undocumented)
   */
  static public  java.nio.ByteBuffer[] deaggregate (java.nio.ByteBuffer buffer)  { throw new RuntimeException(); }
  public  org.apache.spark.streaming.util.WriteAheadLog wrappedLog ()  { throw new RuntimeException(); }
  // not preceding
  public   BatchedWriteAheadLog (org.apache.spark.streaming.util.WriteAheadLog wrappedLog, org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  /**
   * Write a byte buffer to the log file. This method adds the byteBuffer to a queue and blocks
   * until the record is properly written by the parent.
   * @param byteBuffer (undocumented)
   * @param time (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.streaming.util.WriteAheadLogRecordHandle write (java.nio.ByteBuffer byteBuffer, long time)  { throw new RuntimeException(); }
  /**
   * This method is not supported as the resulting ByteBuffer would actually require de-aggregation.
   * This method is primarily used in testing, and to ensure that it is not used in production,
   * we throw an UnsupportedOperationException.
   * @param segment (undocumented)
   * @return (undocumented)
   */
  public  java.nio.ByteBuffer read (org.apache.spark.streaming.util.WriteAheadLogRecordHandle segment)  { throw new RuntimeException(); }
  /**
   * Read all the existing logs from the log directory. The output of the wrapped WriteAheadLog
   * will be de-aggregated.
   * @return (undocumented)
   */
  public  java.util.Iterator<java.nio.ByteBuffer> readAll ()  { throw new RuntimeException(); }
  /**
   * Delete the log files that are older than the threshold time.
   * <p>
   * This method is handled by the parent WriteAheadLog.
   * @param threshTime (undocumented)
   * @param waitForCompletion (undocumented)
   */
  public  void clean (long threshTime, boolean waitForCompletion)  { throw new RuntimeException(); }
  /**
   * Stop the batched writer thread, fulfill promises with failures and close the wrapped WAL.
   */
  public  void close ()  { throw new RuntimeException(); }
}
