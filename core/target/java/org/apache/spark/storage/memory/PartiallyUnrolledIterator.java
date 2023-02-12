package org.apache.spark.storage.memory;
/**
 * Called to dispose of this iterator and free its memory.
 */
  class PartiallyUnrolledIterator<T extends java.lang.Object> implements scala.collection.Iterator<T> {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  public   PartiallyUnrolledIterator (org.apache.spark.storage.memory.MemoryStore memoryStore, org.apache.spark.memory.MemoryMode memoryMode, long unrollMemory, scala.collection.Iterator<T> unrolled, scala.collection.Iterator<T> rest)  { throw new RuntimeException(); }
  /**
   * Called to dispose of this iterator and free its memory.
   */
  public  void close ()  { throw new RuntimeException(); }
  public  boolean hasNext ()  { throw new RuntimeException(); }
  public  T next ()  { throw new RuntimeException(); }
}
