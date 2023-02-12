package org.apache.spark.ml.param.shared;
/**
 * Param for output column names.
 * @group param
 */
public  interface HasOutputCols extends org.apache.spark.ml.param.Params {
  /** @group getParam */
  public  java.lang.String[] getOutputCols ()  ;
  /**
   * Param for output column names.
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.StringArrayParam outputCols ()  ;
}
