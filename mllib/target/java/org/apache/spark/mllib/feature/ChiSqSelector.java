package org.apache.spark.mllib.feature;
/**
 * The is the same to call this() and setNumTopFeatures(numTopFeatures)
 */
public  class ChiSqSelector implements scala.Serializable {
  // not preceding
  static   java.lang.String NumTopFeatures ()  { throw new RuntimeException(); }
  /** String name for `percentile` selector type. */
  static   java.lang.String Percentile ()  { throw new RuntimeException(); }
  /** String name for `fpr` selector type. */
  static   java.lang.String FPR ()  { throw new RuntimeException(); }
  /** String name for `fdr` selector type. */
  static   java.lang.String FDR ()  { throw new RuntimeException(); }
  /** String name for `fwe` selector type. */
  static   java.lang.String FWE ()  { throw new RuntimeException(); }
  /** Set of selector types that ChiSqSelector supports. */
  static public  java.lang.String[] supportedSelectorTypes ()  { throw new RuntimeException(); }
  // not preceding
  public   ChiSqSelector ()  { throw new RuntimeException(); }
  // not preceding
  public  int numTopFeatures ()  { throw new RuntimeException(); }
  public  double percentile ()  { throw new RuntimeException(); }
  public  double fpr ()  { throw new RuntimeException(); }
  public  double fdr ()  { throw new RuntimeException(); }
  public  double fwe ()  { throw new RuntimeException(); }
  public  java.lang.String selectorType ()  { throw new RuntimeException(); }
  /**
   * The is the same to call this() and setNumTopFeatures(numTopFeatures)
   * @param numTopFeatures (undocumented)
   */
  public   ChiSqSelector (int numTopFeatures)  { throw new RuntimeException(); }
  public  org.apache.spark.mllib.feature.ChiSqSelector setNumTopFeatures (int value)  { throw new RuntimeException(); }
  public  org.apache.spark.mllib.feature.ChiSqSelector setPercentile (double value)  { throw new RuntimeException(); }
  public  org.apache.spark.mllib.feature.ChiSqSelector setFpr (double value)  { throw new RuntimeException(); }
  public  org.apache.spark.mllib.feature.ChiSqSelector setFdr (double value)  { throw new RuntimeException(); }
  public  org.apache.spark.mllib.feature.ChiSqSelector setFwe (double value)  { throw new RuntimeException(); }
  public  org.apache.spark.mllib.feature.ChiSqSelector setSelectorType (java.lang.String value)  { throw new RuntimeException(); }
  /**
   * Returns a ChiSquared feature selector.
   * <p>
   * @param data an <code>RDD[LabeledPoint]</code> containing the labeled dataset with categorical features.
   *             Real-valued features will be treated as categorical for each distinct value.
   *             Apply feature discretizer before using this function.
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.feature.ChiSqSelectorModel fit (org.apache.spark.rdd.RDD<org.apache.spark.mllib.regression.LabeledPoint> data)  { throw new RuntimeException(); }
}
