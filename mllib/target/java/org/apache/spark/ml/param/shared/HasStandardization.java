package org.apache.spark.ml.param.shared;
/**
 * Param for whether to standardize the training features before fitting the model.
 * @group param
 */
public  interface HasStandardization extends org.apache.spark.ml.param.Params {
  /** @group getParam */
  public  boolean getStandardization ()  ;
  /**
   * Param for whether to standardize the training features before fitting the model.
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.BooleanParam standardization ()  ;
}
