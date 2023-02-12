package org.apache.spark.sql.catalyst.plans.logical;
/**
 * A logical plan node with a left and right child.
 */
public abstract class BinaryNode extends org.apache.spark.sql.catalyst.plans.logical.LogicalPlan {
  // not preceding
  public   BinaryNode ()  { throw new RuntimeException(); }
  public final  scala.collection.Seq<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> children ()  { throw new RuntimeException(); }
  // not preceding
  public abstract  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan left ()  ;
  public abstract  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan right ()  ;
}
