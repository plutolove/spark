package org.apache.spark.sql.catalyst.statsEstimation;
/**
 * This class is used for unit-testing the cbo switch, it mimics a logical plan which computes
 * a simple statistics or a cbo estimated statistics based on the conf.
 */
public  class DummyLogicalPlan extends org.apache.spark.sql.catalyst.plans.logical.LeafNode implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.catalyst.plans.logical.Statistics defaultStats ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.Statistics cboStats ()  { throw new RuntimeException(); }
  // not preceding
  public   DummyLogicalPlan (org.apache.spark.sql.catalyst.plans.logical.Statistics defaultStats, org.apache.spark.sql.catalyst.plans.logical.Statistics cboStats)  { throw new RuntimeException(); }
  // not preceding
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.Statistics computeStats ()  { throw new RuntimeException(); }
}
