package org.apache.spark.mllib.tree.impurity;
/**
 * Make a deep copy of this {@link ImpurityCalculator}.
 */
 abstract class ImpurityCalculator implements scala.Serializable {
  // not preceding
  static public  org.apache.spark.mllib.tree.impurity.ImpurityCalculator getCalculator (java.lang.String impurity, double[] stats, long rawCount)  { throw new RuntimeException(); }
  // not preceding
  public  double[] stats ()  { throw new RuntimeException(); }
  // not preceding
  public   ImpurityCalculator (double[] stats)  { throw new RuntimeException(); }
  // not preceding
  public abstract  org.apache.spark.mllib.tree.impurity.ImpurityCalculator copy ()  ;
  /**
   * Calculate the impurity from the stored sufficient statistics.
   * @return (undocumented)
   */
  public abstract  double calculate ()  ;
  /**
   * Add the stats from another calculator into this one, modifying and returning this calculator.
   * @param other (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.tree.impurity.ImpurityCalculator add (org.apache.spark.mllib.tree.impurity.ImpurityCalculator other)  { throw new RuntimeException(); }
  /**
   * Subtract the stats from another calculator from this one, modifying and returning this
   * calculator.
   * @param other (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.tree.impurity.ImpurityCalculator subtract (org.apache.spark.mllib.tree.impurity.ImpurityCalculator other)  { throw new RuntimeException(); }
  /**
   * Weighted number of data points accounted for in the sufficient statistics.
   * @return (undocumented)
   */
  public abstract  double count ()  ;
  /**
   * Raw number of data points accounted for in the sufficient statistics.
   * @return (undocumented)
   */
  public abstract  long rawCount ()  ;
  /**
   * Prediction which should be made based on the sufficient statistics.
   * @return (undocumented)
   */
  public abstract  double predict ()  ;
  /**
   * Probability of the label given by {@link predict}, or -1 if no probability is available.
   * @param label (undocumented)
   * @return (undocumented)
   */
  public  double prob (double label)  { throw new RuntimeException(); }
  /**
   * Return the index of the largest array element.
   * Fails if the array is empty.
   * @param array (undocumented)
   * @return (undocumented)
   */
  protected  int indexOfLargestArrayElement (double[] array)  { throw new RuntimeException(); }
}
