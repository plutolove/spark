package org.apache.spark.sql.internal;
public  class FakeQueryExecution extends org.apache.spark.sql.execution.QueryExecution implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.SparkSession spark ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.SparkPlan physicalPlan ()  { throw new RuntimeException(); }
  // not preceding
  public   FakeQueryExecution (org.apache.spark.sql.SparkSession spark, org.apache.spark.sql.execution.SparkPlan physicalPlan)  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.execution.SparkPlan sparkPlan ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.execution.SparkPlan executedPlan ()  { throw new RuntimeException(); }
}
