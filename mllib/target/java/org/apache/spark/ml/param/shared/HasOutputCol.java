package org.apache.spark.ml.param.shared;
/**
 * Param for output column name.
 * @group param
 */
public  interface HasOutputCol extends org.apache.spark.ml.param.Params {
  /** @group getParam */
  public  java.lang.String getOutputCol ()  ;
  /**
   * Param for output column name.
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.Param<java.lang.String> outputCol ()  ;
}
