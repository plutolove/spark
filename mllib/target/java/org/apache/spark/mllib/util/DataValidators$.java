package org.apache.spark.mllib.util;
/**
 * Function to check if labels used for classification are either zero or one.
 * <p>
 * @return True if labels are all zero or one, false otherwise.
 */
// not preceding
public  class DataValidators$ implements org.apache.spark.internal.Logging {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final DataValidators$ MODULE$ = null;
  public   DataValidators$ ()  { throw new RuntimeException(); }
  // not preceding
  public  scala.Function1<org.apache.spark.rdd.RDD<org.apache.spark.mllib.regression.LabeledPoint>, java.lang.Object> binaryLabelValidator ()  { throw new RuntimeException(); }
  /**
   * Function to check if labels used for k class multi-label classification are
   * in the range of {0, 1, ..., k - 1}.
   * <p>
   * @return True if labels are all in the range of {0, 1, ..., k-1}, false otherwise.
   * @param k (undocumented)
   */
  public  scala.Function1<org.apache.spark.rdd.RDD<org.apache.spark.mllib.regression.LabeledPoint>, java.lang.Object> multiLabelValidator (int k)  { throw new RuntimeException(); }
}
