package org.apache.spark.sql.catalyst.optimizer;
/**
 * Replace nested columns to prune unused nested columns later.
 */
// not preceding
public  class NestedColumnAliasing {
  // not preceding
  static public  scala.Option<scala.Tuple2<scala.collection.immutable.Map<org.apache.spark.sql.catalyst.expressions.ExtractValue, org.apache.spark.sql.catalyst.expressions.Alias>, scala.collection.immutable.Map<org.apache.spark.sql.catalyst.expressions.ExprId, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Alias>>>> unapply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  /**
   * Replace nested columns to prune unused nested columns later.
   * @param plan (undocumented)
   * @param nestedFieldToAlias (undocumented)
   * @param attrToAliases (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan replaceToAliases (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan, scala.collection.immutable.Map<org.apache.spark.sql.catalyst.expressions.ExtractValue, org.apache.spark.sql.catalyst.expressions.Alias> nestedFieldToAlias, scala.collection.immutable.Map<org.apache.spark.sql.catalyst.expressions.ExprId, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Alias>> attrToAliases)  { throw new RuntimeException(); }
  /**
   * Return a replaced project list.
   * @param projectList (undocumented)
   * @param nestedFieldToAlias (undocumented)
   * @return (undocumented)
   */
  static public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> getNewProjectList (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> projectList, scala.collection.immutable.Map<org.apache.spark.sql.catalyst.expressions.ExtractValue, org.apache.spark.sql.catalyst.expressions.Alias> nestedFieldToAlias)  { throw new RuntimeException(); }
  /**
   * Return a plan with new children replaced with aliases.
   * @param plan (undocumented)
   * @param attrToAliases (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan replaceChildrenWithAliases (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan, scala.collection.immutable.Map<org.apache.spark.sql.catalyst.expressions.ExprId, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Alias>> attrToAliases)  { throw new RuntimeException(); }
  /**
   * Return two maps in order to replace nested fields to aliases.
   * <p>
   * If <code>exclusiveAttrs</code> is given, any nested field accessors of these attributes
   * won't be considered in nested fields aliasing.
   * <p>
   * 1. ExtractValue -> Alias: A new alias is created for each nested field.
   * 2. ExprId -> Seq[Alias]: A reference attribute has multiple aliases pointing it.
   * @param exprList (undocumented)
   * @param exclusiveAttrs (undocumented)
   * @return (undocumented)
   */
  static public  scala.Option<scala.Tuple2<scala.collection.immutable.Map<org.apache.spark.sql.catalyst.expressions.ExtractValue, org.apache.spark.sql.catalyst.expressions.Alias>, scala.collection.immutable.Map<org.apache.spark.sql.catalyst.expressions.ExprId, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Alias>>>> getAliasSubMap (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> exprList, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> exclusiveAttrs)  { throw new RuntimeException(); }
  /**
   * This is a while-list for pruning nested fields at <code>Generator</code>.
   * @param g (undocumented)
   * @return (undocumented)
   */
  static public  boolean canPruneGenerator (org.apache.spark.sql.catalyst.expressions.Generator g)  { throw new RuntimeException(); }
}
