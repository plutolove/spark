package org.apache.spark.mllib.optimization;
/**
 * Compute an updated value for weights given the gradient, stepSize, iteration number and
 * regularization parameter. Also returns the regularization value regParam * R(w)
 * computed using the *updated* weights.
 * <p>
 * param:  weightsOld - Column matrix of size dx1 where d is the number of features.
 * param:  gradient - Column matrix of size dx1 where d is the number of features.
 * param:  stepSize - step size across iterations
 * param:  iter - Iteration number
 * param:  regParam - Regularization parameter
 * <p>
 * @return A tuple of 2 elements. The first element is a column matrix containing updated weights,
 *         and the second element is the regularization value computed using updated weights.
 */
public abstract class Updater implements scala.Serializable {
  // not preceding
  public   Updater ()  { throw new RuntimeException(); }
  // not preceding
  public abstract  scala.Tuple2<org.apache.spark.mllib.linalg.Vector, java.lang.Object> compute (org.apache.spark.mllib.linalg.Vector weightsOld, org.apache.spark.mllib.linalg.Vector gradient, double stepSize, int iter, double regParam)  ;
}
