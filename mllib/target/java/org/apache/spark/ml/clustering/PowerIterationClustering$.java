package org.apache.spark.ml.clustering;
/**
 * Run the PIC algorithm and returns a cluster assignment for each input vertex.
 * <p>
 * param:  dataset A dataset with columns src, dst, weight representing the affinity matrix,
 *                which is the matrix A in the PIC paper. Suppose the src column value is i,
 *                the dst column value is j, the weight column value is similarity s,,ij,,
 *                which must be nonnegative. This is a symmetric matrix and hence
 *                s,,ij,, = s,,ji,,. For any (i, j) with nonzero similarity, there should be
 *                either (i, j, s,,ij,,) or (j, i, s,,ji,,) in the input. Rows with i = j are
 *                ignored, because we assume s,,ij,, = 0.0.
 * <p>
 * @return A dataset that contains columns of vertex id and the corresponding cluster for the id.
 *         The schema of it will be:
 *          - id: Long
 *          - cluster: Int
 */
// not preceding
public  class PowerIterationClustering$ implements org.apache.spark.ml.util.DefaultParamsReadable<org.apache.spark.ml.clustering.PowerIterationClustering>, scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final PowerIterationClustering$ MODULE$ = null;
  public   PowerIterationClustering$ ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.ml.clustering.PowerIterationClustering load (java.lang.String path)  { throw new RuntimeException(); }
}
