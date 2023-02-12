package org.apache.spark.sql.execution.window;
/**
 * Function for comparing boundary values.
 */
 abstract class BoundOrdering {
  // not preceding
  public   BoundOrdering ()  { throw new RuntimeException(); }
  // not preceding
  public abstract  int compare (org.apache.spark.sql.catalyst.InternalRow inputRow, int inputIndex, org.apache.spark.sql.catalyst.InternalRow outputRow, int outputIndex)  ;
}
