package org.apache.spark.ml.param.shared;
/**
 * Param for suggested depth for treeAggregate (&amp;gt;= 2).
 * @group expertParam
 */
public  interface HasAggregationDepth extends org.apache.spark.ml.param.Params {
  /**
   * Param for suggested depth for treeAggregate (&amp;gt;= 2).
   * @group expertParam
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.IntParam aggregationDepth ()  ;
  /** @group expertGetParam */
  public  int getAggregationDepth ()  ;
}
