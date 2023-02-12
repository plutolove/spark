package org.apache.spark.sql.execution.ui;
/**
 * All the SparkPlanGraphNodes, including those inside of WholeStageCodegen.
 */
public  class SparkPlanGraph implements scala.Product, scala.Serializable {
  // not preceding
  static public  org.apache.spark.sql.execution.ui.SparkPlanGraph apply (org.apache.spark.sql.execution.SparkPlanInfo planInfo)  { throw new RuntimeException(); }
  // not preceding
  public  scala.collection.Seq<org.apache.spark.sql.execution.ui.SparkPlanGraphNode> nodes ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.execution.ui.SparkPlanGraphEdge> edges ()  { throw new RuntimeException(); }
  // not preceding
  public   SparkPlanGraph (scala.collection.Seq<org.apache.spark.sql.execution.ui.SparkPlanGraphNode> nodes, scala.collection.Seq<org.apache.spark.sql.execution.ui.SparkPlanGraphEdge> edges)  { throw new RuntimeException(); }
  // not preceding
  public  java.lang.String makeDotFile (scala.collection.immutable.Map<java.lang.Object, java.lang.String> metrics)  { throw new RuntimeException(); }
  /**
   * All the SparkPlanGraphNodes, including those inside of WholeStageCodegen.
   * @return (undocumented)
   */
  public  scala.collection.Seq<org.apache.spark.sql.execution.ui.SparkPlanGraphNode> allNodes ()  { throw new RuntimeException(); }
}
