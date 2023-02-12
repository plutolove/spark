package org.apache.spark.streaming.util;
/**
 * Wrapper class for representing the records that we will write to the WriteAheadLog. Coupled
 * with the timestamp for the write request of the record, and the promise that will block the
 * write request, while a separate thread is actually performing the write.
 */
// not preceding
public  class BatchedWriteAheadLog$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final BatchedWriteAheadLog$ MODULE$ = null;
  public   BatchedWriteAheadLog$ ()  { throw new RuntimeException(); }
  // not preceding
  public  java.nio.ByteBuffer aggregate (scala.collection.Seq<org.apache.spark.streaming.util.BatchedWriteAheadLog.Record> records)  { throw new RuntimeException(); }
  /**
   * De-aggregate serialized ReceivedBlockTrackerLogEvents in a single ByteBuffer.
   * A stream may not have used batching initially, but started using it after a restart. This
   * method therefore needs to be backwards compatible.
   * @param buffer (undocumented)
   * @return (undocumented)
   */
  public  java.nio.ByteBuffer[] deaggregate (java.nio.ByteBuffer buffer)  { throw new RuntimeException(); }
}
