package org.apache.spark.mllib.clustering;
/**
 * Cluster assignment.
 * param:  id node id
 * param:  cluster assigned cluster id
 */
// not preceding
public  class PowerIterationClustering$ implements org.apache.spark.internal.Logging, scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final PowerIterationClustering$ MODULE$ = null;
  public   PowerIterationClustering$ ()  { throw new RuntimeException(); }
  // not preceding
    org.apache.spark.graphx.Graph<java.lang.Object, java.lang.Object> normalize (org.apache.spark.graphx.Graph<java.lang.Object, java.lang.Object> graph)  { throw new RuntimeException(); }
  /**
   * Normalizes the affinity matrix (A) by row sums and returns the normalized affinity matrix (W).
   * @param similarities (undocumented)
   * @return (undocumented)
   */
    org.apache.spark.graphx.Graph<java.lang.Object, java.lang.Object> normalize (org.apache.spark.rdd.RDD<scala.Tuple3<java.lang.Object, java.lang.Object, java.lang.Object>> similarities)  { throw new RuntimeException(); }
  /**
   * Generates random vertex properties (v0) to start power iteration.
   * <p>
   * @param g a graph representing the normalized affinity matrix (W)
   * @return a graph with edges representing W and vertices representing a random vector
   *         with unit 1-norm
   */
    org.apache.spark.graphx.Graph<java.lang.Object, java.lang.Object> randomInit (org.apache.spark.graphx.Graph<java.lang.Object, java.lang.Object> g)  { throw new RuntimeException(); }
  /**
   * Generates the degree vector as the vertex properties (v0) to start power iteration.
   * It is not exactly the node degrees but just the normalized sum similarities. Call it
   * as degree vector because it is used in the PIC paper.
   * <p>
   * @param g a graph representing the normalized affinity matrix (W)
   * @return a graph with edges representing W and vertices representing the degree vector
   */
    org.apache.spark.graphx.Graph<java.lang.Object, java.lang.Object> initDegreeVector (org.apache.spark.graphx.Graph<java.lang.Object, java.lang.Object> g)  { throw new RuntimeException(); }
  /**
   * Power Iteration fails to converge if absolute value of top 2 eigen values are equal,
   * but with opposite sign. The resultant vector flip-flops between two vectors.
   * We should give an exception, if we detect the failure of the convergence of the
   * power iteration
   * @param g (undocumented)
   * @param maxIterations (undocumented)
   * @return (undocumented)
   */
    org.apache.spark.graphx.VertexRDD<java.lang.Object> powerIter (org.apache.spark.graphx.Graph<java.lang.Object, java.lang.Object> g, int maxIterations)  { throw new RuntimeException(); }
  /**
   * Runs k-means clustering.
   * @param v a {@link VertexRDD} representing the pseudo-eigenvector
   * @param k number of clusters
   * @return a {@link VertexRDD} representing the clustering assignments
   */
    org.apache.spark.graphx.VertexRDD<java.lang.Object> kMeans (org.apache.spark.graphx.VertexRDD<java.lang.Object> v, int k)  { throw new RuntimeException(); }
}
