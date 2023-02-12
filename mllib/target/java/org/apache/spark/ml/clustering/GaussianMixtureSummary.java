package org.apache.spark.ml.clustering;
/**
 * Probability of each cluster.
 */
public  class GaussianMixtureSummary extends org.apache.spark.ml.clustering.ClusteringSummary {
  // not preceding
     GaussianMixtureSummary (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> predictions, java.lang.String predictionCol, java.lang.String probabilityCol, java.lang.String featuresCol, int k, double logLikelihood, int numIter)  { throw new RuntimeException(); }
  public  double logLikelihood ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> probability ()  { throw new RuntimeException(); }
  // not preceding
  public  java.lang.String probabilityCol ()  { throw new RuntimeException(); }
}
