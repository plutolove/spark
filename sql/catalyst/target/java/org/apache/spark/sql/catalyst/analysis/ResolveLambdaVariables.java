package org.apache.spark.sql.catalyst.analysis;
/**
 * Create a bound lambda function by binding the arguments of a lambda function to the given
 * partial arguments (dataType and nullability only). If the expression happens to be an already
 * bound lambda function then we assume it has been bound to the correct arguments and do
 * nothing. This function will produce a lambda function with hidden arguments when it is passed
 * an arbitrary expression.
 */
public  class ResolveLambdaVariables extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> implements scala.Product, scala.Serializable {
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.internal.SQLConf conf ()  { throw new RuntimeException(); }
  // not preceding
  public   ResolveLambdaVariables (org.apache.spark.sql.internal.SQLConf conf)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
}
