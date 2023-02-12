package org.apache.spark.mllib.classification;
/**
 * If we rescale the features, the condition number will be changed so the convergence rate
 * and the solution will not equal to the original solution multiple by the scaling factor
 * which it should be.
 * <p>
 * However, since in the LogisticRegressionWithLBFGS, we standardize the training dataset first,
 * no matter how we multiple a scaling factor into the dataset, the convergence rate should be
 * the same, and the solution should equal to the original solution multiple by the scaling
 * factor.
 */
public  class LogisticRegressionSuite extends org.apache.spark.SparkFunSuite implements org.apache.spark.mllib.util.MLlibTestSparkContext, org.scalatest.Matchers {
  // not preceding
  static public  java.util.List<org.apache.spark.mllib.regression.LabeledPoint> generateLogisticInputAsList (double offset, double scale, int nPoints, int seed)  { throw new RuntimeException(); }
  static public  scala.collection.Seq<org.apache.spark.mllib.regression.LabeledPoint> generateLogisticInput (double offset, double scale, int nPoints, int seed)  { throw new RuntimeException(); }
  /**
   * Generates <code>k</code> classes multinomial synthetic logistic input in <code>n</code> dimensional space given the
   * model weights and mean/variance of the features. The synthetic data will be drawn from
   * the probability distribution constructed by weights using the following formula.
   * <p>
   * P(y = 0 | x) = 1 / norm
   * P(y = 1 | x) = exp(x * w_1) / norm
   * P(y = 2 | x) = exp(x * w_2) / norm
   * ...
   * P(y = k-1 | x) = exp(x * w_{k-1}) / norm
   * where norm = 1 + exp(x * w_1) + exp(x * w_2) + ... + exp(x * w_{k-1})
   * <p>
   * @param weights matrix is flatten into a vector; as a result, the dimension of weights vector
   *                will be (k - 1) * (n + 1) if <code>addIntercept == true</code>, and
   *                if <code>addIntercept != true</code>, the dimension will be (k - 1) * n.
   * @param xMean the mean of the generated features. Lots of time, if the features are not properly
   *              standardized, the algorithm with poor implementation will have difficulty
   *              to converge.
   * @param xVariance the variance of the generated features.
   * @param addIntercept whether to add intercept.
   * @param nPoints the number of instance of generated data.
   * @param seed the seed for random generator. For consistent testing result, it will be fixed.
   * @return (undocumented)
   */
  static public  scala.collection.Seq<org.apache.spark.mllib.regression.LabeledPoint> generateMultinomialLogisticInput (double[] weights, double[] xMean, double[] xVariance, boolean addIntercept, int nPoints, int seed)  { throw new RuntimeException(); }
  // not preceding
  public  org.scalatest.Matchers.KeyWord key ()  { throw new RuntimeException(); }
  // not preceding
  public  org.scalatest.Matchers.ValueWord value ()  { throw new RuntimeException(); }
  // not preceding
  public  org.scalatest.Matchers.AWord a ()  { throw new RuntimeException(); }
  // not preceding
  public  org.scalatest.Matchers.AnWord an ()  { throw new RuntimeException(); }
  // not preceding
  public  org.scalatest.Matchers.TheSameInstanceAsPhrase theSameInstanceAs ()  { throw new RuntimeException(); }
  // not preceding
  public  org.scalatest.Matchers.RegexWord regex ()  { throw new RuntimeException(); }
  // not preceding
  public  org.scalactic.Explicitly.DecidedWord decided ()  { throw new RuntimeException(); }
  // not preceding
  public  org.scalactic.Explicitly.DeterminedWord determined ()  { throw new RuntimeException(); }
  // not preceding
  public  org.scalactic.Explicitly.TheAfterWord after ()  { throw new RuntimeException(); }
  // not preceding
  public  org.scalatest.words.FullyMatchWord fullyMatch ()  { throw new RuntimeException(); }
  // not preceding
  public  org.scalatest.words.StartWithWord startWith ()  { throw new RuntimeException(); }
  // not preceding
  public  org.scalatest.words.EndWithWord endWith ()  { throw new RuntimeException(); }
  // not preceding
  public  org.scalatest.words.IncludeWord include ()  { throw new RuntimeException(); }
  // not preceding
  public  org.scalatest.words.HaveWord have ()  { throw new RuntimeException(); }
  // not preceding
  public  org.scalatest.words.BeWord be ()  { throw new RuntimeException(); }
  // not preceding
  public  org.scalatest.words.ContainWord contain ()  { throw new RuntimeException(); }
  // not preceding
  public  org.scalatest.words.NotWord not ()  { throw new RuntimeException(); }
  // not preceding
  public  org.scalatest.words.LengthWord length ()  { throw new RuntimeException(); }
  // not preceding
  public  org.scalatest.words.SizeWord size ()  { throw new RuntimeException(); }
  // not preceding
  public  org.scalatest.words.SortedWord sorted ()  { throw new RuntimeException(); }
  // not preceding
  public  org.scalatest.words.DefinedWord defined ()  { throw new RuntimeException(); }
  // not preceding
  public  org.scalatest.words.ExistWord exist ()  { throw new RuntimeException(); }
  // not preceding
  public  org.scalatest.words.ReadableWord readable ()  { throw new RuntimeException(); }
  // not preceding
  public  org.scalatest.words.WritableWord writable ()  { throw new RuntimeException(); }
  // not preceding
  public  org.scalatest.words.EmptyWord empty ()  { throw new RuntimeException(); }
  // not preceding
  public  org.scalatest.words.CompileWord compile ()  { throw new RuntimeException(); }
  // not preceding
  public  org.scalatest.words.TypeCheckWord typeCheck ()  { throw new RuntimeException(); }
  // not preceding
  public  org.scalatest.words.MatchPatternWord matchPattern ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.SparkSession spark ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.SparkContext sc ()  { throw new RuntimeException(); }
  // not preceding
  public  java.lang.String checkpointDir ()  { throw new RuntimeException(); }
  public  org.apache.spark.mllib.util.MLlibTestSparkContext.testImplicits$ testImplicits ()  { throw new RuntimeException(); }
  // not preceding
  public   LogisticRegressionSuite ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.rdd.RDD<org.apache.spark.mllib.regression.LabeledPoint> binaryDataset ()  { throw new RuntimeException(); }
  public  void beforeAll ()  { throw new RuntimeException(); }
  public  void validatePrediction (scala.collection.Seq<java.lang.Object> predictions, scala.collection.Seq<org.apache.spark.mllib.regression.LabeledPoint> input, double expectedAcc)  { throw new RuntimeException(); }
}
