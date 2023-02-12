package org.apache.spark.sql.catalyst.statsEstimation;
/** Convert (column name, column stat) pairs to an AttributeMap based on plan output. */
public  interface StatsEstimationTestBase {
  public  void afterAll ()  ;
  public  org.apache.spark.sql.catalyst.expressions.AttributeReference attr (java.lang.String colName)  ;
  public  void beforeAll ()  ;
  public  long getColSize (org.apache.spark.sql.catalyst.expressions.Attribute attribute, org.apache.spark.sql.catalyst.plans.logical.ColumnStat colStat)  ;
  public  boolean originalCBOValue ()  ;
  public  boolean originalPlanStatsValue ()  ;
  /** Get a test ColumnStat with given distinctCount and nullCount */
  public  org.apache.spark.sql.catalyst.plans.logical.ColumnStat rangeColumnStat (int distinctCount, int nullCount)  ;
  /** Convert (column name, column stat) pairs to an AttributeMap based on plan output. */
  public  org.apache.spark.sql.catalyst.expressions.AttributeMap<org.apache.spark.sql.catalyst.plans.logical.ColumnStat> toAttributeMap (scala.collection.Seq<scala.Tuple2<java.lang.String, org.apache.spark.sql.catalyst.plans.logical.ColumnStat>> colStats, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  ;
}
