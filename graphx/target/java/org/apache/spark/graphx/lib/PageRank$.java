package org.apache.spark.graphx.lib;
/**
 * Run PageRank for a fixed number of iterations returning a graph
 * with vertex attributes containing the PageRank and edge
 * attributes the normalized edge weight.
 * <p>
 * @param <VD>  the original vertex attribute (not used)
 * @param <ED>  the original edge attribute (not used)
 * <p>
 * param:  graph the graph on which to compute PageRank
 * param:  numIter the number of iterations of PageRank to run
 * param:  resetProb the random reset probability (alpha)
 * <p>
 * @return the graph containing with each vertex containing the PageRank and each edge
 *         containing the normalized weight.
 */
// not preceding
public  class PageRank$ implements org.apache.spark.internal.Logging {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final PageRank$ MODULE$ = null;
  public   PageRank$ ()  { throw new RuntimeException(); }
  // not preceding
  public <VD extends java.lang.Object, ED extends java.lang.Object> org.apache.spark.graphx.Graph<java.lang.Object, java.lang.Object> run (org.apache.spark.graphx.Graph<VD, ED> graph, int numIter, double resetProb, scala.reflect.ClassTag<VD> evidence$1, scala.reflect.ClassTag<ED> evidence$2)  { throw new RuntimeException(); }
  /**
   * Run PageRank for a fixed number of iterations returning a graph
   * with vertex attributes containing the PageRank and edge
   * attributes the normalized edge weight.
   * <p>
   * @tparam VD the original vertex attribute (not used)
   * @tparam ED the original edge attribute (not used)
   * <p>
   * @param graph the graph on which to compute PageRank
   * @param numIter the number of iterations of PageRank to run
   * @param resetProb the random reset probability (alpha)
   * @param srcId the source vertex for a Personalized Page Rank (optional)
   * <p>
   * @return the graph containing with each vertex containing the PageRank and each edge
   *         containing the normalized weight.
   * <p>
   * @param evidence$3 (undocumented)
   * @param evidence$4 (undocumented)
   */
  public <VD extends java.lang.Object, ED extends java.lang.Object> org.apache.spark.graphx.Graph<java.lang.Object, java.lang.Object> runWithOptions (org.apache.spark.graphx.Graph<VD, ED> graph, int numIter, double resetProb, scala.Option<java.lang.Object> srcId, scala.reflect.ClassTag<VD> evidence$3, scala.reflect.ClassTag<ED> evidence$4)  { throw new RuntimeException(); }
  /**
   * Run PageRank for a fixed number of iterations returning a graph
   * with vertex attributes containing the PageRank and edge
   * attributes the normalized edge weight.
   * <p>
   * @tparam VD the original vertex attribute (not used)
   * @tparam ED the original edge attribute (not used)
   * <p>
   * @param graph the graph on which to compute PageRank
   * @param numIter the number of iterations of PageRank to run
   * @param resetProb the random reset probability (alpha)
   * @param srcId the source vertex for a Personalized Page Rank (optional)
   * @param preRankGraph PageRank graph from which to keep iterating
   * <p>
   * @return the graph containing with each vertex containing the PageRank and each edge
   *         containing the normalized weight.
   * <p>
   * @param evidence$5 (undocumented)
   * @param evidence$6 (undocumented)
   */
  public <VD extends java.lang.Object, ED extends java.lang.Object> org.apache.spark.graphx.Graph<java.lang.Object, java.lang.Object> runWithOptionsWithPreviousPageRank (org.apache.spark.graphx.Graph<VD, ED> graph, int numIter, double resetProb, scala.Option<java.lang.Object> srcId, org.apache.spark.graphx.Graph<java.lang.Object, java.lang.Object> preRankGraph, scala.reflect.ClassTag<VD> evidence$5, scala.reflect.ClassTag<ED> evidence$6)  { throw new RuntimeException(); }
  /**
   * Run Personalized PageRank for a fixed number of iterations, for a
   * set of starting nodes in parallel. Returns a graph with vertex attributes
   * containing the pagerank relative to all starting nodes (as a sparse vector) and
   * edge attributes the normalized edge weight
   * <p>
   * @tparam VD The original vertex attribute (not used)
   * @tparam ED The original edge attribute (not used)
   * <p>
   * @param graph The graph on which to compute personalized pagerank
   * @param numIter The number of iterations to run
   * @param resetProb The random reset probability
   * @param sources The list of sources to compute personalized pagerank from
   * @return the graph with vertex attributes
   *         containing the pagerank relative to all starting nodes (as a sparse vector
   *         indexed by the position of nodes in the sources list) and
   *         edge attributes the normalized edge weight
   * @param evidence$7 (undocumented)
   * @param evidence$8 (undocumented)
   */
  public <VD extends java.lang.Object, ED extends java.lang.Object> org.apache.spark.graphx.Graph<org.apache.spark.ml.linalg.Vector, java.lang.Object> runParallelPersonalizedPageRank (org.apache.spark.graphx.Graph<VD, ED> graph, int numIter, double resetProb, long[] sources, scala.reflect.ClassTag<VD> evidence$7, scala.reflect.ClassTag<ED> evidence$8)  { throw new RuntimeException(); }
  /**
   * Run a dynamic version of PageRank returning a graph with vertex attributes containing the
   * PageRank and edge attributes containing the normalized edge weight.
   * <p>
   * @tparam VD the original vertex attribute (not used)
   * @tparam ED the original edge attribute (not used)
   * <p>
   * @param graph the graph on which to compute PageRank
   * @param tol the tolerance allowed at convergence (smaller =&gt; more accurate).
   * @param resetProb the random reset probability (alpha)
   * <p>
   * @return the graph containing with each vertex containing the PageRank and each edge
   *         containing the normalized weight.
   * @param evidence$9 (undocumented)
   * @param evidence$10 (undocumented)
   */
  public <VD extends java.lang.Object, ED extends java.lang.Object> org.apache.spark.graphx.Graph<java.lang.Object, java.lang.Object> runUntilConvergence (org.apache.spark.graphx.Graph<VD, ED> graph, double tol, double resetProb, scala.reflect.ClassTag<VD> evidence$9, scala.reflect.ClassTag<ED> evidence$10)  { throw new RuntimeException(); }
  /**
   * Run a dynamic version of PageRank returning a graph with vertex attributes containing the
   * PageRank and edge attributes containing the normalized edge weight.
   * <p>
   * @tparam VD the original vertex attribute (not used)
   * @tparam ED the original edge attribute (not used)
   * <p>
   * @param graph the graph on which to compute PageRank
   * @param tol the tolerance allowed at convergence (smaller =&gt; more accurate).
   * @param resetProb the random reset probability (alpha)
   * @param srcId the source vertex for a Personalized Page Rank (optional)
   * <p>
   * @return the graph containing with each vertex containing the PageRank and each edge
   *         containing the normalized weight.
   * @param evidence$11 (undocumented)
   * @param evidence$12 (undocumented)
   */
  public <VD extends java.lang.Object, ED extends java.lang.Object> org.apache.spark.graphx.Graph<java.lang.Object, java.lang.Object> runUntilConvergenceWithOptions (org.apache.spark.graphx.Graph<VD, ED> graph, double tol, double resetProb, scala.Option<java.lang.Object> srcId, scala.reflect.ClassTag<VD> evidence$11, scala.reflect.ClassTag<ED> evidence$12)  { throw new RuntimeException(); }
}
