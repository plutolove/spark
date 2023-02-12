package org.apache.spark.ml.param.shared;
/**
 * Param for how to handle invalid entries. Options are skip (which will filter out rows with bad values), or error (which will throw an error). More options may be added later.
 * @group param
 */
public  interface HasHandleInvalid extends org.apache.spark.ml.param.Params {
  /** @group getParam */
  public  java.lang.String getHandleInvalid ()  ;
  /**
   * Param for how to handle invalid entries. Options are skip (which will filter out rows with bad values), or error (which will throw an error). More options may be added later.
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.Param<java.lang.String> handleInvalid ()  ;
}
