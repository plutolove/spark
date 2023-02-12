package org.apache.spark.mllib.optimization;
/**
 * Set the number of corrections used in the LBFGS update. Default 10.
 * Values of numCorrections less than 3 are not recommended; large values
 * of numCorrections will result in excessive computing time.
 * numCorrections must be positive, and values from 4 to 9 are generally recommended.
 */
public  class LBFGS implements org.apache.spark.mllib.optimization.Optimizer, org.apache.spark.internal.Logging {
  // not preceding
  static public  scala.Tuple2<org.apache.spark.mllib.linalg.Vector, double[]> runLBFGS (org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, org.apache.spark.mllib.linalg.Vector>> data, org.apache.spark.mllib.optimization.Gradient gradient, org.apache.spark.mllib.optimization.Updater updater, int numCorrections, double convergenceTol, int maxNumIterations, double regParam, org.apache.spark.mllib.linalg.Vector initialWeights)  { throw new RuntimeException(); }
  static public  org.slf4j.Logger org$apache$spark$internal$Logging$$log_ ()  { throw new RuntimeException(); }
  static public  void org$apache$spark$internal$Logging$$log__$eq (org.slf4j.Logger x$1)  { throw new RuntimeException(); }
  static protected  java.lang.String logName ()  { throw new RuntimeException(); }
  static protected  org.slf4j.Logger log ()  { throw new RuntimeException(); }
  static protected  void logInfo (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logDebug (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logTrace (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logWarning (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logError (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logInfo (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logDebug (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logTrace (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logWarning (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logError (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  boolean isTraceEnabled ()  { throw new RuntimeException(); }
  static protected  void initializeLogIfNecessary (boolean isInterpreter)  { throw new RuntimeException(); }
  static protected  boolean initializeLogIfNecessary (boolean isInterpreter, boolean silent)  { throw new RuntimeException(); }
  static protected  boolean initializeLogIfNecessary$default$2 ()  { throw new RuntimeException(); }
  static   void initializeForcefully (boolean isInterpreter, boolean silent)  { throw new RuntimeException(); }
  // not preceding
  public   LBFGS (org.apache.spark.mllib.optimization.Gradient gradient, org.apache.spark.mllib.optimization.Updater updater)  { throw new RuntimeException(); }
  /**
   * Set the number of corrections used in the LBFGS update. Default 10.
   * Values of numCorrections less than 3 are not recommended; large values
   * of numCorrections will result in excessive computing time.
   * numCorrections must be positive, and values from 4 to 9 are generally recommended.
   * @param corrections (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.optimization.LBFGS setNumCorrections (int corrections)  { throw new RuntimeException(); }
  /**
   * Set the convergence tolerance of iterations for L-BFGS. Default 1E-6.
   * Smaller value will lead to higher accuracy with the cost of more iterations.
   * This value must be nonnegative. Lower convergence values are less tolerant
   * and therefore generally cause more iterations to be run.
   * @param tolerance (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.optimization.LBFGS setConvergenceTol (double tolerance)  { throw new RuntimeException(); }
    double getConvergenceTol ()  { throw new RuntimeException(); }
  /**
   * Set the maximal number of iterations for L-BFGS. Default 100.
   * @param iters (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.optimization.LBFGS setNumIterations (int iters)  { throw new RuntimeException(); }
  /**
   * Get the maximum number of iterations for L-BFGS. Defaults to 100.
   * @return (undocumented)
   */
    int getNumIterations ()  { throw new RuntimeException(); }
  /**
   * Set the regularization parameter. Default 0.0.
   * @param regParam (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.optimization.LBFGS setRegParam (double regParam)  { throw new RuntimeException(); }
  /**
   * Get the regularization parameter.
   * @return (undocumented)
   */
    double getRegParam ()  { throw new RuntimeException(); }
  /**
   * Set the gradient function (of the loss function of one single data example)
   * to be used for L-BFGS.
   * @param gradient (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.optimization.LBFGS setGradient (org.apache.spark.mllib.optimization.Gradient gradient)  { throw new RuntimeException(); }
  /**
   * Set the updater function to actually perform a gradient step in a given direction.
   * The updater is responsible to perform the update from the regularization term as well,
   * and therefore determines what kind or regularization is used, if any.
   * @param updater (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.optimization.LBFGS setUpdater (org.apache.spark.mllib.optimization.Updater updater)  { throw new RuntimeException(); }
  /**
   * Returns the updater, limited to internal use.
   * @return (undocumented)
   */
    org.apache.spark.mllib.optimization.Updater getUpdater ()  { throw new RuntimeException(); }
  public  org.apache.spark.mllib.linalg.Vector optimize (org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, org.apache.spark.mllib.linalg.Vector>> data, org.apache.spark.mllib.linalg.Vector initialWeights)  { throw new RuntimeException(); }
}