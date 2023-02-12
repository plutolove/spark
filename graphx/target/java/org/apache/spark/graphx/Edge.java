package org.apache.spark.graphx;
/**
 * Given one vertex in the edge return the other vertex.
 * <p>
 * param:  vid the id one of the two vertices on the edge.
 * @return the id of the other vertex on the edge.
 */
public  class Edge<ED extends java.lang.Object> implements scala.Serializable, scala.Product {
  /**
   * Return the relative direction of the edge to the corresponding
   * vertex.
   * <p>
   * @param vid the id of one of the two vertices in the edge.
   * @return the relative direction of the edge to the corresponding
   * vertex.
   */
  static  <ED extends java.lang.Object> java.lang.Object lexicographicOrdering ()  { throw new RuntimeException(); }
  static  <ED extends java.lang.Object> org.apache.spark.util.collection.SortDataFormat<org.apache.spark.graphx.Edge<ED>, org.apache.spark.graphx.Edge<ED>[]> edgeArraySortDataFormat ()  { throw new RuntimeException(); }
  public  long srcId ()  { throw new RuntimeException(); }
  public  long dstId ()  { throw new RuntimeException(); }
  public  ED attr ()  { throw new RuntimeException(); }
  // not preceding
  public   Edge (long srcId, long dstId, ED attr)  { throw new RuntimeException(); }
  // not preceding
  public  long otherVertexId (long vid)  { throw new RuntimeException(); }
  /**
   * Return the relative direction of the edge to the corresponding
   * vertex.
   * <p>
   * @param vid the id of one of the two vertices in the edge.
   * @return the relative direction of the edge to the corresponding
   * vertex.
   */
  public  org.apache.spark.graphx.EdgeDirection relativeDirection (long vid)  { throw new RuntimeException(); }
}
