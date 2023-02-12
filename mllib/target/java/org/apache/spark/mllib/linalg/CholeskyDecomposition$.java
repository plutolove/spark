package org.apache.spark.mllib.linalg;
/**
 * Solves a symmetric positive definite linear system via Cholesky factorization.
 * The input arguments are modified in-place to store the factorization and the solution.
 * param:  A the upper triangular part of A
 * param:  bx right-hand side
 * @return the solution array
 */
// not preceding
public  class CholeskyDecomposition$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final CholeskyDecomposition$ MODULE$ = null;
  public   CholeskyDecomposition$ ()  { throw new RuntimeException(); }
  // not preceding
  public  double[] solve (double[] A, double[] bx)  { throw new RuntimeException(); }
  /**
   * Computes the inverse of a real symmetric positive definite matrix A
   * using the Cholesky factorization A = U**T*U.
   * The input arguments are modified in-place to store the inverse matrix.
   * @param UAi the upper triangular factor U from the Cholesky factorization A = U**T*U
   * @param k the dimension of A
   * @return the upper triangle of the (symmetric) inverse of A
   */
  public  double[] inverse (double[] UAi, int k)  { throw new RuntimeException(); }
}
