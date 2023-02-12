package org.apache.spark.graphx;
/**
 * Return the relative direction of the edge to the corresponding
 * vertex.
 * <p>
 * param:  vid the id of one of the two vertices in the edge.
 * @return the relative direction of the edge to the corresponding
 * vertex.
 */
// not preceding
public  class Edge$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final Edge$ MODULE$ = null;
  public   Edge$ ()  { throw new RuntimeException(); }
  /**
   * Return the relative direction of the edge to the corresponding
   * vertex.
   * <p>
   * @param vid the id of one of the two vertices in the edge.
   * @return the relative direction of the edge to the corresponding
   * vertex.
   */
   <ED extends java.lang.Object> java.lang.Object lexicographicOrdering ()  { throw new RuntimeException(); }
   <ED extends java.lang.Object> org.apache.spark.util.collection.SortDataFormat<org.apache.spark.graphx.Edge<ED>, org.apache.spark.graphx.Edge<ED>[]> edgeArraySortDataFormat ()  { throw new RuntimeException(); }
}
