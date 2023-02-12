package org.apache.spark.ml.optim;
/**
 * Creates a {@link WeightedLeastSquaresModel} from an RDD of {@link Instance}s.
 */
  class WeightedLeastSquares implements scala.Serializable {
  // not preceding
  // not preceding
  static public  class Auto$ implements org.apache.spark.ml.optim.WeightedLeastSquares.Solver, scala.Product, scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final Auto$ MODULE$ = null;
    public   Auto$ ()  { throw new RuntimeException(); }
  }
  // not preceding
  // not preceding
  static public  class Cholesky$ implements org.apache.spark.ml.optim.WeightedLeastSquares.Solver, scala.Product, scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final Cholesky$ MODULE$ = null;
    public   Cholesky$ ()  { throw new RuntimeException(); }
  }
  // not preceding
  // not preceding
  static public  class QuasiNewton$ implements org.apache.spark.ml.optim.WeightedLeastSquares.Solver, scala.Product, scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final QuasiNewton$ MODULE$ = null;
    public   QuasiNewton$ ()  { throw new RuntimeException(); }
  }
  static public  interface Solver {
  }
  /**
   * In order to take the normal equation approach efficiently, {@link WeightedLeastSquares}
   * only supports the number of features is no more than 4096.
   * @return (undocumented)
   */
  static public  int MAX_NUM_FEATURES ()  { throw new RuntimeException(); }
  // not preceding
  static public  scala.Product[] supportedSolvers ()  { throw new RuntimeException(); }
  // not preceding
  public  boolean fitIntercept ()  { throw new RuntimeException(); }
  public  double regParam ()  { throw new RuntimeException(); }
  public  double elasticNetParam ()  { throw new RuntimeException(); }
  public  boolean standardizeFeatures ()  { throw new RuntimeException(); }
  public  boolean standardizeLabel ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.optim.WeightedLeastSquares.Solver solverType ()  { throw new RuntimeException(); }
  public  int maxIter ()  { throw new RuntimeException(); }
  public  double tol ()  { throw new RuntimeException(); }
  // not preceding
  public   WeightedLeastSquares (boolean fitIntercept, double regParam, double elasticNetParam, boolean standardizeFeatures, boolean standardizeLabel, org.apache.spark.ml.optim.WeightedLeastSquares.Solver solverType, int maxIter, double tol)  { throw new RuntimeException(); }
  /**
   * Creates a {@link WeightedLeastSquaresModel} from an RDD of {@link Instance}s.
   * @param instances (undocumented)
   * @param instr (undocumented)
   * @param depth (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.optim.WeightedLeastSquaresModel fit (org.apache.spark.rdd.RDD<org.apache.spark.ml.feature.Instance> instances, org.apache.spark.ml.util.OptionalInstrumentation instr, int depth)  { throw new RuntimeException(); }
}
