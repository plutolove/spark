package org.apache.spark.mllib.util;
/**
 * Generate an RDD containing test data for KMeans.
 * <p>
 * param:  sc SparkContext to use for creating the RDD
 * param:  numPoints Number of points that will be contained in the RDD
 * param:  k Number of clusters
 * param:  d Number of dimensions
 * param:  r Scaling factor for the distribution of the initial centers
 * param:  numPartitions Number of partitions of the generated RDD; default 2
 */
// not preceding
public  class KMeansDataGenerator {
  // not preceding
  static public  org.apache.spark.rdd.RDD<double[]> generateKMeansRDD (org.apache.spark.SparkContext sc, int numPoints, int k, int d, double r, int numPartitions)  { throw new RuntimeException(); }
  static public  void main (java.lang.String[] args)  { throw new RuntimeException(); }
}
