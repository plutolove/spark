package org.apache.spark.sql.execution;
/**
 * Take the first <code>limit</code> elements of each child partition, but do not collect or shuffle them.
 */
public  class LocalLimitExec extends org.apache.spark.sql.execution.SparkPlan implements org.apache.spark.sql.execution.BaseLimitExec, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  // not preceding
  public  scala.collection.Seq<java.lang.String> limitNotReachedChecks ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.execution.CodegenSupport parent ()  { throw new RuntimeException(); }
  public  int limit ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.SparkPlan child ()  { throw new RuntimeException(); }
  // not preceding
  public   LocalLimitExec (int limit, org.apache.spark.sql.execution.SparkPlan child)  { throw new RuntimeException(); }
  // not preceding
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.SortOrder> outputOrdering ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.physical.Partitioning outputPartitioning ()  { throw new RuntimeException(); }
}