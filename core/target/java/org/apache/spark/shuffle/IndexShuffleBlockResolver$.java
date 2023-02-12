package org.apache.spark.shuffle;
/**
 * Write an index file with the offsets of each block, plus a final offset at the end for the
 * end of the output file. This will be used by getBlockData to figure out where each block
 * begins and ends.
 * <p>
 * It will commit the data and index file as an atomic operation, use the existing ones, or
 * replace them with new ones.
 * <p>
 * Note: the <code>lengths</code> will be updated to match the existing index file if use the existing ones.
 */
// not preceding
public  class IndexShuffleBlockResolver$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final IndexShuffleBlockResolver$ MODULE$ = null;
  public   IndexShuffleBlockResolver$ ()  { throw new RuntimeException(); }
  /**
   * Write an index file with the offsets of each block, plus a final offset at the end for the
   * end of the output file. This will be used by getBlockData to figure out where each block
   * begins and ends.
   * <p>
   * It will commit the data and index file as an atomic operation, use the existing ones, or
   * replace them with new ones.
   * <p>
   * Note: the <code>lengths</code> will be updated to match the existing index file if use the existing ones.
   * @return (undocumented)
   */
  public  int NOOP_REDUCE_ID ()  { throw new RuntimeException(); }
}
