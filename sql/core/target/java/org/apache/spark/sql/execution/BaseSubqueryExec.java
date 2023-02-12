package org.apache.spark.sql.execution;
/**
 * In the new explain mode <code>EXPLAIN FORMATTED</code>, the subqueries are not shown in the
 * main plan and are printed separately along with correlation information with
 * its parent plan. The condition below makes sure that subquery plans are
 * excluded from the main plan.
 */
public abstract class BaseSubqueryExec extends org.apache.spark.sql.execution.SparkPlan {
  // not preceding
  public   BaseSubqueryExec ()  { throw new RuntimeException(); }
  public abstract  org.apache.spark.sql.execution.SparkPlan child ()  ;
  /**
   * In the new explain mode <code>EXPLAIN FORMATTED</code>, the subqueries are not shown in the
   * main plan and are printed separately along with correlation information with
   * its parent plan. The condition below makes sure that subquery plans are
   * excluded from the main plan.
   * @param depth (undocumented)
   * @param lastChildren (undocumented)
   * @param append (undocumented)
   * @param verbose (undocumented)
   * @param prefix (undocumented)
   * @param addSuffix (undocumented)
   * @param maxFields (undocumented)
   * @param printNodeId (undocumented)
   */
  public  void generateTreeString (int depth, scala.collection.Seq<java.lang.Object> lastChildren, scala.Function1<java.lang.String, scala.runtime.BoxedUnit> append, boolean verbose, java.lang.String prefix, boolean addSuffix, int maxFields, boolean printNodeId)  { throw new RuntimeException(); }
  // not preceding
  public abstract  java.lang.String name ()  ;
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.SortOrder> outputOrdering ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.physical.Partitioning outputPartitioning ()  { throw new RuntimeException(); }
}
