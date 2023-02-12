package org.apache.spark.mllib.tree.configuration;
/**
 */
public  class Strategy implements scala.Serializable {
  /**
   * Construct a default set of parameters for {@link org.apache.spark.mllib.tree.DecisionTree}
   * @param algo  "Classification" or "Regression"
   * @return (undocumented)
   */
  static public  org.apache.spark.mllib.tree.configuration.Strategy defaultStrategy (java.lang.String algo)  { throw new RuntimeException(); }
  /**
   * Construct a default set of parameters for {@link org.apache.spark.mllib.tree.DecisionTree}
   * @param algo Algo.Classification or Algo.Regression
   * @return (undocumented)
   */
  static public  org.apache.spark.mllib.tree.configuration.Strategy defaultStrategy (scala.Enumeration.Value algo)  { throw new RuntimeException(); }
  // not preceding
  public  scala.Enumeration.Value algo ()  { throw new RuntimeException(); }
  public  org.apache.spark.mllib.tree.impurity.Impurity impurity ()  { throw new RuntimeException(); }
  public  int maxDepth ()  { throw new RuntimeException(); }
  public  int numClasses ()  { throw new RuntimeException(); }
  public  int maxBins ()  { throw new RuntimeException(); }
  public  scala.Enumeration.Value quantileCalculationStrategy ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.Object, java.lang.Object> categoricalFeaturesInfo ()  { throw new RuntimeException(); }
  public  int minInstancesPerNode ()  { throw new RuntimeException(); }
  public  double minInfoGain ()  { throw new RuntimeException(); }
  public  int maxMemoryInMB ()  { throw new RuntimeException(); }
  public  double subsamplingRate ()  { throw new RuntimeException(); }
  public  boolean useNodeIdCache ()  { throw new RuntimeException(); }
  public  int checkpointInterval ()  { throw new RuntimeException(); }
  public  double minWeightFractionPerNode ()  { throw new RuntimeException(); }
    boolean bootstrap ()  { throw new RuntimeException(); }
  // not preceding
  public   Strategy (scala.Enumeration.Value algo, org.apache.spark.mllib.tree.impurity.Impurity impurity, int maxDepth, int numClasses, int maxBins, scala.Enumeration.Value quantileCalculationStrategy, scala.collection.immutable.Map<java.lang.Object, java.lang.Object> categoricalFeaturesInfo, int minInstancesPerNode, double minInfoGain, int maxMemoryInMB, double subsamplingRate, boolean useNodeIdCache, int checkpointInterval, double minWeightFractionPerNode, boolean bootstrap)  { throw new RuntimeException(); }
  // not preceding
  public  boolean isMulticlassClassification ()  { throw new RuntimeException(); }
  /**
   * @return (undocumented)
   */
  public  boolean isMulticlassWithCategoricalFeatures ()  { throw new RuntimeException(); }
  /**
   * Backwards compatible constructor for {@link org.apache.spark.mllib.tree.configuration.Strategy}
   * @param algo (undocumented)
   * @param impurity (undocumented)
   * @param maxDepth (undocumented)
   * @param numClasses (undocumented)
   * @param maxBins (undocumented)
   * @param quantileCalculationStrategy (undocumented)
   * @param categoricalFeaturesInfo (undocumented)
   * @param minInstancesPerNode (undocumented)
   * @param minInfoGain (undocumented)
   * @param maxMemoryInMB (undocumented)
   * @param subsamplingRate (undocumented)
   * @param useNodeIdCache (undocumented)
   * @param checkpointInterval (undocumented)
   */
  public   Strategy (scala.Enumeration.Value algo, org.apache.spark.mllib.tree.impurity.Impurity impurity, int maxDepth, int numClasses, int maxBins, scala.Enumeration.Value quantileCalculationStrategy, scala.collection.immutable.Map<java.lang.Object, java.lang.Object> categoricalFeaturesInfo, int minInstancesPerNode, double minInfoGain, int maxMemoryInMB, double subsamplingRate, boolean useNodeIdCache, int checkpointInterval)  { throw new RuntimeException(); }
  /**
   * Java-friendly constructor for {@link org.apache.spark.mllib.tree.configuration.Strategy}
   * @param algo (undocumented)
   * @param impurity (undocumented)
   * @param maxDepth (undocumented)
   * @param numClasses (undocumented)
   * @param maxBins (undocumented)
   * @param categoricalFeaturesInfo (undocumented)
   */
  public   Strategy (scala.Enumeration.Value algo, org.apache.spark.mllib.tree.impurity.Impurity impurity, int maxDepth, int numClasses, int maxBins, java.util.Map<java.lang.Integer, java.lang.Integer> categoricalFeaturesInfo)  { throw new RuntimeException(); }
  /**
   * Sets Algorithm using a String.
   * @param algo (undocumented)
   */
  public  void setAlgo (java.lang.String algo)  { throw new RuntimeException(); }
  /**
   * Sets categoricalFeaturesInfo using a Java Map.
   * @param categoricalFeaturesInfo (undocumented)
   */
  public  void setCategoricalFeaturesInfo (java.util.Map<java.lang.Integer, java.lang.Integer> categoricalFeaturesInfo)  { throw new RuntimeException(); }
  /**
   * Check validity of parameters.
   * Throws exception if invalid.
   */
    void assertValid ()  { throw new RuntimeException(); }
  /**
   * Returns a shallow copy of this instance.
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.tree.configuration.Strategy copy ()  { throw new RuntimeException(); }
  // not preceding
  public  scala.Enumeration.Value getAlgo ()  { throw new RuntimeException(); }
    boolean getBootstrap ()  { throw new RuntimeException(); }
  // not preceding
  public  scala.collection.immutable.Map<java.lang.Object, java.lang.Object> getCategoricalFeaturesInfo ()  { throw new RuntimeException(); }
  public  int getCheckpointInterval ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.mllib.tree.impurity.Impurity getImpurity ()  { throw new RuntimeException(); }
  public  int getMaxBins ()  { throw new RuntimeException(); }
  // not preceding
  public  int getMaxDepth ()  { throw new RuntimeException(); }
  public  int getMaxMemoryInMB ()  { throw new RuntimeException(); }
  // not preceding
  public  double getMinInfoGain ()  { throw new RuntimeException(); }
  // not preceding
  public  int getMinInstancesPerNode ()  { throw new RuntimeException(); }
  public  double getMinWeightFractionPerNode ()  { throw new RuntimeException(); }
  // not preceding
  public  int getNumClasses ()  { throw new RuntimeException(); }
  public  scala.Enumeration.Value getQuantileCalculationStrategy ()  { throw new RuntimeException(); }
  public  double getSubsamplingRate ()  { throw new RuntimeException(); }
  public  boolean getUseNodeIdCache ()  { throw new RuntimeException(); }
  // not preceding
  public  void setAlgo (scala.Enumeration.Value x$1)  { throw new RuntimeException(); }
    void setBootstrap (boolean x$1)  { throw new RuntimeException(); }
  // not preceding
  public  void setCategoricalFeaturesInfo (scala.collection.immutable.Map<java.lang.Object, java.lang.Object> x$1)  { throw new RuntimeException(); }
  public  void setCheckpointInterval (int x$1)  { throw new RuntimeException(); }
  // not preceding
  public  void setImpurity (org.apache.spark.mllib.tree.impurity.Impurity x$1)  { throw new RuntimeException(); }
  public  void setMaxBins (int x$1)  { throw new RuntimeException(); }
  // not preceding
  public  void setMaxDepth (int x$1)  { throw new RuntimeException(); }
  public  void setMaxMemoryInMB (int x$1)  { throw new RuntimeException(); }
  // not preceding
  public  void setMinInfoGain (double x$1)  { throw new RuntimeException(); }
  // not preceding
  public  void setMinInstancesPerNode (int x$1)  { throw new RuntimeException(); }
  public  void setMinWeightFractionPerNode (double x$1)  { throw new RuntimeException(); }
  // not preceding
  public  void setNumClasses (int x$1)  { throw new RuntimeException(); }
  public  void setQuantileCalculationStrategy (scala.Enumeration.Value x$1)  { throw new RuntimeException(); }
  public  void setSubsamplingRate (double x$1)  { throw new RuntimeException(); }
  public  void setUseNodeIdCache (boolean x$1)  { throw new RuntimeException(); }
}
