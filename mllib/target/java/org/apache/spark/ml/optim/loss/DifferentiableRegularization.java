package org.apache.spark.ml.optim.loss;
/** Magnitude of the regularization penalty. */
public  interface DifferentiableRegularization<T extends java.lang.Object> extends breeze.optimize.DiffFunction<T> {
  /** Magnitude of the regularization penalty. */
  public  double regParam ()  ;
}
