package org.apache.spark.sql.catalyst.analysis;
/**
 * Returns true if the nameParts is a subset of the last elements of qualifier of the attribute.
 * <p>
 * For example, the following should all return true:
 *   - <code>SELECT ns1.ns2.t.* FROM ns1.n2.t</code> where nameParts is Seq("ns1", "ns2", "t") and
 *     qualifier is Seq("ns1", "ns2", "t").
 *   - <code>SELECT ns2.t.* FROM ns1.n2.t</code> where nameParts is Seq("ns2", "t") and
 *     qualifier is Seq("ns1", "ns2", "t").
 *   - <code>SELECT t.* FROM ns1.n2.t</code> where nameParts is Seq("t") and
 *     qualifier is Seq("ns1", "ns2", "t").
 */
public  class UnresolvedStar extends org.apache.spark.sql.catalyst.analysis.Star implements org.apache.spark.sql.catalyst.expressions.Unevaluable, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1)  ;
  // not preceding
  public  scala.Option<scala.collection.Seq<java.lang.String>> target ()  { throw new RuntimeException(); }
  // not preceding
  public   UnresolvedStar (scala.Option<scala.collection.Seq<java.lang.String>> target)  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> expand (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan input, scala.Function2<java.lang.String, java.lang.String, java.lang.Object> resolver)  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
