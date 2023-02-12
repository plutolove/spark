package org.apache.spark.ml.evaluation;
/**
 * The method takes the input dataset and computes the aggregated values
 * about a cluster which are needed by the algorithm.
 * <p>
 * param:  df The DataFrame which contains the input data
 * param:  predictionCol The name of the column which contains the predicted cluster id
 *                      for the point.
 * @return A {@link scala.collection.immutable.Map} which associates each cluster id to a
 *         its statistics (ie. the precomputed values <code>N</code> and <code>$\Omega_{\Gamma}$</code>).
 */
// not preceding
public  class CosineSilhouette$ extends org.apache.spark.ml.evaluation.Silhouette {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final CosineSilhouette$ MODULE$ = null;
  public   CosineSilhouette$ ()  { throw new RuntimeException(); }
  // not preceding
  public  scala.collection.immutable.Map<java.lang.Object, scala.Tuple2<org.apache.spark.ml.linalg.Vector, java.lang.Object>> computeClusterStats (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> df, java.lang.String featuresCol, java.lang.String predictionCol)  { throw new RuntimeException(); }
  /**
   * It computes the Silhouette coefficient for a point.
   * <p>
   * @param broadcastedClustersMap A map of the precomputed values for each cluster.
   * @param normalizedFeatures The {@link org.apache.spark.ml.linalg.Vector} representing the
   *                           normalized features of the current point.
   * @param clusterId The id of the cluster the current point belongs to.
   * @return (undocumented)
   */
  public  double computeSilhouetteCoefficient (org.apache.spark.broadcast.Broadcast<scala.collection.immutable.Map<java.lang.Object, scala.Tuple2<org.apache.spark.ml.linalg.Vector, java.lang.Object>>> broadcastedClustersMap, org.apache.spark.ml.linalg.Vector normalizedFeatures, double clusterId)  { throw new RuntimeException(); }
  /**
   * Compute the Silhouette score of the dataset using the cosine distance measure.
   * <p>
   * @param dataset The input dataset (previously clustered) on which compute the Silhouette.
   * @param predictionCol The name of the column which contains the predicted cluster id
   *                      for the point.
   * @param featuresCol The name of the column which contains the feature vector of the point.
   * @return The average of the Silhouette values of the clustered data.
   */
  public  double computeSilhouetteScore (org.apache.spark.sql.Dataset<?> dataset, java.lang.String predictionCol, java.lang.String featuresCol)  { throw new RuntimeException(); }
}
