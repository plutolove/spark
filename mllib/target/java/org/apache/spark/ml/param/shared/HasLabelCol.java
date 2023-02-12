package org.apache.spark.ml.param.shared;
/**
 * Param for label column name.
 * @group param
 */
public  interface HasLabelCol extends org.apache.spark.ml.param.Params {
  /** @group getParam */
  public  java.lang.String getLabelCol ()  ;
  /**
   * Param for label column name.
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.Param<java.lang.String> labelCol ()  ;
}
