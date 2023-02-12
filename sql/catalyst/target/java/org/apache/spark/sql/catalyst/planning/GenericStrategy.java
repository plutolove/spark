package org.apache.spark.sql.catalyst.planning;
/**
 * Returns a placeholder for a physical plan that executes <code>plan</code>. This placeholder will be
 * filled in automatically by the QueryPlanner using the other execution strategies that are
 * available.
 */
public abstract class GenericStrategy<PhysicalPlan extends org.apache.spark.sql.catalyst.trees.TreeNode<PhysicalPlan>> implements org.apache.spark.internal.Logging {
  // not preceding
  public   GenericStrategy ()  { throw new RuntimeException(); }
  public abstract  scala.collection.Seq<PhysicalPlan> apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  ;
  // not preceding
  protected abstract  PhysicalPlan planLater (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  ;
}
