package org.apache.spark.mllib.linalg.distributed;
/**
 * Returns the index of the partition the input coordinate belongs to.
 * <p>
 * param:  key The partition id i (calculated through this method for coordinate (i, j) in
 *            <code>simulateMultiply</code>, the coordinate (i, j) or a tuple (i, j, k), where k is
 *            the inner index used in multiplication. k is ignored in computing partitions.
 * @return The index of the partition, which the coordinate belongs to.
 */
  class GridPartitioner extends org.apache.spark.Partitioner {
  // not preceding
  static public  org.apache.spark.mllib.linalg.distributed.GridPartitioner apply (int rows, int cols, int rowsPerPart, int colsPerPart)  { throw new RuntimeException(); }
  /** Creates a new {@link GridPartitioner} instance with the input suggested number of partitions. */
  static public  org.apache.spark.mllib.linalg.distributed.GridPartitioner apply (int rows, int cols, int suggestedNumPartitions)  { throw new RuntimeException(); }
  // not preceding
  public  int rows ()  { throw new RuntimeException(); }
  public  int cols ()  { throw new RuntimeException(); }
  public  int rowsPerPart ()  { throw new RuntimeException(); }
  public  int colsPerPart ()  { throw new RuntimeException(); }
  // not preceding
  public   GridPartitioner (int rows, int cols, int rowsPerPart, int colsPerPart)  { throw new RuntimeException(); }
  public  int numPartitions ()  { throw new RuntimeException(); }
  /**
   * Returns the index of the partition the input coordinate belongs to.
   * <p>
   * @param key The partition id i (calculated through this method for coordinate (i, j) in
   *            <code>simulateMultiply</code>, the coordinate (i, j) or a tuple (i, j, k), where k is
   *            the inner index used in multiplication. k is ignored in computing partitions.
   * @return The index of the partition, which the coordinate belongs to.
   */
  public  int getPartition (Object key)  { throw new RuntimeException(); }
  public  boolean equals (Object obj)  { throw new RuntimeException(); }
  public  int hashCode ()  { throw new RuntimeException(); }
}
