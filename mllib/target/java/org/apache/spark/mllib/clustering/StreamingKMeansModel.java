package org.apache.spark.mllib.clustering;
/**
 * Perform a k-means update on a batch of data.
 */
public  class StreamingKMeansModel extends org.apache.spark.mllib.clustering.KMeansModel implements org.apache.spark.internal.Logging {
  // not preceding
  public   StreamingKMeansModel (org.apache.spark.mllib.linalg.Vector[] clusterCenters, double[] clusterWeights)  { throw new RuntimeException(); }
  public  org.apache.spark.mllib.linalg.Vector[] clusterCenters ()  { throw new RuntimeException(); }
  public  double[] clusterWeights ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.mllib.clustering.StreamingKMeansModel update (org.apache.spark.rdd.RDD<org.apache.spark.mllib.linalg.Vector> data, double decayFactor, java.lang.String timeUnit)  { throw new RuntimeException(); }
}
