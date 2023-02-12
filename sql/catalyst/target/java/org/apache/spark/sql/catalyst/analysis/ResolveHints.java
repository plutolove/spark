package org.apache.spark.sql.catalyst.analysis;
/**
 * The list of allowed join strategy hints is defined in {@link JoinStrategyHint.strategies}, and a
 * sequence of relation aliases can be specified with a join strategy hint, e.g., "MERGE(a, c)",
 * "BROADCAST(a)". A join strategy hint plan node will be inserted on top of any relation (that
 * is not aliased differently), subquery, or common table expression that match the specified
 * name.
 * <p>
 * The hint resolution works by recursively traversing down the query plan to find a relation or
 * subquery that matches one of the specified relation aliases. The traversal does not go past
 * beyond any view reference, with clause or subquery alias.
 * <p>
 * This rule must happen before common table expressions.
 */
// not preceding
public  class ResolveHints {
  // not preceding
  static public  class ResolveCoalesceHints extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    // not preceding
    public   ResolveCoalesceHints (org.apache.spark.sql.internal.SQLConf conf)  { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  }
  // not preceding
  // not preceding
  static public  class ResolveCoalesceHints$ {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final ResolveCoalesceHints$ MODULE$ = null;
    public   ResolveCoalesceHints$ ()  { throw new RuntimeException(); }
    // not preceding
    public  scala.collection.immutable.Set<java.lang.String> COALESCE_HINT_NAMES ()  { throw new RuntimeException(); }
  }
  // not preceding
  static public  class ResolveJoinStrategyHints extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    // not preceding
    public   ResolveJoinStrategyHints (org.apache.spark.sql.internal.SQLConf conf)  { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
    public  scala.Function2<java.lang.String, java.lang.String, java.lang.Object> resolver ()  { throw new RuntimeException(); }
  }
  // not preceding
  static public  class RemoveAllHints extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    // not preceding
    public   RemoveAllHints (org.apache.spark.sql.internal.SQLConf conf)  { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  }
}
