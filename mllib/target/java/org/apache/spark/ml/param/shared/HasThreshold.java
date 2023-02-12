package org.apache.spark.ml.param.shared;
/**
 * Param for threshold in binary classification prediction, in range [0, 1].
 * @group param
 */
public  interface HasThreshold extends org.apache.spark.ml.param.Params {
  /** @group getParam */
  public  double getThreshold ()  ;
  /**
   * Param for threshold in binary classification prediction, in range [0, 1].
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.DoubleParam threshold ()  ;
}
