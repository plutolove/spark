package org.apache.spark.sql.catalyst.planning;
/** (joinType, leftKeys, rightKeys, condition, leftChild, rightChild, joinHint) */
// not preceding
public  class ExtractEquiJoinKeys$ implements org.apache.spark.internal.Logging, org.apache.spark.sql.catalyst.expressions.PredicateHelper {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final ExtractEquiJoinKeys$ MODULE$ = null;
  public   ExtractEquiJoinKeys$ ()  { throw new RuntimeException(); }
  public  scala.Option<scala.Tuple7<org.apache.spark.sql.catalyst.plans.JoinType, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression>, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression>, scala.Option<org.apache.spark.sql.catalyst.expressions.Expression>, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan, org.apache.spark.sql.catalyst.plans.logical.JoinHint>> unapply (org.apache.spark.sql.catalyst.plans.logical.Join join)  { throw new RuntimeException(); }
}
