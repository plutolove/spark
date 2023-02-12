package org.apache.spark.mllib.optimization;
/**
 * For Binary Logistic Regression.
 * <p>
 * Although the loss and gradient calculation for multinomial one is more generalized,
 * and multinomial one can also be used in binary case, we still implement a specialized
 * binary version for performance reason.
 */
public  class LogisticGradient extends org.apache.spark.mllib.optimization.Gradient {
  // not preceding
  public   LogisticGradient (int numClasses)  { throw new RuntimeException(); }
  // not preceding
  public   LogisticGradient ()  { throw new RuntimeException(); }
  /**
   * For Binary Logistic Regression.
   * <p>
   * Although the loss and gradient calculation for multinomial one is more generalized,
   * and multinomial one can also be used in binary case, we still implement a specialized
   * binary version for performance reason.
   * @param data (undocumented)
   * @param label (undocumented)
   * @param weights (undocumented)
   * @param cumGradient (undocumented)
   * @return (undocumented)
   */
  public  double compute (org.apache.spark.mllib.linalg.Vector data, double label, org.apache.spark.mllib.linalg.Vector weights, org.apache.spark.mllib.linalg.Vector cumGradient)  { throw new RuntimeException(); }
}
