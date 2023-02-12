package org.apache.spark.mllib.clustering;
/**
 * @return the index of the closest center to the given point, as well as the squared distance.
 */
  class EuclideanDistanceMeasure extends org.apache.spark.mllib.clustering.DistanceMeasure {
  // not preceding
  static   double fastSquaredDistance (org.apache.spark.mllib.clustering.VectorWithNorm v1, org.apache.spark.mllib.clustering.VectorWithNorm v2)  { throw new RuntimeException(); }
  // not preceding
  public   EuclideanDistanceMeasure ()  { throw new RuntimeException(); }
  // not preceding
  public  scala.Tuple2<java.lang.Object, java.lang.Object> findClosest (scala.collection.TraversableOnce<org.apache.spark.mllib.clustering.VectorWithNorm> centers, org.apache.spark.mllib.clustering.VectorWithNorm point)  { throw new RuntimeException(); }
  /**
   * @return whether a center converged or not, given the epsilon parameter.
   * @param oldCenter (undocumented)
   * @param newCenter (undocumented)
   * @param epsilon (undocumented)
   */
  public  boolean isCenterConverged (org.apache.spark.mllib.clustering.VectorWithNorm oldCenter, org.apache.spark.mllib.clustering.VectorWithNorm newCenter, double epsilon)  { throw new RuntimeException(); }
  /**
   * @param v1: first vector
   * @param v2: second vector
   * @return the Euclidean distance between the two input vectors
   */
  public  double distance (org.apache.spark.mllib.clustering.VectorWithNorm v1, org.apache.spark.mllib.clustering.VectorWithNorm v2)  { throw new RuntimeException(); }
  /**
   * @return the total cost of the cluster from its aggregated properties
   * @param centroid (undocumented)
   * @param pointsSum (undocumented)
   * @param weightSum (undocumented)
   * @param pointsSquaredNorm (undocumented)
   */
  public  double clusterCost (org.apache.spark.mllib.clustering.VectorWithNorm centroid, org.apache.spark.mllib.clustering.VectorWithNorm pointsSum, double weightSum, double pointsSquaredNorm)  { throw new RuntimeException(); }
  /**
   * @return the cost of a point to be assigned to the cluster centroid
   * @param point (undocumented)
   * @param centroid (undocumented)
   */
  public  double cost (org.apache.spark.mllib.clustering.VectorWithNorm point, org.apache.spark.mllib.clustering.VectorWithNorm centroid)  { throw new RuntimeException(); }
}
