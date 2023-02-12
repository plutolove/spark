package org.apache.spark.mllib.feature;
/**
 * Applies unit length normalization on a vector.
 * <p>
 * param:  vector vector to be normalized.
 * @return normalized vector. If the norm of the input is zero, it will return the input vector.
 */
public  class Normalizer implements org.apache.spark.mllib.feature.VectorTransformer {
  // not preceding
  public   Normalizer (double p)  { throw new RuntimeException(); }
  // not preceding
  public   Normalizer ()  { throw new RuntimeException(); }
  /**
   * Applies unit length normalization on a vector.
   * <p>
   * @param vector vector to be normalized.
   * @return normalized vector. If the norm of the input is zero, it will return the input vector.
   */
  public  org.apache.spark.mllib.linalg.Vector transform (org.apache.spark.mllib.linalg.Vector vector)  { throw new RuntimeException(); }
}
