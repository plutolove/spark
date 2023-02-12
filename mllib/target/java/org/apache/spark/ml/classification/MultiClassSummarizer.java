package org.apache.spark.ml.classification;
/**
 * Add a new label into this MultilabelSummarizer, and update the distinct map.
 * <p>
 * param:  label The label for this data point.
 * param:  weight The weight of this instances.
 * @return This MultilabelSummarizer
 */
  class MultiClassSummarizer implements scala.Serializable {
  // not preceding
  public   MultiClassSummarizer ()  { throw new RuntimeException(); }
  /**
   * Add a new label into this MultilabelSummarizer, and update the distinct map.
   * <p>
   * @param label The label for this data point.
   * @param weight The weight of this instances.
   * @return This MultilabelSummarizer
   */
  public  org.apache.spark.ml.classification.MultiClassSummarizer add (double label, double weight)  { throw new RuntimeException(); }
  /** @return The total invalid input counts. */
  public  long countInvalid ()  { throw new RuntimeException(); }
  /** @return The weightSum of each label in the input dataset. */
  public  double[] histogram ()  { throw new RuntimeException(); }
  /**
   * Merge another MultilabelSummarizer, and update the distinct map.
   * (Note that it will merge the smaller distinct map into the larger one using in-place
   * merging, so either <code>this</code> or <code>other</code> object will be modified and returned.)
   * <p>
   * @param other The other MultilabelSummarizer to be merged.
   * @return Merged MultilabelSummarizer object.
   */
  public  org.apache.spark.ml.classification.MultiClassSummarizer merge (org.apache.spark.ml.classification.MultiClassSummarizer other)  { throw new RuntimeException(); }
  /** @return The number of distinct labels in the input dataset. */
  public  int numClasses ()  { throw new RuntimeException(); }
}
