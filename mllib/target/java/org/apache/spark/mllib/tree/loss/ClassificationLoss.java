package org.apache.spark.mllib.tree.loss;
/**
 * Computes the class probability given the margin.
 */
public  interface ClassificationLoss extends org.apache.spark.mllib.tree.loss.Loss {
  // not preceding
    double computeProbability (double margin)  ;
}
