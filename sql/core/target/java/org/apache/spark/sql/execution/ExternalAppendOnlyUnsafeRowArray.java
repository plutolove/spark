package org.apache.spark.sql.execution;
/**
 * Clears up resources (eg. memory) held by the backing storage
 */
  class ExternalAppendOnlyUnsafeRowArray implements org.apache.spark.internal.Logging {
  // not preceding
  static public  int DefaultInitialSizeOfInMemoryBuffer ()  { throw new RuntimeException(); }
  // not preceding
  public   ExternalAppendOnlyUnsafeRowArray (org.apache.spark.memory.TaskMemoryManager taskMemoryManager, org.apache.spark.storage.BlockManager blockManager, org.apache.spark.serializer.SerializerManager serializerManager, org.apache.spark.TaskContext taskContext, int initialSize, long pageSizeBytes, int numRowsInMemoryBufferThreshold, int numRowsSpillThreshold)  { throw new RuntimeException(); }
  // not preceding
  public   ExternalAppendOnlyUnsafeRowArray (int numRowsInMemoryBufferThreshold, int numRowsSpillThreshold)  { throw new RuntimeException(); }
  public  int length ()  { throw new RuntimeException(); }
  public  boolean isEmpty ()  { throw new RuntimeException(); }
  /**
   * Clears up resources (eg. memory) held by the backing storage
   */
  public  void clear ()  { throw new RuntimeException(); }
  public  void add (org.apache.spark.sql.catalyst.expressions.UnsafeRow unsafeRow)  { throw new RuntimeException(); }
  /**
   * Creates an {@link Iterator} for the current rows in the array starting from a user provided index
   * <p>
   * If there are subsequent {@link add()} or {@link clear()} calls made on this array after creation of
   * the iterator, then the iterator is invalidated thus saving clients from thinking that they
   * have read all the data while there were new rows added to this array.
   * @param startIndex (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.Iterator<org.apache.spark.sql.catalyst.expressions.UnsafeRow> generateIterator (int startIndex)  { throw new RuntimeException(); }
  public  scala.collection.Iterator<org.apache.spark.sql.catalyst.expressions.UnsafeRow> generateIterator ()  { throw new RuntimeException(); }
}
