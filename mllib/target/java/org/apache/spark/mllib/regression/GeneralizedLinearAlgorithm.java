package org.apache.spark.mllib.regression;
/**
 * The optimizer to solve the problem.
 * <p>
 */
public abstract class GeneralizedLinearAlgorithm<M extends org.apache.spark.mllib.regression.GeneralizedLinearModel> implements org.apache.spark.internal.Logging, scala.Serializable {
  // not preceding
  public   GeneralizedLinearAlgorithm ()  { throw new RuntimeException(); }
  /** Whether to add intercept (default: false). */
  protected  boolean addIntercept ()  { throw new RuntimeException(); }
  /**
   * Create a model given the weights and intercept
   * @param weights (undocumented)
   * @param intercept (undocumented)
   * @return (undocumented)
   */
  protected abstract  M createModel (org.apache.spark.mllib.linalg.Vector weights, double intercept)  ;
  /**
   * When <code>numOfLinearPredictor > 1</code>, the intercepts are encapsulated into weights,
   * so the <code>weights</code> will include the intercepts. When <code>numOfLinearPredictor == 1</code>,
   * the intercept will be stored as separated value in <code>GeneralizedLinearModel</code>.
   * This will result in different behaviors since when <code>numOfLinearPredictor == 1</code>,
   * users have no way to set the initial intercept, while in the other case, users
   * can set the intercepts as part of weights.
   * <p>
   * TODO: See if we can deprecate <code>intercept</code> in <code>GeneralizedLinearModel</code>, and always
   * have the intercept as part of weights to have consistent design.
   * @param input (undocumented)
   * @return (undocumented)
   */
  protected  org.apache.spark.mllib.linalg.Vector generateInitialWeights (org.apache.spark.rdd.RDD<org.apache.spark.mllib.regression.LabeledPoint> input)  { throw new RuntimeException(); }
  /**
   * The dimension of training features.
   * <p>
   * @return (undocumented)
   */
  public  int getNumFeatures ()  { throw new RuntimeException(); }
  /**
   * Get if the algorithm uses addIntercept
   * <p>
   * @return (undocumented)
   */
  public  boolean isAddIntercept ()  { throw new RuntimeException(); }
  /**
   * The dimension of training features.
   * @return (undocumented)
   */
  protected  int numFeatures ()  { throw new RuntimeException(); }
  /**
   * In <code>GeneralizedLinearModel</code>, only single linear predictor is allowed for both weights
   * and intercept. However, for multinomial logistic regression, with K possible outcomes,
   * we are training K-1 independent binary logistic regression models which requires K-1 sets
   * of linear predictor.
   * <p>
   * As a result, the workaround here is if more than two sets of linear predictors are needed,
   * we construct bigger <code>weights</code> vector which can hold both weights and intercepts.
   * If the intercepts are added, the dimension of <code>weights</code> will be
   * (numOfLinearPredictor) * (numFeatures + 1) . If the intercepts are not added,
   * the dimension of <code>weights</code> will be (numOfLinearPredictor) * numFeatures.
   * <p>
   * Thus, the intercepts will be encapsulated into weights, and we leave the value of intercept
   * in GeneralizedLinearModel as zero.
   * @return (undocumented)
   */
  protected  int numOfLinearPredictor ()  { throw new RuntimeException(); }
  /**
   * The optimizer to solve the problem.
   * <p>
   * @return (undocumented)
   */
  public abstract  org.apache.spark.mllib.optimization.Optimizer optimizer ()  ;
  /**
   * Run the algorithm with the configured parameters on an input
   * RDD of LabeledPoint entries.
   * <p>
   * @param input (undocumented)
   * @return (undocumented)
   */
  public  M run (org.apache.spark.rdd.RDD<org.apache.spark.mllib.regression.LabeledPoint> input)  { throw new RuntimeException(); }
  /**
   * Scaling columns to unit variance as a heuristic to reduce the condition number:
   * <p>
   * During the optimization process, the convergence (rate) depends on the condition number of
   * the training dataset. Scaling the variables often reduces this condition number
   * heuristically, thus improving the convergence rate. Without reducing the condition number,
   * some training datasets mixing the columns with different scales may not be able to converge.
   * <p>
   * GLMNET and LIBSVM packages perform the scaling to reduce the condition number, and return
   * the weights in the original scale.
   * See page 9 in http://cran.r-project.org/web/packages/glmnet/glmnet.pdf
   * <p>
   * Here, if useFeatureScaling is enabled, we will standardize the training features by dividing
   * the variance of each column (without subtracting the mean), and train the model in the
   * scaled space. Then we transform the coefficients from the scaled space to the original scale
   * as GLMNET and LIBSVM do.
   * <p>
   * Currently, it's only enabled in LogisticRegressionWithLBFGS
   * @param input (undocumented)
   * @param initialWeights (undocumented)
   * @return (undocumented)
   */
  public  M run (org.apache.spark.rdd.RDD<org.apache.spark.mllib.regression.LabeledPoint> input, org.apache.spark.mllib.linalg.Vector initialWeights)  { throw new RuntimeException(); }
  /**
   * Set if the algorithm should use feature scaling to improve the convergence during optimization.
   * @param useFeatureScaling (undocumented)
   * @return (undocumented)
   */
    org.apache.spark.mllib.regression.GeneralizedLinearAlgorithm<M> setFeatureScaling (boolean useFeatureScaling)  { throw new RuntimeException(); }
  /**
   * Set if the algorithm should add an intercept. Default false.
   * We set the default to false because adding the intercept will cause memory allocation.
   * <p>
   * @param addIntercept (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.regression.GeneralizedLinearAlgorithm<M> setIntercept (boolean addIntercept)  { throw new RuntimeException(); }
  /**
   * Set if the algorithm should validate data before training. Default true.
   * <p>
   * @param validateData (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.regression.GeneralizedLinearAlgorithm<M> setValidateData (boolean validateData)  { throw new RuntimeException(); }
  /**
   * Whether to perform feature scaling before model training to reduce the condition numbers
   * which can significantly help the optimizer converging faster. The scaling correction will be
   * translated back to resulting model weights, so it's transparent to users.
   * Note: This technique is used in both libsvm and glmnet packages. Default false.
   * @return (undocumented)
   */
    boolean useFeatureScaling ()  { throw new RuntimeException(); }
  protected  boolean validateData ()  { throw new RuntimeException(); }
  // not preceding
  protected  scala.collection.Seq<scala.Function1<org.apache.spark.rdd.RDD<org.apache.spark.mllib.regression.LabeledPoint>, java.lang.Object>> validators ()  { throw new RuntimeException(); }
}
