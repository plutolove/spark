package org.apache.spark.util;
/**
 * Clean up the buffer, and potentially dispose of it using StorageUtils.dispose().
 */
  class ByteBufferInputStream extends java.io.InputStream {
  // not preceding
  public   ByteBufferInputStream (java.nio.ByteBuffer buffer)  { throw new RuntimeException(); }
  // not preceding
  public  int read ()  { throw new RuntimeException(); }
  public  int read (byte[] dest)  { throw new RuntimeException(); }
  public  int read (byte[] dest, int offset, int length)  { throw new RuntimeException(); }
  public  long skip (long bytes)  { throw new RuntimeException(); }
}
