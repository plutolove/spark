package org.apache.spark.sql.execution.ui;
/**
 * This field is only populated after the execution is finished; it will be null while the
 * execution is still running. During execution, aggregate metrics need to be retrieved
 * from the SQL listener instance.
 */
public  class SparkPlanGraphWrapper {
  // not preceding
  public   SparkPlanGraphWrapper (long executionId, scala.collection.Seq<org.apache.spark.sql.execution.ui.SparkPlanGraphNodeWrapper> nodes, scala.collection.Seq<org.apache.spark.sql.execution.ui.SparkPlanGraphEdge> edges)  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.execution.ui.SparkPlanGraphEdge> edges ()  { throw new RuntimeException(); }
  // not preceding
  public  long executionId ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.execution.ui.SparkPlanGraphNodeWrapper> nodes ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.execution.ui.SparkPlanGraph toSparkPlanGraph ()  { throw new RuntimeException(); }
}
