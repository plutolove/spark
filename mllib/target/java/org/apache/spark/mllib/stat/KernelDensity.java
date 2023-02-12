package org.apache.spark.mllib.stat;
/** Bandwidth of the kernel function. */
public  class KernelDensity implements scala.Serializable {
  // not preceding
  static public  double normPdf (double mean, double standardDeviation, double logStandardDeviationPlusHalfLog2Pi, double x)  { throw new RuntimeException(); }
  // not preceding
  public   KernelDensity ()  { throw new RuntimeException(); }
  /**
   * Sets the bandwidth (standard deviation) of the Gaussian kernel (default: <code>1.0</code>).
   * @param bandwidth (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.stat.KernelDensity setBandwidth (double bandwidth)  { throw new RuntimeException(); }
  /**
   * Sets the sample to use for density estimation.
   * @param sample (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.stat.KernelDensity setSample (org.apache.spark.rdd.RDD<java.lang.Object> sample)  { throw new RuntimeException(); }
  /**
   * Sets the sample to use for density estimation (for Java users).
   * @param sample (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.stat.KernelDensity setSample (org.apache.spark.api.java.JavaRDD<java.lang.Double> sample)  { throw new RuntimeException(); }
  /**
   * Estimates probability density function at the given array of points.
   * @param points (undocumented)
   * @return (undocumented)
   */
  public  double[] estimate (double[] points)  { throw new RuntimeException(); }
}
