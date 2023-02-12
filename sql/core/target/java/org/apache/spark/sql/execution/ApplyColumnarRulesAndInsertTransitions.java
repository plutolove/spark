package org.apache.spark.sql.execution;
/**
 * Inserts an transition to columnar formatted data.
 */
public  class ApplyColumnarRulesAndInsertTransitions extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.execution.SparkPlan> implements scala.Product, scala.Serializable {
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.internal.SQLConf conf ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.execution.ColumnarRule> columnarRules ()  { throw new RuntimeException(); }
  // not preceding
  public   ApplyColumnarRulesAndInsertTransitions (org.apache.spark.sql.internal.SQLConf conf, scala.collection.Seq<org.apache.spark.sql.execution.ColumnarRule> columnarRules)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.SparkPlan apply (org.apache.spark.sql.execution.SparkPlan plan)  { throw new RuntimeException(); }
}
