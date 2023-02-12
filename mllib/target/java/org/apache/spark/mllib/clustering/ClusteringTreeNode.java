package org.apache.spark.mllib.clustering;
/** Whether this is a leaf node. */
  class ClusteringTreeNode implements scala.Serializable {
  // not preceding
     ClusteringTreeNode (int index, long size, org.apache.spark.mllib.clustering.VectorWithNorm centerWithNorm, double cost, double height, org.apache.spark.mllib.clustering.ClusteringTreeNode[] children)  { throw new RuntimeException(); }
  /** Cluster center. */
  public  org.apache.spark.mllib.linalg.Vector center ()  { throw new RuntimeException(); }
    org.apache.spark.mllib.clustering.VectorWithNorm centerWithNorm ()  { throw new RuntimeException(); }
  public  org.apache.spark.mllib.clustering.ClusteringTreeNode[] children ()  { throw new RuntimeException(); }
  /**
   * Computes the cost of the input point.
   * @param point (undocumented)
   * @param distanceMeasure (undocumented)
   * @return (undocumented)
   */
  public  double computeCost (org.apache.spark.mllib.linalg.Vector point, org.apache.spark.mllib.clustering.DistanceMeasure distanceMeasure)  { throw new RuntimeException(); }
  public  double cost ()  { throw new RuntimeException(); }
  public  double height ()  { throw new RuntimeException(); }
  // not preceding
  public  int index ()  { throw new RuntimeException(); }
  // not preceding
  public  boolean isLeaf ()  { throw new RuntimeException(); }
  /**
   * Returns all leaf nodes from this node.
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.clustering.ClusteringTreeNode[] leafNodes ()  { throw new RuntimeException(); }
  /** Predicts the leaf cluster node index that the input point belongs to. */
  public  int predict (org.apache.spark.mllib.linalg.Vector point, org.apache.spark.mllib.clustering.DistanceMeasure distanceMeasure)  { throw new RuntimeException(); }
  /** Returns the full prediction path from root to leaf. */
  public  org.apache.spark.mllib.clustering.ClusteringTreeNode[] predictPath (org.apache.spark.mllib.linalg.Vector point, org.apache.spark.mllib.clustering.DistanceMeasure distanceMeasure)  { throw new RuntimeException(); }
  public  long size ()  { throw new RuntimeException(); }
}
