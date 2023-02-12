package org.apache.spark.ml.regression;
/**
 * Set the dimensionality of the factors.
 * Default is 8.
 * <p>
 * @group setParam
 */
public  class FMRegressor extends org.apache.spark.ml.regression.Regressor<org.apache.spark.ml.linalg.Vector, org.apache.spark.ml.regression.FMRegressor, org.apache.spark.ml.regression.FMRegressionModel> implements org.apache.spark.ml.regression.FactorizationMachines, org.apache.spark.ml.regression.FMRegressorParams, org.apache.spark.ml.util.DefaultParamsWritable, org.apache.spark.internal.Logging {
  // not preceding
  static public  org.apache.spark.ml.regression.FMRegressor load (java.lang.String path)  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.util.MLReader<T> read ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.IntParam factorSize ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.BooleanParam fitLinear ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.DoubleParam miniBatchFraction ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.DoubleParam initStd ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.Param<java.lang.String> solver ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.DoubleParam regParam ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.BooleanParam fitIntercept ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.LongParam seed ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.DoubleParam tol ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.ml.param.DoubleParam stepSize ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.IntParam maxIter ()  { throw new RuntimeException(); }
  public  java.lang.String uid ()  { throw new RuntimeException(); }
  // not preceding
  public   FMRegressor (java.lang.String uid)  { throw new RuntimeException(); }
  // not preceding
  public   FMRegressor ()  { throw new RuntimeException(); }
  /**
   * Set the dimensionality of the factors.
   * Default is 8.
   * <p>
   * @group setParam
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.regression.FMRegressor setFactorSize (int value)  { throw new RuntimeException(); }
  /**
   * Set whether to fit intercept term.
   * Default is true.
   * <p>
   * @group setParam
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.regression.FMRegressor setFitIntercept (boolean value)  { throw new RuntimeException(); }
  /**
   * Set whether to fit linear term.
   * Default is true.
   * <p>
   * @group setParam
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.regression.FMRegressor setFitLinear (boolean value)  { throw new RuntimeException(); }
  /**
   * Set the L2 regularization parameter.
   * Default is 0.0.
   * <p>
   * @group setParam
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.regression.FMRegressor setRegParam (double value)  { throw new RuntimeException(); }
  /**
   * Set the mini-batch fraction parameter.
   * Default is 1.0.
   * <p>
   * @group setParam
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.regression.FMRegressor setMiniBatchFraction (double value)  { throw new RuntimeException(); }
  /**
   * Set the standard deviation of initial coefficients.
   * Default is 0.01.
   * <p>
   * @group setParam
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.regression.FMRegressor setInitStd (double value)  { throw new RuntimeException(); }
  /**
   * Set the maximum number of iterations.
   * Default is 100.
   * <p>
   * @group setParam
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.regression.FMRegressor setMaxIter (int value)  { throw new RuntimeException(); }
  /**
   * Set the initial step size for the first step (like learning rate).
   * Default is 1.0.
   * <p>
   * @group setParam
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.regression.FMRegressor setStepSize (double value)  { throw new RuntimeException(); }
  /**
   * Set the convergence tolerance of iterations.
   * Default is 1E-6.
   * <p>
   * @group setParam
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.regression.FMRegressor setTol (double value)  { throw new RuntimeException(); }
  /**
   * Set the solver algorithm used for optimization.
   * Supported options: "gd", "adamW".
   * Default: "adamW"
   * <p>
   * @group setParam
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.regression.FMRegressor setSolver (java.lang.String value)  { throw new RuntimeException(); }
  /**
   * Set the random seed for weight initialization.
   * <p>
   * @group setParam
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.regression.FMRegressor setSeed (long value)  { throw new RuntimeException(); }
  protected  org.apache.spark.ml.regression.FMRegressionModel train (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.regression.FMRegressor copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
}