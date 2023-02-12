package org.apache.spark.mllib.tree.loss;
/**
 * Method to calculate the gradients for the gradient boosting calculation for least
 * absolute error calculation.
 * The gradient with respect to F(x) is: sign(F(x) - y)
 * param:  prediction Predicted label.
 * param:  label True label.
 * @return Loss gradient
 */
// not preceding
public  class AbsoluteError$ implements org.apache.spark.mllib.tree.loss.Loss {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final AbsoluteError$ MODULE$ = null;
  public   AbsoluteError$ ()  { throw new RuntimeException(); }
  // not preceding
  public  double gradient (double prediction, double label)  { throw new RuntimeException(); }
    double computeError (double prediction, double label)  { throw new RuntimeException(); }
}
