package org.apache.spark.ml.regression;
/**
 * Sets the value of param {@link family}.
 * Default is "gaussian".
 * <p>
 * @group setParam
 */
public  class GeneralizedLinearRegression extends org.apache.spark.ml.regression.Regressor<org.apache.spark.ml.linalg.Vector, org.apache.spark.ml.regression.GeneralizedLinearRegression, org.apache.spark.ml.regression.GeneralizedLinearRegressionModel> implements org.apache.spark.ml.regression.GeneralizedLinearRegressionBase, org.apache.spark.ml.util.DefaultParamsWritable, org.apache.spark.internal.Logging {
  /** Linear predictor based on given mu. */
  static   class FamilyAndLink implements scala.Serializable {
    // not preceding
    public  org.apache.spark.ml.regression.GeneralizedLinearRegression.Family family ()  { throw new RuntimeException(); }
    public  org.apache.spark.ml.regression.GeneralizedLinearRegression.Link link ()  { throw new RuntimeException(); }
    // not preceding
    public   FamilyAndLink (org.apache.spark.ml.regression.GeneralizedLinearRegression.Family family, org.apache.spark.ml.regression.GeneralizedLinearRegression.Link link)  { throw new RuntimeException(); }
    // not preceding
    public  double predict (double mu)  { throw new RuntimeException(); }
    /** Fitted value based on linear predictor eta. */
    public  double fitted (double eta)  { throw new RuntimeException(); }
    /**
     * Get the initial guess model for {@link IterativelyReweightedLeastSquares}.
     * @param instances (undocumented)
     * @param fitIntercept (undocumented)
     * @param regParam (undocumented)
     * @param instr (undocumented)
     * @param depth (undocumented)
     * @return (undocumented)
     */
    public  org.apache.spark.ml.optim.WeightedLeastSquaresModel initialize (org.apache.spark.rdd.RDD<org.apache.spark.ml.feature.OffsetInstance> instances, boolean fitIntercept, double regParam, org.apache.spark.ml.util.OptionalInstrumentation instr, int depth)  { throw new RuntimeException(); }
    /**
     * The reweight function used to update working labels and weights
     * at each iteration of {@link IterativelyReweightedLeastSquares}.
     * @param instance (undocumented)
     * @param model (undocumented)
     * @return (undocumented)
     */
    public  scala.Tuple2<java.lang.Object, java.lang.Object> reweightFunc (org.apache.spark.ml.feature.OffsetInstance instance, org.apache.spark.ml.optim.WeightedLeastSquaresModel model)  { throw new RuntimeException(); }
  }
  // not preceding
  // not preceding
  static public  class FamilyAndLink$ implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final FamilyAndLink$ MODULE$ = null;
    public   FamilyAndLink$ ()  { throw new RuntimeException(); }
    // not preceding
    public  org.apache.spark.ml.regression.GeneralizedLinearRegression.FamilyAndLink apply (org.apache.spark.ml.regression.GeneralizedLinearRegressionBase params)  { throw new RuntimeException(); }
  }
  // not preceding
  static  abstract class Family implements scala.Serializable {
    // not preceding
    public  java.lang.String name ()  { throw new RuntimeException(); }
    // not preceding
    public   Family (java.lang.String name)  { throw new RuntimeException(); }
    // not preceding
    public abstract  org.apache.spark.ml.regression.GeneralizedLinearRegression.Link defaultLink ()  ;
    /** Initialize the starting value for mu. */
    public abstract  double initialize (double y, double weight)  ;
    /** The variance of the endogenous variable's mean, given the value mu. */
    public abstract  double variance (double mu)  ;
    /** Deviance of (y, mu) pair. */
    public abstract  double deviance (double y, double mu, double weight)  ;
    /**
     * Akaike Information Criterion (AIC) value of the family for a given dataset.
     * <p>
     * @param predictions an RDD of (y, mu, weight) of instances in evaluation dataset
     * @param deviance the deviance for the fitted model in evaluation dataset
     * @param numInstances number of instances in evaluation dataset
     * @param weightSum weights sum of instances in evaluation dataset
     * @return (undocumented)
     */
    public abstract  double aic (org.apache.spark.rdd.RDD<scala.Tuple3<java.lang.Object, java.lang.Object, java.lang.Object>> predictions, double deviance, double numInstances, double weightSum)  ;
    /** Trim the fitted value so that it will be in valid range. */
    public  double project (double mu)  { throw new RuntimeException(); }
  }
  // not preceding
  // not preceding
  static public  class Family$ implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final Family$ MODULE$ = null;
    public   Family$ ()  { throw new RuntimeException(); }
    // not preceding
    public  org.apache.spark.ml.regression.GeneralizedLinearRegression.Family fromParams (org.apache.spark.ml.regression.GeneralizedLinearRegressionBase params)  { throw new RuntimeException(); }
  }
  // not preceding
  static   class Tweedie extends org.apache.spark.ml.regression.GeneralizedLinearRegression.Family {
    // not preceding
    public  double variancePower ()  { throw new RuntimeException(); }
    // not preceding
    public   Tweedie (double variancePower)  { throw new RuntimeException(); }
    // not preceding
    public  org.apache.spark.ml.regression.GeneralizedLinearRegression.Link defaultLink ()  { throw new RuntimeException(); }
    public  double initialize (double y, double weight)  { throw new RuntimeException(); }
    public  double variance (double mu)  { throw new RuntimeException(); }
    public  double deviance (double y, double mu, double weight)  { throw new RuntimeException(); }
    public  double aic (org.apache.spark.rdd.RDD<scala.Tuple3<java.lang.Object, java.lang.Object, java.lang.Object>> predictions, double deviance, double numInstances, double weightSum)  { throw new RuntimeException(); }
    public  double project (double mu)  { throw new RuntimeException(); }
  }
  // not preceding
  // not preceding
  static public  class Tweedie$ implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final Tweedie$ MODULE$ = null;
    public   Tweedie$ ()  { throw new RuntimeException(); }
    // not preceding
    public  double delta ()  { throw new RuntimeException(); }
  }
  // not preceding
  // not preceding
  static public  class Gaussian$ extends org.apache.spark.ml.regression.GeneralizedLinearRegression.Tweedie {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final Gaussian$ MODULE$ = null;
    public   Gaussian$ ()  { throw new RuntimeException(); }
    // not preceding
    public  java.lang.String name ()  { throw new RuntimeException(); }
    public  org.apache.spark.ml.regression.GeneralizedLinearRegression.Link defaultLink ()  { throw new RuntimeException(); }
    public  double initialize (double y, double weight)  { throw new RuntimeException(); }
    public  double variance (double mu)  { throw new RuntimeException(); }
    public  double deviance (double y, double mu, double weight)  { throw new RuntimeException(); }
    public  double aic (org.apache.spark.rdd.RDD<scala.Tuple3<java.lang.Object, java.lang.Object, java.lang.Object>> predictions, double deviance, double numInstances, double weightSum)  { throw new RuntimeException(); }
    public  double project (double mu)  { throw new RuntimeException(); }
  }
  // not preceding
  // not preceding
  static public  class Binomial$ extends org.apache.spark.ml.regression.GeneralizedLinearRegression.Family {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final Binomial$ MODULE$ = null;
    public   Binomial$ ()  { throw new RuntimeException(); }
    // not preceding
    public  org.apache.spark.ml.regression.GeneralizedLinearRegression.Link defaultLink ()  { throw new RuntimeException(); }
    public  double initialize (double y, double weight)  { throw new RuntimeException(); }
    public  double variance (double mu)  { throw new RuntimeException(); }
    public  double deviance (double y, double mu, double weight)  { throw new RuntimeException(); }
    public  double aic (org.apache.spark.rdd.RDD<scala.Tuple3<java.lang.Object, java.lang.Object, java.lang.Object>> predictions, double deviance, double numInstances, double weightSum)  { throw new RuntimeException(); }
    public  double project (double mu)  { throw new RuntimeException(); }
  }
  // not preceding
  // not preceding
  static public  class Poisson$ extends org.apache.spark.ml.regression.GeneralizedLinearRegression.Tweedie {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final Poisson$ MODULE$ = null;
    public   Poisson$ ()  { throw new RuntimeException(); }
    // not preceding
    public  java.lang.String name ()  { throw new RuntimeException(); }
    public  org.apache.spark.ml.regression.GeneralizedLinearRegression.Link defaultLink ()  { throw new RuntimeException(); }
    public  double initialize (double y, double weight)  { throw new RuntimeException(); }
    public  double variance (double mu)  { throw new RuntimeException(); }
    public  double deviance (double y, double mu, double weight)  { throw new RuntimeException(); }
    public  double aic (org.apache.spark.rdd.RDD<scala.Tuple3<java.lang.Object, java.lang.Object, java.lang.Object>> predictions, double deviance, double numInstances, double weightSum)  { throw new RuntimeException(); }
  }
  // not preceding
  // not preceding
  static public  class Gamma$ extends org.apache.spark.ml.regression.GeneralizedLinearRegression.Tweedie {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final Gamma$ MODULE$ = null;
    public   Gamma$ ()  { throw new RuntimeException(); }
    // not preceding
    public  java.lang.String name ()  { throw new RuntimeException(); }
    public  org.apache.spark.ml.regression.GeneralizedLinearRegression.Link defaultLink ()  { throw new RuntimeException(); }
    public  double initialize (double y, double weight)  { throw new RuntimeException(); }
    public  double variance (double mu)  { throw new RuntimeException(); }
    public  double deviance (double y, double mu, double weight)  { throw new RuntimeException(); }
    public  double aic (org.apache.spark.rdd.RDD<scala.Tuple3<java.lang.Object, java.lang.Object, java.lang.Object>> predictions, double deviance, double numInstances, double weightSum)  { throw new RuntimeException(); }
  }
  // not preceding
  static  abstract class Link implements scala.Serializable {
    // not preceding
    public  java.lang.String name ()  { throw new RuntimeException(); }
    // not preceding
    public   Link (java.lang.String name)  { throw new RuntimeException(); }
    // not preceding
    public abstract  double link (double mu)  ;
    /** Derivative of the link function. */
    public abstract  double deriv (double mu)  ;
    /** The inverse link function. */
    public abstract  double unlink (double eta)  ;
  }
  // not preceding
  // not preceding
  static public  class Link$ implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final Link$ MODULE$ = null;
    public   Link$ ()  { throw new RuntimeException(); }
    // not preceding
    public  org.apache.spark.ml.regression.GeneralizedLinearRegression.Link fromParams (org.apache.spark.ml.regression.GeneralizedLinearRegressionBase params)  { throw new RuntimeException(); }
  }
  // not preceding
  // not preceding
  static public  class Identity$ extends org.apache.spark.ml.regression.GeneralizedLinearRegression.Power {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final Identity$ MODULE$ = null;
    public   Identity$ ()  { throw new RuntimeException(); }
    // not preceding
    public  java.lang.String name ()  { throw new RuntimeException(); }
    public  double link (double mu)  { throw new RuntimeException(); }
    public  double deriv (double mu)  { throw new RuntimeException(); }
    public  double unlink (double eta)  { throw new RuntimeException(); }
  }
  // not preceding
  // not preceding
  static public  class Logit$ extends org.apache.spark.ml.regression.GeneralizedLinearRegression.Link {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final Logit$ MODULE$ = null;
    public   Logit$ ()  { throw new RuntimeException(); }
    // not preceding
    public  double link (double mu)  { throw new RuntimeException(); }
    public  double deriv (double mu)  { throw new RuntimeException(); }
    public  double unlink (double eta)  { throw new RuntimeException(); }
  }
  // not preceding
  // not preceding
  static public  class Log$ extends org.apache.spark.ml.regression.GeneralizedLinearRegression.Power {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final Log$ MODULE$ = null;
    public   Log$ ()  { throw new RuntimeException(); }
    // not preceding
    public  java.lang.String name ()  { throw new RuntimeException(); }
    public  double link (double mu)  { throw new RuntimeException(); }
    public  double deriv (double mu)  { throw new RuntimeException(); }
    public  double unlink (double eta)  { throw new RuntimeException(); }
  }
  // not preceding
  // not preceding
  static public  class Inverse$ extends org.apache.spark.ml.regression.GeneralizedLinearRegression.Power {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final Inverse$ MODULE$ = null;
    public   Inverse$ ()  { throw new RuntimeException(); }
    // not preceding
    public  java.lang.String name ()  { throw new RuntimeException(); }
    public  double link (double mu)  { throw new RuntimeException(); }
    public  double deriv (double mu)  { throw new RuntimeException(); }
    public  double unlink (double eta)  { throw new RuntimeException(); }
  }
  // not preceding
  // not preceding
  static public  class Probit$ extends org.apache.spark.ml.regression.GeneralizedLinearRegression.Link {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final Probit$ MODULE$ = null;
    public   Probit$ ()  { throw new RuntimeException(); }
    // not preceding
    public  double link (double mu)  { throw new RuntimeException(); }
    public  double deriv (double mu)  { throw new RuntimeException(); }
    public  double unlink (double eta)  { throw new RuntimeException(); }
  }
  // not preceding
  // not preceding
  static public  class CLogLog$ extends org.apache.spark.ml.regression.GeneralizedLinearRegression.Link {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final CLogLog$ MODULE$ = null;
    public   CLogLog$ ()  { throw new RuntimeException(); }
    // not preceding
    public  double link (double mu)  { throw new RuntimeException(); }
    public  double deriv (double mu)  { throw new RuntimeException(); }
    public  double unlink (double eta)  { throw new RuntimeException(); }
  }
  // not preceding
  // not preceding
  static public  class Sqrt$ extends org.apache.spark.ml.regression.GeneralizedLinearRegression.Power {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final Sqrt$ MODULE$ = null;
    public   Sqrt$ ()  { throw new RuntimeException(); }
    // not preceding
    public  java.lang.String name ()  { throw new RuntimeException(); }
    public  double link (double mu)  { throw new RuntimeException(); }
    public  double deriv (double mu)  { throw new RuntimeException(); }
    public  double unlink (double eta)  { throw new RuntimeException(); }
  }
  // not preceding
  static   class Power extends org.apache.spark.ml.regression.GeneralizedLinearRegression.Link {
    // not preceding
    public   Power (double linkPower)  { throw new RuntimeException(); }
    public  double deriv (double mu)  { throw new RuntimeException(); }
    // not preceding
    public  double link (double mu)  { throw new RuntimeException(); }
    // not preceding
    public  double linkPower ()  { throw new RuntimeException(); }
    public  double unlink (double eta)  { throw new RuntimeException(); }
  }
  // not preceding
  static public  org.apache.spark.ml.regression.GeneralizedLinearRegression load (java.lang.String path)  { throw new RuntimeException(); }
  // not preceding
  static   scala.collection.immutable.Set<scala.Tuple2<org.apache.spark.ml.regression.GeneralizedLinearRegression.Family, org.apache.spark.ml.regression.GeneralizedLinearRegression.Link>> supportedFamilyAndLinkPairs ()  { throw new RuntimeException(); }
  /** String name for "irls" (iteratively reweighted least squares) solver. */
  static   java.lang.String IRLS ()  { throw new RuntimeException(); }
  /** Set of solvers that GeneralizedLinearRegression supports. */
  static   java.lang.String[] supportedSolvers ()  { throw new RuntimeException(); }
  // not preceding
  static   java.lang.String[] supportedFamilyNames ()  { throw new RuntimeException(); }
  // not preceding
  static   java.lang.String[] supportedLinkNames ()  { throw new RuntimeException(); }
  static   double epsilon ()  { throw new RuntimeException(); }
  static   double ylogy (double y, double mu)  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.util.MLReader<T> read ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.Param<java.lang.String> family ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.DoubleParam variancePower ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.Param<java.lang.String> link ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.DoubleParam linkPower ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.Param<java.lang.String> linkPredictionCol ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.Param<java.lang.String> offsetCol ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.Param<java.lang.String> solver ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.IntParam aggregationDepth ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.Param<java.lang.String> weightCol ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.DoubleParam regParam ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.DoubleParam tol ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.IntParam maxIter ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.BooleanParam fitIntercept ()  { throw new RuntimeException(); }
  public  java.lang.String uid ()  { throw new RuntimeException(); }
  // not preceding
  public   GeneralizedLinearRegression (java.lang.String uid)  { throw new RuntimeException(); }
  // not preceding
  public   GeneralizedLinearRegression ()  { throw new RuntimeException(); }
  /**
   * Sets the value of param {@link family}.
   * Default is "gaussian".
   * <p>
   * @group setParam
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.regression.GeneralizedLinearRegression setFamily (java.lang.String value)  { throw new RuntimeException(); }
  /**
   * Sets the value of param {@link variancePower}.
   * Used only when family is "tweedie".
   * Default is 0.0, which corresponds to the "gaussian" family.
   * <p>
   * @group setParam
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.regression.GeneralizedLinearRegression setVariancePower (double value)  { throw new RuntimeException(); }
  /**
   * Sets the value of param {@link linkPower}.
   * Used only when family is "tweedie".
   * <p>
   * @group setParam
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.regression.GeneralizedLinearRegression setLinkPower (double value)  { throw new RuntimeException(); }
  /**
   * Sets the value of param {@link link}.
   * Used only when family is not "tweedie".
   * <p>
   * @group setParam
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.regression.GeneralizedLinearRegression setLink (java.lang.String value)  { throw new RuntimeException(); }
  /**
   * Sets if we should fit the intercept.
   * Default is true.
   * <p>
   * @group setParam
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.regression.GeneralizedLinearRegression setFitIntercept (boolean value)  { throw new RuntimeException(); }
  /**
   * Sets the maximum number of iterations (applicable for solver "irls").
   * Default is 25.
   * <p>
   * @group setParam
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.regression.GeneralizedLinearRegression setMaxIter (int value)  { throw new RuntimeException(); }
  /**
   * Sets the convergence tolerance of iterations.
   * Smaller value will lead to higher accuracy with the cost of more iterations.
   * Default is 1E-6.
   * <p>
   * @group setParam
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.regression.GeneralizedLinearRegression setTol (double value)  { throw new RuntimeException(); }
  /**
   * Sets the regularization parameter for L2 regularization.
   * The regularization term is
   * <blockquote>
   *    $$
   *    0.5 * regParam * L2norm(coefficients)^2
   *    $$
   * </blockquote>
   * Default is 0.0.
   * <p>
   * @group setParam
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.regression.GeneralizedLinearRegression setRegParam (double value)  { throw new RuntimeException(); }
  /**
   * Sets the value of param {@link weightCol}.
   * If this is not set or empty, we treat all instance weights as 1.0.
   * Default is not set, so all instances have weight one.
   * In the Binomial family, weights correspond to number of trials and should be integer.
   * Non-integer weights are rounded to integer in AIC calculation.
   * <p>
   * @group setParam
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.regression.GeneralizedLinearRegression setWeightCol (java.lang.String value)  { throw new RuntimeException(); }
  /**
   * Sets the value of param {@link offsetCol}.
   * If this is not set or empty, we treat all instance offsets as 0.0.
   * Default is not set, so all instances have offset 0.0.
   * <p>
   * @group setParam
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.regression.GeneralizedLinearRegression setOffsetCol (java.lang.String value)  { throw new RuntimeException(); }
  /**
   * Sets the solver algorithm used for optimization.
   * Currently only supports "irls" which is also the default solver.
   * <p>
   * @group setParam
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.regression.GeneralizedLinearRegression setSolver (java.lang.String value)  { throw new RuntimeException(); }
  /**
   * Sets the link prediction (linear predictor) column name.
   * <p>
   * @group setParam
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.regression.GeneralizedLinearRegression setLinkPredictionCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group expertSetParam */
  public  org.apache.spark.ml.regression.GeneralizedLinearRegression setAggregationDepth (int value)  { throw new RuntimeException(); }
  protected  org.apache.spark.ml.regression.GeneralizedLinearRegressionModel train (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.regression.GeneralizedLinearRegression copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
}
