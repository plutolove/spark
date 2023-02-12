package org.apache.spark.mllib.stat;
/**
 * Add a new sample to this summarizer, and update the statistical summary.
 * <p>
 * param:  sample The sample in dense/sparse vector format to be added into this summarizer.
 * @return This MultivariateOnlineSummarizer object.
 */
public  class MultivariateOnlineSummarizer implements org.apache.spark.mllib.stat.MultivariateStatisticalSummary, scala.Serializable {
  // not preceding
  public   MultivariateOnlineSummarizer ()  { throw new RuntimeException(); }
  /**
   * Add a new sample to this summarizer, and update the statistical summary.
   * <p>
   * @param sample The sample in dense/sparse vector format to be added into this summarizer.
   * @return This MultivariateOnlineSummarizer object.
   */
  public  org.apache.spark.mllib.stat.MultivariateOnlineSummarizer add (org.apache.spark.mllib.linalg.Vector sample)  { throw new RuntimeException(); }
    org.apache.spark.mllib.stat.MultivariateOnlineSummarizer add (org.apache.spark.mllib.linalg.Vector instance, double weight)  { throw new RuntimeException(); }
  /**
   * Sample size.
   * <p>
   * @return (undocumented)
   */
  public  long count ()  { throw new RuntimeException(); }
  /**
   * Maximum value of each dimension.
   * <p>
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.linalg.Vector max ()  { throw new RuntimeException(); }
  /**
   * Sample mean of each dimension.
   * <p>
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.linalg.Vector mean ()  { throw new RuntimeException(); }
  /**
   * Merge another MultivariateOnlineSummarizer, and update the statistical summary.
   * (Note that it's in place merging; as a result, <code>this</code> object will be modified.)
   * <p>
   * @param other The other MultivariateOnlineSummarizer to be merged.
   * @return This MultivariateOnlineSummarizer object.
   */
  public  org.apache.spark.mllib.stat.MultivariateOnlineSummarizer merge (org.apache.spark.mllib.stat.MultivariateOnlineSummarizer other)  { throw new RuntimeException(); }
  /**
   * Minimum value of each dimension.
   * <p>
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.linalg.Vector min ()  { throw new RuntimeException(); }
  /**
   * L1 norm of each dimension.
   * <p>
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.linalg.Vector normL1 ()  { throw new RuntimeException(); }
  /**
   * L2 (Euclidean) norm of each dimension.
   * <p>
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.linalg.Vector normL2 ()  { throw new RuntimeException(); }
  /**
   * Number of nonzero elements in each dimension.
   * <p>
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.linalg.Vector numNonzeros ()  { throw new RuntimeException(); }
  /**
   * Unbiased estimate of sample variance of each dimension.
   * <p>
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.linalg.Vector variance ()  { throw new RuntimeException(); }
  /**
   * Sum of weights.
   * @return (undocumented)
   */
  public  double weightSum ()  { throw new RuntimeException(); }
}
