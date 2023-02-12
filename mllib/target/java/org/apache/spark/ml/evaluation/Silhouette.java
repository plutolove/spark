package org.apache.spark.ml.evaluation;
/**
 * It computes the Silhouette coefficient for a point.
 */
 abstract class Silhouette {
  // not preceding
  public   Silhouette ()  { throw new RuntimeException(); }
  /**
   * Compute the mean Silhouette values of all samples.
   * @param df (undocumented)
   * @param scoreColumn (undocumented)
   * @return (undocumented)
   */
  public  double overallScore (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> df, org.apache.spark.sql.Column scoreColumn)  { throw new RuntimeException(); }
  // not preceding
  public  double pointSilhouetteCoefficient (scala.collection.immutable.Set<java.lang.Object> clusterIds, double pointClusterId, long pointClusterNumOfPoints, scala.Function1<java.lang.Object, java.lang.Object> averageDistanceToCluster)  { throw new RuntimeException(); }
}
