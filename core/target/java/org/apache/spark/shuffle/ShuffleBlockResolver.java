package org.apache.spark.shuffle;
/**
 * Implementers of this trait understand how to retrieve block data for a logical shuffle block
 * identifier (i.e. map, reduce, and shuffle). Implementations may use files or file segments to
 * encapsulate shuffle data. This is used by the BlockStore to abstract over different shuffle
 * implementations when shuffle data is retrieved.
 */
public  interface ShuffleBlockResolver {
  /**
   * Retrieve the data for the specified block.
   * <p>
   * When the dirs parameter is None then use the disk manager's local directories. Otherwise,
   * read from the specified directories.
   * <p>
   * If the data for that block is not available, throws an unspecified exception.
   * @param blockId (undocumented)
   * @param dirs (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.network.buffer.ManagedBuffer getBlockData (org.apache.spark.storage.BlockId blockId, scala.Option<java.lang.String[]> dirs)  ;
  public  void stop ()  ;
}
