package org.apache.spark.sql.execution.streaming;
/**
 * Execute batches using <code>batchRunner</code>. If <code>batchRunner</code> runs <code>false</code>, terminate the execution.
 */
public  interface TriggerExecutor {
  // not preceding
  public  void execute (scala.Function0<java.lang.Object> batchRunner)  ;
}
