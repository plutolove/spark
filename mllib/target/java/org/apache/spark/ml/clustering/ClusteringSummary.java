package org.apache.spark.ml.clustering;
/**
 * Cluster centers of the transformed data.
 */
public  class ClusteringSummary implements scala.Serializable {
  // not preceding
     ClusteringSummary (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> predictions, java.lang.String predictionCol, java.lang.String featuresCol, int k, int numIter)  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> cluster ()  { throw new RuntimeException(); }
  // not preceding
  public  long[] clusterSizes ()  { throw new RuntimeException(); }
  public  java.lang.String featuresCol ()  { throw new RuntimeException(); }
  public  int k ()  { throw new RuntimeException(); }
  public  int numIter ()  { throw new RuntimeException(); }
  public  java.lang.String predictionCol ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> predictions ()  { throw new RuntimeException(); }
}
