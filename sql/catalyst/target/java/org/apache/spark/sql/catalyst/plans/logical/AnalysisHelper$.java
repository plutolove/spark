package org.apache.spark.sql.catalyst.plans.logical;
/**
 * A thread local to track whether we are in a resolveOperator call (for the purpose of analysis).
 * This is an int because resolve* calls might be be nested (e.g. a rule might trigger another
 * query compilation within the rule itself), so we are tracking the depth here.
 */
// not preceding
public  class AnalysisHelper$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final AnalysisHelper$ MODULE$ = null;
  public   AnalysisHelper$ ()  { throw new RuntimeException(); }
  public <T extends java.lang.Object> T allowInvokingTransformsInAnalyzer (scala.Function0<T> f)  { throw new RuntimeException(); }
  public <T extends java.lang.Object> T markInAnalyzer (scala.Function0<T> f)  { throw new RuntimeException(); }
}
