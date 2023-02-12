package org.apache.spark.ml.tree.impl;
/**
 * Convert an input dataset into its TreePoint representation,
 * binning feature values in preparation for DecisionTree training.
 * param:  input     Input dataset.
 * param:  splits    Splits for features, of size (numFeatures, numSplits).
 * param:  metadata  Learning and dataset metadata
 * @return  TreePoint dataset representation
 */
// not preceding
public  class TreePoint$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final TreePoint$ MODULE$ = null;
  public   TreePoint$ ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.rdd.RDD<org.apache.spark.ml.tree.impl.TreePoint> convertToTreeRDD (org.apache.spark.rdd.RDD<org.apache.spark.ml.feature.Instance> input, org.apache.spark.ml.tree.Split[][] splits, org.apache.spark.ml.tree.impl.DecisionTreeMetadata metadata)  { throw new RuntimeException(); }
}
