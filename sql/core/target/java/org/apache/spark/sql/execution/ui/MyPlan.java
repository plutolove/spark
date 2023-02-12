package org.apache.spark.sql.execution.ui;
/**
 * A dummy {@link org.apache.spark.sql.execution.SparkPlan} that updates a {@link SQLMetrics}
 * on the driver.
 */
public  class MyPlan extends org.apache.spark.sql.execution.SparkPlan implements org.apache.spark.sql.execution.LeafExecNode, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.SparkContext sc ()  { throw new RuntimeException(); }
  public  long expectedValue ()  { throw new RuntimeException(); }
  public  long expectedValue2 ()  { throw new RuntimeException(); }
  // not preceding
  public   MyPlan (org.apache.spark.SparkContext sc, long expectedValue, long expectedValue2)  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.SparkContext sparkContext ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, org.apache.spark.sql.execution.metric.SQLMetric> metrics ()  { throw new RuntimeException(); }
  public  org.apache.spark.rdd.RDD<org.apache.spark.sql.catalyst.InternalRow> doExecute ()  { throw new RuntimeException(); }
}
