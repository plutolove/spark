package org.apache.spark.storage.memory;
/**
 * Called to dispose of this block and free its memory.
 */
  class PartiallySerializedBlock<T extends java.lang.Object> {
  // not preceding
  public   PartiallySerializedBlock (org.apache.spark.storage.memory.MemoryStore memoryStore, org.apache.spark.serializer.SerializerManager serializerManager, org.apache.spark.storage.BlockId blockId, org.apache.spark.serializer.SerializationStream serializationStream, org.apache.spark.storage.memory.RedirectableOutputStream redirectableOutputStream, long unrollMemory, org.apache.spark.memory.MemoryMode memoryMode, org.apache.spark.util.io.ChunkedByteBufferOutputStream bbos, scala.collection.Iterator<T> rest, scala.reflect.ClassTag<T> classTag)  { throw new RuntimeException(); }
  /**
   * Called to dispose of this block and free its memory.
   */
  public  void discard ()  { throw new RuntimeException(); }
  /**
   * Finish writing this block to the given output stream by first writing the serialized values
   * and then serializing the values from the original input iterator.
   * @param os (undocumented)
   */
  public  void finishWritingToStream (java.io.OutputStream os)  { throw new RuntimeException(); }
    org.apache.spark.util.io.ChunkedByteBuffer getUnrolledChunkedByteBuffer ()  { throw new RuntimeException(); }
  public  long unrollMemory ()  { throw new RuntimeException(); }
  /**
   * Returns an iterator over the values in this block by first deserializing the serialized
   * values and then consuming the rest of the original input iterator.
   * <p>
   * If the caller does not plan to fully consume the resulting iterator then they must call
   * <code>close()</code> on it to free its resources.
   * @return (undocumented)
   */
  public  org.apache.spark.storage.memory.PartiallyUnrolledIterator<T> valuesIterator ()  { throw new RuntimeException(); }
}
