package org.apache.spark.sql.catalyst;
/**
 * Summary for a rule.
 * param:  totalTimeNs total amount of time, in nanosecs, spent in this rule.
 * param:  numInvocations number of times the rule has been invoked.
 * param:  numEffectiveInvocations number of times the rule has been invoked and
 *                                resulted in a plan change.
 */
// not preceding
public  class QueryPlanningTracker$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final QueryPlanningTracker$ MODULE$ = null;
  public   QueryPlanningTracker$ ()  { throw new RuntimeException(); }
  // not preceding
  public  java.lang.String PARSING ()  { throw new RuntimeException(); }
  public  java.lang.String ANALYSIS ()  { throw new RuntimeException(); }
  public  java.lang.String OPTIMIZATION ()  { throw new RuntimeException(); }
  public  java.lang.String PLANNING ()  { throw new RuntimeException(); }
  /** Returns the current tracker in scope, based on the thread local variable. */
  public  scala.Option<org.apache.spark.sql.catalyst.QueryPlanningTracker> get ()  { throw new RuntimeException(); }
  /** Sets the current tracker for the execution of function f. We assume f is single-threaded. */
  public <T extends java.lang.Object> T withTracker (org.apache.spark.sql.catalyst.QueryPlanningTracker tracker, scala.Function0<T> f)  { throw new RuntimeException(); }
}
