package org.apache.spark.graphx.lib;
/**
 * Compute the strongly connected component (SCC) of each vertex and return a graph with the
 * vertex value containing the lowest vertex id in the SCC containing that vertex.
 * <p>
 * @param <VD>  the vertex attribute type (discarded in the computation)
 * @param <ED>  the edge attribute type (preserved in the computation)
 * <p>
 * param:  graph the graph for which to compute the SCC
 * <p>
 * @return a graph with vertex attributes containing the smallest vertex id in each SCC
 */
// not preceding
public  class StronglyConnectedComponents$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final StronglyConnectedComponents$ MODULE$ = null;
  public   StronglyConnectedComponents$ ()  { throw new RuntimeException(); }
  // not preceding
  public <VD extends java.lang.Object, ED extends java.lang.Object> org.apache.spark.graphx.Graph<java.lang.Object, ED> run (org.apache.spark.graphx.Graph<VD, ED> graph, int numIter, scala.reflect.ClassTag<VD> evidence$1, scala.reflect.ClassTag<ED> evidence$2)  { throw new RuntimeException(); }
}
