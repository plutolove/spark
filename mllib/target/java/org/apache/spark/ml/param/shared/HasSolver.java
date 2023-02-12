package org.apache.spark.ml.param.shared;
/**
 * Param for the solver algorithm for optimization.
 * @group param
 */
public  interface HasSolver extends org.apache.spark.ml.param.Params {
  /** @group getParam */
  public  java.lang.String getSolver ()  ;
  /**
   * Param for the solver algorithm for optimization.
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.Param<java.lang.String> solver ()  ;
}
