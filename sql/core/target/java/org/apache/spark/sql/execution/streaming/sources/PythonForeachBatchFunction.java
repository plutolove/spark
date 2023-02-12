package org.apache.spark.sql.execution.streaming.sources;
/** Call the Python implementation of this function */
public  interface PythonForeachBatchFunction {
  // not preceding
  public  void call (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> batchDF, long batchId)  ;
}
