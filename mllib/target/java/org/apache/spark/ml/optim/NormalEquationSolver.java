package org.apache.spark.ml.optim;
/** Solve the normal equations from summary statistics. */
public  interface NormalEquationSolver {
  // not preceding
  public  org.apache.spark.ml.optim.NormalEquationSolution solve (double bBar, double bbBar, org.apache.spark.ml.linalg.DenseVector abBar, org.apache.spark.ml.linalg.DenseVector aaBar, org.apache.spark.ml.linalg.DenseVector aBar)  ;
}
