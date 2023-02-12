package org.apache.spark.ml.evaluation;
/**
 * This method registers the class
 * {@link org.apache.spark.ml.evaluation.SquaredEuclideanSilhouette.ClusterStats}
 * for kryo serialization.
 * <p>
 * param:  sc <code>SparkContext</code> to be used
 */
// not preceding
public  class SquaredEuclideanSilhouette {
  static public  class ClusterStats implements scala.Product, scala.Serializable {
    // not preceding
    public  org.apache.spark.ml.linalg.Vector featureSum ()  { throw new RuntimeException(); }
    public  double squaredNormSum ()  { throw new RuntimeException(); }
    public  long numOfPoints ()  { throw new RuntimeException(); }
    // not preceding
    public   ClusterStats (org.apache.spark.ml.linalg.Vector featureSum, double squaredNormSum, long numOfPoints)  { throw new RuntimeException(); }
  }
  // not preceding
  static public  class ClusterStats$ extends scala.runtime.AbstractFunction3<org.apache.spark.ml.linalg.Vector, java.lang.Object, java.lang.Object, org.apache.spark.ml.evaluation.SquaredEuclideanSilhouette.ClusterStats> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final ClusterStats$ MODULE$ = null;
    public   ClusterStats$ ()  { throw new RuntimeException(); }
  }
  // not preceding
  static public  void registerKryoClasses (org.apache.spark.SparkContext sc)  { throw new RuntimeException(); }
  // not preceding
  static public  scala.collection.immutable.Map<java.lang.Object, org.apache.spark.ml.evaluation.SquaredEuclideanSilhouette.ClusterStats> computeClusterStats (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> df, java.lang.String predictionCol, java.lang.String featuresCol)  { throw new RuntimeException(); }
  /**
   * It computes the Silhouette coefficient for a point.
   * <p>
   * @param broadcastedClustersMap A map of the precomputed values for each cluster.
   * @param point The {@link org.apache.spark.ml.linalg.Vector} representing the current point.
   * @param clusterId The id of the cluster the current point belongs to.
   * @param squaredNorm The <code>$\Xi_{X}$</code> (which is the squared norm) precomputed for the point.
   * @return The Silhouette for the point.
   */
  static public  double computeSilhouetteCoefficient (org.apache.spark.broadcast.Broadcast<scala.collection.immutable.Map<java.lang.Object, org.apache.spark.ml.evaluation.SquaredEuclideanSilhouette.ClusterStats>> broadcastedClustersMap, org.apache.spark.ml.linalg.Vector point, double clusterId, double squaredNorm)  { throw new RuntimeException(); }
  /**
   * Compute the Silhouette score of the dataset using squared Euclidean distance measure.
   * <p>
   * @param dataset The input dataset (previously clustered) on which compute the Silhouette.
   * @param predictionCol The name of the column which contains the predicted cluster id
   *                      for the point.
   * @param featuresCol The name of the column which contains the feature vector of the point.
   * @return The average of the Silhouette values of the clustered data.
   */
  static public  double computeSilhouetteScore (org.apache.spark.sql.Dataset<?> dataset, java.lang.String predictionCol, java.lang.String featuresCol)  { throw new RuntimeException(); }
  static public  double pointSilhouetteCoefficient (scala.collection.immutable.Set<java.lang.Object> clusterIds, double pointClusterId, long pointClusterNumOfPoints, scala.Function1<java.lang.Object, java.lang.Object> averageDistanceToCluster)  { throw new RuntimeException(); }
  static public  double overallScore (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> df, org.apache.spark.sql.Column scoreColumn)  { throw new RuntimeException(); }
}
