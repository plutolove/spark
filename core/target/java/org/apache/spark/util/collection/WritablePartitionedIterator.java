package org.apache.spark.util.collection;
/**
 * Iterator that writes elements to a DiskBlockObjectWriter instead of returning them. Each element
 * has an associated partition.
 */
public  interface WritablePartitionedIterator {
  public  boolean hasNext ()  ;
  public  int nextPartition ()  ;
  // not preceding
  public  void writeNext (org.apache.spark.util.collection.PairsWriter writer)  ;
}
