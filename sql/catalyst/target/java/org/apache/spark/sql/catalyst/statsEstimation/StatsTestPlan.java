package org.apache.spark.sql.catalyst.statsEstimation;
/**
 * This class is used for unit-testing. It's a logical plan whose output and stats are passed in.
 */
public  class StatsTestPlan extends org.apache.spark.sql.catalyst.plans.logical.LeafNode implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3, T4 v4)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  // not preceding
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> outputList ()  { throw new RuntimeException(); }
  public  scala.math.BigInt rowCount ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.AttributeMap<org.apache.spark.sql.catalyst.plans.logical.ColumnStat> attributeStats ()  { throw new RuntimeException(); }
  public  scala.Option<scala.math.BigInt> size ()  { throw new RuntimeException(); }
  // not preceding
  public   StatsTestPlan (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> outputList, scala.math.BigInt rowCount, org.apache.spark.sql.catalyst.expressions.AttributeMap<org.apache.spark.sql.catalyst.plans.logical.ColumnStat> attributeStats, scala.Option<scala.math.BigInt> size)  { throw new RuntimeException(); }
  // not preceding
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.Statistics computeStats ()  { throw new RuntimeException(); }
}
