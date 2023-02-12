package org.apache.spark.sql;
public  class MyColumarRule extends org.apache.spark.sql.execution.ColumnarRule implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.execution.SparkPlan> pre ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.execution.SparkPlan> post ()  { throw new RuntimeException(); }
  // not preceding
  public   MyColumarRule (org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.execution.SparkPlan> pre, org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.execution.SparkPlan> post)  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.execution.SparkPlan> preColumnarTransitions ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.execution.SparkPlan> postColumnarTransitions ()  { throw new RuntimeException(); }
}
