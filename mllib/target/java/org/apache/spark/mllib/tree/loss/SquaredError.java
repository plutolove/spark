package org.apache.spark.mllib.tree.loss;
/**
 * Method to calculate the gradients for the gradient boosting calculation for least
 * squares error calculation.
 * The gradient with respect to F(x) is: - 2 (y - F(x))
 * param:  prediction Predicted label.
 * param:  label True label.
 * @return Loss gradient
 */
// not preceding
public  class SquaredError {
  // not preceding
  static public  double gradient (double prediction, double label)  { throw new RuntimeException(); }
  static   double computeError (double prediction, double label)  { throw new RuntimeException(); }
}
