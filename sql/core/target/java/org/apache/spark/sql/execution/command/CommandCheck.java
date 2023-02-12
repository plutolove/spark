package org.apache.spark.sql.execution.command;
/**
 * Checks legitimization of various execution commands.
 */
public  class CommandCheck implements scala.Function1<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan, scala.runtime.BoxedUnit>, scala.Product, scala.Serializable {
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.internal.SQLConf conf ()  { throw new RuntimeException(); }
  // not preceding
  public   CommandCheck (org.apache.spark.sql.internal.SQLConf conf)  { throw new RuntimeException(); }
  // not preceding
  public  void apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
}
