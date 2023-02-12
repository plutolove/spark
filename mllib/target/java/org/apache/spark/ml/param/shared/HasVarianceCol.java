package org.apache.spark.ml.param.shared;
/**
 * Param for Column name for the biased sample variance of prediction.
 * @group param
 */
public  interface HasVarianceCol extends org.apache.spark.ml.param.Params {
  /** @group getParam */
  public  java.lang.String getVarianceCol ()  ;
  /**
   * Param for Column name for the biased sample variance of prediction.
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.Param<java.lang.String> varianceCol ()  ;
}
