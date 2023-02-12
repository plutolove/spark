package org.apache.spark.sql.execution;
/**
 * Cleans up the resources used by the physical operator (if any). In general, all the resources
 * should be cleaned up when the task finishes but operators like SortMergeJoinExec and LimitExec
 * may want eager cleanup to free up tight resources (e.g., memory).
 */
public  interface LeafExecNode {
  public  scala.collection.Seq<org.apache.spark.sql.execution.SparkPlan> children ()  ;
  public  org.apache.spark.sql.catalyst.expressions.AttributeSet producedAttributes ()  ;
  public  java.lang.String verboseStringWithOperatorId ()  ;
}
