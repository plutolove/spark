package org.apache.spark.sql.execution.adaptive;
/**
 * The subquery-reuse map shared across the entire query.
 */
public  class AdaptiveExecutionContext implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.SparkSession session ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.QueryExecution qe ()  { throw new RuntimeException(); }
  // not preceding
  public   AdaptiveExecutionContext (org.apache.spark.sql.SparkSession session, org.apache.spark.sql.execution.QueryExecution qe)  { throw new RuntimeException(); }
  // not preceding
  public  scala.collection.concurrent.TrieMap<org.apache.spark.sql.execution.SparkPlan, org.apache.spark.sql.execution.BaseSubqueryExec> subqueryCache ()  { throw new RuntimeException(); }
  /**
   * The exchange-reuse map shared across the entire query, including sub-queries.
   * @return (undocumented)
   */
  public  scala.collection.concurrent.TrieMap<org.apache.spark.sql.execution.SparkPlan, org.apache.spark.sql.execution.adaptive.QueryStageExec> stageCache ()  { throw new RuntimeException(); }
}
