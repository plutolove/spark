package org.apache.spark.mllib.tree.configuration;
/**
 * Check validity of parameters.
 * Throws exception if invalid.
 */
public  class BoostingStrategy implements scala.Serializable, scala.Product {
  /**
   * Returns default configuration for the boosting algorithm
   * @param algo Learning goal.  Supported: "Classification" or "Regression"
   * @return Configuration for boosting algorithm
   */
  static public  org.apache.spark.mllib.tree.configuration.BoostingStrategy defaultParams (java.lang.String algo)  { throw new RuntimeException(); }
  /**
   * Returns default configuration for the boosting algorithm
   * @param algo Learning goal.  Supported:
   *             <code>org.apache.spark.mllib.tree.configuration.Algo.Classification</code>,
   *             <code>org.apache.spark.mllib.tree.configuration.Algo.Regression</code>
   * @return Configuration for boosting algorithm
   */
  static public  org.apache.spark.mllib.tree.configuration.BoostingStrategy defaultParams (scala.Enumeration.Value algo)  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.mllib.tree.configuration.Strategy treeStrategy ()  { throw new RuntimeException(); }
  public  org.apache.spark.mllib.tree.loss.Loss loss ()  { throw new RuntimeException(); }
  public  int numIterations ()  { throw new RuntimeException(); }
  public  double learningRate ()  { throw new RuntimeException(); }
  public  double validationTol ()  { throw new RuntimeException(); }
  // not preceding
  public   BoostingStrategy (org.apache.spark.mllib.tree.configuration.Strategy treeStrategy, org.apache.spark.mllib.tree.loss.Loss loss, int numIterations, double learningRate, double validationTol)  { throw new RuntimeException(); }
  // not preceding
    void assertValid ()  { throw new RuntimeException(); }
  // not preceding
  public  double getLearningRate ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.mllib.tree.loss.Loss getLoss ()  { throw new RuntimeException(); }
  public  int getNumIterations ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.mllib.tree.configuration.Strategy getTreeStrategy ()  { throw new RuntimeException(); }
  public  double getValidationTol ()  { throw new RuntimeException(); }
  // not preceding
  public  void setLearningRate (double x$1)  { throw new RuntimeException(); }
  // not preceding
  public  void setLoss (org.apache.spark.mllib.tree.loss.Loss x$1)  { throw new RuntimeException(); }
  public  void setNumIterations (int x$1)  { throw new RuntimeException(); }
  // not preceding
  public  void setTreeStrategy (org.apache.spark.mllib.tree.configuration.Strategy x$1)  { throw new RuntimeException(); }
  public  void setValidationTol (double x$1)  { throw new RuntimeException(); }
}
