package org.apache.spark.ml.param.shared;
/**
 * Param for regularization parameter (&amp;gt;= 0).
 * @group param
 */
public  interface HasRegParam extends org.apache.spark.ml.param.Params {
  /** @group getParam */
  public  double getRegParam ()  ;
  /**
   * Param for regularization parameter (&amp;gt;= 0).
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.DoubleParam regParam ()  ;
}
