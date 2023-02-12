package org.apache.spark.mllib.tree.loss;
/**
 * Method to calculate the loss gradients for the gradient boosting calculation for binary
 * classification
 * The gradient with respect to F(x) is: - 4 y / (1 + exp(2 y F(x)))
 * param:  prediction Predicted label.
 * param:  label True label.
 * @return Loss gradient
 */
// not preceding
public  class LogLoss {
  // not preceding
  static public  double gradient (double prediction, double label)  { throw new RuntimeException(); }
  static   double computeError (double prediction, double label)  { throw new RuntimeException(); }
  /**
   * Returns the estimated probability of a label of 1.0.
   * @param margin (undocumented)
   * @return (undocumented)
   */
  static   double computeProbability (double margin)  { throw new RuntimeException(); }
}
