package org.apache.spark.sql.streaming;
/**
 * Tests the behavior of <code>StreamingQuery.awaitTermination</code>.
 * <p>
 * param:  expectedBehavior  Expected behavior (not blocked, blocked, or exception thrown)
 * param:  timeoutMs         Timeout in milliseconds
 *                          When timeoutMs is less than or equal to 0, awaitTermination() is
 *                          tested (i.e. w/o timeout)
 *                          When timeoutMs is greater than 0, awaitTermination(timeoutMs) is
 *                          tested
 * param:  expectedReturnValue Expected return value when awaitTermination(timeoutMs) is used
 */
// not preceding
public  class StreamingQuerySuite$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final StreamingQuerySuite$ MODULE$ = null;
  public   StreamingQuerySuite$ ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.streaming.util.StreamManualClock clock ()  { throw new RuntimeException(); }
}
