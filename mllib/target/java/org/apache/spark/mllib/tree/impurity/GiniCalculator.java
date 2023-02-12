package org.apache.spark.mllib.tree.impurity;
/**
 * Make a deep copy of this {@link ImpurityCalculator}.
 */
  class GiniCalculator extends org.apache.spark.mllib.tree.impurity.ImpurityCalculator {
  // not preceding
  public   GiniCalculator (double[] stats, long rawCount)  { throw new RuntimeException(); }
  /**
   * Calculate the impurity from the stored sufficient statistics.
   * @return (undocumented)
   */
  public  double calculate ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.mllib.tree.impurity.GiniCalculator copy ()  { throw new RuntimeException(); }
  /**
   * Weighted number of data points accounted for in the sufficient statistics.
   * @return (undocumented)
   */
  public  double count ()  { throw new RuntimeException(); }
  /**
   * Prediction which should be made based on the sufficient statistics.
   * @return (undocumented)
   */
  public  double predict ()  { throw new RuntimeException(); }
  /**
   * Probability of the label given by {@link predict}.
   * @param label (undocumented)
   * @return (undocumented)
   */
  public  double prob (double label)  { throw new RuntimeException(); }
  // not preceding
  public  long rawCount ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
