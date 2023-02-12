package org.apache.spark.sql.catalyst.plans.logical;
public abstract class OrderPreservingUnaryNode extends org.apache.spark.sql.catalyst.plans.logical.UnaryNode {
  // not preceding
  public   OrderPreservingUnaryNode ()  { throw new RuntimeException(); }
  // not preceding
  public final  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.SortOrder> outputOrdering ()  { throw new RuntimeException(); }
}
