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
public  class PhysicalOperation$ implements org.apache.spark.sql.catalyst.planning.OperationHelper, org.apache.spark.sql.catalyst.expressions.PredicateHelper {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final PhysicalOperation$ MODULE$ = null;
  public   PhysicalOperation$ ()  { throw new RuntimeException(); }
  // not preceding
  public  scala.Option<scala.Tuple3<scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression>, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression>, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan>> unapply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
}
