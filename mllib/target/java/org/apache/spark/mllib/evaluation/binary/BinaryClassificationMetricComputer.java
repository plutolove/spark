package org.apache.spark.mllib.evaluation.binary;
/**
 * Trait for a binary classification evaluation metric computer.
 */
public  interface BinaryClassificationMetricComputer extends scala.Serializable {
  // not preceding
  public  double apply (org.apache.spark.mllib.evaluation.binary.BinaryConfusionMatrix c)  ;
}
