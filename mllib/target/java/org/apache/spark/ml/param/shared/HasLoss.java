package org.apache.spark.ml.param.shared;
/**
 * Param for the loss function to be optimized.
 * @group param
 */
public  interface HasLoss extends org.apache.spark.ml.param.Params {
  /** @group getParam */
  public  java.lang.String getLoss ()  ;
  /**
   * Param for the loss function to be optimized.
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.Param<java.lang.String> loss ()  ;
}
