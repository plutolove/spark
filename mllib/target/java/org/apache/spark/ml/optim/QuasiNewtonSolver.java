package org.apache.spark.ml.optim;
/**
 * NormalEquationCostFun implements Breeze's DiffFunction[T] for the normal equation.
 * It returns the loss and gradient with L2 regularization at a particular point (coefficients).
 * It's used in Breeze's convex optimization routines.
 */
  class QuasiNewtonSolver implements org.apache.spark.ml.optim.NormalEquationSolver {
  // not preceding
  public   QuasiNewtonSolver (boolean fitIntercept, int maxIter, double tol, scala.Option<scala.Function1<java.lang.Object, java.lang.Object>> l1RegFunc)  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.ml.optim.NormalEquationSolution solve (double bBar, double bbBar, org.apache.spark.ml.linalg.DenseVector abBar, org.apache.spark.ml.linalg.DenseVector aaBar, org.apache.spark.ml.linalg.DenseVector aBar)  { throw new RuntimeException(); }
}
