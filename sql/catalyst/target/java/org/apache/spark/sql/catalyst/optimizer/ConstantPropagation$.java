package org.apache.spark.sql.catalyst.optimizer;
/**
 * Traverse a condition as a tree and replace attributes with constant values.
 * - On matching {@link And}, recursively traverse each children and get propagated mappings.
 *   If the current node is not child of another {@link And}, replace all occurrences of the
 *   attributes with the corresponding constant values.
 * - If a child of {@link And} is {@link EqualTo} or {@link EqualNullSafe}, propagate the mapping
 *   of attribute =&gt; constant.
 * - On matching {@link Or} or {@link Not}, recursively traverse each children, propagate empty mapping.
 * - Otherwise, stop traversal and propagate empty mapping.
 * param:  condition condition to be traversed
 * param:  replaceChildren whether to replace attributes with constant values in children
 * param:  nullIsFalse whether a boolean expression result can be considered to false e.g. in the
 *                    case of <code>WHERE e</code>, null result of expression <code>e</code> means the same as if it
 *                    resulted false
 * @return A tuple including:
 *         1. Option[Expression]: optional changed condition after traversal
 *         2. EqualityPredicates: propagated mapping of attribute =&gt; constant
 */
// not preceding
public  class ConstantPropagation$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> implements org.apache.spark.sql.catalyst.expressions.PredicateHelper {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final ConstantPropagation$ MODULE$ = null;
  public   ConstantPropagation$ ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
}
