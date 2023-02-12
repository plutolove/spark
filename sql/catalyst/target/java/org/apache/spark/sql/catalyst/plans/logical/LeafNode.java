package org.apache.spark.sql.catalyst.plans.logical;
/** Leaf nodes that can survive analysis must define their own statistics. */
public abstract class LeafNode extends org.apache.spark.sql.catalyst.plans.logical.LogicalPlan {
  // not preceding
  public   LeafNode ()  { throw new RuntimeException(); }
  // not preceding
  public final  scala.collection.Seq<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> children ()  { throw new RuntimeException(); }
  /** Leaf nodes that can survive analysis must define their own statistics. */
  public  org.apache.spark.sql.catalyst.plans.logical.Statistics computeStats ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.AttributeSet producedAttributes ()  { throw new RuntimeException(); }
}
