package org.apache.spark.ml.param.shared;
/**
 * Param for the convergence tolerance for iterative algorithms (&amp;gt;= 0).
 * @group param
 */
public  interface HasTol extends org.apache.spark.ml.param.Params {
  /** @group getParam */
  public  double getTol ()  ;
  /**
   * Param for the convergence tolerance for iterative algorithms (&amp;gt;= 0).
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.DoubleParam tol ()  ;
}
