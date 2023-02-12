package org.apache.spark.graphx;
/**
 * Assigns edges to partitions using a 2D partitioning of the sparse edge adjacency matrix,
 * guaranteeing a <code>2 * sqrt(numParts)</code> bound on vertex replication.
 * <p>
 * Suppose we have a graph with 12 vertices that we want to partition
 * over 9 machines.  We can use the following sparse matrix representation:
 * <p>
 * <pre>
 *       __________________________________
 *  v0   | P0 *     | P1       | P2    *  |
 *  v1   |  ****    |  *       |          |
 *  v2   |  ******* |      **  |  ****    |
 *  v3   |  *****   |  *  *    |       *  |
 *       ----------------------------------
 *  v4   | P3 *     | P4 ***   | P5 **  * |
 *  v5   |  *  *    |  *       |          |
 *  v6   |       *  |      **  |  ****    |
 *  v7   |  * * *   |  *  *    |       *  |
 *       ----------------------------------
 *  v8   | P6   *   | P7    *  | P8  *   *|
 *  v9   |     *    |  *    *  |          |
 *  v10  |       *  |      **  |  *  *    |
 *  v11  | * &lt;-E    |  ***     |       ** |
 *       ----------------------------------
 * </pre>
 * <p>
 * The edge denoted by <code>E</code> connects <code>v11</code> with <code>v1</code> and is assigned to processor <code>P6</code>. To get the
 * processor number we divide the matrix into <code>sqrt(numParts)</code> by <code>sqrt(numParts)</code> blocks. Notice
 * that edges adjacent to <code>v11</code> can only be in the first column of blocks <code>(P0, P3,
 * P6)</code> or the last
 * row of blocks <code>(P6, P7, P8)</code>.  As a consequence we can guarantee that <code>v11</code> will need to be
 * replicated to at most <code>2 * sqrt(numParts)</code> machines.
 * <p>
 * Notice that <code>P0</code> has many edges and as a consequence this partitioning would lead to poor work
 * balance.  To improve balance we first multiply each vertex id by a large prime to shuffle the
 * vertex locations.
 * <p>
 * When the number of partitions requested is not a perfect square we use a slightly different
 * method where the last column can have a different number of rows than the others while still
 * maintaining the same size per block.
 */
// not preceding
public  class PartitionStrategy$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final PartitionStrategy$ MODULE$ = null;
  public   PartitionStrategy$ ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.graphx.PartitionStrategy fromString (java.lang.String s)  { throw new RuntimeException(); }
}
