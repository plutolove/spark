package org.apache.spark.ml.evaluation;
/**
 * This method registers the class
 * {@link org.apache.spark.ml.evaluation.SquaredEuclideanSilhouette.ClusterStats}
 * for kryo serialization.
 * <p>
 * param:  sc <code>SparkContext</code> to be used
 */
// not preceding
public  class SquaredEuclideanSilhouette$ extends org.apache.spark.ml.evaluation.Silhouette {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final SquaredEuclideanSilhouette$ MODULE$ = null;
  public   SquaredEuclideanSilhouette$ ()  { throw new RuntimeException(); }
  // not preceding
  public  void registerKryoClasses (org.apache.spark.SparkContext sc)  { throw new RuntimeException(); }
  // not preceding
  public  scala.collection.immutable.Map<java.lang.Object, org.apache.spark.ml.evaluation.SquaredEuclideanSilhouette.ClusterStats> computeClusterStats (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> df, java.lang.String predictionCol, java.lang.String featuresCol)  { throw new RuntimeException(); }
  /**
   * It computes the Silhouette coefficient for a point.
   * <p>
   * @param broadcastedClustersMap A map of the precomputed values for each cluster.
   * @param point The {@link org.apache.spark.ml.linalg.Vector} representing the current point.
   * @param clusterId The id of the cluster the current point belongs to.
   * @param squaredNorm The <code>$\Xi_{X}$</code> (which is the squared norm) precomputed for the point.
   * @return The Silhouette for the point.
   */
  public  double computeSilhouetteCoefficient (org.apache.spark.broadcast.Broadcast<scala.collection.immutable.Map<java.lang.Object, org.apache.spark.ml.evaluation.SquaredEuclideanSilhouette.ClusterStats>> broadcastedClustersMap, org.apache.spark.ml.linalg.Vector point, double clusterId, double squaredNorm)  { throw new RuntimeException(); }
  /**
   * Compute the Silhouette score of the dataset using squared Euclidean distance measure.
   * <p>
   * @param dataset The input dataset (previously clustered) on which compute the Silhouette.
   * @param predictionCol The name of the column which contains the predicted cluster id
   *                      for the point.
   * @param featuresCol The name of the column which contains the feature vector of the point.
   * @return The average of the Silhouette values of the clustered data.
   */
  public  double computeSilhouetteScore (org.apache.spark.sql.Dataset<?> dataset, java.lang.String predictionCol, java.lang.String featuresCol)  { throw new RuntimeException(); }
}
