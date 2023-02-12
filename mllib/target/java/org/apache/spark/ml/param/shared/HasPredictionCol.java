package org.apache.spark.ml.param.shared;
/**
 * Param for prediction column name.
 * @group param
 */
public  interface HasPredictionCol extends org.apache.spark.ml.param.Params {
  /** @group getParam */
  public  java.lang.String getPredictionCol ()  ;
  /**
   * Param for prediction column name.
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.Param<java.lang.String> predictionCol ()  ;
}
