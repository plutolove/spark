package org.apache.spark.storage;
/**
 * Uses sampling algorithm by Robert Floyd. Finds a random sample in O(n) while
 * minimizing space usage. Please see <a href="https://math.stackexchange.com/q/178690">
 * here</a>.
 * <p>
 * param:  n total number of indices
 * param:  m number of samples needed
 * param:  r random number generator
 * @return list of m random unique indices
 */
// not preceding
public  class BlockReplicationUtils {
  /**
   * Get a random sample of size m from the elems
   * <p>
   * @param elems
   * @param m number of samples needed
   * @param r random number generator
   * @tparam T
   * @return a random list of size m. If there are fewer than m elements in elems, we just
   *         randomly shuffle elems
   */
  static public <T extends java.lang.Object> scala.collection.immutable.List<T> getRandomSample (scala.collection.Seq<T> elems, int m, scala.util.Random r)  { throw new RuntimeException(); }
}