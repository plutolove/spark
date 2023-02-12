package org.apache.spark.mllib.clustering;
/**
 * Initializer for the optimizer. LDA passes the common parameters to the optimizer and
 * the internal structure can be initialized properly.
 */
public  interface LDAOptimizer {
    org.apache.spark.mllib.clustering.LDAModel getLDAModel (double[] iterationTimes)  ;
  // not preceding
    org.apache.spark.mllib.clustering.LDAOptimizer initialize (org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, org.apache.spark.mllib.linalg.Vector>> docs, org.apache.spark.mllib.clustering.LDA lda)  ;
    org.apache.spark.mllib.clustering.LDAOptimizer next ()  ;
}
