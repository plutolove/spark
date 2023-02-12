package org.apache.spark.ml.param.shared;
/**
 * Param for random seed.
 * @group param
 */
public  interface HasSeed extends org.apache.spark.ml.param.Params {
  /** @group getParam */
  public  long getSeed ()  ;
  /**
   * Param for random seed.
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.LongParam seed ()  ;
}
