package org.apache.spark.sql.catalyst.statsEstimation;
/**
 * In this test suite, we test predicates containing the following operators:
 * =, <, <=, >, >=, AND, OR, IS NULL, IS NOT NULL, IN, NOT IN
 */
public  class FilterEstimationSuite extends org.apache.spark.SparkFunSuite implements org.apache.spark.sql.catalyst.statsEstimation.StatsEstimationTestBase {
  // not preceding
  public   FilterEstimationSuite ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.AttributeReference attrBool ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.AttributeReference attrDate ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.AttributeReference attrDecimal ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.AttributeReference attrDouble ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.catalyst.expressions.AttributeReference attrInt ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.AttributeReference attrInt2 ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.AttributeReference attrInt3 ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.AttributeReference attrInt4 ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.AttributeReference attrIntHgm ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.AttributeReference attrIntSkewHgm ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.AttributeReference attrString ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.AttributeMap<org.apache.spark.sql.catalyst.plans.logical.ColumnStat> attributeMap ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.ColumnStat colStatBool ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.ColumnStat colStatDate ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.ColumnStat colStatDecimal ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.ColumnStat colStatDouble ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.ColumnStat colStatInt ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.ColumnStat colStatInt2 ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.ColumnStat colStatInt3 ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.ColumnStat colStatInt4 ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.ColumnStat colStatIntHgm ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.ColumnStat colStatIntSkewHgm ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.ColumnStat colStatString ()  { throw new RuntimeException(); }
  public  int dMax ()  { throw new RuntimeException(); }
  public  int dMin ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.Decimal decMax ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.Decimal decMin ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.Histogram hgmInt ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.Histogram hgmIntSkew ()  { throw new RuntimeException(); }
  // not preceding
  public  boolean originalCBOValue ()  { throw new RuntimeException(); }
  // not preceding
  public  boolean originalPlanStatsValue ()  { throw new RuntimeException(); }
}
