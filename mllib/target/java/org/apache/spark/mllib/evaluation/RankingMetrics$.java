package org.apache.spark.mllib.evaluation;
/**
 * Creates a {@link RankingMetrics} instance (for Java users).
 * param:  predictionAndLabels a JavaRDD of (predicted ranking, ground truth set) pairs
 */
// not preceding
public  class RankingMetrics$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final RankingMetrics$ MODULE$ = null;
  public   RankingMetrics$ ()  { throw new RuntimeException(); }
  // not preceding
  public <E extends java.lang.Object, T extends java.lang.Iterable<E>> org.apache.spark.mllib.evaluation.RankingMetrics<E> of (org.apache.spark.api.java.JavaRDD<scala.Tuple2<T, T>> predictionAndLabels)  { throw new RuntimeException(); }
}
