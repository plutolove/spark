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
public  class ResolveHints$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final ResolveHints$ MODULE$ = null;
  public   ResolveHints$ ()  { throw new RuntimeException(); }
}
