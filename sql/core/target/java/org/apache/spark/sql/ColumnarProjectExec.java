package org.apache.spark.sql;
/**
 * A version of ProjectExec that adds in columnar support.
 */
public  class ColumnarProjectExec extends org.apache.spark.sql.execution.ProjectExec {
  // not preceding
  public   ColumnarProjectExec (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> projectList, org.apache.spark.sql.execution.SparkPlan child)  { throw new RuntimeException(); }
  public  org.apache.spark.rdd.RDD<org.apache.spark.sql.vectorized.ColumnarBatch> doExecuteColumnar ()  { throw new RuntimeException(); }
  public  boolean equals (Object other)  { throw new RuntimeException(); }
  public  int hashCode ()  { throw new RuntimeException(); }
  public  boolean supportCodegen ()  { throw new RuntimeException(); }
  // not preceding
  public  boolean supportsColumnar ()  { throw new RuntimeException(); }
}
