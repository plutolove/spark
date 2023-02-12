package org.apache.spark.ml.param.shared;
/**
 * Param for input column names.
 * @group param
 */
public  interface HasInputCols extends org.apache.spark.ml.param.Params {
  /** @group getParam */
  public  java.lang.String[] getInputCols ()  ;
  /**
   * Param for input column names.
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.StringArrayParam inputCols ()  ;
}
