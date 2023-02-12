package org.apache.spark.sql.catalyst.plans.logical;
public abstract class SetOperation extends org.apache.spark.sql.catalyst.plans.logical.BinaryNode {
  // not preceding
  static public  scala.Option<scala.Tuple2<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan>> unapply (org.apache.spark.sql.catalyst.plans.logical.SetOperation p)  { throw new RuntimeException(); }
  // not preceding
  public   SetOperation (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan left, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan right)  { throw new RuntimeException(); }
  // not preceding
  public  boolean duplicateResolved ()  { throw new RuntimeException(); }
  protected  scala.collection.immutable.Set<org.apache.spark.sql.catalyst.expressions.Expression> leftConstraints ()  { throw new RuntimeException(); }
  protected  scala.collection.immutable.Set<org.apache.spark.sql.catalyst.expressions.Expression> rightConstraints ()  { throw new RuntimeException(); }
  // not preceding
  public  boolean resolved ()  { throw new RuntimeException(); }
}
