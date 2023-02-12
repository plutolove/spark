package org.apache.spark.ml.recommendation;
/**
 * Rating class for better code readability.
 */
// not preceding
public  class ALS$ implements org.apache.spark.ml.util.DefaultParamsReadable<org.apache.spark.ml.recommendation.ALS>, org.apache.spark.internal.Logging, scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final ALS$ MODULE$ = null;
  public   ALS$ ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.ml.recommendation.ALS load (java.lang.String path)  { throw new RuntimeException(); }
  // not preceding
  public <ID extends java.lang.Object> scala.Tuple2<org.apache.spark.rdd.RDD<scala.Tuple2<ID, float[]>>, org.apache.spark.rdd.RDD<scala.Tuple2<ID, float[]>>> train (org.apache.spark.rdd.RDD<org.apache.spark.ml.recommendation.ALS.Rating<ID>> ratings, int rank, int numUserBlocks, int numItemBlocks, int maxIter, double regParam, boolean implicitPrefs, double alpha, boolean nonnegative, org.apache.spark.storage.StorageLevel intermediateRDDStorageLevel, org.apache.spark.storage.StorageLevel finalRDDStorageLevel, int checkpointInterval, long seed, scala.reflect.ClassTag<ID> evidence$1, scala.math.Ordering<ID> ord)  { throw new RuntimeException(); }
  /**
   * Clean the shuffles &amp; all of its parents.
   * @param sc (undocumented)
   * @param deps (undocumented)
   * @param blocking (undocumented)
   */
   <T extends java.lang.Object> void cleanShuffleDependencies (org.apache.spark.SparkContext sc, scala.collection.Seq<org.apache.spark.Dependency<?>> deps, boolean blocking)  { throw new RuntimeException(); }
}
