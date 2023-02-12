package org.apache.spark.ml.param.shared;
/**
 * Param for the relative target precision for the approximate quantile algorithm. Must be in the range [0, 1].
 * @group expertParam
 */
public  interface HasRelativeError extends org.apache.spark.ml.param.Params {
  /** @group expertGetParam */
  public  double getRelativeError ()  ;
  /**
   * Param for the relative target precision for the approximate quantile algorithm. Must be in the range [0, 1].
   * @group expertParam
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.DoubleParam relativeError ()  ;
}
