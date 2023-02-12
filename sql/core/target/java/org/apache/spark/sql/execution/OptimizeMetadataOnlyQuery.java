package org.apache.spark.sql.execution;
/**
 * Returns the partition attributes of the table relation plan.
 */
public  class OptimizeMetadataOnlyQuery extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> implements scala.Product, scala.Serializable {
  /**
   * A pattern that finds the partitioned table relation node inside the given plan, and returns a
   * pair of the partition attributes and the table relation node.
   */
  // not preceding
  public  class PartitionedRelation$ implements org.apache.spark.sql.catalyst.expressions.PredicateHelper {
    public   PartitionedRelation$ ()  { throw new RuntimeException(); }
    // not preceding
    public  scala.Option<scala.Tuple2<org.apache.spark.sql.catalyst.expressions.AttributeSet, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan>> unapply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  }
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  /**
   * Accessor for nested Scala object
   * @return (undocumented)
   */
  public  org.apache.spark.sql.execution.OptimizeMetadataOnlyQuery.PartitionedRelation$ PartitionedRelation ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.catalyst.catalog.SessionCatalog catalog ()  { throw new RuntimeException(); }
  // not preceding
  public   OptimizeMetadataOnlyQuery (org.apache.spark.sql.catalyst.catalog.SessionCatalog catalog)  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
}
