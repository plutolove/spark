package org.apache.spark.mllib.feature;
/**
 * Computes the mean and variance and stores as a model to be used for later scaling.
 * <p>
 * param:  data The data used to compute the mean and variance to build the transformation model.
 * @return a StandardScalarModel
 */
public  class StandardScaler implements org.apache.spark.internal.Logging {
  // not preceding
  public   StandardScaler (boolean withMean, boolean withStd)  { throw new RuntimeException(); }
  // not preceding
  public   StandardScaler ()  { throw new RuntimeException(); }
  /**
   * Computes the mean and variance and stores as a model to be used for later scaling.
   * <p>
   * @param data The data used to compute the mean and variance to build the transformation model.
   * @return a StandardScalarModel
   */
  public  org.apache.spark.mllib.feature.StandardScalerModel fit (org.apache.spark.rdd.RDD<org.apache.spark.mllib.linalg.Vector> data)  { throw new RuntimeException(); }
}
