package org.apache.spark.storage.memory;
/**
 * Log a warning for failing to unroll a block.
 * <p>
 * param:  blockId ID of the block we are trying to unroll.
 * param:  finalVectorSize Final size of the vector before unrolling failed.
 */
public  interface MemoryEntryBuilder<T extends java.lang.Object> {
  public  org.apache.spark.storage.memory.MemoryEntry<T> build ()  ;
  public  long preciseSize ()  ;
}
