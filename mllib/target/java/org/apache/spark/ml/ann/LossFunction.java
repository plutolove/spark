package org.apache.spark.ml.ann;
/**
 * Returns the value of loss function.
 * Computes loss based on target and output.
 * Writes delta (error) to delta in place.
 * Delta is allocated based on the outputSize
 * of model implementation.
 * <p>
 * param:  output actual output
 * param:  target target output
 * param:  delta delta (updated in place)
 * @return loss
 */
public  interface LossFunction {
  // not preceding
  public  double loss (breeze.linalg.DenseMatrix<java.lang.Object> output, breeze.linalg.DenseMatrix<java.lang.Object> target, breeze.linalg.DenseMatrix<java.lang.Object> delta)  ;
}
