package org.apache.spark.shuffle;
/**
 * Get the shuffle data file.
 * <p>
 * When the dirs parameter is None then use the disk manager's local directories. Otherwise,
 * read from the specified directories.
 */
  class IndexShuffleBlockResolver implements org.apache.spark.shuffle.ShuffleBlockResolver, org.apache.spark.internal.Logging {
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
  static public  int NOOP_REDUCE_ID ()  { throw new RuntimeException(); }
  // not preceding
  public   IndexShuffleBlockResolver (org.apache.spark.SparkConf conf, org.apache.spark.storage.BlockManager _blockManager)  { throw new RuntimeException(); }
  public  java.io.File getDataFile (int shuffleId, long mapId)  { throw new RuntimeException(); }
  /**
   * Get the shuffle data file.
   * <p>
   * When the dirs parameter is None then use the disk manager's local directories. Otherwise,
   * read from the specified directories.
   * @param shuffleId (undocumented)
   * @param mapId (undocumented)
   * @param dirs (undocumented)
   * @return (undocumented)
   */
  public  java.io.File getDataFile (int shuffleId, long mapId, scala.Option<java.lang.String[]> dirs)  { throw new RuntimeException(); }
  /**
   * Remove data file and index file that contain the output data from one map.
   * @param shuffleId (undocumented)
   * @param mapId (undocumented)
   */
  public  void removeDataByMap (int shuffleId, long mapId)  { throw new RuntimeException(); }
  /**
   * Write an index file with the offsets of each block, plus a final offset at the end for the
   * end of the output file. This will be used by getBlockData to figure out where each block
   * begins and ends.
   * <p>
   * It will commit the data and index file as an atomic operation, use the existing ones, or
   * replace them with new ones.
   * <p>
   * Note: the <code>lengths</code> will be updated to match the existing index file if use the existing ones.
   * @param shuffleId (undocumented)
   * @param mapId (undocumented)
   * @param lengths (undocumented)
   * @param dataTmp (undocumented)
   */
  public  void writeIndexFileAndCommit (int shuffleId, long mapId, long[] lengths, java.io.File dataTmp)  { throw new RuntimeException(); }
  public  org.apache.spark.network.buffer.ManagedBuffer getBlockData (org.apache.spark.storage.BlockId blockId, scala.Option<java.lang.String[]> dirs)  { throw new RuntimeException(); }
  public  void stop ()  { throw new RuntimeException(); }
}
