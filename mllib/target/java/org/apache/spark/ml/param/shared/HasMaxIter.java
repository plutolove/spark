package org.apache.spark.ml.param.shared;
/**
 * Param for maximum number of iterations (&amp;gt;= 0).
 * @group param
 */
public  interface HasMaxIter extends org.apache.spark.ml.param.Params {
  /** @group getParam */
  public  int getMaxIter ()  ;
  /**
   * Param for maximum number of iterations (&amp;gt;= 0).
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.IntParam maxIter ()  ;
}
