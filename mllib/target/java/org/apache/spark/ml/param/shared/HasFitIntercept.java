package org.apache.spark.ml.param.shared;
/**
 * Param for whether to fit an intercept term.
 * @group param
 */
public  interface HasFitIntercept extends org.apache.spark.ml.param.Params {
  /**
   * Param for whether to fit an intercept term.
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.BooleanParam fitIntercept ()  ;
  /** @group getParam */
  public  boolean getFitIntercept ()  ;
}
