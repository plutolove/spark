package org.apache.spark.sql.execution.ui;
/**
 * Represent a node in the SparkPlan tree, along with its metrics.
 * <p>
 * param:  id generated by "SparkPlanGraph". There is no duplicate id in a graph
 * param:  name the name of this SparkPlan node
 * param:  metrics metrics that this SparkPlan node will track
 */
  class SparkPlanGraphNode {
  // not preceding
  public   SparkPlanGraphNode (long id, java.lang.String name, java.lang.String desc, scala.collection.Seq<org.apache.spark.sql.execution.ui.SQLPlanMetric> metrics)  { throw new RuntimeException(); }
  public  java.lang.String desc ()  { throw new RuntimeException(); }
  // not preceding
  public  long id ()  { throw new RuntimeException(); }
  // not preceding
  public  java.lang.String makeDotNode (scala.collection.immutable.Map<java.lang.Object, java.lang.String> metricsValue)  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.execution.ui.SQLPlanMetric> metrics ()  { throw new RuntimeException(); }
  public  java.lang.String name ()  { throw new RuntimeException(); }
}