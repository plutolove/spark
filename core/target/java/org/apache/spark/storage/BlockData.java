package org.apache.spark.storage;
/**
 * Returns a Netty-friendly wrapper for the block's data.
 * <p>
 * Please see <code>ManagedBuffer.convertToNetty()</code> for more details.
 */
public  interface BlockData {
  public  void dispose ()  ;
  public  long size ()  ;
  public  java.nio.ByteBuffer toByteBuffer ()  ;
  public  org.apache.spark.util.io.ChunkedByteBuffer toChunkedByteBuffer (scala.Function1<java.lang.Object, java.nio.ByteBuffer> allocator)  ;
  // not preceding
  public  java.io.InputStream toInputStream ()  ;
  /**
   * Returns a Netty-friendly wrapper for the block's data.
   * <p>
   * Please see <code>ManagedBuffer.convertToNetty()</code> for more details.
   * @return (undocumented)
   */
  public  java.lang.Object toNetty ()  ;
}
