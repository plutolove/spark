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
public  class PageRank {
  // not preceding
  static public <VD extends java.lang.Object, ED extends java.lang.Object> org.apache.spark.graphx.Graph<java.lang.Object, java.lang.Object> run (org.apache.spark.graphx.Graph<VD, ED> graph, int numIter, double resetProb, scala.reflect.ClassTag<VD> evidence$1, scala.reflect.ClassTag<ED> evidence$2)  { throw new RuntimeException(); }
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
  static public <VD extends java.lang.Object, ED extends java.lang.Object> org.apache.spark.graphx.Graph<java.lang.Object, java.lang.Object> runWithOptions (org.apache.spark.graphx.Graph<VD, ED> graph, int numIter, double resetProb, scala.Option<java.lang.Object> srcId, scala.reflect.ClassTag<VD> evidence$3, scala.reflect.ClassTag<ED> evidence$4)  { throw new RuntimeException(); }
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
  static public <VD extends java.lang.Object, ED extends java.lang.Object> org.apache.spark.graphx.Graph<java.lang.Object, java.lang.Object> runWithOptionsWithPreviousPageRank (org.apache.spark.graphx.Graph<VD, ED> graph, int numIter, double resetProb, scala.Option<java.lang.Object> srcId, org.apache.spark.graphx.Graph<java.lang.Object, java.lang.Object> preRankGraph, scala.reflect.ClassTag<VD> evidence$5, scala.reflect.ClassTag<ED> evidence$6)  { throw new RuntimeException(); }
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
  static public <VD extends java.lang.Object, ED extends java.lang.Object> org.apache.spark.graphx.Graph<org.apache.spark.ml.linalg.Vector, java.lang.Object> runParallelPersonalizedPageRank (org.apache.spark.graphx.Graph<VD, ED> graph, int numIter, double resetProb, long[] sources, scala.reflect.ClassTag<VD> evidence$7, scala.reflect.ClassTag<ED> evidence$8)  { throw new RuntimeException(); }
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
  static public <VD extends java.lang.Object, ED extends java.lang.Object> org.apache.spark.graphx.Graph<java.lang.Object, java.lang.Object> runUntilConvergence (org.apache.spark.graphx.Graph<VD, ED> graph, double tol, double resetProb, scala.reflect.ClassTag<VD> evidence$9, scala.reflect.ClassTag<ED> evidence$10)  { throw new RuntimeException(); }
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
  static public <VD extends java.lang.Object, ED extends java.lang.Object> org.apache.spark.graphx.Graph<java.lang.Object, java.lang.Object> runUntilConvergenceWithOptions (org.apache.spark.graphx.Graph<VD, ED> graph, double tol, double resetProb, scala.Option<java.lang.Object> srcId, scala.reflect.ClassTag<VD> evidence$11, scala.reflect.ClassTag<ED> evidence$12)  { throw new RuntimeException(); }
  static public  org.slf4j.Logger org$apache$spark$internal$Logging$$log_ ()  { throw new RuntimeException(); }
  static public  void org$apache$spark$internal$Logging$$log__$eq (org.slf4j.Logger x$1)  { throw new RuntimeException(); }
  static protected  java.lang.String logName ()  { throw new RuntimeException(); }
  static protected  org.slf4j.Logger log ()  { throw new RuntimeException(); }
  static protected  void logInfo (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logDebug (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logTrace (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logWarning (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logError (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logInfo (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logDebug (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logTrace (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logWarning (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logError (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  boolean isTraceEnabled ()  { throw new RuntimeException(); }
  static protected  void initializeLogIfNecessary (boolean isInterpreter)  { throw new RuntimeException(); }
  static protected  boolean initializeLogIfNecessary (boolean isInterpreter, boolean silent)  { throw new RuntimeException(); }
  static protected  boolean initializeLogIfNecessary$default$2 ()  { throw new RuntimeException(); }
  static   void initializeForcefully (boolean isInterpreter, boolean silent)  { throw new RuntimeException(); }
}
