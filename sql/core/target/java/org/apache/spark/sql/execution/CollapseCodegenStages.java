package org.apache.spark.sql.execution;
/**
 * Inserts an InputAdapter on top of those that do not support codegen.
 */
public  class CollapseCodegenStages extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.execution.SparkPlan> implements scala.Product, scala.Serializable {
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.internal.SQLConf conf ()  { throw new RuntimeException(); }
  public  java.util.concurrent.atomic.AtomicInteger codegenStageCounter ()  { throw new RuntimeException(); }
  // not preceding
  public   CollapseCodegenStages (org.apache.spark.sql.internal.SQLConf conf, java.util.concurrent.atomic.AtomicInteger codegenStageCounter)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.SparkPlan apply (org.apache.spark.sql.execution.SparkPlan plan)  { throw new RuntimeException(); }
}
