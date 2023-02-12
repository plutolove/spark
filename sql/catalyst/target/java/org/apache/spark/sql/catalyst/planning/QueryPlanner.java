package org.apache.spark.sql.catalyst.planning;
/** A list of execution strategies that can be used by the planner */
public abstract class QueryPlanner<PhysicalPlan extends org.apache.spark.sql.catalyst.trees.TreeNode<PhysicalPlan>> {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree().setOriginal(AppliedTypeTree(Select(Select(Select(Select(Select(Select(Ident(org), org.apache), org.apache.spark), org.apache.spark.sql), org.apache.spark.sql.catalyst), org.apache.spark.sql.catalyst.trees), org.apache.spark.sql.catalyst.trees.TreeNode), List(TypeTree().setOriginal(Ident(TypeName("PhysicalPlan"))))))))
  public   QueryPlanner ()  { throw new RuntimeException(); }
  /**
   * Collects placeholders marked using {@link GenericStrategy#planLater planLater}
   * by {@link strategies}.
   * @param plan (undocumented)
   * @return (undocumented)
   */
  protected abstract  scala.collection.Seq<scala.Tuple2<PhysicalPlan, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan>> collectPlaceholders (PhysicalPlan plan)  ;
  public  scala.collection.Iterator<PhysicalPlan> plan (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  /** Prunes bad plans to prevent combinatorial explosion. */
  protected abstract  scala.collection.Iterator<PhysicalPlan> prunePlans (scala.collection.Iterator<PhysicalPlan> plans)  ;
  // not preceding
  public abstract  scala.collection.Seq<org.apache.spark.sql.catalyst.planning.GenericStrategy<PhysicalPlan>> strategies ()  ;
}
