package org.apache.spark.util.io;
/** Index of the last chunk. Starting with -1 when the chunks array is empty. */
  class ChunkedByteBufferOutputStream extends java.io.OutputStream {
  // not preceding
  public   ChunkedByteBufferOutputStream (int chunkSize, scala.Function1<java.lang.Object, java.nio.ByteBuffer> allocator)  { throw new RuntimeException(); }
  // not preceding
  public  scala.collection.mutable.ArrayBuffer<java.nio.ByteBuffer> chunks ()  { throw new RuntimeException(); }
  public  void close ()  { throw new RuntimeException(); }
  /**
   * Next position to write in the last chunk.
   * <p>
   * If this equals chunkSize, it means for next write we need to allocate a new chunk.
   * This can also never be 0.
   * @return (undocumented)
   */
  public  long size ()  { throw new RuntimeException(); }
  public  org.apache.spark.util.io.ChunkedByteBuffer toChunkedByteBuffer ()  { throw new RuntimeException(); }
  public  void write (int b)  { throw new RuntimeException(); }
  public  void write (byte[] bytes, int off, int len)  { throw new RuntimeException(); }
}
