package org.apache.spark.ml.param.shared;
/**
 * Param for Number of features. Should be greater than 0.
 * @group param
 */
public  interface HasNumFeatures extends org.apache.spark.ml.param.Params {
  /** @group getParam */
  public  int getNumFeatures ()  ;
  /**
   * Param for Number of features. Should be greater than 0.
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.IntParam numFeatures ()  ;
}
