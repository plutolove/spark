package org.apache.spark.streaming.util;
/** Write the bytebuffer to the log file */
  class FileBasedWriteAheadLogWriter implements java.io.Closeable {
  // not preceding
  public   FileBasedWriteAheadLogWriter (java.lang.String path, org.apache.hadoop.conf.Configuration hadoopConf)  { throw new RuntimeException(); }
  public  void close ()  { throw new RuntimeException(); }
  /** Write the bytebuffer to the log file */
  public  org.apache.spark.streaming.util.FileBasedWriteAheadLogSegment write (java.nio.ByteBuffer data)  { throw new RuntimeException(); }
}
