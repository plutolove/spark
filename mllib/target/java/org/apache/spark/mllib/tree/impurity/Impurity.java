package org.apache.spark.mllib.tree.impurity;
/**
 * information calculation for multiclass classification
 * param:  counts Array[Double] with counts for each label
 * param:  totalCount sum of counts for all labels
 * @return information value, or 0 if totalCount = 0
 */
public  interface Impurity extends scala.Serializable {
  // not preceding
  public  double calculate (double[] counts, double totalCount)  ;
  /**
   * information calculation for regression
   * @param count number of instances
   * @param sum sum of labels
   * @param sumSquares summation of squares of the labels
   * @return information value, or 0 if count = 0
   */
  public  double calculate (double count, double sum, double sumSquares)  ;
}
