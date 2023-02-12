package org.apache.spark.sql.execution.metric;
/**
 * Return a list of recorded metrics aggregated per stage.
 * <p>
 * The list is sorted in the ascending order on the stageId.
 * For each recorded stage, the following tuple is returned:
 *  - sum of inputMetrics.recordsRead for all the tasks in the stage
 *  - sum of shuffleReadMetrics.recordsRead for all the tasks in the stage
 *  - sum of the highest values of "number of output rows" metric for all the tasks in the stage
 */
// not preceding
public  class InputOutputMetricsHelper {
  // not preceding
  static public  scala.collection.immutable.List<scala.Tuple3<java.lang.Object, java.lang.Object, java.lang.Object>> run (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> df)  { throw new RuntimeException(); }
}
