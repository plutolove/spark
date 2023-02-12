package org.apache.spark.sql.catalyst.planning;
/**
 * Collects all deterministic projects and filters, in-lining/substituting aliases if necessary.
 * Here are two examples for alias in-lining/substitution.
 * Before:
 * <pre><code>
 *   SELECT c1 FROM (SELECT key AS c1 FROM t1) t2 WHERE c1 &gt; 10
 *   SELECT c1 AS c2 FROM (SELECT key AS c1 FROM t1) t2 WHERE c1 &gt; 10
 * </code></pre>
 * After:
 * <pre><code>
 *   SELECT key AS c1 FROM t1 WHERE key &gt; 10
 *   SELECT key AS c2 FROM t1 WHERE key &gt; 10
 * </code></pre>
 */
// not preceding
public  class PhysicalOperation {
  // not preceding
  static public  scala.Option<scala.Tuple3<scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression>, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression>, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan>> unapply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  static protected  org.apache.spark.sql.catalyst.expressions.AttributeMap<org.apache.spark.sql.catalyst.expressions.Expression> collectAliases (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> fields)  { throw new RuntimeException(); }
  static protected  org.apache.spark.sql.catalyst.expressions.Expression substitute (org.apache.spark.sql.catalyst.expressions.AttributeMap<org.apache.spark.sql.catalyst.expressions.Expression> aliases, org.apache.spark.sql.catalyst.expressions.Expression expr)  { throw new RuntimeException(); }
  static protected  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> splitConjunctivePredicates (org.apache.spark.sql.catalyst.expressions.Expression condition)  { throw new RuntimeException(); }
  static public  scala.Option<scala.Tuple2<org.apache.spark.sql.catalyst.expressions.Expression, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan>> findExpressionAndTrackLineageDown (org.apache.spark.sql.catalyst.expressions.Expression exp, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  static protected  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> splitDisjunctivePredicates (org.apache.spark.sql.catalyst.expressions.Expression condition)  { throw new RuntimeException(); }
  static protected  org.apache.spark.sql.catalyst.expressions.Expression replaceAlias (org.apache.spark.sql.catalyst.expressions.Expression condition, org.apache.spark.sql.catalyst.expressions.AttributeMap<org.apache.spark.sql.catalyst.expressions.Expression> aliases)  { throw new RuntimeException(); }
  static protected  boolean canEvaluate (org.apache.spark.sql.catalyst.expressions.Expression expr, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  static protected  boolean canEvaluateWithinJoin (org.apache.spark.sql.catalyst.expressions.Expression expr)  { throw new RuntimeException(); }
}
