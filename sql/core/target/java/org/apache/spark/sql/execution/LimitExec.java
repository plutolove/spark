package org.apache.spark.sql.execution;
/** Number of element should be taken from child operator */
public  interface LimitExec extends org.apache.spark.sql.execution.UnaryExecNode {
  // not preceding
  public  int limit ()  ;
}
